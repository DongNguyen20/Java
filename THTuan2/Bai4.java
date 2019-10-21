package Tuan2;
import java.util.*;
import Tuan2.Bai3;
class HonSo{
	private int pn;
	private PhanSo ps;
	HonSo(){};
	HonSo(int _pn, int _tu , int _mau){
		this.pn = _pn;
		this.ps = new PhanSo(_tu, _mau);
	}
	String tuString() {
		return this.pn + " " + ps.getTu()+ "/" + ps.getMau(); 
	}
	PhanSo toPhanSo() {
		PhanSo tam = new PhanSo();
		tam.setTu(this.pn* this.ps.getMau()+ this.ps.getTu());
		tam.setMau(this.ps.getMau());
		return tam;
	}
	HonSo cong(HonSo b) {
		PhanSo m = new PhanSo();
		m= this.toPhanSo().cong(b.toPhanSo()).toiGian();
		return m.toHonSo();
	}

	HonSo tru(HonSo b) {
		PhanSo m = new PhanSo();
		m= this.toPhanSo().tru(b.toPhanSo()).toiGian();
		return m.toHonSo();
	}
	HonSo nhan(HonSo b) {
		PhanSo m = new PhanSo();
		m= this.toPhanSo().nhan(b.toPhanSo()).toiGian();
		return m.toHonSo();
	}
	
	HonSo chia(HonSo b) {
		PhanSo m = new PhanSo();
		m= this.toPhanSo().chia(b.toPhanSo()).toiGian();
		return m.toHonSo();
	}
	
	public int getPhanNguyen() {
		return this.pn;
	}
	public PhanSo getPS() {
		return this.ps;
	}
	
	public void setPhanNguyen(int k) {
		this.pn = k;
	}
	public void setPhanSo(int t, int m) {
		this.ps.setTu(t);
		this.ps.setMau(m);
	}
	
}
public class Bai4 {

	public static void main(String[] args) {
		HonSo h = new HonSo(2, 3, 4);
		h.setPhanNguyen(8);
		h.setPhanSo(1, 5);
		HonSo k = new HonSo(1, 1, 2);
		System.out.println(h.toPhanSo().toString());
		System.out.print(h.tru(k).tuString());
		
	}

}
