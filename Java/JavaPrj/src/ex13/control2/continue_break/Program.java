package ex13.control2.continue_break;

import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 sp로 구분해서 5개 이상 입력하세요! : ");
		
		//scan.nextInt();> 3 Enter, < 3만 읽음  34 5 6 234 345 54 45 Enter < 34만 읽음. 뒤는 저장할 공간이 없어서
				
		while(scan.hasNext()) { // scan.hasNext 는 다음에 읽을 값이 있으면 true, 없으면 false로 값을 내보냄.
			n = scan.nextInt(); 
		
			if(n < 10)
				continue; // n에 담긴 수중 10 아래의 수는 건너뜀 34 5 6 234 345 54 45 > 34 234 345 54 45 만 출력
			
			if(n > 300)
				break; // n에 담긴 수중 300이 넘어가면 이후부터 출력 안함 34 5 6 234 345 54 45 > 34 234만 출력후 break
				
			System.out.println(n);
		}
	}	

}