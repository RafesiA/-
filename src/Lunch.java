import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Lunch extends JFrame{
	JFrame frm = new JFrame();
	JTabbedPane jtp = new JTabbedPane();
	JTextArea outputArea1, outputArea2, outputArea3, outputArea4;
	JPanel panel1, panel2, panel3, panel4;
	JLabel label1, label2, label3, label4;
	String[] resName = {"순살파닭", "BHC", "신통치킨", "미쳐버린파닭", "팔구치킨"};
	String[] resName1 = {"피자에땅", "피자알볼로", "59쌀피자", "피자헤븐", "토파토피자"};
	String[] resName2 = {"족발뱅이", "사또족발"};
	String[] resName3 = {"만다린", "라이징강", "짬뽕이조아", "궁차이나"};
	
	void userUI() {
		outputArea1 = new JTextArea(10, 30);
		outputArea2 = new JTextArea(10, 30);
		outputArea3 = new JTextArea(10, 30);
		outputArea4 = new JTextArea(10, 30);
		
		JComboBox box1 = new JComboBox(resName);
		JComboBox box2 = new JComboBox(resName1);
		JComboBox box3 = new JComboBox(resName2);
		JComboBox box4 = new JComboBox(resName3);
		panel1 = new JPanel();
		panel1.setBackground(Color.gray);
		panel1.add(box1);
		panel1.add(outputArea1);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.gray);
		panel2.add(box2);
		panel2.add(outputArea2);
		
		panel3 = new JPanel();
		panel3.setBackground(Color.gray);
		panel3.add(box3);
		panel3.add(outputArea3);
		
		
		panel4 = new JPanel();
		panel4.setBackground(Color.gray);
		panel4.add(box4);
		panel4.add(outputArea4);
		
		label1 = new JLabel("I'm the First");
		label2 = new JLabel("I'm Second");
		label3 = new JLabel("I'm number Three");
		label4 = new JLabel("wtf");
		panel1.add(label1);
		panel2.add(label2);
		panel3.add(label3);
		panel4.add(label4);
		jtp.add("치킨", panel1);
		jtp.add("피자", panel2);
		jtp.add("족발/보쌈", panel3);
		jtp.add("중식", panel4);
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
