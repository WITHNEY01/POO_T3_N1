package Q_32;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int x, y;

	        System.out.print("Digite um número inteiro e positivo para X: ");
	        x = sc.nextInt();

	        System.out.print("Digite um número inteiro e positivo para Y: ");
	        y = sc.nextInt();

	        int resultado = 1;

	        for (int i = 1; i <= y; i++) {
	            resultado *= x;
	        }

	        System.out.println(x + " elevado a " + y + " é igual a: " + resultado);
	    }
	}

