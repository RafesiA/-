import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Lunch extends JFrame{
	File resListFile = new File("src\\Menus\\");
	String fileName;
	String filePath = resListFile.getPath();
	String[] resName = {"선택하세요", "순살파닭", "BHC", "신통치킨", "미쳐버린파닭", "팔구치킨"};
	String[] resName1 = {"선택하세요", "피자에땅", "피자알볼로", "59쌀피자", "피자헤븐", "토파토피자"};
	String[] resName2 = {"선택하세요", "족발뱅이", "사또족발"};
	String[] resName3 = {"선택하세요", "만다린", "라이징강", "짬뽕이조아", "궁차이나"};
	private static final String[] report = {"이 음식점은 이제 배달을 안해요", "이 음식점이 신장개업했어요", "아무도 몰랐던 음식점을 제보해요", "푸드 매거진에 광고하고싶어요(사장님들만!)"};
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	File sendResReport = new File("C:\\Temp\\SendReport.txt");
	JPanel multipleInput;
	JFrame frm = new JFrame();
	JTabbedPane jtp = new JTabbedPane();
	JTextArea outputArea1, outputArea2, outputArea3, outputArea4;
	JLabel reportResName = new JLabel("음식점 이름:");
	JLabel reportResCall = new JLabel("음식점 번호:");
	JTextField reportInputName = new JTextField(10);
	JTextField reportInputCall = new JTextField(10);
	JPanel panel1, panel2, panel3, panel4;
	JButton orderChicken = new JButton("주문하기");
	JButton orderPizza = new JButton("주문하기");
	JButton orderFoot = new JButton("주문하기");
	JButton orderChienese = new JButton("주문하기");
	ImageIcon icon = new ImageIcon("src\\myImage.jpg");
	JComboBox<String> box1, box2, box3, box4;
	JList list1, list2, list3, list4;
	
	
	void resReport() {
		int sendReport = JOptionPane.showConfirmDialog(null, multipleInput, null, JOptionPane.YES_OPTION);
		if(sendReport == JOptionPane.YES_OPTION) {
			String getInputCall = reportInputCall.getText();
			String getInputResName = reportInputName.getText();
			try {
				FileWriter fw = new FileWriter(sendResReport);
				fw.write(getInputResName + LINE_SEPARATOR + getInputCall);
				fw.flush();
				fw.close();
				JOptionPane.showMessageDialog(null, "제보해주셔서 감사합니다", "Thanks you", JOptionPane.NO_OPTION);
				// 개발자 이메일에 전송하는 코드 구현 에정
			} catch(IOException e) {
				System.out.println("FileWriting error");
			}
			reportInputName.setText("");
			reportInputCall.setText("");
			return;
		}
		else {
			return;
		}
	}
	
	
	
	class MenuListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String selectedItem = e.getActionCommand();
			
			switch(selectedItem) {
			case "종료":
				System.exit(0);
				return;
				
			case "계산기":
				File calc = new File("C:\\Windows\\System32\\calc.exe");
				String calcPath = calc.getAbsolutePath();
				try {
					Process calProcess = new ProcessBuilder(calcPath).start();
				} catch(IOException er) {
					System.out.println("계산기가 안켜진다");
				}
				return;
				
			case "제보하기":
				multipleInput = new JPanel();
				GroupLayout layout = new GroupLayout(multipleInput);
				layout.setAutoCreateContainerGaps(true);
				layout.setAutoCreateGaps(true);
				
				layout.setHorizontalGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(reportResName)
								.addComponent(reportResCall))
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(reportInputName)
								.addComponent(reportInputCall)
								));
				
				layout.setVerticalGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(reportResName)
								.addComponent(reportInputName))
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(reportResCall)
								.addComponent(reportInputCall)
								));
				
				
				String reporting = (String)JOptionPane.showInputDialog(null, "캠퍼스 푸드매거진에 제보할 것이 있나요?", "Reporting Restaurant",
			JOptionPane.NO_OPTION, null, report, null);
				multipleInput.setLayout(layout);
				if(reporting.equals(report[0])) {
					String getResName = JOptionPane.showInputDialog(null, "Input Restaurnt Name", "IRS", JOptionPane.YES_OPTION);
					System.out.println(getResName);
				}
				else if(reporting.equals(report[1])) {
					resReport();
				}
				else if(reporting.equals(report[2])) {
					resReport();
				}
				else if(reporting.equals(report[3])) {
					JOptionPane.showMessageDialog(null, "광고 문의 번호 010-2316-0090입니다.", "광고 문의", JOptionPane.DEFAULT_OPTION);
				}
				else {
					return;
				}
				
				return;
				//제보 기능 구현
			
			case "프로그램 버전":
				JOptionPane.showMessageDialog(null, "0.1b ver. On Progress Project 'lunch'", "Program Version", JOptionPane.PLAIN_MESSAGE);
				return;
			case "개발자 정보":
				JOptionPane.showMessageDialog(null, "Developer: RafesiA(조경진)\n" + "Undergraduate at Kyonggi Univ.\n" + 
			"Contact: infectionweapon@gmail.com\n" + "whrudwls98@naver.com\n" + "https://github.com/RafesiA",
			"Developer Information", JOptionPane.PLAIN_MESSAGE, icon);
			}
		}
	}
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("주문하기")) {
				if(box1.getSelectedItem().equals(resName[1])) {
					Order openOrderWindow = new Order();
					openOrderWindow.setVisible(true);
					return;
				}
				else if(box1.getSelectedItem().equals(resName[2])) {
					
				}
			}
			
			// Ordering Button
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
		JMenu secondMenu = new JMenu("기타");
		JMenuBar menuBar = new JMenuBar();
		String[] menuItemName = {"계산기", "제보하기", "종료"};
		String[] infoItemName = {"프로그램 버전", "개발자 정보", "문의하기"};
		
		JMenuItem[] menuItem = new JMenuItem[3];
		JMenuItem[] infoItem = new JMenuItem[3];
		MenuListener il = new MenuListener();
		
		for(int i=0;i<menuItemName.length; i++) {
			menuItem[i] = new JMenuItem(menuItemName[i]);
			menuItem[i].addActionListener(il);
			firstMenu.add(menuItem[i]);
		}
		for(int i=0;i<infoItemName.length; i++) {
			infoItem[i] = new JMenuItem(infoItemName[i]);
			infoItem[i].addActionListener(il);
			secondMenu.add(infoItem[i]);
		}
		menuBar.add(firstMenu);
		menuBar.add(secondMenu);
		frm.setJMenuBar(menuBar);
		
	}
	
	void userUI() {
		ButtonListener bt = new ButtonListener();
		MyActionListener listener = new MyActionListener();
		outputArea1 = new JTextArea(10, 30);
		outputArea2 = new JTextArea(10, 30);
		outputArea3 = new JTextArea(10, 30);
		outputArea4 = new JTextArea(10, 30);
		outputArea1.setEditable(false);
		outputArea2.setEditable(false);
		outputArea3.setEditable(false);
		outputArea4.setEditable(false);
		
		box1 = new JComboBox<String>(resName);
		box2 = new JComboBox<String>(resName1);
		box3 = new JComboBox<String>(resName2);
		box4 = new JComboBox<String>(resName3);
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
		orderChicken.addActionListener(bt);
		panel1.add(orderChicken);
		panel1.add(new JScrollPane(outputArea1));
		panel1.setFocusable(true);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.gray);
		panel2.add(box2);
		panel2.add(outputArea2);
		orderPizza.addActionListener(bt);
		panel2.add(orderPizza);
		panel2.add(new JScrollPane(outputArea2));
		panel2.setFocusable(true);
		
		panel3 = new JPanel();
		panel3.setBackground(Color.gray);
		panel3.add(box3);
		panel3.add(outputArea3);
		orderFoot.addActionListener(bt);
		panel3.add(orderFoot);
		panel3.add(new JScrollPane(outputArea3));
		panel3.setFocusable(true);
		
		panel4 = new JPanel();
		panel4.setBackground(Color.gray);
		panel4.add(box4);
		panel4.add(outputArea4);
		orderChienese.addActionListener(bt);
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
		frm.setTitle("KGU 푸드매거진");
		frm.setSize(500,320);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setResizable(false);
		}
	

	public static void main(String[] args) {
		new Lunch();
		
	}
}
