public class Add2BinaryStrings {

    public static void main(String[] args) {
        
        String a = "01";
        String b="10";
        int a1=Integer.parseInt(a,2);
        int a2=Integer.parseInt(b,2);
        
        System.out.println(Integer.toBinaryString(a1+a2));
        //sum(a,b);
    }
    // public static String sum(String s1,String s2)
    // {   
    //     int sum=0,carry=0;
    //     String s3="";
    //     for(int i=0,j=0;i<s1.length()||j<s2.length();i++,j++)
    //     {
    //         if(s1.charAt(i)==0 &&s2.charAt(j)==0)
    //             {sum=0;
    //             s3=s3+sum;
    //             carry=0;    }
    //         else if(s1.charAt(i)==0 && s2.charAt(j)==1)
    //             {
    //                 sum=1;
    //             }
    //     }
    //     return s1;
    }
    
}
