package ex20.finalvar;

import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		final int SIZE = 7;
		int[] kors = new int[SIZE]; 
		int total = 0;
		int menu;
		float avg;
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3; 
		
		// 상수형 문자는 대문자로 적는게 기본(가독성)
		// final 뒤에 적힌 변수는 변경불가능함.
		
		Scanner scan = new Scanner(System.in);
		
		종료:
		while(true) 
		{
		//---------------- 메인 매뉴 --------------------
			System.out.print("┌──────────────────────────┐\n");
			System.out.print("│         \\매인매뉴\\       　 │\n");
			System.out.print("└──────────────────────────┘\n");	
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.종료");
			System.out.print("\t>");
			menu = scan.nextInt(); 
			
		//---------------- 성적 입력 부분 ----------------
			
			switch(menu) { 
			
			case MENU_INPUT: 
				System.out.print("┌──────────────────────────┐\n");
				System.out.print("│         \\성적입력\\       　 │\n");
				System.out.print("└──────────────────────────┘\n");	
	
				for(int i=0 ; i<SIZE ; i++)
					do {
						System.out.printf("국어 %d 점수 입력 : " ,i+1,kors);
						kors[i] = scan.nextInt(); 
					
						if (kors[i]<0 || 100<kors[i])
							System.out.println("성적범위 ( 0 ~ 100 )를 벗어났습니다.");	
						
					}while (kors[i]<0 || 100<kors[i]);
				break;
			
			case MENU_PRINT:
				//-------------- 성적 출력 부분 ------------------
				for(int i=0; i<SIZE; i++) 
					total += kors[i];
					avg = total / 3.0f;
				// SIZE라는 상수형 변수를 이용하여 해당값 출력할때 1+2+3~+7 이렇게 치지말고 +=를 응용
				// i를 쓴 이유는 같이 올라가서 같은값 받으려고 
					
				System.out.print("┌──────────────────────────┐\n");
				System.out.print("│         \\성적출력\\       　 │\n");
				System.out.print("└──────────────────────────┘\n");	
				
				for(int i=0; i<SIZE; i++)  				
					System.out.printf("\t국어%d : %3d\n",i+1, kors[i]);
					
					System.out.printf("\t총점  : %3d\n", total);
					System.out.printf("\t평군  : %5.2f\n", avg); 
		
					System.out.println("────────────────────────────");
					break;
			
			case MENU_EXIT:
				break 종료; 
			
			default:
				System.out.println("올바르지 않은 입력 입니다.");
			}
	
		}
	
		System.out.print("종료되었습니다.");

	}	

}