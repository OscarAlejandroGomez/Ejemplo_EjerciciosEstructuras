package ejemplo;

import java.util.*;
import java.io.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alejandro
 */
public class DataTypes {
 public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x <= 32767 && x>= -32768)System.out.println("* short");
                if(x <= 2147483647 && x>= -2147483648)System.out.println("* int ");
                if(x <= Math.pow(2, 31)-1 && x>= Math.pow(-2, 31) )System.out.println("* long ");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

