public class Swap2Num {

    public static void main(String[] args) {
        
        int a=10;
        int b=20;
        System.out.println("Before Swap : "+a+" "+b);

        swapUsingTemp(a,b);
        swapUsingAddSub(a,b);
        swapUsingMulDiv(a,b);
        swapUsingXor(a,b);
        swapWithSingleExpression(a,b);

        
    }

    private static void swapWithSingleExpression(int a, int b) {

    b=a+b-(a=b);
    System.out.println("After swap : "+a+" " +b);
        
      }

    private static void swapUsingXor(int a, int b) {
    
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After swap : "+a+" " +b);
        

    }


    private static void swapUsingMulDiv(int a, int b) {

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After swap : "+a+" " +b);
        
        }

    private static void swapUsingAddSub(int a, int b) {

        a=a+b;
        b=a-b;
        a=a-b;
       System.out.println("After swap : "+a+" " +b);
        
        }

    private static void swapUsingTemp(int a, int b) {
        int t=a;
        a=b;
        b=t;
        System.out.println("After swap : "+a+" " +b);
        
        }

    
    
}
