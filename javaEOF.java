package hackerrank;
import java.util.*;


public class javaEOF {
	
    
	public static void main(String[] args) {
		
	      Scanner scan = new Scanner(System.in);
	        int line = 1;
	        while (scan.hasNextLine()) {
	            System.out.println(line ++ + " " + scan.nextLine());
	        }
	        scan.close();
    }

}
