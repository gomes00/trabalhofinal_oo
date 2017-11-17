package frames;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import net.miginfocom.swing.MigLayout;

public class FrameMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMain window = new FrameMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 150, 350, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[50px][225px]", "[68px][68px][68px][68px]"));
		frame.setLocation(400, 200);
		
		JButton btnTurma = new JButton("Turmas");
		btnTurma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							FrameCrud crud = new FrameTurma();
							crud.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});	
		frame.getContentPane().add(btnTurma, "cell 1 0,grow");
		
		JLabel label_1 = new JLabel("");
		frame.getContentPane().add(label_1, "cell 0 1,grow");
		
		JButton btnAlunos = new JButton("Alunos");
		btnAlunos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							FrameCrud crud = new FrameAlunos();
							crud.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		frame.getContentPane().add(btnAlunos, "cell 1 1,grow");
		
		JLabel label_2 = new JLabel("");
		frame.getContentPane().add(label_2, "cell 0 2,grow");
		
		JButton btnAvaliacao = new JButton("Avaliações");
		btnAvaliacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							FrameCrud crud = new FrameAvaliacao();
							crud.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		frame.getContentPane().add(btnAvaliacao, "cell 1 2,grow");
		
		JLabel label_3 = new JLabel("");
		frame.getContentPane().add(label_3, "cell 0 3,grow");
		
		JButton btnSair = new JButton("Sair");
		btnAvaliacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		frame.getContentPane().add(btnSair, "cell 1 3,grow");
	}

}
