package ex15.marray;

import java.util.Scanner;

public class Program2{
	public static void main(String[] args) {
		
		int[][] kors = new int[3][3]; 
		int total;
		int menu;
		float avg;
		
		Scanner scan = new Scanner(System.in);
		for(int j=0 ; j<3 ; j++)
			for(int i=0 ; i<3 ; i++)
				kors[j][i] = 0;
		
		
		
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
				
				for(int j=0 ; j<3 ; j++)
					for(int i=0 ; i<3 ; i++)
						do {
							System.out.printf("%d학년 국어 %d 점수 입력 : " ,j+1, i+1,kors);
							kors[j][i] = scan.nextInt(); 
							if (kors[j][i]<0 || 100<kors[j][i])
								System.out.println("성적범위 ( 0 ~ 100 )를 벗어났습니다.");	
							
						}while (kors[j][i]<0 || 100<kors[j][i]);
					break;
			
			case 2:
				//-------------- 성적 출력 부분 ------------------
				
				System.out.print("┌──────────────────────────┐\n");
				System.out.print("│         \\성적출력\\       　 │\n");
				System.out.print("└──────────────────────────┘\n");	
				
				for (int j=0; j<3; j++) {
					System.out.printf("<%d학년의 국어 성적>-------------\n", j+1);
					total = kors[j][0]+kors[j][1]+kors[j][2]; 
					avg =total/3.0f;
					
					
															
					for(int i=0; i<3; i++)  				
					
						System.out.printf("\t국어%d : %3d\n",i+1, kors[j][0]);
						
						System.out.printf("\t총점  : %3d\n", total);
						System.out.printf("\t평군  : %5.2f\n", avg); 
		
						System.out.println("────────────────────────────");	
					
				
				}
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