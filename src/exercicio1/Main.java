package exercicio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Alberto","Alberto@gmail.com");
        //pessoa1.nome = "Juliano";
        pessoa1.setNome("Juliano");
        //pessoa1.email = "juliano@gmail.com";
        pessoa1.setEmail("juliano@gmail.com");
        pessoa1.logar();
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Nome: " + pessoa1.getEmail());
        System.out.println("Nome:" + pessoa2.getNome());
        System.out.println("Nome:" + pessoa2.getEmail());

        Professor profi1 = new Professor();
        profi1.logar();

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Ana");
        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");

        Turma turma1 = new Turma("estrutura de dados",
                profi1,30);

        turma1.inserirAluno(aluno1);
        turma1.inserirAluno(aluno2);
        turma1.listar();



    }
}
