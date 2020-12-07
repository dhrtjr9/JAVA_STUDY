package 연산;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "이옥석";
		String strVar2 = "이옥석";
		String strVar3 = new String("이옥석");
		
		System.out.println( strVar1 ==  strVar2);
		System.out.println( strVar1 ==  strVar3);
		System.out.println();
		System.out.println( strVar1.equals(strVar2));
		System.out.println( strVar1.equals(strVar3));

	}

}

// byte, char, short, int, long, double, float, boolean은 == 연산자 사용
// String 문자열 비교연산은 equals() 메소드 사용