import java.util.Scanner;

public class ReverseStringUsingArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any word : ");
		String s = sc.next();
		char[] c = s.toCharArray();
		int left=0,right=c.length-1;
		while(left<right)
		{
			char temp=c[left];
			c[left]=c[right];
			c[right]=temp;
			left++;
			right--;
		}
		System.out.println("The Reverse of word is : "+new String(c));
	}
}