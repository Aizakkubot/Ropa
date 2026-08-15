package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

//importar a classe Database do pacote database
import database.Database;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblData;
	private final JLabel MySql = new JLabel("");

	//Criação de um objeto para lidar com conexão
	Database db = new Database();
	private JLabel lblBolinha2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		FlatMacLightLaf.setup();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(65, 105, 225));
		panel.setBounds(0, 0, 184, 533);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			// ativar a tela sobre
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setForeground(new Color(240, 248, 255));
		btnSobre.setBackground(new Color(0, 191, 255));
		btnSobre.setIcon(new ImageIcon(Main.class.getResource("/img/info.png")));
		btnSobre.setBounds(10, 433, 164, 89);
		panel.add(btnSobre);
		
		JButton btnProdutos = new JButton("Produtos");
		btnProdutos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProdutos.setBackground(new Color(0, 191, 255));
		btnProdutos.setForeground(new Color(240, 248, 255));
		btnProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnProdutos.setIcon(new ImageIcon(Main.class.getResource("/img/order.png")));
		btnProdutos.setBounds(10, 150, 164, 57);
		panel.add(btnProdutos);
		
		JButton btnPdv = new JButton("PDV");
		btnPdv.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPdv.setForeground(new Color(240, 255, 255));
		btnPdv.setBackground(new Color(0, 191, 255));
		btnPdv.setIcon(new ImageIcon(Main.class.getResource("/img/online-shop.png")));
		btnPdv.setBounds(10, 218, 164, 57);
		panel.add(btnPdv);
		
		JButton btnProdutos1 = new JButton("Produtos");
		btnProdutos1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProdutos1.setBackground(new Color(0, 191, 255));
		btnProdutos1.setForeground(new Color(240, 255, 255));
		btnProdutos1.setIcon(new ImageIcon(Main.class.getResource("/img/order.png")));
		btnProdutos1.setBounds(10, 286, 164, 57);
		panel.add(btnProdutos1);
		
		JLabel lblNewLabel_1 = new JLabel("Agasalhos");
		lblNewLabel_1.setForeground(new Color(240, 248, 255));
		lblNewLabel_1.setFont(new Font("TypewriterScribbled", Font.BOLD, 13));
		lblNewLabel_1.setBounds(78, 44, 80, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblLogo = new JLabel("ROPA");
		lblLogo.setBounds(10, 11, 164, 57);
		panel.add(lblLogo);
		lblLogo.setToolTipText("");
		lblLogo.setForeground(new Color(240, 255, 240));
		lblLogo.setFont(new Font("Myanmar Text", Font.BOLD, 22));
		lblLogo.setIcon(new ImageIcon(Main.class.getResource("/img/boutique.png")));
		lblLogo.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblNewLabel_2 = new JLabel("-----------------------------------------");
		lblNewLabel_2.setForeground(new Color(240, 248, 255));
		lblNewLabel_2.setBounds(10, 401, 174, 39);
		panel.add(lblNewLabel_2);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSair.addActionListener(new ActionListener() {
			// Quando clicar no botao
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair do sistema?", "Confirmar Saida", JOptionPane.YES_NO_OPTION);
				// apoio ao entendimento da logica
				System.out.println(resposta);
				if (resposta == 0) {
					System.exit(0); // encerra o sistema
				}
			}
		});
		btnSair.setIcon(new ImageIcon(Main.class.getResource("/img/logout.png")));
		btnSair.setForeground(new Color(240, 255, 255));
		btnSair.setBackground(new Color(0, 191, 255));
		btnSair.setBounds(10, 354, 164, 57);
		panel.add(btnSair);
		
		JButton btnVendas = new JButton("Fornecedores");
		btnVendas.setBounds(10, 82, 164, 57);
		panel.add(btnVendas);
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFornecedor fornecedor = new frmFornecedor();
				fornecedor.setVisible(true);
			}
		});
		btnVendas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVendas.setBackground(new Color(0, 191, 255));
		btnVendas.setForeground(new Color(240, 248, 255));
		btnVendas.setIcon(new ImageIcon(Main.class.getResource("/img/sales.png")));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(169, 169, 169));
		panel_1.setForeground(new Color(220, 220, 220));
		panel_1.setBounds(0, 534, 796, 27);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		MySql.setIcon(new ImageIcon(Main.class.getResource("/img/data-science.png")));
		MySql.setFont(new Font("Tahoma", Font.BOLD, 11));
		MySql.setBounds(10, 0, 148, 27);
		panel_1.add(MySql);
		
		lblBolinha2 = new JLabel("•");
		lblBolinha2.setForeground(Color.RED);
		lblBolinha2.setBounds(140, 11, 32, 14);
		panel_1.add(lblBolinha2);
		
		JLabel lblNewLabel_3 = new JLabel("Dashboard");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 26));
		lblNewLabel_3.setIcon(new ImageIcon(Main.class.getResource("/img/benchmarking.png")));
		lblNewLabel_3.setBounds(212, 26, 215, 45);
		contentPane.add(lblNewLabel_3);
		
		JPanel panelCard2 = new JPanel();
		panelCard2.setBounds(390, 93, 184, 115);
		contentPane.add(panelCard2);
		
		JPanel panelCard1 = new JPanel();
		panelCard1.setBounds(194, 93, 184, 115);
		contentPane.add(panelCard1);
		panelCard1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Produtos");
		lblNewLabel_7.setForeground(new Color(0, 191, 255));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setIcon(new ImageIcon(Main.class.getResource("/img/order (1).png")));
		lblNewLabel_7.setBounds(22, 0, 152, 40);
		panelCard1.add(lblNewLabel_7);
		
		JLabel lblNewLabel = new JLabel("Total de produtos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(53, 76, 121, 14);
		panelCard1.add(lblNewLabel);
		
		JLabel lblCadastrados = new JLabel("cadastrados");
		lblCadastrados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCadastrados.setBounds(53, 90, 95, 14);
		panelCard1.add(lblCadastrados);
		
		JLabel lblNewLabel_4 = new JLabel("5");
		lblNewLabel_4.setForeground(Color.CYAN);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 39));
		lblNewLabel_4.setBounds(76, 25, 98, 48);
		panelCard1.add(lblNewLabel_4);
		
		JPanel panelCard3 = new JPanel();
		panelCard3.setBounds(590, 93, 184, 115);
		contentPane.add(panelCard3);
		
		JPanel panelCard4 = new JPanel();
		panelCard4.setBounds(194, 235, 184, 115);
		contentPane.add(panelCard4);
		
		JPanel panelCard5 = new JPanel();
		panelCard5.setBounds(391, 235, 184, 115);
		contentPane.add(panelCard5);
		
		JPanel panelCard6 = new JPanel();
		panelCard6.setBounds(590, 235, 184, 115);
		contentPane.add(panelCard6);
		
		JPanel panelCard7 = new JPanel();
		panelCard7.setForeground(new Color(255, 255, 255));
		panelCard7.setBounds(194, 381, 580, 152);
		contentPane.add(panelCard7);
		
		JLabel lblCalendario = new JLabel("");
		lblCalendario.setIcon(new ImageIcon(Main.class.getResource("/img/calendar.png")));
		lblCalendario.setBounds(676, 26, 32, 51);
		contentPane.add(lblCalendario);
		
		JLabel lblNewLabel_5 = new JLabel("Visão geral do seu negócio");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(278, 58, 149, 36);
		contentPane.add(lblNewLabel_5);
		
		lblData = new JLabel("");
		lblData.setBounds(718, 26, 75, 45);
		contentPane.add(lblData);
		
		// atualizar a data
		atualizarData();

		//status do banco (mudar texto e cor da bolinha)
		if (db.testarConecxao() == true) {
			System.out.println("Banco conectado");
			MySql.setText("MySql Conectado");
			lblBolinha2.setForeground(Color.GREEN);
		} else {
			System.out.println("Erro de Conexão");
			MySql.setText("MySql Desconectado");
			lblBolinha2.setForeground(Color.RED);
			
		}
		
	}// FIM do construtor
	
	// função (metodo) para atualizar a data do sistema
	private void atualizarData() {
		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		lblData.setText(hoje.format(formato));
	}
}//FIM da classe Main (pricipal)
