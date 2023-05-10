// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pessoa primeiraPessoa = new Pessoa();

        primeiraPessoa.setNome("Chaves del 8");
        System.out.println(primeiraPessoa.getNome());

        primeiraPessoa.setIdade(7);
        System.out.println(primeiraPessoa.getIdade());

        primeiraPessoa.pessoaMaiorDeIdade();

        System.out.println("\n");

        Pessoa segundaPessoa = new Pessoa();
        segundaPessoa.setNome("Seu Madruga");
        System.out.println(segundaPessoa.getNome());

        segundaPessoa.setIdade(47);
        System.out.println(segundaPessoa.getIdade());

        segundaPessoa.pessoaMaiorDeIdade();
    }
}