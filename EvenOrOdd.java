import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int i= sc.nextInt();
        EvenOrOdd(i);
        //System.out.println(i%2==0?"Even":"Odd");
        
    }

    private static void EvenOrOdd(int i) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'EvenOrOdd'");
    System.out.println(i%2==0?"Even":"Odd");
    }
}
