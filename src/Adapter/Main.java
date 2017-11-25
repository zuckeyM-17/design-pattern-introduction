package Adapter;

// import Adapter.Extends.Print;
// import Adapter.Extends.PrintBanner;
import Adapter.Devolution.Print;
import Adapter.Devolution.PrintBanner;

public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
