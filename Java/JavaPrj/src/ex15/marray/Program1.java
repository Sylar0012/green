package ex15.marray;

import java.util.Scanner;

public class Program1{
	public static void main(String[] args) {
		
		int[] kors = new int[3*3]; // 9라고 적으면 2차원으로 구성한건지 아닌지 모름
		int total;
		int menu;
		float avg;
		
		Scanner scan = new Scanner(System.in);
		for(int j=0 ; j<3 ; j++)
			for(int i=0 ; i<3 ; i++)
				kors[3*j+i] = 0; // 2차원 저장법
		
		// 3*j가 없으면 i는 0 1 2 번값에만 0이 저장됨. (1차원 저장)
		
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
							kors[3*j+i] = scan.nextInt(); // kors에 i번째 방에 정수를 저장하겠다
						
							if (kors[3*j+i]<0 || 100<kors[3*j+i])
								System.out.println("성적범위 ( 0 ~ 100 )를 벗어났습니다.");	
							
						}while (kors[3*j+i]<0 || 100<kors[3*j+i]);
					break;
			
			case 2:
				//-------------- 성적 출력 부분 ------------------
				
				System.out.print("┌──────────────────────────┐\n");
				System.out.print("│         \\성적출력\\       　 │\n");
				System.out.print("└──────────────────────────┘\n");	
				
				for (int j=0; j<3; j++) {

					total = kors[3*j+0]+kors[3*j+1]+kors[3*j+2]; // i = 0 1 2 값을 가지니까 그냥 대입.
					avg =total/3.0f;
					
					System.out.printf("<%d학년의 국어 성적>-------------\n", j+1);
															
					for(int i=0; i<3; i++)  				
					
						System.out.printf("\t국어%d : %3d\n",j+1,i+1, kors[3*j+i]);//123123123 으로 나오는 이유 = 받는거 2개 주는거 3개라 꼬임
						
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