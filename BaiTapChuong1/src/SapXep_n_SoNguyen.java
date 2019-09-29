import java.util.Scanner;

public class SapXep_n_SoNguyen {

	static Scanner inp = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		int arr[];
		do {
			System.out.print("Nhap so nguyen n: ");
			n = inp.nextInt();
		} while(n<0);
		arr = new int[n];
		nhap(arr,n);
		sapXep(arr, n);
		xuat(arr);
		
						
	}
	
	public static void nhap(int arr[], int n) {
		System.out.println("Nhap vao phan tu mang:");
		for(int i=0;i<n;i++) {
			arr[i] = inp.nextInt();
		}
	}
	public static void xuat(int arr[]) {
		System.out.print("Mang da sap xep: ");
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
	}
	public static void sapXep(int arr[], int n) {
		int chon;
		System.out.print("Chon thuat toan: 1. interchangeSort   2. selectionSort    3. interSort   4. bubbleSort  default: quickSort! : " );
		chon = inp.nextInt();
		switch(chon) {
		case 1:
			interchangeSort(arr, n);
			break;
		case 2: 
			selectionSort(arr, n);
			break;
		case 3: 
			insertSort(arr, n);
			break;
		case 4: 
			bubbleSort(arr, n);
			break;
		default: 
			quickSort(arr,0,n-1);
		}
	}
	public static void interchangeSort(int a[], int n) {
		int i, j;
		for(i=0;i<n-1;i++) {
			for(j=i+1;j<n;j++)
			{
				if(a[j]<a[i]) {
					int tam = a[i];
					a[i] = a[j];
					a[j] = tam;
				}
			}
		}
	}
	public static void selectionSort(int a[], int n) {
		int min, i, j;
		for(i=0;i<n;i++) {
			min = i;
			for(j = i+1; j<n;j++) {
				if(a[j]<a[min])
					min =j;
				}
			int tam = a[min];
			a[min] = a[i];
			a[i] = tam;
		}
	}
	public static void bubbleSort(int a[], int n) {
		int i,j;
		for(i=0;i<n-1;i++) {
			for(j=n-1;j > 1;j--) {
				if(a[j]<a[j-1]) {
					int tam =a[j];
					a[j]= a[j-1];
					a[j-1] = tam;
				}
			}
		}
	}
	public static void insertSort(int a[], int n) {
		int pos, key;
		for(int i= 1; i<n; i++) {
			key =a[i];
			pos = i -1;
			while((pos >= 0)&&(a[pos]>key)) {
				a[pos+1]= a[pos];
				pos--;	
			}
			a[pos+1]=key;
		}
	}
	public static void quickSort(int a[], int left, int  right) {
		
		int i, j, x;
		x = a[(left + right)/2];
		i = left;
		j = right;
		while(i<j) {
			while(a[i]<x)
				i++;
			while(a[j]>x)
				j--;
			if(i<=j) {
				int tam = a[i];
				a[i]= a[j];
				a[j]= tam;
				i++;
				j--;
			}
		}
		if(left<j)
			quickSort(a,left, j);
		if(i<right)
			quickSort(a, i, right);
	}
	
}
