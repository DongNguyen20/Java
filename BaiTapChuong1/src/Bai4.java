import java.util.Scanner;
public class Bai4 {

	static Scanner inp = new Scanner(System.in);
	public static void main(String[] args) {
		int thang, nam;
		do {
			System.out.print("Nhap thang:");
			thang = inp.nextInt();
			System.out.print("nam: ");
			nam = inp.nextInt();
		}while(thang < 0 || thang > 12);
		
		System.out.print("Thang " + thang + "/"+ nam + " co: " + kiemTra(thang, nam) + " ngay!");
	}
	public static int kiemTra(int thang, int nam) {
		
		switch(thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2: 
			if(isNamNhuan(nam) == true)
				return 29;
			else
				return 28;
		}
		return 0;
		
	}
	public static boolean isNamNhuan(int nam) {
		if(nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0))
			return true;
		return false;
	}

}
