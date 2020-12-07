package 연산;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		//double z = x / y;
		double z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(z + 2); //문제가 되는 코드
		
		// 프로그램 코드에서 /와 % 연산의 결과가 Infinity, NaN인지 확인하려면
		//Double.isInfinite() , Double.isNaN() 메소드를 이용하면 된다.
	}

}
