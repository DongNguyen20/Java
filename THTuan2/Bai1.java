package Tuan2;

import java.util.*;
import java.awt.Point;
import java.math.*;

class Point2D{
	int x, y;
	Scanner inp = new Scanner(System.in);
	Point2D(){
		x = 0;
		y = 0;
	}
	Point2D(int a, int b) {
		x= a;
		y= b;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int k) {
		x = k;
	}
	public void setY(int k) {
		y = k;
	}
	public String toString() {
		return "("+ x + "," + y + ") ";
	}
	void nhap() {
		System.out.print("x: ");
		x = inp.nextInt();
		System.out.print("y: ");
		y = inp.nextInt();
	}
	void xuat() {
		System.out.print(toString());
	}
	float khoangCach(Point2D b) {
		return (float) Math.sqrt((x-b.x)*(x-b.x) +(y-b.y)*(y- b.y));
	}
	void diChuyen(Point2D m) {
		x += m.x;
		y += m.y;
	}
}
public class Bai1 {

	public static void main(String[] args) {
		//Point2D a = new Point2D(3, 4);
	
		Point2D v = new Point2D(1, 1);
		Point2D A = new Point2D();
		Point2D B = new Point2D();
		System.out.println("Diem A");
		A.nhap();
		System.out.println("Diem B");
		B.nhap();
		
		System.out.printf("A%s, B%s" , A.toString(), B.toString());
	
		System.out.println("\nKhoang cac A va B la: " + A.khoangCach(B));
		A.diChuyen(v);
		System.out.println("Diem A sau khi dich chuyen v" + v.toString()+"la: " + A.toString());
	}

}
