package frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import dados.AlunoAvaliacao;
import dados.Alunos;
import main.Crud;
import net.miginfocom.swing.MigLayout;

public class FrameAlunos extends FrameCrud {
	
	public static void main(String[] args) {
		initialize();
	}
	
	public FrameAlunos() {
		initialize();
	}

	private static void initialize() {
		Crud alunos = new Alunos(); 
		
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[450px]", "[45px][45px][45px][45px][45px]"));
		frame.setLocation(300, 300);
		
		frame.getContentPane().add(FrameCrud.btnCadastrar,"cell 0 0,grow");
		frame.getContentPane().add(FrameCrud.btnExcluir,"cell 0 1,grow");
		frame.getContentPane().add(FrameCrud.btnAddAvaliação,"cell 0 2,grow");
		frame.getContentPane().add(FrameCrud.btnPesquisar, "cell 0 3,grow");
		frame.getContentPane().add(FrameCrud.btnVoltar, "cell 0 4,grow");
		
		FrameCrud.cadatro(btnCadastrar, alunos);
		FrameCrud.excluir(btnExcluir, alunos);
		FrameCrud.pesquisar(btnPesquisar, alunos);
		avaliacao(btnAddAvaliação, alunos);
		FrameCrud.voltar(btnVoltar);
		
	}
	
	public static void avaliacao(JButton btn, Crud crud ) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlunoAvaliacao.cadastrarNotas();
			}
		});
	}
}
