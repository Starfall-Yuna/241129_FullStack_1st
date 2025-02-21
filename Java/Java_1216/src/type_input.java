import java.util.Scanner;

public class type_input {
	public static void main(String args[]) {
		// int arr[5] = {1, 2, 3, 4, 5};
		// arr[1] = 2;
		// *(arr + 1) = 2;	-> arr 주소값을 찾고, 1번째에 위치한 값을 찾아라
		//		 arr :: 배열 arr의 시작 주소
		
		
		// 자료형 :: 데이터의 종류
		// [정수형] :: "int", long, long long int
		// [실수형] :: float, "double" (정밀도 차이)
		// [문자형] :: "char, String"(문자열)
		// [참/거짓] :: boolean
		// String은 char형 배열, 참조 자료형 (String 변수의 시작점을 기점으로 읽어들인다.)
		
		
		// 변수 선언
		// 입력문 :: Scanner 클래스의 함수 활용 (자료형마다 함수를 다르게 써야함)
		// Scanner 객체 만들어주고, 객체를 통해서 입력 함수를 불러와야함 (Scanner :: 내장 클래스 중 하나)
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();			// 정수형
		double d = sc.nextDouble();		// 실수형
		char c = sc.next().charAt(0);	// 문자형
		String s1 = sc.next();			// 문자열형 (next() :: 단어 단위로 입력, 공백 입력X)
		String s2 = sc.nextLine();		// 문자열형 (nextLine() :: 문장 단위로 입력, 공백 입력O)
		boolean b = sc.nextBoolean();	// 참/거짓
		
		
		// 상수 선언 (final 키워드 사용)
		final int num = 1;
		// num = 5;		-> 값 수정
	}
}
