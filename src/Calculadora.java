public class Calculadora extends Pessoa {

    private double resultado ;

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public    void calcular() {
        double a = getAltura()*2;
        double resultado= getPeso() / a;
        setResultado(resultado);
    }


    public double getResultado() {
        return resultado;
    }
}
