package ex03.io.escape;
public class Program{
	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		total = kor1 + kor2 + kor3;
		avg = total/3;
	
		//-------------- 성적 출력 부분 ------------------
		System.out.print("┌────────────────┐\n");
		System.out.print("│    \\성적출력\\  　 │\n");
		System.out.print("└────────────────┘\n");	
		// \n은 <br>의 느낌
		// \를 포함시킬 경우 \\를 사용
		System.out.println("\t국어1 : 0");
		System.out.println("\t국어2 : 0");
		System.out.println("\t국어3 : 0");
		System.out.println("\t총점  : 0");
		System.out.println("\t평군  : 0.00");
		System.out.println("──────────────────");
		
		//print + \n = println
		// \t 는 앞 공백 넣어줌
	}
}