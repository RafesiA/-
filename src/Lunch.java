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
	JButton orderChicken = new JButton("주문하기");
	JButton orderPizza = new JButton("주문하기");
	JButton orderFoot = new JButton("주문하기");
	JButton orderChienese = new JButton("주문하기");
	String[] resName = {"선택하세요", "순살파닭", "BHC", "신통치킨", "미쳐버린파닭", "팔구치킨"};
	String[] resName1 = {"선택하세요", "피자에땅", "피자알볼로", "59쌀피자", "피자헤븐", "토파토피자"};
	String[] resName2 = {"선택하세요", "족발뱅이", "사또족발"};
	String[] resName3 = {"선택하세요", "만다린", "라이징강", "짬뽕이조아", "궁차이나"};
	
	class MenuListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String selectedItem = e.getActionCommand();
			
			switch(selectedItem) {
			case "닫기":
				System.exit(0);
				return;
				
			case "계산기":
				File calc = new File("C:\\Windows\\System32\\calc.exe");
				String calcPath = calc.getAbsolutePath();
				try {
					Process calProcess = new ProcessBuilder(calcPath).start();
					BufferedReader stdOut = new BufferedReader(new InputStreamReader(calProcess.getInputStream()));
				} catch(IOException er) {
					System.out.println("계산기가 안켜진다");
				}
			}
		}
	}
	
	class MyActionListener implements ActionListener, FocusListener{
		public void focusGained(FocusEvent f) {
			System.out.println("Focusing..");
		}
		
		public void focusLost(FocusEvent f) {
			System.out.println("Focus Lost");
		}
		public void actionPerformed(ActionEvent e) {
			JComboBox<String> cb = (JComboBox<String>)e.getSource();
			String menuName = (String)cb.getSelectedItem();
			
			
			if(menuName.equals("순살파닭")) {
				fileName = "\\순살파닭.txt";
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
			else if(menuName.equals("신통치킨")) {
				fileName = "\\신통치킨.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea1.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("미쳐버린파닭")) {
				fileName = "\\미쳐버린파닭.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea1.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("팔구치킨")) {
				fileName = "\\팔구치킨.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea1.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("피자에땅")) {
				fileName = "\\피자에땅.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea2.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("피자알볼로")) {
				fileName = "\\피자알볼로.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea2.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("59쌀피자")) {
				fileName = "\\59쌀피자.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea2.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}

			else if(menuName.equals("피자헤븐")) {
				fileName = "\\피자헤븐.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea2.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}

			else if(menuName.equals("피자헤븐")) {
				fileName = "\\피자헤븐.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea2.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}

			else if(menuName.equals("토파토피자")) {
				fileName = "\\토파토피자.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea2.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("족발뱅이")) {
				fileName = "\\족발뱅이.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea3.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("사또족발")) {
				fileName = "\\사또족발.txt";
				try {
					BufferedReader br = new BufferedReader(new FileReader(resListFile + fileName));
					outputArea3.read((br), resListFile);
				} catch(IOException er) {
					System.out.println(er);
				}
			}
			else if(menuName.equals("선택하세요")) {
				if(resName[0] == menuName) {
					outputArea1.setText("");
					return;
				}
				else if(resName1[0] == menuName) {
					outputArea2.setText("");
					return;
				}
				else if(resName2[0] == menuName) {
					outputArea3.setText("");
					return;
				}
				else if(resName3[0] == menuName) {
					outputArea4.setText("");
					return;
				}
			}
			
		}
	}
	
	public void creatingMenu() {
		JMenu firstMenu = new JMenu("파일");
		JMenuBar menuBar = new JMenuBar();
		String[] menuItemName = {"닫기", "계산기", "종료", "제보하기"};
		JMenuItem[] menuItem = new JMenuItem[5];
		MenuListener il = new MenuListener();
		
		for(int i=0;i<menuItemName.length; i++) {
			menuItem[i] = new JMenuItem(menuItemName[i]);
			menuItem[i].addActionListener(il);
			firstMenu.add(menuItem[i]);
		}
		menuBar.add(firstMenu);
		frm.setJMenuBar(menuBar);
		
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
		
		JComboBox<String> box1 = new JComboBox<String>(resName);
		JComboBox<String> box2 = new JComboBox<String>(resName1);
		JComboBox<String> box3 = new JComboBox<String>(resName2);
		JComboBox<String> box4 = new JComboBox<String>(resName3);
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
		panel1.add(orderChicken);
		panel1.add(new JScrollPane(outputArea1));
		panel1.setFocusable(true);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.gray);
		panel2.add(box2);
		panel2.add(outputArea2);
		panel2.add(orderPizza);
		panel2.add(new JScrollPane(outputArea2));
		panel2.setFocusable(true);
		
		panel3 = new JPanel();
		panel3.setBackground(Color.gray);
		panel3.add(box3);
		panel3.add(outputArea3);
		panel3.add(orderFoot);
		panel3.add(new JScrollPane(outputArea3));
		panel3.setFocusable(true);
		
		panel4 = new JPanel();
		panel4.setBackground(Color.gray);
		panel4.add(box4);
		panel4.add(outputArea4);
		panel4.add(orderChienese);
		panel4.add(new JScrollPane(outputArea4));
		panel4.setFocusable(true);
		
		jtp.add("치킨", panel1);
		jtp.add("피자", panel2);
		jtp.add("족발/보쌈", panel3);
		jtp.add("중식", panel4);
		
	}
	
	public Lunch() {
		userUI();
		creatingMenu();
		frm.add(jtp);
		frm.setTitle("점심먹자");
		frm.setSize(500,320);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setResizable(false);
		}
	

	public static void main(String[] args) {
		new Lunch();
		
	}
}
