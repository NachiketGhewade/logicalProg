package logical_Programs;

public class CountSumOfAllNumbersInNumber {

	public static void main(String[] args) {

		int num = 5423;
		int sum =0;
		
		while(num>0) {
			int ref = num%10; 
			sum = sum+ref;
			
			num=num/10;
		}
		System.out.println(sum);

	}

}
