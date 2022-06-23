package testNGHW;

import org.testng.annotations.Test;

public class LearnAttributes {
	@Test (priority = 1)
	public void createlead() {
		
		System.out.println("createlead");
		throw new RuntimeException();
	}
	@Test (enabled = false)
public void editlead() {
		
		System.out.println("editlead");
	}
	
	@Test (dependsOnMethods = {"createlead"})
public void deletelead() {
	
	System.out.println("deletelead");
}
}
