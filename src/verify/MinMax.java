package verify;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("3���� ������ �Է� �ϼ���?");
		int n1, n2, n3, max, min;

		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt(); // n1=20;
		n2 = sc.nextInt(); // n2=10;
		n3 = sc.nextInt();

		max = (n1 > n2) ? n1 : n2;
		max = (max > n3) ? max : n3;

		min = (n1 < n2) ? n1 : n2;
		min = (min < n3) ? min : n3;

		System.out.println("max=" + max);
		System.out.println("min=" + min);

	}

}
