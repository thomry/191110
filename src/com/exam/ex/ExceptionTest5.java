package com.exam.ex;

/*
 * 예외를 임의로 발생시킨다
 */

public class ExceptionTest5 {
	public static void main(String[] args) {
		
		int num    = 500;
		int ranNum = (int)Math.random()*300+1;
		int result = 0;
		
		try {
			result = num - ranNum;
			
			if (result <=0) {
				//임의로 예외 발생
				throw new Exception("0보다 숫자가 작다.");
			}
			// 예외 처리가 되면 안나옴
			System.out.println("오류안났음.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("종료");
	}
	

}
