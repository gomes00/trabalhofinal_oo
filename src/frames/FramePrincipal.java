package frames;

import java.awt.Dimension;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FramePrincipal {
	//método para criar e apresentar a interface gráfica ao usuario 
		private static void criarApresentarGUI() {
			//Define o titulo da janela e a operacao a ser realizada ao 
			//sair da aplicacao.
	 	 	JFrame janela = new JFrame("Trabalho Final - OO");
	 	 	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	 	janela.setMinimumSize(new Dimension(500, 200));
	 	 	janela.setLocation(300, 300);
	 	 	
	 	 	//Adiciona um componente de texto no conteudo da janela
	 	 	
	 	 	
	 	 	//Exibe a janela e seus elementos
	 	 	janela.pack(); // Faz a janela ser dimensionada no tamanho escolhido (ou melhor tamanho) 
	 	 	janela.setVisible(true); //apresenta janela
	 	 	
		}
		
		
		public static void main(String[] args) {
			criarApresentarGUI();
		}
}
