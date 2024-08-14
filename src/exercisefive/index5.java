package exercisefive;
import java.util.Scanner;
public class index5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
	       double conversion= 0.0016;
	       System.out.print("Ingresa la cantidad de pesetas:");
	       double peseta=teclado.nextInt();
	       double euros= peseta*conversion;
	       System.out.print("la conversion para pesetas es:");
	       System.out.println(peseta + "pesetas son equivalentes a " + euros + "euro.");
	       teclado.close();
 
	}

}
