package exercicio1;

public class Pessoa {
    private String nome;
    public String email;

    public Pessoa(){}

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void logar(){
        System.out.println("Usuário Logado.");
    }
}
