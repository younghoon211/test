package sec03.exam03_accuracy;
public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}
}

