/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author pasargad
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner b=new Scanner (System.in);
        int a=b.nextInt();
        int i=1;
        int t=0;
       while(i<=a)
       {
          if(a%i==0)
          {
              t++;
          }
          i++;
       }
       if(t==2)
        System.out.print("yes");
       else
           System.out.print("no");
    }
    
}
