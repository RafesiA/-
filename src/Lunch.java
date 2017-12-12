import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Lunch extends JFrame{
	JFrame frm = new JFrame();
	JTabbedPane jtp = new JTabbedPane();
	JPanel panel1, panel2, panel3;
	JLabel label1, label2, label3;
	String[] resName = {"만다린", "수비드하우스", "치킨집"};
	
	
	void userUI() {
		JComboBox box1 = new JComboBox(resName);
		panel1 = new JPanel();
		panel1.setBackground(Color.red);
		panel1.add(box1);
		panel2 = new JPanel();
		panel2.setBackground(Color.orange);
		panel3 = new JPanel();
		panel3.setBackground(Color.YELLOW);
		label1 = new JLabel("I'm the First");
		label2 = new JLabel("I'm Second");
		label3 = new JLabel("I'm number Three");
		panel1.add(label1);
		panel2.add(label2);
		panel3.add(label3);
		jtp.add("First", panel1);
		jtp.add("Second", panel2);
		jtp.add("Third", panel3);
	}
	
	public Lunch() {
		userUI();
		frm.add(jtp);
		frm.setTitle("점심먹자");
		frm.setSize(500,300);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		}
	
	private void createMenu() {
		JMenuBar jb = new JMenuBar();
		JMenu file = new JMenu("File");
		JMenuItem[] itemTitle = new JMenuItem[3];
		String[] itemName = {"Select", "About", "Close"};
	}


	public static void main(String[] args) {
		new Lunch();
	}
}
