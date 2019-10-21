package Tuan2;
import java.util.*;

abstract class AmaraDichVu{
	Scanner inp = new Scanner(System.in);
	protected int sL;
	protected int giaGoc; 
	abstract void nhap();
	abstract int tinhTien();
	abstract void xuat();
	
}
class ThueXe extends AmaraDichVu{
	private int soGio;
	ThueXe(){};
	ThueXe(int n, int gia, int gio){
		this.sL = n;
		this.giaGoc = gia;
		this.soGio = gio;
	}
	void nhap() {
	
		System.out.print("So xe:");
		this.sL = inp.nextInt();
		System.out.print("Gia:");
		this.giaGoc = inp.nextInt();
		System.out.print("So gio:");
		this.soGio = inp.nextInt();
	}
	int tinhTien() {
		int sumTime = this.sL*this.soGio;
		int tongTien = 0;
		if(this.soGio > 6)
			tongTien = this.sL*this.soGio * this.giaGoc * 95 / 100;
		else tongTien = this.sL*this.soGio* this.giaGoc;
		return (sumTime > 72)? tongTien*98/100 : tongTien;
	}
	void xuat() {
		System.out.println("DV: Thue Xe|	Tong tien: " + this.tinhTien());
	}

}
class GoiDT extends AmaraDichVu{
	private int soPhut;
	GoiDT(){}
	GoiDT(int gia, int phut){
		this.sL =  1;
		this.giaGoc = gia;
		this.soPhut = phut;
	}
	void nhap() {
		System.out.print("So tien 1 phut call: ");
		this.giaGoc = inp.nextInt();
		System.out.print("So phut goi? : ");
		this.soPhut = inp.nextInt();
	}
	
	int tinhTien() {
		int tongTien = this.giaGoc* this.soPhut;
		return (tongTien > 300000)? tongTien*80/ 100 : tongTien;
	}
	void xuat() {
		System.out.println("DV: Goi DT| 	Tong tien: " + this.tinhTien());
	}
}
class TangHoa extends AmaraDichVu{
	TangHoa(){}
	TangHoa(int n, int gia){
		this.sL = n;
		this.giaGoc = gia;
	}
	void nhap() {
		System.out.print("So luong hoa: ");
		this.sL = inp.nextInt();
		System.out.print("Gia hoa: ");
		this.giaGoc = inp.nextInt();
	}
	int tinhTien() {
		return this.sL* this.giaGoc;
	}
	void xuat() {
		System.out.println("DV: Tang hoa|	 Tong tien: " + this.tinhTien());
	}
}
public class Bai7 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		ArrayList<AmaraDichVu> dv = new ArrayList<AmaraDichVu>();
		int key;
		
		do {
			System.out.print("Nhap key: 0- Stop | 1- thueXe  | 2- Goi DT  | 3- Tang hoa| ----> ");
			key = ip.nextInt();
			switch(key) {
			case 1:
				ThueXe a = new ThueXe();
				a.nhap();
				dv.add(a);
				break;
			case 2:
				GoiDT b = new GoiDT();
				b.nhap();
				dv.add(b);
				break;
			case 3:
				TangHoa c = new TangHoa();
				c.nhap();
				dv.add(c);
			}
		}while(key!=0);
		
		AmaraDichVu maxTien = dv.get(0);
		int sumTien = 0;
		System.out.println("=============== XUAT ==============");
		for(int i =0; i< dv.size(); i++) {
			dv.get(i).xuat();
			if(maxTien.tinhTien() < dv.get(i).tinhTien())
				maxTien = dv.get(i);
			sumTien += dv.get(i).tinhTien();
		}
		System.out.print("DV ton tien nhat: ");
		maxTien.xuat();
		System.out.println("Tong so tien su dung DV: "+ sumTien);
		
		
	}
		
		

}
