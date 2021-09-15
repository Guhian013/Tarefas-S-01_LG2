class Estatistica {
  public static double calcularMedia(double[] valores) {
    double soma = 0.0;
    for(double valor : valores) {
      soma += valor;
    }
    return soma / valores.length;
  }

  public static void verify(double[] values) {
    double max = 0.0;

      for(int i=0; i<values.length; ++i) {
        if(values[i] > max) {
          max = values[i];
        }
      }

      double min = values[0];

      for(int i=1; i<values.length; ++i) {
        if(values[i] < min) {
          min = values[i];
        }
      }

      System.out.println("\nA Maior nota é: " + max);
      System.out.println("A Menor nota é: " + min);
  }
}

