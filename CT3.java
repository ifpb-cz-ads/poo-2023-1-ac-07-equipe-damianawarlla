import java.util.Scanner;

public class CT3 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int notas [] = new int [10];  
		int soma = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("digite a primeira nota");
			notas[i] = entrada.nextInt();
			soma = soma + notas[i];
		}
		
		double media = soma / 10;
		System.out.println("a media da turma é: " + media);
		
		entrada.close();
	}
}
