import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner ler = new Scanner(System.in);

        int[] num1 = {1, 7, 2, 8, 10};

        System.out.println("Soma Iterativa");
        System.out.println(somaIterativa(num1));

        System.out.print("\nEntre com o tamanho do Array: ");
        int tamanho = ler.nextInt();

        int[] num2 = new int[tamanho];

        for(int i=0; i<num2.length; ++i) {
            System.out.print("Entre com o " + (i+1) + " número: ");
            num2[i] = ler.nextInt();
        }

        System.out.println("\nSoma Recursiva");
        System.out.println(somaRecursiva(num2, tamanho));

        ler.close();
    }

    public static int somaIterativa(int[] numeros) {
        int soma = 0;

        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        return soma;
    }

    public static int somaRecursiva(int[] numeros, int n) {
        if(n == 0) {
            return 0;
        } else {
            return numeros[n-1] + somaRecursiva(numeros, n-1);
        }
    }
}
