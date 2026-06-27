import java.util.Scanner;

class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Olá, para fazermos o calculo do seu IMC precisaremos de algumas informações: ");
        System.out.printf("Qual seu nome?");
        String nome = scanner.nextLine();
        System.out.printf("Qual é a sua altura(em centimetros)?");
        double altura = scanner.nextDouble();
        System.out.printf("Qual seu peso?");
        double peso = scanner.nextDouble();
        System.out.printf("Qual a sua idade?");
        int idade = scanner.nextInt();

ClassificacaoIMC calculos = new ClassificacaoIMC();

calculos.setNome(nome);
calculos.setAltura(altura);
calculos.setPeso(peso);
calculos.setIdade(idade);

calculos.calcular();
calculos.comparacao();
calculos.informaçoes();






    }
}