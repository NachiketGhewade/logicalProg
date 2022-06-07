package logical_Programs;

public class AmstrongNobetweenOneToTwoHundred {

	public static void main(String[] args) {
	amstrongNO(0, 500);
	
	}

	public static void amstrongNO(int a , int b) {
		
		for(int i=a;i<=b;i++) {
			
			int num=i;
			int sum=0;
			
			while(num>0) {
				int r= num%10;
				sum = sum + (r*r*r);
				num=num/10;
				
		}
			if(sum==i) {
				System.out.print(sum+ " ");
			}
			
		}
		
	}
}
