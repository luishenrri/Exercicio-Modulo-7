public class Pessoa {
    private String nome;
    private int idade;

    // Obtém o nome da pessoa
    public String getNome() {
        return nome;
    }

    // Define o nome da pessoa
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Obtém a idade da pessoa
    public int getIdade() {
        return idade;
    }

    // Define a idade da pessoa
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Verifica se é maior de idade
    public void pessoaMaiorDeIdade() {
        if(this.idade >18) {
            System.out.println("Pessoa maior de idade");
        } else {
            System.out.println("Pessoa menor de idade");
        }
    }
}
