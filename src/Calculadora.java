import java.nio.channels.FileLockInterruptionException;

public class Calculadora {

    private double resultado;

    public double calcularIMC(double altura, double peso) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero ");
        } else if (altura> 3.0) {
            throw new IllegalArgumentException("Altura deve ser menor que tres metros");

        }
        this.resultado = peso / (altura * altura);
        return this.resultado;
    }

    public double getResultado() {
        return resultado;
    }
}