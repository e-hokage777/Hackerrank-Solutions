package Challenges;

class Singleton {
	public String str;
	
	private Singleton() {
		
	}
	
	public static final Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
}

public class JavaSingletonPattern {
	public static void main(String args[]) {
	}
}
