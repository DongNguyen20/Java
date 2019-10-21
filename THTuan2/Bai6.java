package Tuan2;

import java.util.*;
abstract class AbstractRobot{
	protected int M; //trong luong
	protected int S; //quang duong di 
	abstract int enery();
	public abstract String toString();
	
}
class Pedion extends AbstractRobot{
	private int F;// do linh hoat
	Pedion(int qd){
		this.M = 20;
		Random rd = new Random();
		this.F = 1 + rd.nextInt(5);
		this.S = qd;
	}
	public int enery() {
		return this.M * S +(F+1)*S /2;
	}
	public String toString() {
		return "Pedion";
	}
	public int getF() {
		return F;
	}
	
}
class Zattacker extends AbstractRobot{
	private int P; //suc manh
	Zattacker(int qd){
		this.M = 50;
		Random rd = new Random();
		this.P = 20 + rd.nextInt(11);
		this.S = qd;
	}
	public int enery() {
		return M*S + P*P*S;
	}
	public String toString() {
		return "Zattacker";
	}
	public int getP() {
		return this.P;
	}
}
class Carrier extends AbstractRobot{
	private int E; // kho nang luong
	Carrier(int qd){
		this.M = 30;
		Random rd = new Random();
		this.E= 50 +rd.nextInt(51);
		this.S = qd; 
	}
	public int enery() {
		return M*S +4*E*S;
	}
	public String toString() {
		return "Carrier";
	}
	public int getE() {
		return this.E;
	}
}

public class Bai6 {

	static Scanner inp = new Scanner(System.in);
	public static void main(String[] args) {
		int A, B, C;
		
		ArrayList<AbstractRobot> rb = new ArrayList<AbstractRobot>();
		System.out.print("Nhap so Pedison: ");
		A = inp.nextInt();
		System.out.print("Nhap so Zattacker: ");
		B = inp.nextInt();
		System.out.print("Nhap so Carrier: ");
		C = inp.nextInt();
		
		for(int i = 0; i< A; i++) {
			rb.add(new Pedion(10));
		}
		for(int j =  A; j< A+B; j++) {
			rb.add(j, new Zattacker(10));
		}
		for(int h =  A+B; h< A+B+C; h++) {
			rb.add(h, new Carrier(10));
		}
		
		AbstractRobot max = rb.get(0);
		int sumN = rb.get(0).enery();
		for(int k =0; k< rb.size(); k++) {
			System.out.print(rb.get(k).toString()+", N: ");
			System.out.println(rb.get(k).enery());
			if(rb.get(k).enery() > max.enery())
				max = rb.get(k);
			sumN += rb.get(k).enery();
		}
		System.out.println("Loai robot ton nang luong nhat :" + max.toString());
		System.out.println("Tong nang luong ca doan tieu thu :" + sumN);
	
		
	}

}
