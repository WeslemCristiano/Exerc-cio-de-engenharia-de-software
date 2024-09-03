import java.util.Date;
import java.util.List;

public class Emprestimo {
    private List<ItemEmprestimo> itens;
    private Date dataEmprestimo;

    public Emprestimo(List<ItemEmprestimo> itens) {
        this.itens = itens;
        this.dataEmprestimo = new Date();
    }

    public List<ItemEmprestimo> getItens() {
        return itens;
    }

    public void setItens(List<ItemEmprestimo> itens) {
        this.itens = itens;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date calcularDataDeDevolucao() {
        Date dataMaxima = itens.stream()
                               .map(ItemEmprestimo::getDataPrevista)
                               .max(Date::compareTo)
                               .orElse(dataEmprestimo);

        if (itens.size() >= 3) {
            int diasExtras = (itens.size() - 2) * 2;
            dataMaxima = new Date(dataMaxima.getTime() + diasExtras * 24 * 60 * 60 * 1000L);
        }

        return dataMaxima;
    }
}
