import java.util.Scanner;

public class CheckNumPalindrome {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter any number : ");
int n=sc.nextInt();
int rev=0,rem;
int temp=n;
while(n>0)
{
	rem=n%10;
	rev=rev*10+rem;
	n=n/10;
	
}
System.out.println("The Reverse of a number is :"+rev);

System.out.println(rev==temp?"Palindrome":"Not a Palindrome");
        
    }
}
