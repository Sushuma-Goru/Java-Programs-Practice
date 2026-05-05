import java.util.Scanner;

public class ReverseWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String sentence = sc.nextLine();
	String[] words = sentence.split(" ");
	//StringBuilder reverse = new StringBuilder();
    String s="";
	for(String e : words)
	{
		
	 s =s+new StringBuilder(e).reverse().toString()+" ";
     

	 
	}
      System.out.println("The Reversed words of given sentence is : "+s); 
    }
}
