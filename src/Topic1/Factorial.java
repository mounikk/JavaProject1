package Topic1;

import javax.swing.JOptionPane;

public class Factorial {
	 public static void main(String[] args) {

		    int num = Integer.parseInt(JOptionPane.showInputDialog ("Enter any number "));
		       int f = f(num);
		       System.out.println(f);
		   }
		    static int f(int n){
		        if(n==0 || n==1)
		            return 1;
		        else
		            return n*f(n-1);
		    }
}
