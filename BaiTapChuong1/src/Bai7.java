import java.util.*;
class PhanSo{
	int tu;
	int mau;
	public PhanSo() {
		tu = 0;
		mau = 1;
	}
	public int getTuSo() {
		return tu;
	}
	public int getMauSo() {
		return mau;
	}
	public void setTuSo(int t) {
		tu = t;
	}
	public void setMauSo(int m) {
		mau = m;
	}
	public void xuatPhanSo(PhanSo a) {
		System.out.print(a.tu + "/" + a.mau + " " );
	}
	public float PhanSoTofloat(PhanSo a) {
		return (float) tu/mau;
	}
}
public class Bai7 {

	static Scanner inp = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		System.out.print("Nhap n: ");
		n = inp.nextInt();
		PhanSo arr[] = new PhanSo[n];
		for(int i = 0; i< n; i++) {
			arr[i] = new PhanSo();
			arr[i].tu = inp.nextInt();
			arr[i].mau = inp.nextInt();
		}			
		for(int j= 0; j< n; j++) {
			arr[j].xuatPhanSo(arr[j]);
		}
		System.out.println("\nPhan So nho nhat la: ");
		minPhanSo(arr).xuatPhanSo(minPhanSo(arr));
		
	}
	
	
	
	public static PhanSo minPhanSo(PhanSo a[]) {
		float tam [] = new float[a.length]; 
		PhanSo m = new PhanSo();
		for(int i = 0; i< a.length; i++) {
			tam[i] = a[i].PhanSoTofloat(a[i]);
		}
		float min = tam[0];
		int k = 0;
		for(int j = 1; j< tam.length; j++) {
			if(tam[j] < min){
				min = tam[j];
				k = j;
			}
		}
	
		m = a[k];
		return m;
	}
	

}
