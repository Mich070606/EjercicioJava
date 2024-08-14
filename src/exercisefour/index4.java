package exercisefour;

import java.util.Scanner;
public class index4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
	       int euro;
	       double conversion=166.386;
	       System.out.print("Ingresa la cantidad de euros:");
	       euro=teclado.nextInt();
	       double pesetas= euro*conversion;
	       System.out.print("la conversion para pesetas es:");
	       System.out.println(pesetas);
	       teclado.close();
		
	    
		
		

	}

}
