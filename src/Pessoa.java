public class Pessoa {

    private String nome;
    private String genero;
    private double altura;
    private double peso;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Pessoa(String nome, String genero, double altura, double peso) {
        this.nome = nome;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }
}
