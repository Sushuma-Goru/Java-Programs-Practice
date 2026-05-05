import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String s1=sc.next();
        // StringBuilder sb=new StringBuilder(s1);
        // System.out.println(sb.reverse().toString());
        //String s2="";
        //char[] c = s1.toCharArray();
        // for(int i=s1.length()-1;i>=0;i--)

        // {
        //     s2=s2+s1.charAt(i);
        // }

        // System.out.println("The Reverse of given String is : "+s2);

        //String s1 = "Automation";
		//char temp='';
		char[] c = s1.toCharArray();
		int left =0,right=c.length-1;
		while(left<right)
		{
		char temp=c[left];
		c[left]=c[right];
		c[right]=temp;
		left++;
		right--;
		
		}
		System.out.println(new String(c));
        
    }
    
}
