import java.util.Scanner;
//Ler oque a pessoa digitar
public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme preferido");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();
        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
