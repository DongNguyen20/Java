package Tuan2;

import java.util.*;
abstract class AbstractShape{
	abstract float tinhDienTich();
	abstract float chuVi();
	abstract String intoString();
}

class Rectangle extends AbstractShape {
    private int chieuDai;
    private int chieuRong;
    public Rectangle(int a, int b){ 
    	chieuDai = a;
    	chieuRong = b; 
    }
    float tinhDienTich() {
        return chieuDai*chieuRong;
    }
    float chuVi() {
    	return (this.chieuDai + this.chieuRong)*2;
    }
    String intoString(){
        return "Hinh chu nhat";
    }
}

class Circle extends AbstractShape {
    private float R;
    final float PI = 3.14f;
    public Circle(int a) { 
    	R = a;
    }
    float tinhDienTich() {
        return R*R*PI;
    }
    float chuVi() {
    	return R*2*PI;
    }
    String intoString() {
        return "Hinh tron";
    }
}

class Square extends AbstractShape{
	private int canh;
	public Square() {
		this.canh = 0;
	}
	public Square(int a) {
		this.canh = a;
	}
	float tinhDienTich() {
		return this.canh*this.canh;
	}
	float chuVi() {
		return this.canh*4;
	}
	String intoString() {
		return "Hinh vuong";
	}
}

class Triangle extends AbstractShape{
	private int a, b, c;
	public Triangle() {
		this.a = this.b = this.c = 0;
	}
	public Triangle(int m, int n,int  k) {
		this.a = m;
		this.b= n;
		this.c = k;
	}
	float tinhDienTich() {
		float p = (this.a + this.b + this.c)/2;
		return (float) Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
	}
	float chuVi() {
		return this.a+ this.b + this.c;
	}
    String intoString() {
		return "Hinh tam giac";
	}
} 

public class Bai2 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		int cDai;
	    int cRong;
	    int a;
	    int R;
	    int c1, c2 , c3;
	    System.out.println("==============NHAP=============");
	    System.out.print("HCN Chieu Dai: ");
	    cDai = inp.nextInt();
	    System.out.print("HCN Chieu Rong: ");
	    cRong = inp.nextInt();
	    Rectangle cn = new Rectangle(cDai, cRong);
	   
	    System.out.print("Nhap ban kinh hinh tron: ");
	    R = inp.nextInt();
	    Circle tron = new Circle(R);
	    
	    System.out.print("Nhap canh hVuong: " );
	    a = inp.nextInt();
	    Square hv = new Square(a);
	    
	    System.out.print("Tam giac c1: ");
	    c1 = inp.nextInt();
	    System.out.print("Tam giac c2: ");
	    c2 = inp.nextInt();
	    System.out.print("Tam giac c3: ");
	    c3 = inp.nextInt();
	    Triangle tg = new Triangle(c1, c2, c3);
	    
	   
	    System.out.println(cn.intoString()+ ", Dien tich: "+ cn.tinhDienTich()+ ", Chu Vi: "+ cn.chuVi());
	    System.out.println(tron.intoString()+ ", Dien tich: "+ tron.tinhDienTich()+ ", Chu Vi: "+ tron.chuVi());
	    System.out.println(hv.intoString()+ ", Dien tich: "+ hv.tinhDienTich()+ ", Chu Vi: "+ hv.chuVi());
	    System.out.println(tg.intoString()+ ", Dien tich: "+ tg.tinhDienTich()+ ", Chu Vi: "+ tg.chuVi());

	}

}
