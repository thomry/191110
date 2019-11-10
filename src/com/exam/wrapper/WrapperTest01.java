package com.exam.wrapper;

public class WrapperTest01 {
	public static void main(String[] args) {
	
		int    a1     = 10;
		String str1   = "a111";
		int    result = 0;
		
		/*
		 * int형 wrapper class
		 * 모든 숫자형 WRAPPER CLASS는
		 * 데이터 타입변환 메서드가 존재합니다.
		 * 
		 * inValue();
		 * longValue();
		 * doubleValue();
		 * shortValue();
		 * byteValue();
		 * toString(); // 문자타입
		 */
		Integer cNum  = new Integer(10);					// new라는 키워드로 새로운 메모리공간을 만들고 10을 넣은 객체형타입입니다.
		Integer cNum2 = 10;		// autoBoxing
		Integer cNum3 = 10;		// autoBoxing
		
		System.out.println( cNum == cNum2 );				// FALSE 객체형과 일반형을 비교했기때문에.
		System.out.println( cNum.intValue() == cNum2 );		// value비교.
		System.out.println( cNum2 == cNum3 );
		
		/*
		 * 숫자형 문자열 타입 값을 숫자 타입 값으로 변환
		 */
		
		try {
			// 문자형 타입 숫자를 int형 변수로 치환
			result = Integer.parseInt(str1);
		}catch(Exception e) {
			System.out.println("포맷변환 에러: "+e.getMessage());
		}

	}

}
