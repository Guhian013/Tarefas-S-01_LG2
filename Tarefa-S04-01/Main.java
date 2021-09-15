class Main {
  public static void main(String[] args) {
    String name = args[0];

    double[] notas = new double[args.length-1];

      for(int i=0; i<notas.length; ++i) {
        notas[i] = Double.parseDouble(args[i+1]);
      }

    double media = Estatistica.calcularMedia(notas);

    exibirNota(media, name);

    Estatistica.verify(notas);
  }

  public static void exibirNota(double nota, String nome) {
    System.out.println(String.format(nome + " tem média %.2f", nota));
  }
}
