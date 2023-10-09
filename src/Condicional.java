public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 6.4;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Filme novo");
        } else {
            System.out.println("Filme antigo");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme disponível");
        } else {
            System.out.println("Deve adquirir o plano");
        }
    }
}

//teste teste
