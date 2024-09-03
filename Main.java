import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Nome Autor", "Sobrenome Autor");
        Titulo titulo = new Titulo("Exemplo de Livro", 2024, autor);
        Livro livro1 = new Livro("123456789", titulo, 5);
        Livro livro2 = new Livro("987654321", titulo, 5);

        ItemEmprestimo item1 = new ItemEmprestimo(livro1, new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000L));
        ItemEmprestimo item2 = new ItemEmprestimo(livro2, new Date(System.currentTimeMillis() + 10 * 24 * 60 * 60 * 1000L));

        List<ItemEmprestimo> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);

        Emprestimo emprestimo = new Emprestimo(itens);
        Date dataDevolucao = emprestimo.calcularDataDeDevolucao();

        System.out.println("Data de Devolução: " + dataDevolucao);
    }
}
