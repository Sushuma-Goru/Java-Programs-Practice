

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromUser {
    
    public static void main(String[] args) {


        //Q) Read Number from standard input

        //A) Reading num from scanner and printint it

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int i = sc.nextInt();
        System.out.println("Entered number is : "+i);

        // Q) Get Input from user 
         
        // 1. Using  Buffered Reader

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number : ");
        try {
            int j = Integer.parseInt(bf.readLine());

            System.out.println("Entered number is : "+j);
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        //3 . using console

        Console c = System.console();
        System.out.println("Enter any number : ");
        int k =Integer.parseInt(c.readLine());
        System.out.println("Entered num is : "+k);

        //4.using command line arguments

        if(args.length>0)
        {
            System.out.println("The passed arguments are  : ");
            for(String s : args)
            {
                System.out.println(Integer.parseInt(s));
    
            }
        }

        //5.using DataInputStream
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"));
            
                dos.writeInt(1000);
                dos.close();
                DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"));
                int m = dis.readInt();
                System.out.println("Entered input is : "+m);
                dis.close();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

        
          
         
    }

    
