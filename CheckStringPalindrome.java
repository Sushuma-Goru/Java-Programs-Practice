import java.util.Scanner;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word : ");
        String s = sc.next();
	char[] rev = s.toCharArray();
	int left=0,right=rev.length-1;
	while(left<right)
	{
		char temp = rev[left];
		rev[left]=rev[right];
		rev[right]=temp;
		left++;
		right--;

	}
	String reverse = new String(rev);
	System.out.println("The Reverse of given word is :"+reverse);
	System.out.println(s.equals(reverse)?"Palindrome":"Not a Palindrome");
        
    }
}
