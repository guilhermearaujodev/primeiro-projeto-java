public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Uncharted: Fora do Mapa");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 6.4;
        //Média calculada pelas 3 notas minha e de dois amigos em relação ao filme.
        double media = (6.5 + 6.2 + 5.4) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme de ação e aventura.
                Adapção baseada no jogo da empresa Nauty Dog.
                Bom mas esperava mais!
                Ano de lançamento: 
                """ + anoDeLancamento;
        System.out.println(sinopse);

        //Realizar média da nota do filme de 1 a 5 "estrelas"
        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}
       /* public class DesafioTemperatura {

            public static void main(String[] args) {
                double temperaturaEmCelsius = 30.4;
                double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

                String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit",
                        temperaturaEmCelsius, temperaturaEmFahrenheit);

                int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
                System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);
            }
        }
        */