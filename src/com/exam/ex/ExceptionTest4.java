package com.exam.ex;

public class ExceptionTest4 {
	
	// 메서드에서 발생하는 예외를 해당 메서드를 호출하는 곳에서 처리하도록 던짐
	public double divide(double num, int target) throws Exception{
		return (num/target);
	}

	public static void main(String[] args) {
		ExceptionTest4 ex = new ExceptionTest4();
		double result = 0;
		try {
			result = ex.divide(30, 4);
			System.out.println(result);
			result = ex.divide(30, 0);
			System.out.println(result);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();

	}

}
