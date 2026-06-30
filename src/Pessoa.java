public class Pessoa {

    private final String nome;
    private final double altura;
    private final double peso;

    public Pessoa(String nome, double altura, double peso) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero");
        }
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser maior que zero");
        }

        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
}