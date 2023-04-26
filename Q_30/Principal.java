package Q_30;
import java.util.Scanner;
public class Principal {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n;

	        System.out.print("Digite um número inteiro e positivo: ");
	        n = sc.nextInt();

	        double e = 1.0;
	        double fatorial = 1.0;

	        for (int i = 1; i <= n; i++) {
	            fatorial *= i;
	            e += 1.0 / fatorial;
	        }

	        System.out.println("O valor de E é: " + e);
	    }
	}


