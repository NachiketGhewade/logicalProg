package logical_Programs;

public class SumOfElementsInArray {

	public static void main(String[] args) {

		int a []= {5,3,6,9,7,9};
		int sum =0;
		
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of elements in array:"+ sum);
	}

}
