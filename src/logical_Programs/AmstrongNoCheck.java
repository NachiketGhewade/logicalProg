package logical_Programs;

public class AmstrongNoCheck {

	// 153 = 1 5 3
	// 1*1*1 + 5*5*5 + 3*3*3 = 1+125+27 =153

	public static void main(String[] args) {

		int num = 154;
		int t = num;
		int sum = 0;
		int r;

		
		while (num > 0) {
			r = num % 10;
			sum = sum + r * r * r;
			num = num / 10;

		}
		if (sum == t) {
			System.out.println("given no is amstrong no");
		} else {
			System.out.println("given no is not an amstrong no");

		}

	}

}

