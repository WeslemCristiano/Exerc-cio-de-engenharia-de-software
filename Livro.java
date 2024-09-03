public class Livro {
    private String ISBN;
    private boolean disponivel;
    private int exemplaresDisponiveis;
    private Titulo titulo;

    public Livro(String ISBN, Titulo titulo, int exemplares) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.exemplaresDisponiveis = exemplares;
        this.disponivel = exemplares > 0;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }

    public void setExemplaresDisponiveis(int exemplaresDisponiveis) {
        this.exemplaresDisponiveis = exemplaresDisponiveis;
        this.disponivel = exemplaresDisponiveis > 0;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }
}
