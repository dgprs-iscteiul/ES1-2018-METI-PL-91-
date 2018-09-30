import javax.swing.JFrame;
import javax.swing.JMenu;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class WindowDBA {

	private JFrame windowFrame;
	private ArrayList<JPanel> panels;
		
	public WindowDBA(String title) {
		windowFrame = new JFrame(title);
		configWindow();
	}
	
	// GETTERS
	public JFrame getFrame() {
		return windowFrame;
	}
	
	public ArrayList<JPanel> getPanels() {
		return panels;
	}
	
	// MÉTODOS AUXILIARES
	private void addPanels() {
		panels = new ArrayList<>();
		panels.add(new JPanel()); // 0 SOUTH
		panels.add(new JPanel()); // 1 WEST
		panels.add(new JPanel()); // 2 EAST
		panels.add(new JPanel()); // 3 NORTH
	}
	
	private void configWindow() {
		addPanels();
		windowFrame.setSize(500, 500);
		// CONFIGURAÇÃO JPANEL NA WINDOWFRAME
		windowFrame.add(panels.get(0), BorderLayout.SOUTH);
		windowFrame.add(panels.get(1), BorderLayout.WEST);
		windowFrame.add(panels.get(2), BorderLayout.EAST);
		windowFrame.add(panels.get(3), BorderLayout.CENTER);
		
		// CONFIGURAÇÃO DO MENU
		JMenuBar generalMenu = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Sort");
		JMenu aboutMenu = new JMenu("More");
		
		JMenuItem connection = new JMenuItem("Connection");
		JMenuItem workOffline = new JMenuItem("Work offline");
		JMenuItem exit = new JMenuItem("Exit");
		JMenuItem moreRecent = new JMenuItem("More recent");
		JMenuItem moreOld = new JMenuItem("More old");
		JMenuItem about = new JMenuItem("About");
		JMenuItem help = new JMenuItem("Help");

		fileMenu.add(connection);
		fileMenu.add(workOffline);
		fileMenu.add(exit);
		editMenu.add(moreRecent);
		editMenu.add(moreOld);
		aboutMenu.add(about);
		aboutMenu.add(help);
		
		generalMenu.add(fileMenu);
		generalMenu.add(editMenu);
		generalMenu.add(aboutMenu);
		windowFrame.add(generalMenu, BorderLayout.NORTH);
		
		// CONFIGURAÇÃO DOS RADIO BUTTON
		JRadioButton sortOne = new JRadioButton("Mais recente");
		JRadioButton sortTwo = new JRadioButton("Mais antigo");
		
		ButtonGroup sortOptions = new ButtonGroup();
		sortOptions.add(sortOne);
		sortOptions.add(sortTwo);
		
		panels.get(3).add(sortOne);
		panels.get(3).add(sortTwo);

		// CONFIGURAÇÃO DA TABELA
		JTable tableContent = new JTable(0,4);
		DefaultTableModel modelTable = (DefaultTableModel) tableContent.getModel();
		modelTable.insertRow(0, new String[]{"Data", "Canal", "Origem", "Subject"});

		panels.get(3).add(tableContent);
		
		// CONFIGURAÇÃO WINDOW FRAME
		windowFrame.setLocationRelativeTo(null);
		windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		windowFrame.setResizable(false);
		windowFrame.validate();
		windowFrame.setVisible(true);
	}

}