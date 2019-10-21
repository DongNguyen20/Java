package Tuan2;
import java.util.*;

abstract class DienTro{
	protected float[] R;
	abstract void nhap();
	abstract float tongTro(); 
	Scanner inp = new Scanner(System.in);
}
class MachNoiTiep extends DienTro {
	MachNoiTiep(){}
	void nhap() {
		int n;
		System.out.print("Nhap so dien tro: ");
		n= inp.nextInt();
		R = new float[n];
		for(int j = 0; j< n; j++) {
			R[j] = inp.nextFloat();
		}
	}
	float tongTro() {
		float tongR= 0;
		for(float i : this.R) {
			tongR += i; 
		}
		return tongR; 
	}
	void xuat() {
		
	}
	
}
class MachSongSong extends DienTro{
	MachSongSong(){}
	void nhap() {
		int m;
		System.out.print("Nhap so dien tro: ");
		m = inp.nextInt();
		R = new float[m];
		for(int j = 0; j< m; j++) {
			R[j] = inp.nextFloat();
		}
	}
	float tongTro() {
		float tongTro = R[0];
		for(int i = 1; i < R.length; i++) {
			
			tongTro = tongTro* R[i]/(tongTro+R[i]);
		}
		return tongTro;
	}
}
public class Bai8 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		ArrayList<DienTro> dt = new ArrayList<DienTro>();
		int key;
		do {
			System.out.print("0- Stop| 1- mach noi tiep  | 2 - mach song song : -----> ");
			key= ip.nextInt();
			switch(key) {
			case 1:
				MachNoiTiep a = new MachNoiTiep();
				a.nhap();
				dt.add(a);
				break;
			case 2:
				MachSongSong b = new MachSongSong();
				b.nhap();
				dt.add(b);
				break;
			}
		}while(key!= 0);
		
		System.out.println("================== XUAT ====================");
		float tongR = 0;
		for(int i = 0; i<dt.size();i++) {
			tongR += dt.get(i).tongTro();
			System.out.println("Dien tro Cum: " + (i+1) +" la: " + dt.get(i).tongTro() );
		}
		System.out.println("Tong tro la: " + tongR);

	}

}
