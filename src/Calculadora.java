public class Calculadora extends Pessoa {

    double resultado ;

    public    void calcular() {
        double resultados = getPeso() / (getAltura() * 2);
    }


    public double getResultado() {
        return resultado;
    }
}
