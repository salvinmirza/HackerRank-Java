package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class javaLoopII {
	
    
    public static void main(String[] args) throws IOException {
   
    	 Scanner in = new Scanner(System.in);
         int t=in.nextInt();
         for(int i=0;i<t;i++){
             int a = in.nextInt();
             int b = in.nextInt();
             int n = in.nextInt();
             int res = a;
             for (int j = 0; j < n; j++)
             {
                 res += (int)(Math.pow(2, j) * b);
                 System.out.print(Integer.toString(res)  + ' ');
             }
             System.out.println();

         }

         in.close();
    	
    }

}
