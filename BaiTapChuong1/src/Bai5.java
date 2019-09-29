import java.util.*;
public class Bai5 {

	static Scanner inp = new Scanner(System.in);
	public static void main(String[] args) {
		int n, k = 0;
		System.out.print("Nhap n: ");
		n = inp.nextInt();
		int arr[]  = new int[n];
		nhap(arr, n);
		int chon;
		System.out.print("1. them    2. sua   3.xoa   4.sap xep   5.tinh TB   default.xuat mang  =====> CHON: ");
		chon = inp.nextInt();
		switch(chon) {
		case 1:
			them(arr, k);
			break;
		case 2:
			sua(arr, k);
			break;
		case 3:
			xoaPhanTu(arr, n);
			break;
		case 4:
			sapXep(arr);
			break;
		case 5:
			System.out.print("Gia tri TB: " + tinhTB(arr));
			break;
		default:
			xuat(arr, n);
		}
		
	}
	public static void nhap(int arr[], int n) {
		System.out.println("Nhap mang: ");
		for(int i =0; i< n; i++) {
			arr[i]= inp.nextInt();
		}
	}
	public static void xuat(int a[], int n) {
		System.out.println("\nXuat mang: ");
		for(int i= 0; i< n; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void them(int a[], int k) {
		int m;
		System.out.print("Vi tri them k: ");
		k = inp.nextInt();
		System.out.print("a[k]= ");
		m = inp.nextInt();
		int b[]= new int[a.length + 1];
		for(int i = a.length; i >= k; i--) {
			b[i] = a[i-1];
		
		}
		b[k-1] = m;
		for(int j = 0; j<k-1; j++) {
			b[j]= a[j];
		}
		xuat(b, b.length);

	}
	public static void xoaPhanTu(int a[], int n) {
		int chon, k, j;
		if(a.length <= 0) {
			return;
		}
		System.out.print("1. Xoa vi tri k    |||    2. Xoa ptu gia tri k  =====>  chon:  ");
		chon = inp.nextInt();
		System.out.print("K = ");
		k = inp.nextInt();
		switch(chon) {
		case 1:
			if(k > a.length)
				System.out.print("Khong ton tai a[k]");
			else {
				for(int i = j =0; i< n; i++) {
					if(i != k)
					{
						a[j] = a[i];
						j++;
					}
				}
				xuat(a,n-1);
			}
			break;	
		case 2:
			for( int i = 0, h = 0; i< n; i++) {
				if(k != a[i]) {
					a[h] = a[i];
					h++;
				}
			}
			xuat(a, n-1);
			break;		
		}
		
	}

	public static void sapXep(int a[]) {
		for(int i = 0; i< a.length; i++) {
			for(int j=i+1;j< a.length;j++)
			{
				if(a[j]<a[i]) {
					int tam = a[i];
					a[i] = a[j];
					a[j] = tam;
				}
			}
		}
		xuat(a,a.length);
	}
	
	public static float tinhTB(int a[]) {
		float tong = 0;
		for(int i = 0; i< a.length; i++) {
			tong += a[i];
		}
		return tong/a.length; 
	}
	
	public static void sua(int a[], int k) {
		int m;
		do {
			System.out.print("Vi tri sua k: ");
			k = inp.nextInt();
		} while(k > a.length);
		System.out.print("Gia tri: " );
		m = inp.nextInt();
		a[k] = m;
		xuat(a, a.length);
	}
}

