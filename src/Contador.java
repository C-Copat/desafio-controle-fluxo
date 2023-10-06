import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner scannerContador = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numeroUm = scannerContador.nextInt();

        System.out.println("Digite o segundo número:");
        int numeroDois = scannerContador.nextInt();

        try {
            contar(numeroUm,numeroDois);    
        } catch (ParametrosInvalidosException pie) {
            // pie.printStackTrace();
            System.out.println("O segundo numero deve ser maior do que o primeiro.");
        };

        scannerContador.close();


    }

    static void contar (int numero1, int numero2) throws ParametrosInvalidosException{

        if (numero2 <= numero1){
            throw new ParametrosInvalidosException("Número 2 ("+numero2+") deve ser menor do que número 1 ("+numero1+")");
        }
            
        for (int i = 1; i <= (numero2-numero1); i++){
            System.out.println("Imprimindo o número "+i);
        }


    }
    
}
