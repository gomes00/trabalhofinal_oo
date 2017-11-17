package frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import main.Crud;

public class FrameCrud extends FrameMain{

	
	protected static JFrame frame;
	static JButton btnCadastrar = new JButton("Cadastrar");
	static JButton btnExcluir = new JButton("Excluir");
	static JButton btnPesquisar = new JButton("Pesquisar");
	static JButton btnAddAvaliação = new JButton("Adicionar Avaliação");
	static JButton btnVoltar = new JButton("Voltar");
	
	public static void cadatro(JButton btn, Crud crud ) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crud.cadastrar();
			}
		});
	}
	
	public static void excluir(JButton btn, Crud crud ) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crud.excluir();
			}
		});
	}
	
	public static void pesquisar(JButton btn, Crud crud ) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crud.imprimir();
			}
		});
	}
	
	public static void voltar(JButton btn) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
	}
	
	public static void main(String[] args) {
	}

	private static void initialize() {
	}
}
