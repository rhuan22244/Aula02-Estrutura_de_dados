package exercicio2;

public class Livro {

    public String titulo;
    public String autor;
    public int numPaginas;
    public boolean disponibilidade;

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numPaginas);
        System.out.println("Disponível: " + (disponibilidade ? "Sim" : "Não"));
        System.out.println();
    }

    public String getTitulo() {
        return titulo;
    }

    public void reservar(){
        if (disponibilidade){
            disponibilidade = false;
            System.out.println("O livro" + titulo + "'foi reservado com sucesso!" );
        }else{
            System.out.println("O livro" + titulo + "'ja está reservado com sucesso!" );
        }
    }

    public void devolver(){
        if (!disponibilidade){
            disponibilidade = true;
            System.out.println("O livro" + titulo + "'foi devolvido!" );
        }else {
            System.out.println("O livro" + titulo + "'já está dispónivel!");
        }
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public Livro(String titulo, String autor, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.disponibilidade = true;
    }
}

class Livraria{
    private Livro[] livros;
    private int totalLivros;
    private String titulo;

    public Livraria(int capacidade){
        livros = new Livro[capacidade];
        totalLivros = 0;
    }

    public void inserirLivro(Livro livro){
        if (totalLivros < livros.length){
            livros[totalLivros] = livro;
            totalLivros++;
            System.out.println("Livro" + livro.getTitulo() + "' inserido com sucesso!");
        }else{
            System.out.println("Não há espaço para inserir novos livros.");
        }
    }

    public void listarLivros(){
        System.out.println("Lista de livros na livraria:");
        for (int i = 0; i < totalLivros; i++){
            livros[i].exibirDetalhes();
        }
    }

    public void listarDisponiveis(){
        System.out.println("Livros disponiveis para emprestimo");
        for (int i = 0; i < totalLivros; i++){
            if (livros[i].isDisponivel()){
                livros[i].exibirDetalhes();
            }
        }


    }
}
