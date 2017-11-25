package Adapter.FileIO;

import java.io.*;
import java.util.*;

@SuppressWarnings("serial")
public class FileProperties extends Properties implements FileIO {

	public void readFromFile(String filename) throws IOException {
		this.load(new FileInputStream(filename));
	}

	public void writeToFile(String filename) throws IOException {
		this.store(new FileOutputStream(filename), "written by FileProperties");
	}
	
	public void setValue(String key, String value) {
		this.setProperty(key, value);
	}

	public void getValue(String key) {
		this.getProperty(key);
	}

}
