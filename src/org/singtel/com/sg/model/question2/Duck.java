/**
 * 
 */
package org.singtel.com.sg.model.question2;

import org.singtel.com.sg.model.question1.Bird;
import org.singtel.com.sg.model.question1.Soundable;

/**
 * @author sunkara
 *
 */
public class Duck  extends Bird implements Soundable{
	
	public void swim() {
		System.out.println("I am swimming");
	}
	
	public void makeSound() {
		System.out.println("Quack,quack");
		
	}

}
