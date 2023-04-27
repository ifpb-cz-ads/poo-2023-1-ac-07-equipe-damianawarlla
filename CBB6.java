import java.util.Scanner;



public class CBB6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int maiorNumero = 0;

        for(int i=0;i<=9;i++){
            System.out.println("digite um numero: ");
            numeros[i] = entrada.nextInt();
            System.out.println("o numero digitado foi: " +numeros[i]);
            maiorNumero = numeros[i];
            if(maiorNumero < numeros[i]){
                maiorNumero = numeros[i];
            }
        }
        System.out.println("o maior numero foi:"+ maiorNumero);

    }
}

