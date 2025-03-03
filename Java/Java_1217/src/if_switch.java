import java.util.Scanner;

public class if_switch {
	public static void main(String args[]) {
		// 조건문 :: "특정 조건에 만족하면", 정해진 명령어를 수행하게 하는 구문
		// if - else if - else 조건문 :: if-else(O) / if-else if(O) / else if-else(X)
		//		셋 간의 순서만 잘 지키면 상관없음
		
		// 2개의 숫자를 입력을 받고
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		// 숫자 비교 결과에 따라서, 출력을 < or > or == 중 하나 출력
		if(a>b) {	// a가 b보다 더 크다면 ">" 출력
			System.out.println(">");
		}
		else if(a<b) {	// 위 사항을 만족하지 못하고, a가 b보다 더 작다면 "<" 출력
			System.out.println("<");
		}
		else {	// 위 사항을 모두 만족하지 못 하였다면, "==" 출력
			System.out.println("==");
		}
		
		// switch문 :: case, default, break
		//		특정 값에 대한 경우의 수를 나누어서 명령을 수행
		//		주의. () 안에 bool 타입 넣을 수 없음
		// a==b 성립하면, "두 숫자가 같습니다." 출력
		// a==b 성립하지 못한다면, "두 숫자는 다릅니다." 출력
		boolean tf = (a==b);	// true 또는 false 삽입 예정
		int result = tf==true ? 1 : 0;		// tf==true라면, 1을 넣어줌. 아니라면 0을 넣어줌.
		switch(result) {
		case 1:		// if(result == 1)
			System.out.println("두 숫자가 같습니다.");
			break;
		default:
			System.out.println("두 숫자가 다릅니다.");
			// switch의 마지막 case나 default에는 break; 굳이 적지 않아도 됌
		}
	}
}
