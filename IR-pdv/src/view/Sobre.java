package view;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sobre extends JDialog {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setTitle("Sobre");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel ROPA = new JLabel("ROPA");
		ROPA.setFont(new Font("Tahoma", Font.BOLD, 14));
		ROPA.setBounds(30, 24, 60, 14);
		getContentPane().add(ROPA);
		
		JLabel lblSistema = new JLabel("Sistema para gestao de estoque e PVD");
		lblSistema.setBounds(30, 54, 199, 14);
		getContentPane().add(lblSistema);
		
		JLabel lblAutor = new JLabel("Autor Isaac de oliveira");
		lblAutor.setBounds(30, 80, 139, 14);
		getContentPane().add(lblAutor);
		
		JLabel lblVersao = new JLabel("Versão 1.0");
		lblVersao.setBounds(30, 105, 102, 26);
		getContentPane().add(lblVersao);
		
		JLabel lblMIT = new JLabel("");
		lblMIT.setIcon(new ImageIcon(Sobre.class.getResource("/img/mit.png")));
		lblMIT.setBounds(355, 0, 69, 91);
		getContentPane().add(lblMIT);
		
		JLabel lblGit = new JLabel("");
		lblGit.setIcon(new ImageIcon(Sobre.class.getResource("/img/github.png")));
		lblGit.setBounds(30, 190, 46, 60);
		getContentPane().add(lblGit);
		
		JLabel lblRepositorio = new JLabel("https://github.com/Aizakkubot");
		lblRepositorio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://github.com/Aizakkubot");
			}
		});
		lblRepositorio.setForeground(new Color(0, 0, 255));
		lblRepositorio.setBounds(78, 215, 163, 14);
		getContentPane().add(lblRepositorio);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//fechar apenas o sobre
				dispose();
			}
		});
		btnOK.setBounds(323, 211, 89, 23);
		getContentPane().add(btnOK);
		
		setLocationRelativeTo(null);

	}// fim do construtor

	//funçao(metodo) para abrir um link no navegador padrão
	private void link(String url) {
		// a linha abaixo obtem o desktop do cliente
		Desktop desktop = Desktop.getDesktop();
		// uso do try catch(tratamento de exceções)
		try {
			//objeto uri para acessar os metodos necessarios para estabelecer uma conexão com url (link)
			URI uri = new URI(url);
			//abrir o link no navegador padrão do cliente
			desktop.browse(uri);
		} catch (Exception e) {
			System.out.println();
		}
	}
}
