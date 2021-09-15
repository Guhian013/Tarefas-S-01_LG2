import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int reach = 0;
        double soma = 0, result = 0;

        System.out.printf("Entre com o numero de notas: ");
        reach = read.nextInt();

        double[] notas = new double[reach];

        for (int i=0; i<notas.length;++i) {
            System.out.printf("Entre com a nota " + (i + 1) + ": ");
            notas[i] = read.nextDouble();
        }

        for (int i=0;i<notas.length;++i) {
            soma += notas[i];
        }

        result = soma / notas.length;

        System.out.println("\nMédia: " + result);

        read.close();
    }
}
