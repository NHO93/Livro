package livro.modulos;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private final List<Livro> livros;

    public CatalogoLivros() {

        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {

        livros.add(livro);
    }

    public List<Livro> obterTodosLivros() {

        return new ArrayList<>(livros);
    }

	List<Livro> CatalogoLivros() {
		throw new UnsupportedOperationException("Not supported yet.");
	}
}