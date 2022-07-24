package ex09.control2.for_;

import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		Scanner scan = new Scanner(System.in);
		
		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		while(true) 
		{
		//---------------- 성적 입력 부분 ----------------
		
		System.out.print("┌──────────────────────────┐\n");
		System.out.print("│         \\성적입력\\       　 │\n");
		System.out.print("└──────────────────────────┘\n");	
		do {
			System.out.print("국어 1 점수 입력 : ");
			kor1 = scan.nextInt(); 
		
			if (kor1<0 || 100<kor1)
				System.out.println("성적범위 ( 0 ~ 100 )를 벗어났습니다.");	
			
		}while (kor1<0 || 100<kor1); 
		do {
			System.out.print("국어 2 점수 입력 : ");
			kor2 = scan.nextInt(); 
		
			if (kor2<0 || 100<kor2)
				System.out.println("성적범위 ( 0 ~ 100 )를 벗어났습니다.");	
			
		}while (kor2<0 || 100<kor2); 
		do {
			System.out.print("국어 3 점수 입력 : ");
			kor3 = scan.nextInt(); 
		
			if (kor3<0 || 100<kor3)
				System.out.println("성적범위 ( 0 ~ 100 )를 벗어났습니다.");	
			
		}while (kor3<0 || 100<kor3); 
		
		//-------------- 성적 출력 부분 ------------------
		total = kor1 + kor2 + kor3;
		avg = total / 3.0f;
		
		System.out.print("┌──────────────────────────┐\n");
		System.out.print("│         \\성적출력\\       　 │\n");
		System.out.print("└──────────────────────────┘\n");	
		
		//for (int n=1; n<=3; n++) < i는 0부터 시작할떄 쓰고 n은 1부터 시작할때 쓰는게 보통.
		for(int i=0; i<3; i++) { 
			// for 문은 몇번 반복하는지 파악하기 쉽게 해줌. ( 한곳에 다 모여있기 떄문에)
			System.out.printf("\t국어%d : %3d\n",i+1, kor1);
			// 역순으로 만드는 방법 > 3-i  .. 
			// 계산식 변경 보다는 내부를 변경하는 방법을 익숙해져야 함.
			
		}
		System.out.printf("\t총점  : %3d\n", kor1*3);
		System.out.printf("\t평군  : %5.2f\n", kor1/3f); 

		System.out.println("────────────────────────────");
		System.out.printf("%2$d.%3$d.%1$d\n", 1, 2, 3);	
		}
	}
}