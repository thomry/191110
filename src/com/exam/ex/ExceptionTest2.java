package com.exam.ex;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int num = 10;
		
		try {
			// 0으로 나눌 수 없음
			System.out.println( num / 0 );
			
		}catch(NullPointerException e) {
			System.out.println("객체가 없습니다.");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다 : "+e.getMessage());
		}
		
		System.out.println("================프로그램 종료================");

	}

}
