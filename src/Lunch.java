import java.io.*;
import java.util.*;

class Menu{
	File lunchDB = new File("C:\\Temp\\lunchDB.txt");
	String eatery;
	int telNumber;
	List<File> lucnhMenus = Arrays.asList(lunchDB);
	
	
	void ViewDB(){
		FileReader fr = null;
		InputStreamReader isr = null;
		int i = 0;
		
		try {
			
			isr = new InputStreamReader(System.in);
			
			fr = new FileReader(lunchDB);
			
			while((i = fr.read()) != -1)
				System.out.print((char)i);
			
		} catch(IOException e) {
			System.out.println("Critical Error" + e.getMessage());
		}
	}
	void find() {
		
	}
}


public class Lunch {
	public static void main(String[] args) {
		while(true) {
		Menu menu = new Menu();
		System.out.println("========================");
		System.out.println("Lunch Selection");
		System.out.println();
		System.out.println("골라라");
		System.out.println("1. Show DB");
		System.out.print("선택하기: ");
		Scanner scanner = new Scanner(System.in);
		
		int choice = scanner.nextInt();
		System.out.println("========================");
		switch(choice){
		
		case 1:
			menu.ViewDB();
			continue;
			
		case 2:
			}
		}
	}
}
