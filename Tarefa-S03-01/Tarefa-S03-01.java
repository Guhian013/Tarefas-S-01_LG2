import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int reach = 0;

        System.out.printf("Entre com o numero de elementos: ");
        reach = read.nextInt();

        int[] values = new int[reach];

        int max = 0;

        for(int i=0; i<values.length; ++i) {
            System.out.print("Entre com o " + (i+1) + " valor: ");
            values[i] = read.nextInt();

            if(values[i] > max) {
                max = values[i];
            }
        }

        int min = values[0];

        for(int i=1; i<values.length; ++i) {
            if(values[i] < min) {
                min = values[i];
            }
        }

        System.out.println("\nO Maior valor é: " + max);
        System.out.println("O Menor valor é: " + min);


        read.close();
    }
}
