public class ClassificacaoIMC extends Calculadora {

    // indices
    protected double magreza = 18.5;
    protected double pesoNormal = 24.9;
    protected double sobrePeso = 29.9;
    protected double obesidade = 39.9;
    protected double obesidadeGrave = 40.0;


    public void comparacao() {
        if (resultado < =0.0) {
            System.out.printf("Numero invalido");
        } else if (resultado < magreza) {
            System.out.println(" Magreza ");
        } else if (resultado > magreza && resultado < pesoNormal) {
            System.out.printf(" Peso ideal ");

        } else if (resultado > pesoNormal && resultado < sobrePeso) {
            System.out.printf(" sobre peso");

        } else if (resultado > sobrePeso && resultado < obesidade) {
            System.out.printf(" obesidade");

        } else if (resultado >= obesidadeGrave) {
            System.out.printf("obesidade grave!");
        }
    }
public void informaçoes(){

    System.out.printf("Olá "+getNome()+" o resultado do seu IMC é de: "+resultado);
}


}
