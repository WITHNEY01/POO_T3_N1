package Q_18;
import java.util.Scanner;
public class Principal {
	   public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int num;

		        System.out.print("Digite um número inteiro maior que 1: ");
		        num = sc.nextInt();

		        boolean isPrime = true;

		        if (num <= 1) {
		            System.out.println(num + " não é um número primo.");
		        } else {
		            for (int i = 2; i <= Math.sqrt(num); i++) {
		                if (num % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }

		            if (isPrime) {
		                System.out.println(num + " é um número primo.");
		            } else {
		                System.out.println(num + " não é um número primo.");
		            }
		        }
		    }
		



	 }

