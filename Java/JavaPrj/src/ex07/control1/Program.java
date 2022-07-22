package ex07.control1;

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
		
		System.out.print("국어 1 점수 입력 : ");
		kor1 = scan.nextInt(); 
		//if (!(0<=kor1 && kor1<=100))
		//if (0>kor1 || kor1>100)
		while (kor1<0 || 100<kor1) { // 가독성 편하게 적으면 좋음.
			System.out.println("성적범위 ( 0 ~ 100 )를 벗어났습니다.");
			System.out.print("국어 1 점수 입력 : ");
			kor1 = scan.nextInt(); 
		}
		System.out.print("국어 2 점수 입력 : ");
		kor2 = scan.nextInt();		
		System.out.print("국어 3 점수 입력 : ");
		kor3 = scan.nextInt();
		
		//-------------- 성적 출력 부분 ------------------
		total = kor1 + kor2 + kor3;
		avg = total / 3.0f;
		
		System.out.print("┌──────────────────────────┐\n");
		System.out.print("│         \\성적출력\\       　 │\n");
		System.out.print("└──────────────────────────┘\n");	

		System.out.printf("\t국어1 : %3d\n", kor1);
		System.out.printf("\t국어2 : %3d\n", kor2);
		System.out.printf("\t국어3 : %3d\n", kor3);
		System.out.printf("\t총점  : %3d\n", total);
		System.out.printf("\t평군  : %5.2f\n", avg); 

		System.out.println("────────────────────────────");
		
		}
	}
}