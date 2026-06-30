import java.util.Scanner;

class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, para fazermos o calculo do seu IMC precisaremos de algumas informações: ");
        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Qual é a sua altura(0,00)?");
        double altura = scanner.nextDouble();
        System.out.println("Qual seu peso?");
        double peso = scanner.nextDouble();


        ClassificacaoIMC calculos = new ClassificacaoIMC(nome, altura, peso);

        calculos.calcular();
        calculos.comparacao();
        calculos.informacoes();







    }
}