public class Titulo {
    private String nome;
    private int ano;
    private Autor autor;

    public Titulo(String nome, int ano, Autor autor) {
        this.nome = nome;
        this.ano = ano;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
