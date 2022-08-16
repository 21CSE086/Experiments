/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author 21CSE086
 */import java.util.Scanner;
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      int a,b,result;
      System.out.println("minimum in a list");
      a=10;
      b=20;
      int result1=(a<b)?a:b;
      System.out.println("result"+result1);
    }
    
}
