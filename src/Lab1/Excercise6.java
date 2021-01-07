package Lab1;

public class Excercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2; 
		System.out.println(calculateDifference (n));	 

	}
	static int calculateDifference (int n){ 

	int sum=0,sum1=0,diff=0;
	
		for(int i=1;i<=n;i++)
		{
			sum=sum+(i*i);
			sum1=sum1+i;
			
		}
		diff=sum-(sum1*sum1);
		return diff;
	} 
}