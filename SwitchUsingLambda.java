import java.util.Scanner;

public class SwitchUsingLambda {

    public static void main(String[] args) {
        
        //String day = "Mon";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of week : ");
        String day = sc.next();
        switch(day)
        {
            case "Mon","Tues","Wed","Thurs","Fri" -> System.out.println("Its a week day");
            case "Sat","Sun"->System.out.println("Its a weekend");
            default->System.out.println("Enter valid day");
        }
     
        //System.out.println(result);
    }
    }

   
