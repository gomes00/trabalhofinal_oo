package frames;

import javax.swing.JButton;
import javax.swing.JFrame;

import dados.Alunos;
import dados.Avaliacoes;
import main.Crud;
import net.miginfocom.swing.MigLayout;

public class FrameAvaliacao extends FrameCrud {

	public static void main(String[] args) {
		
	}
	
	public FrameAvaliacao() {
		initialize();
	}

	private static void initialize() {
		Crud avaliacao = new Avaliacoes(); 
		
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[450px]", "[45px][45px][45px][45px]"));
		frame.setLocation(300, 300);
		
		frame.getContentPane().add(FrameCrud.btnCadastrar,"cell 0 0,grow");
		frame.getContentPane().add(FrameCrud.btnExcluir,"cell 0 1,grow");
		frame.getContentPane().add(FrameCrud.btnPesquisar, "cell 0 2,grow");
		frame.getContentPane().add(FrameCrud.btnVoltar, "cell 0 3,grow");
		
		FrameCrud.cadatro(btnCadastrar, avaliacao);
		FrameCrud.excluir(btnExcluir, avaliacao);
		FrameCrud.pesquisar(btnPesquisar, avaliacao);
		FrameCrud.voltar(btnVoltar);
		
	}
}
