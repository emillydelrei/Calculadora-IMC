public class Calculadora extends Pessoa {

    private double resultado ;

    public Calculadora (String nome, double altura, double peso) {
        super(nome, altura, peso);
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public    void calcular() {
        double a = getAltura()*getAltura();
        double resultado= getPeso() / a;
        setResultado(resultado);
    }


    public double getResultado() {
        return resultado;
    }
}
