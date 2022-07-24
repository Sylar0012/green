package ex14.array;

import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		
		int[] kors = new int[3]; // kors에 3개의 정수를 저장하겠다
		int total;
		int menu;
		float avg;
		
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
			
			case 1: 
				System.out.print("┌──────────────────────────┐\n");
				System.out.print("│         \\성적입력\\       　 │\n");
				System.out.print("└──────────────────────────┘\n");	
	
				for(int i=0 ; i<3 ; i++)
					do {
						System.out.printf("국어 %d 점수 입력 : " ,i+1,kors);
						kors[i] = scan.nextInt(); // kors에 i번째 방에 정수를 저장하겠다
					
						if (kors[i]<0 || 100<kors[i])
							System.out.println("성적범위 ( 0 ~ 100 )를 벗어났습니다.");	
						
					}while (kors[i]<0 || 100<kors[i]);
				break;
			
			case 2:
				//-------------- 성적 출력 부분 ------------------
				total = kors[0] + kors[1] + kors[2];
				avg = total / 3.0f;
				
				System.out.print("┌──────────────────────────┐\n");
				System.out.print("│         \\성적출력\\       　 │\n");
				System.out.print("└──────────────────────────┘\n");	
				
				for(int i=0; i<3; i++)  				
					System.out.printf("\t국어%d : %3d\n",i+1, kors[i]);
					
				System.out.printf("\t총점  : %3d\n", total);
				System.out.printf("\t평군  : %5.2f\n", avg); 
		
				System.out.println("────────────────────────────");
				break;
			
			case 3:
				break 종료; 
			
			default:
				System.out.println("올바르지 않은 입력 입니다.");
			}
	
		}
	
		System.out.print("종료되었습니다.");

	}	

}