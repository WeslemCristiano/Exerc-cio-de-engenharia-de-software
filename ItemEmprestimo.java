import java.util.Date;

public class ItemEmprestimo {
    private Livro livro;
    private Date dataPrevista;

    public ItemEmprestimo(Livro livro, Date dataPrevista) {
        this.livro = livro;
        this.dataPrevista = dataPrevista;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Date getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista) {
        this.dataPrevista = dataPrevista;
    }
}
