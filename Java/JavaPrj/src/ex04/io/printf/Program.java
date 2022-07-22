package ex04.io.printf;
public class Program{
	public static void main(String[] args) {
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		total = kor1 + kor2 + kor3;
		//avg = total/3; // 계산하면 소수점이 날아감. ( 정수 / 정수 계산하면 소수점은 버려짐)
		avg = total / 3.0f; // 묵시적 형변환 이용 avg는 float값이니 나누는 수를 float로 하면 190도 float로 바뀜
		// total/3.0; => 3.0이 double이 됨 에러는 나지만 계산은 됨(계산하면 소숫점이 짤리기 떄문에 에러)
		// ( 묵시적 허용으로 190 = > 190.0d )
		
		// (float)total/3.0 => (float)total 먼저 실행 후 그값을 3.0과 나눠서 에러가 발생
		// (float)totla = 190.0f => 190.0f / 3.0d => 형변환 => 190.0d / 3.0d avg = 63.33d => avg는 float 써서 손실난다고 에러 발생.
		
		// (float)(total / 3.0) => 뒤에 식 계산한걸 float으로 바꾸라 지시해서 에러 안남. (명시적 형변환)
		
		// 받는게 float이면 나누는것도 float으로 바꾸면 더편함 ㅋㅋ
		
		//-------------- 성적 출력 부분 ------------------
		System.out.print("┌────────────────┐\n");
		System.out.print("│    \\성적출력\\  　 │\n");
		System.out.print("└────────────────┘\n");	
		// \n은 <br>의 느낌
		// \를 포함시킬 경우 \\를 사용
		System.out.printf("\t국어1 : %3d\n", kor1);
		System.out.printf("\t국어2 : %3d\n", kor2);
		System.out.printf("\t국어3 : %3d\n", kor3);
		System.out.printf("\t총점  : %3d\n", total);
		System.out.printf("\t평군  : %6.2f\n", avg); 
		// avg는 실수형(float)을 썻기 때문에 %f임
		// %5.2f => 5 = 소수점 포함 표시될 문자갯수(최소한 가질 공간) , 2 = 소숫점 뒤 표현될 숫자 갯수	
		System.out.println("──────────────────");
		
		//print + \n = println
		// \t 는 앞 공백 넣어줌
		System.out.printf("%d.%d.%d\n", 2022, 07, 20);
		//System.out.print(80); 80 출력
		//System.out.write(80); 80을 아스키 코드로 해석하여 80에 해당하는 문자 또는 숫자 출력
		//System.out.flush();
		System.out.printf("%2$d.%3$d.%1$d\n", 1, 2, 3);
		// 숫자$ => 출력 순서 바꿔줌
		System.out.printf("%1$d.%1$d.%1$d\n", 1);
		// 원래는 지정자의 수 만큼 값의 수가 와야하지만 $을 사용하면 하나의 값을 여러번 출력 가능
		
	}
}
