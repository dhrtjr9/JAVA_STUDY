package ����;

public class CarcarExample {

	public static void main(String[] args) {
		Carcar myCar = new Carcar();
		
		myCar.setGas(5); // car�� setGas() �޼ҵ�ȣ��
		
		boolean gasState = myCar.isLeftGas(); //car�� isLeftGas() �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run(); // car�� run() �޼ҵ� ȣ��
			
		}
		
		if(myCar.isLeftGas()) { //Car�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}
