package Biblioteca;

public class Livro {
    String titulo;
    String autor;
    Usuario associado;
    Usuario nenhum = new Usuario("");
    public Livro() {
        this.associado = nenhum;
    }

    public void removerUsuario(){
        setAssociado(nenhum);
    }

    public Usuario getAssociado() {
        return associado;
    }

    public void setAssociado(Usuario associado) {
        this.associado = associado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
