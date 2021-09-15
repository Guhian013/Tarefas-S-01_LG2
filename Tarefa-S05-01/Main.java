import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 4, 5, 7, 9, 11, 15};
        int numero = 15;
        
        int posicaoEncontrada = buscaBinaria_N(numero, numeros);

        System.out.println("O número encontrado está na " + posicaoEncontrada + "ª posição");

        if(posicaoEncontrada >= 0) {
            System.out.println(numeros[posicaoEncontrada]);
        }

        String[] doces = {"Bala", "Sorvete", "Chocolate", "Pirulito", "Goiabada", "Chiclete", "Cereal"};
        Arrays.sort(doces);

        String doce = "Chiclete";

        int resultadoPosicao = buscaBinaria_S(doce, doces);

        System.out.print("\nO array de Strings ordenados é: ");

        for(int i = 0; i < doces.length; ++i) {
            System.out.print(doces[i] + ", ");
        }

        System.out.println("\n\nA String encontrada está na " + resultadoPosicao + "ª posição");

        if(resultadoPosicao >= 0) {
            System.out.println(doces[resultadoPosicao]);
        }
    }

    public static int buscaBinaria_S(String valor, String[] valores) {
        int inicio = 0;
        int fim = valores.length - 1;
        int meio;
  
        while(inicio <= fim) {
            meio = (inicio + fim) / 2;
            
            if(valor.equals(valores[meio])) {
                return meio;
            } else if(valor.compareTo(valores[meio]) > 0) {
                inicio = meio + 1;
            } else {
                fim = meio -1;
            }
        }
        return -1; 
    }
  
    public static int buscaBinaria_N(int elemento, int[] elementos) {
        int inicio = 0;
        int fim = elementos.length - 1;
        int meio;
  
        while(inicio <= fim) {
            meio = (inicio + fim) / 2;
            
            if(elemento == elementos[meio]) {
                return meio;
            } else if(elemento > elementos[meio]) {
                inicio = meio + 1;
            } else {
                fim = meio -1;
            }
        }
        return -1;
    }
}
