package 연산;

public class CarcarExample {

	public static void main(String[] args) {
		Carcar myCar = new Carcar();
		
		myCar.setGas(5); // car의 setGas() 메소드호출
		
		boolean gasState = myCar.isLeftGas(); //car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); // car의 run() 메소드 호출
			
		}
		
		if(myCar.isLeftGas()) { //Car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
