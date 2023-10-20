package livro;
	
import javax.swing.JOptionPane;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        while (true) {
           //Opções 
			String[] opcoes = {"Adicionar Livro", "Listar Livros", "Sair"};
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Catalogação de Livros",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            switch (escolha) {
                //Opção de cadastrar livro
				case 0:
                    String titulo = JOptionPane.showInputDialog("Título do Livro:");
                    String autor = JOptionPane.showInputDialog("Autor do Livro:");
                    String editora = JOptionPane.showInputDialog("Editora do Livro:");
                    int anoPublicacao;
                    try {
                        anoPublicacao = Integer.parseInt(JOptionPane.showInputDialog("Ano de Publicação:"));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Ano de Publicação inválido. Por favor, insira um número.");
                        continue; // Reinicia o loop para que o usuário insira um ano válido.
                    }

                    Livro novoLivro = new Livro(titulo, autor, editora, anoPublicacao);
                    catalogo.adicionarLivro(novoLivro);
                    JOptionPane.showMessageDialog(null, "Livro adicionado com sucesso!");
                    break;
					//Opção Lista de livros
                case 1: 
                    List<Livro> livros = catalogo.obterTodosLivros();
                    StringBuilder listaLivros = new StringBuilder("Lista de Livros:\n");
                    for (Livro livro : livros) {
                        listaLivros.append(livro).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, listaLivros.toString());
                    break;
					//Opção de sair do programa
                case 2:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa. Até logo!");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
