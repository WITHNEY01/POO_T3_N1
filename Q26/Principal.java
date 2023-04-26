package Q26;

public class Principal {
	
			 public static void main(String[] args) {
			  int qtd = 0;
			  int num = 1;

			  System.out.println("Os cinco primeiros múltiplos de 3 depois do zero são: ");
			  while (qtd < 5) {
			      if ((num%3) == 0) {
			          System.out.println(num);
			          qtd++;
			      }

			  num++; 
			  }
			 }


			}