import java.util.Scanner;

public class Program{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [][] kors = new int [3][3];
		int total;
		float avg;
		int menu;
		
		for(int j=0; j<3; j++)
			for(int i=0; i<3; i++)
				kors[j][i] = 0;
		종료:
		while(true) {
			System.out.println("┌──────────────────────────┐");
			System.out.println("│         \\메인매뉴\\       　 │");
			System.out.println("└──────────────────────────┘");	
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.나가기");
			System.out.print(">");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 : 
				System.out.println("┌──────────────────────────┐");
				System.out.println("│         \\성적입력\\       　 │");
				System.out.println("└──────────────────────────┘");	
				for(int j=0; j<3; j++)
					for(int i=0; i<3; i++)
						do {
							System.out.printf("%d학년 국어%d : ", j+1,i+1,kors);
							kors[j][i] = scan.nextInt();
							
							if(kors[j][i]<0 || 100<kors[j][i])
								System.out.println("0 ~ 100 사이의 점수를 입력 해주세요.");
						
						}while(kors[j][i]<0 || 100<kors[j][i]);
					break;
			case 2 :		
				System.out.println("┌──────────────────────────┐");
				System.out.println("│         \\성적출력\\       　 │");
				System.out.println("└──────────────────────────┘");	
				
				for(int j=0; j<3; j++) {
					total = kors[j][0] + kors[j][1] + kors[j][2];
					avg = total/3.0f;
					System.out.printf("<%d학년 국어 성적> ----------------\n",j+1);
					for(int i=0; i<3; i++)	
						System.out.printf("\t국어 %d : %3d\n", i+1, kors[j][i]);
											

					System.out.printf("\t총합 : %3d\n", total);
					System.out.printf("\t평균 : %5.2f\n", avg);
					System.out.println("───────────────────────────\n");
					
			
					}//for (int j)
					break;
			
			case 3 :
				break 종료;
			
			default :
				System.out.println("올바르지 않은 입력 입니다.");
			}//switch(menu)
			
		}//while(true)		
		System.out.println("종료되었습니다.");
	}	

}