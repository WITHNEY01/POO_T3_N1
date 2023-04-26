package Q_04;
import java.util.Scanner;
public class Principal {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a, b;

	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Digite o valor inteiro e positivo de a para o par " + i + ":");
	            a = sc.nextInt();

	            System.out.println("Digite o valor inteiro e positivo de b para o par " + i + ":");
	            b = sc.nextInt();

	            System.out.print("Os números inteiros pares de " + a + " até " + b + " são: ");

	            for (int j = a; j <= b; j++) {
	                if (j % 2 == 0) {
	                    System.out.print(j + " ");
	                }
	            }

	            System.out.println();
	        }
	    }
	}

