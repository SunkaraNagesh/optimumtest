/**
 * 
 */
package org.singtel.com.sg.model.question4;

import org.singtel.com.sg.model.question1.Animal;
import org.singtel.com.sg.model.question1.Soundable;

/**
 * @author sunkara
 *
 */
public class Cat extends Animal implements Soundable{

	public void makeSound() {
		System.out.println("Meow”");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

}
