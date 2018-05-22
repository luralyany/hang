import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class cakeys {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cakeys window = new cakeys();
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
	public cakeys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 968, 567);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_7036527641064331");
		panel.setLayout(null);
		
		JButton btnA = new JButton("A");
		btnA.setBounds(0, 441, 41, 25);
		panel.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(45, 441, 53, 25);
		panel.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(95, 441, 53, 25);
		panel.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(151, 441, 53, 25);
		panel.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(200, 441, 46, 25);
		panel.add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(244, 441, 53, 25);
		panel.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(297, 441, 41, 25);
		panel.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.setBounds(337, 441, 53, 25);
		panel.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(391, 441, 41, 25);
		panel.add(btnI);
		
		JButton btnJ = new JButton("J");
		btnJ.setBounds(432, 441, 53, 25);
		panel.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(480, 441, 41, 25);
		panel.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(518, 441, 41, 25);
		panel.add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(551, 441, 53, 25);
		panel.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(597, 441, 53, 25);
		panel.add(btnN);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(641, 441, 53, 25);
		panel.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(690, 441, 68, 25);
		panel.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.setBounds(756, 441, 53, 25);
		panel.add(btnQ);
		
		JButton btnR = new JButton("R");
		btnR.setBounds(806, 441, 53, 25);
		panel.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(853, 441, 41, 25);
		panel.add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(885, 441, 97, 25);
		panel.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.setBounds(1, 479, 53, 25);
		panel.add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.setBounds(55, 479, 53, 25);
		panel.add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(105, 479, 53, 25);
		panel.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(161, 479, 43, 25);
		panel.add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.setBounds(210, 479, 53, 25);
		panel.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBounds(264, 479, 68, 25);
		panel.add(btnZ);
		
		JLabel lblLetters = new JLabel("LETTERS ");
		lblLetters.setBounds(12, 412, 56, 16);
		panel.add(lblLetters);
		
		JLabel lblHangman = new JLabel("HANGMAN");
		lblHangman.setBounds(498, 13, 152, 16);
		panel.add(lblHangman);
		
		JLabel lblWord = new JLabel("WORD");
		lblWord.setBounds(0, 188, 56, 16);
		panel.add(lblWord);
	}
}
