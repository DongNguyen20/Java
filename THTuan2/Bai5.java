package Tuan2;

//import Tuan2.Bai2;
import java.util.*;
public class Bai5 {

	static Scanner inp = new Scanner(System.in);
	public static void main(String[] args) {
		int n= 0;
		int demVuong = 0;
		int demTron = 0;
		int demHCN = 0;
		int demTG = 0;
		System.out.print("So luong hinh: ");
		n = inp.nextInt();
		AbstractShape a[] = new AbstractShape[n];
		int key;
		for(int i= 0; i< n; i++) {
			System.out.print(" |  1- hv  |  2-  hcn | 3- tamgiac | khac- htron | --> key: " );
			key = inp.nextInt();
			switch(key)
			{
			case 1:
				demVuong++;
				int c = 0;
				System.out.print("Canh hvuong: ");
				c = inp.nextInt();
				a[i] = new Square(c);
				break;
			case 2: 
				demHCN++;
				int k =0, h = 0;
				System.out.print("CDai: ");
				k = inp.nextInt();
				System.out.print("CRong: ");
				h = inp.nextInt();
				a[i] = new Rectangle(k, h);
				break;
			case 3: 
				demTG++;
				int c1, c2, c3;
				System.out.print("canh 1: ");
				c1 = inp.nextInt();
				System.out.print("canh 2: ");
				c2 = inp.nextInt();
				System.out.print("canh 3: ");
				c3 = inp.nextInt();
				a[i] = new Triangle(c1, c2, c3);
				break;
			default:
				demTron++;
				int R;
				System.out.print("Ban kinh:");
				R =inp.nextInt();
				a[i]= new Circle(R);
				break;
			}
		}
		System.out.println("================ XUAT ==================");
		for(int j= 0; j< n; j++) {
			System.out.println(a[j].intoString()+ " Dien tich: "+ a[j].tinhDienTich() + ", Chu Vi: " + a[j].chuVi()); 
		}
		System.out.println("So hinh vuong: " + demVuong);
		System.out.println("So hinh chu nhat: " + demHCN);
		System.out.println("So hinh tam giac: " + demTG);
		System.out.println("So hinh tron: " + demTron);
	}
	


}
