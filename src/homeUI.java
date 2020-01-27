import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.UIManager;

public class homeUI extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homeUI frame = new homeUI();
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
	public homeUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 620);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		setUndecorated(true);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(342, 66, 586, 554);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton leagueButton = new JButton("League of Legends");
		leagueButton.setBounds(74, 31, 161, 23);
		panel_1.add(leagueButton);
		
		JButton fortniteButton = new JButton("Fortnite");
		fortniteButton.setBounds(74, 84, 89, 23);
		panel_1.add(fortniteButton);
		
		JButton discordButton = new JButton("Discord");
		discordButton.setBounds(74, 138, 89, 23);
		panel_1.add(discordButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 344, 620);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea txtrExit = new JTextArea();
		txtrExit.setBounds(750, 11, 38, 35);
		panel.add(txtrExit);
		txtrExit.setText("Exit");
		txtrExit.setOpaque(false);
		txtrExit.setForeground(Color.RED);
		txtrExit.setFont(new Font("Monospaced", Font.PLAIN, 10));
		txtrExit.setEditable(false);
		txtrExit.setBackground(Color.RED);
		
		JLabel headerIcon = new JLabel("");
		headerIcon.setBounds(0, 0, 344, 646);
		panel.add(headerIcon);
		headerIcon.setBackground(Color.BLUE);
		headerIcon.setIcon(new ImageIcon(homeUI.class.getResource("/img/background2.jpg")));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(342, 0, 586, 68);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea Logo = new JTextArea();
		Logo.setBounds(73, 20, 125, 30);
		panel_2.add(Logo);
		Logo.setEditable(false);
		Logo.setForeground(Color.WHITE);
		Logo.setFont(new Font("Monospaced", Font.ITALIC, 19));
		Logo.setText("QuickLaunch");
		Logo.setOpaque(false);
		Logo.setBackground(new Color(0,0,0,0));
		
		JButton exitButton = new JButton("X");
		exitButton.setBounds(531, 20, 45, 30);
		panel_2.add(exitButton);
		exitButton.setIcon(null);
		exitButton.setForeground(new Color(255, 0, 0));
		exitButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitButton.setOpaque(false);
		exitButton.setBackground(new Color(0,0,0,0));
		
		
		
		
		leagueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Process process = new ProcessBuilder("C:\\Riot Games\\League of Legends\\LeagueClient.exe").start();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		discordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Process process = new ProcessBuilder("C:\\Users\\Big Bang\\AppData\\Local\\Discord\\app-0.0.300\\Discord").start();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}
