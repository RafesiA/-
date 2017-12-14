import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Lunch extends JFrame{
	String fileName;
	File resListFile = new File("C:\\Temp\\Menus\\");
	String filePath = resListFile.getPath();
	JFrame frm = new JFrame();
	JTabbedPane jtp = new JTabbedPane();
	
	JTextArea outputArea1, outputArea2, outputArea3, outputArea4;
	JPanel panel1, panel2, panel3, panel4;
	JLabel label1, label2, label3, label4;
	String[] resName = {"�����ϼ���", "�����Ĵ�", "BHC", "����ġŲ", "���Ĺ����Ĵ�", "�ȱ�ġŲ"};
	String[] resName1 = {"�����ϼ���", "���ڿ���", "���ھ˺���", "59������", "�������", "����������"};
	String[] resName2 = {"�����ϼ���", "���߹���", "�������"};
	String[] resName3 = {"�����ϼ���", "���ٸ�", "����¡��", "«��������", "�����̳�"};
	
	
	
	class MyActionListener implements ActionListener, FocusListener{
		public void focusGained(FocusEvent f) {
			System.out.println("Focusing..");
		}
		
		public void focusLost(FocusEvent f) {
			System.out.println("Focus Lost");
		}
		public void actionPerformed(ActionEvent e) {
			JComboBox cb = (JComboBox)e.getSource();
			String menuName = (String)cb.getSelectedItem();
			if(menuName.equals("�����Ĵ�")) {
				fileName = "\\�����Ĵ�.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea1.read(br, resListFile);
			} catch(IOException er) {
				System.out.println(er);}
			}
			else if(menuName.equals("BHC")) {
				fileName = "\\BHC.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea1.read(br, resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}	
			}
			else if(menuName.equals("����ġŲ")) {
				fileName = "\\����ġŲ.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea1.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("���Ĺ����Ĵ�")) {
				fileName = "\\���Ĺ����Ĵ�.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea1.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("�ȱ�ġŲ")) {
				fileName = "\\�ȱ�ġŲ.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea1.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("���ڿ���")) {
				fileName = "\\���ڿ���.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea2.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("���ھ˺���")) {
				fileName = "\\���ھ˺���.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea2.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("59������")) {
				fileName = "\\59������.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea2.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}

			else if(menuName.equals("�������")) {
				fileName = "\\�������.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea2.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}

			else if(menuName.equals("�������")) {
				fileName = "\\�������.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea2.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}

			else if(menuName.equals("����������")) {
				fileName = "\\����������.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea2.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("���߹���")) {
				fileName = "\\���߹���.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea3.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("�������")) {
				fileName = "\\�������.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea3.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("�����ϼ���")) {
				if(resName[0] == menuName) {
					outputArea1.setText("");
				}
				else if(resName1[0] == menuName) {
					outputArea2.setText("");
				}
				else if(resName2[0] == menuName) {
					outputArea3.setText("");
				}
				else if(resName3[0] == menuName) {
					outputArea4.setText("");
				}
			}
		}
	}
	
	public void creatingMenu() {
		JMenu firstMenu = new JMenu("����");
		JMenuBar menuBar = new JMenuBar();
		String[] menuItemName = {"�߰�", "�ݱ�", "����", "����"};
		JMenuItem[] menuItem = new JMenuItem[5];
		MyActionListener listener = new MyActionListener();
		
		for(int i=0;i<menuItemName.length; i++) {
			menuItem[i] = new JMenuItem(menuItemName[i]);
			menuItem[i].addActionListener(listener);
			firstMenu.add(menuItem[i]);
		}
		
		menuBar.add(firstMenu);
		setJMenuBar(menuBar);
		
	}
	
	void userUI() {
		MyActionListener listener = new MyActionListener();
		outputArea1 = new JTextArea(10, 30);
		outputArea2 = new JTextArea(10, 30);
		outputArea3 = new JTextArea(10, 30);
		outputArea4 = new JTextArea(10, 30);
		outputArea1.setEditable(false);
		outputArea2.setEditable(false);
		outputArea3.setEditable(false);
		outputArea4.setEditable(false);
		
		JComboBox box1 = new JComboBox(resName);
		JComboBox box2 = new JComboBox(resName1);
		JComboBox box3 = new JComboBox(resName2);
		JComboBox box4 = new JComboBox(resName3);
		box1.addActionListener(listener);
		box2.addActionListener(listener);
		box3.addActionListener(listener);
		box4.addActionListener(listener);
		box1.addFocusListener(listener);
		box2.addFocusListener(listener);
		box3.addFocusListener(listener);
		box4.addFocusListener(listener);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.gray);
		panel1.add(box1);
		panel1.add(outputArea1);
		panel1.add(new JScrollPane(outputArea1));
		panel1.setFocusable(true);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.gray);
		panel2.add(box2);
		panel2.add(outputArea2);
		panel2.add(new JScrollPane(outputArea2));
		panel2.setFocusable(true);
		
		panel3 = new JPanel();
		panel3.setBackground(Color.gray);
		panel3.add(box3);
		panel3.add(outputArea3);
		panel3.add(new JScrollPane(outputArea3));
		panel3.setFocusable(true);
		
		panel4 = new JPanel();
		panel4.setBackground(Color.gray);
		panel4.add(box4);
		panel4.add(outputArea4);
		panel4.add(new JScrollPane(outputArea4));
		panel4.setFocusable(true);
		
		
		label1 = new JLabel("I'm the First");
		label2 = new JLabel("I'm Second");
		label3 = new JLabel("I'm number Three");
		label4 = new JLabel("wtf");
		
		panel1.add(label1);
		panel2.add(label2);
		panel3.add(label3);
		panel4.add(label4);
		jtp.add("ġŲ", panel1);
		jtp.add("����", panel2);
		jtp.add("����/����", panel3);
		jtp.add("�߽�", panel4);
		jtp.add("+", null);
		
	}
	
	public Lunch() {
		userUI();
		frm.add(jtp);
		frm.setTitle("���ɸ���");
		frm.setSize(1000,500);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(new BorderLayout());
		}
	
	
	
	


	public static void main(String[] args) {
		new Lunch();
		
	}
}
