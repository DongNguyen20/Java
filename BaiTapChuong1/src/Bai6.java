import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		
		int year, doomsDay;
		
		char[] daysOfWeek = {'S','M','T','W','T','F','S'};
		
		String[] months = {
				"January",
				"February",
				"March",
				"April",
				"May",
				"June",
				"July",
				"August",
				"September",
				"October",
				"November",
				"December"
		};
		
		System.out.println("Nhap nam: ");
		year = inp.nextInt();
		
		int[] daysInAMonth = new int[months.length];
		
		daysInAMonth = getDays(year, months.length);
		
		System.out.println("\n\n");
		
		doomsDay = calculateStartDayOfYear(year);

		for(int i = 0; i < months.length;i++)
		{
			
			System.out.println("\t\t    " + months[i] + " " + year);
			System.out.println("--------------------------------------------------");
			
			for(int j = 0; j < daysOfWeek.length; j++)
				System.out.print(daysOfWeek[j] + "\t");
			
			System.out.print("\n--------------------------------------------------\n");
			
			for(int j = 0; j < daysInAMonth[i];) {
				
				for(int k = 0; k < 7; k++)
				{
					if(k<doomsDay)
					{
						System.out.print("\t");
					}
					else {
						System.out.print(++j + "\t");
						if(j == daysInAMonth[i]) {
							if(k != 6)
								doomsDay = k+1;
							break;	
						}
						doomsDay = 0;
					}
					
				}
				System.out.print("\n");	
			}
			System.out.println("--------------------------------------------------\n\n");
			
		}
	}
	
	private static int[] getDays(int year, int months) {
		
		int[] days = new int[months];
		
		for(int i = 0; i < days.length; i++)
		{
			 switch(i+1) {
			 	case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					days[i] = 31;
					break;
				case 2:
					if(year%4 == 0)
						days[i] = 29;
					else 
						days[i] =28;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					days[i] = 30;
					break;
				default:
					days[i] = 0;
					break;
				 
			 }
		}
		
		return days;
	}

	static int calculateStartDayOfYear(int y) {
		
		int dd = 0, firstFinger = 0, secondFinger, thirdFinger, fourthFinger = 0, bd = 0;
		
		dd = y%400;
		
		if(dd >= 0 && dd <= 99) {
			firstFinger = 2;
		}else if(dd >= 100 && dd <= 199) {
			firstFinger = 0;
		}else if(dd >= 200 && dd <= 299) {
			firstFinger = 5;
		}else if(dd >= 300 && dd <= 399) {
			firstFinger = 3;
		}
		
		secondFinger = (y%100)/12;
		
		thirdFinger = (y%100)%12;
		
		if(thirdFinger !=0)
			fourthFinger = thirdFinger/4;
		
		dd = firstFinger + secondFinger + thirdFinger + fourthFinger;
		
		while(dd > 6) {
			dd = dd-7;
		}
		
		if(y%4 == 0)
		{
			if(dd>2)
				bd= dd-3;
			else
				bd = dd+4;
		}
		else
		{
			if(dd>3)
				bd= dd-2;
			else
				bd= dd+5;
		}
		return bd;
	}
}