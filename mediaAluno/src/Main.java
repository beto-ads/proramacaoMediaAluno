import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //implementado a classe Aluno para uso dos Get.
        Aluno aluno = new Aluno();

        //abaixo esta os que pedimos ao usuario para fazer o calculo da media..
        //..e esta sendo feio o uso do Get para pegar(Get) os dados que precisamos
        System.out.println("------------------------------------------------------");
        System.out.println("Bem vindo ao Sistema de calculos de Notas Educacionais");
        System.out.println("------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Nome do Aluno: ");
        String nome = scanner.nextLine();
        aluno.setNome(nome);
        System.out.println("RA: ");
        int R_A = scanner.nextInt();
        aluno.setR_A(R_A);
        System.out.println("Nota da primeira Prova: ");
        double nProva1 = scanner.nextDouble();
        aluno.setnProva1(nProva1);
        System.out.println("Nota da segunda Prova: ");
        double nProva2 = scanner.nextDouble();
        aluno.setnProva2(nProva2);
        System.out.println("Nota de Trabalho: ");
        double nTrabalho = scanner.nextDouble();
        aluno.setnTrabalho(nTrabalho);

       //Chamando o método calcularMedia() para fazer o calculo após os dados do aluno serem coletado
        System.out.println(aluno.calcularMedia());
        //Chamando o método calcularMedia() para imprimir se o aluno foi aprovado ou não
        System.out.println( aluno.situacao());
        //Chamando o método situacao() para imprimir o RA, Nome, Média e situacao
        System.out.println(aluno.toString());





    }
}