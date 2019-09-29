import java.util.Scanner;

public class PhuongTrinhBac2 {
	
	public static void main(String[] args) {
		int a, b, c;
		float denta;
		Scanner inp = new Scanner(System.in);
		System.out.println("Nhap he so");
		a = inp.nextInt();
		b = inp.nextInt();
		c = inp.nextInt();
		float x1, x2;
		if(a == 0) {
			if(b==0 && c != 0)
				System.out.println("Phuong trinh vo nghiem!");
			else if(b==0 && c==0)
				System.out.println("Phuong trinh vo so nghiem!");
			if(b!=0) {
				x1 = -c/b;
				System.out.print("Phuong trinh co nghiem duy nhat: "+ x1);
			}
		}
		else {
			denta = b*b - 4*a*c;
			if(denta < 0)
				System.out.print("Phuong trinh vo nghiem!");
			else if(denta == 0) {
				x1 = -b/(2*a);
				System.out.println("Phuong trinh co nghiem kep: x="+ x1);
			}
			else {
				x1 = (float) (-b - Math.sqrt(denta))/(2*a);
				x2 = (float) (-b + Math.sqrt(denta))/(2*a);
				System.out.print("Phuong trinh co 2 nghiem:  \nx1= "+ x1 + "\nx2= "+ x2);
			}
		}
			
	}

}
