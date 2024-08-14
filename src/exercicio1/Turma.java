package exercicio1;

public class Turma {
    private String nome;
    private Professor professor;
    private Aluno[] alunos;
    private int posicaoAtual = 0;
    public Turma(String nome, Professor professor, int numeroVagas){
        this.nome = nome;
        this.professor = professor;
        alunos = new Aluno[numeroVagas];
    }

    public void inserirAluno(Aluno aluno){
        alunos[posicaoAtual] = aluno;
        posicaoAtual++;
    }

    public void listar(){
        for(int i = 0; i < posicaoAtual; i++){
            System.out.println("exercicio1.Aluno" + (i + 1)+": " + alunos[i].getNome());
        }
    }


}
