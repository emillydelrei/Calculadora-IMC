import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Olá, para fazermos o calculo do seu IMC precisaremos de algumas informações: ");

            Pessoa pessoa = null;


            while (pessoa == null) {
                try {
                    System.out.println("Qual seu nome?");
                    String nome = scanner.nextLine().trim();

                    if (nome.isEmpty()) {

                        throw new IllegalArgumentException("Nome não pode ser vazio");
                    }

                    double altura = lerDoublePositivo(scanner, "Qual é a sua altura, em metros? (ex: 1.75)");
                    double peso = lerDoublePositivo(scanner, "Qual seu peso, em kg? (ex: 70.5)");


                    pessoa = new Pessoa(nome, altura, peso);

                } catch (IllegalArgumentException e) {

                    System.out.println("Erro: " + e.getMessage() + ". Vamos tentar novamente do início.\n");
                }
            }


            ClassificacaoIMC calculos = new ClassificacaoIMC(pessoa.getNome(), pessoa.getAltura(), pessoa.getPeso());

            calculos.calcular();
            calculos.comparacao();
            calculos.informacoes();
        }
    }

    private static double lerDoublePositivo(Scanner scanner, String mensagem) {
        while (true) {
            System.out.println(mensagem);
            String entrada = scanner.nextLine().trim().replace(",", ".");

            try {
                double valor = Double.parseDouble(entrada);
                if (valor > 0) {
                    return valor;
                }
                System.out.println("O valor precisa ser maior que zero. Tente de novo.");
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número, ex: 1.75");
            }
        }
    }
}
