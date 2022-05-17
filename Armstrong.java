package week1.day2;

public class Armstrong 
{
	public static void main(String[] args) {
		int input=152;
		int output=0;
		int temp=input;
		while(input>0)
		{
			int rem=input%10;
			output=output+(rem*rem*rem);
			input=input/10;
		}
		System.out.println(output);
		if (temp==output) {
			System.out.println("Armstrong number");
		}
		else
		{		System.out.println("Armstrong number");
		}
	}}