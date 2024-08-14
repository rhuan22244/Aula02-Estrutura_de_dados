package exercicio2;

public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria(10); // Livraria com capacidade para 10 livros

        Livro livro1 = new Livro("Java Programming", "James Gosling", 500);
        Livro livro2 = new Livro("Clean Code", "Robert C. Martin", 464);
        Livro livro3 = new Livro("Design Patterns", "Erich Gamma", 395);

        livraria.inserirLivro(livro1);
        livraria.inserirLivro(livro2);
        livraria.inserirLivro(livro3);

        livraria.listarLivros(); // Lista todos os livros
        livraria.listarDisponiveis(); // Lista apenas os disponíveis

        livro1.reservar(); // Reserva o livro1
        livro1.reservar(); // Tenta reservar novamente, mas já está reservado

        livro1.devolver(); // Devolve o livro1
        livro1.reservar(); // Reserva novamente
    }
}

