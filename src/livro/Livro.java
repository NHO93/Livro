package livro;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;

    public Livro(String titulo, String autor, String editora, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "\n----------------------------------------" +
				"\nLivro" +
                "\nTitulo: " + titulo +
                "\nAutor: " + autor +
                "\nEditora: " + editora +
                "\n Ano de Publicacao: " + anoPublicacao +
			    "\n----------------------------------------";
    }
}
