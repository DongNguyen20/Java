package Tuan2;

import java.util.*;
class PhanSo{
	private int tu, mau;
	PhanSo(){
		this.tu =  0;
		this.mau = 1;
	}
	PhanSo(int a, int b){
		this.tu = a;
		this.mau = b;
	}
	
	PhanSo toiGian() {
		PhanSo m = new PhanSo();
		int a = UCLN(this.tu, this.mau);
		m.tu = this.tu / a;
		m.mau = this.mau / a;
		return m;
		
	}
	public int UCLN(int a, int b) {
		
		if (a == 0)
	        return 1;
		a = Math.abs(a);
		b = Math.abs(b);
	    while (b != 0) {
	        if (a > b)
	            a = a - b;
	        else
	            b = b - a;
	    }

	    return a;
	}
	
	PhanSo cong(PhanSo b) {
		PhanSo m = new PhanSo();
		m.mau = this.mau * b.mau;
		m.tu = this.tu*b.mau + b.tu*this.mau;
		m.toiGian();
		return m;
	}
	
	PhanSo tru(PhanSo b) {
		PhanSo m = new PhanSo();
		m.mau = this.mau * b.mau;
		m.tu = this.tu*b.mau -  b.tu*this.mau;
		m.toiGian();
		return m;
	}
	
	PhanSo nhan(PhanSo b) {
		PhanSo m = new PhanSo();
		m.mau = this.mau * b.mau;
		m.tu = this.tu* b.tu;
		m.toiGian();
		return m;
	}
	
	PhanSo chia(PhanSo b) {
		PhanSo m = new PhanSo();
		m.mau = this.mau * b.tu;
		m.tu = this.tu*b.mau;
		m.toiGian();
		return m;
	}
	Scanner inp = new Scanner(System.in);
	public void nhap() {
		System.out.print("Tu: ");
		this.tu = inp.nextInt();
		do {
		System.out.print("Mau: ");
		this.mau = inp.nextInt();
		}while(mau == 0);
	}
	public int getTu() {
		return this.tu;
	}
	public int getMau() {
		return this.mau;
	}
	public void setTu(int k) {
		this.tu = k;
	}
	public void setMau(int k) {
		this.mau = k;
	}
	public String toString() {
		if(this.tu == 0)
			return "0";
		return this.tu + "/" + this.mau;
	}
	public HonSo toHonSo() {
		this.toiGian();
		int pn = this.tu/ this.mau;
		int tt = this.tu % this.mau;
		int mm = this.mau;
		HonSo m = new HonSo(pn, tt, mm);
		return m;
	}
	
}

public class Bai3 {

	public static void main(String[] args) {
		
		PhanSo a = new PhanSo();
		PhanSo b = new PhanSo(24, 5);
		PhanSo c = new PhanSo();
		
		System.out.print(b.toHonSo().tuString());
		a.nhap();
		c.nhap();
		System.out.println(a.toiGian().cong(b.toiGian()).toiGian().toString());
	}
	

}
