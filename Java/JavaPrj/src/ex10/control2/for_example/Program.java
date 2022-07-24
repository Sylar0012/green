package ex10.control2.for_example;

import java.util.Scanner;

public class Program{
	public static void main(String[] args) {
		int n = 0;
		
		for(int i = 0; i<10; i++) 
			if(3<= i+1 && i+1<=7 ) 
				n += i+1;
		
		System.out.printf("3부터 7까지의 합은 %d 입니다.\n", n);
		
		
		n = 5*(3+7)/2; //5 = 3~7 사이 숫자 갯수. 3+7 => 초항 + 끝항 /2 하면 사이 다 더한 값 나옴.
		System.out.println(n);
		
	}
}