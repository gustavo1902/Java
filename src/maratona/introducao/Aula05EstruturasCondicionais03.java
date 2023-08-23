package maratona.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main (String[] args){
        double salario = 6000;
        String mensagemDoar ="Vou doar 300";
        String mensagemNaoDoar ="Não posso doar";
        //(condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
