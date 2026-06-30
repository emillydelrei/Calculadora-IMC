public class ClassificacaoIMC {

    private static final double magreza = 18.5;
    private static final double pesoNormal = 24.9;
    private static final double sobrePeso = 29.9;
    private static final double obesidade = 39.9;

    private final Pessoa pessoa;
    private final Calculadora calculadora;

    public ClassificacaoIMC(String nome, double altura, double peso) {

        this.pessoa = new Pessoa(nome, altura, peso);
        this.calculadora = new Calculadora();
    }

    public void calcular() {

        calculadora.calcularIMC(pessoa.getAltura(), pessoa.getPeso());
    }

    public void comparacao() {
        double imc = calculadora.getResultado();

        if (imc <= 0.0) {
            System.out.printf("Numero invalido%n");
        } else if (imc < magreza) {
            System.out.printf("Magreza%n");
        } else if (imc < pesoNormal) {
            System.out.printf("Peso ideal%n");
        } else if (imc < sobrePeso) {
            System.out.printf("Sobre peso%n");
        } else if (imc < obesidade) {
            System.out.printf("Obesidade%n");
        } else {
            System.out.printf("Obesidade grave!%n");
        }
    }

    public void informacoes() {
        System.out.printf(" %s, o seu IMC é de %.2f%n", pessoa.getNome(), calculadora.getResultado());
    }
}