package maratona.javacore.Bintroducaometodos.dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) {
            System.out.println(salario + " ");
        }
    }

    public void imprimeMediaSalario() {
        double media = 0.0; // Inicializa a variável média com 0.0
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length; // Calcula a média dividindo pelo número de salários
        System.out.println("Média salarial: " + media);
    }
}