package com.exam.ex;

public class ExceptionTest3 {

	public static void main(String[] args) {
		int[] array = { 1,2,3,4,5};
		
		try {
			for(int i=0; i<0; i++)
				System.out.println(array[i]);
		}catch(Exception e) {
			System.out.println("오류 : "+e.getMessage());
		}
		
		System.out.println("================프로그램 종료================");

	}

}
