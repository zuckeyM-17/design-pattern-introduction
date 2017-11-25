package Adapter.Extends;

import Adapter.Extends.Print;
import Adapter.Extends.PrintBanner;

public class Main {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
