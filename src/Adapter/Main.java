package Adapter;

import java.io.IOException;

// import Adapter.Extends.Print;
// import Adapter.Extends.PrintBanner;
import Adapter.Devolution.Print;
import Adapter.Devolution.PrintBanner;
import Adapter.FileIO.FileIO;
import Adapter.FileIO.FileProperties;

public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
		
		FileIO f = new FileProperties();
		try {
			f.readFromFile("file.txt");
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
