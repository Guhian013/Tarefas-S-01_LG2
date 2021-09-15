import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Entre com o tamanho do Array: ");
        int tam = ler.nextInt();

        int[] numeros = new int[tam];

        for(int i=0; i<numeros.length; ++i) {
            System.out.print("Entre com o " + (i+1) + " número: ");
            numeros[i] = ler.nextInt();
        }
        
        System.out.println("Números Originais");
        VetorUtil.imprimirVetor(numeros);

        int[] numerosOrdenados1 = Ordenacao.bubbleSort(numeros);
        int[] numerosOrdenados2 = Ordenacao.insertionSort(numeros);

        System.out.println("Bubble Sort");
        VetorUtil.imprimirVetor(numerosOrdenados1);
        System.out.println("Insertion Sort");
        VetorUtil.imprimirVetor(numerosOrdenados2);

        ler.close();
    }
}

class Ordenacao {
    public static int[] bubbleSort(int[] vetor) {
        vetor = VetorUtil.copiar(vetor);
        int aux;
        
        for(int i = 0; i < vetor.length; i++) {
            for(int j = 0; j < vetor.length - 1; j++) {
                if(vetor[j] > vetor[j+1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        } 
        return vetor;
    }

    public static int[] insertionSort(int[] vetor) {	
		for (int i = 1; i < vetor.length; i++) {
			int aux = vetor[i];
			int j = i;
			
			while ((j > 0) && (vetor[j-1] > aux)) {
				vetor[j] = vetor[j-1];
				j -= 1;
			}
			vetor[j] = aux;
		}
        return vetor;
	}
}

class VetorUtil {
    public static int[] copiar(int[] vetor) {
        int[] novoVetor = new int[vetor.length];
        for(int i = 0; i < novoVetor.length; i++) {
            novoVetor[i] = vetor[i];
        }
        return novoVetor;
    }
    
    public static void imprimirVetor(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        System.out.println("------------------");
    }
}
