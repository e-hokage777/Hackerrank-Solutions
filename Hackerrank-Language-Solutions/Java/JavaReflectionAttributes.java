package Challenges;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class StudenT {
	private String name;
	private String id;
	private String email;
	
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setEmail(String emial) {
		this.email = email;
	}
	
	public void anotherMethod() {
		
	}
}

public class JavaReflectionAttributes {
	
	public static void main(String args[]) {
		Class student = new StudenT().getClass();
		Method methods[] = student.getDeclaredMethods();
		
		ArrayList<String> methodList = new ArrayList<>();
		for(Method method : methods) {
			methodList.add(method.getName());
		}
		
		Collections.sort(methodList);
		for(String name: methodList) {
			System.out.println(name);
		}
	}

}
