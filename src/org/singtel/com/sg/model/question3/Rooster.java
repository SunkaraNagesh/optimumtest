/**
 * 
 */
package org.singtel.com.sg.model.question3;

import org.singtel.com.sg.model.question1.Soundable;
import org.singtel.com.sg.model.question2.Chicken;

/**
 * @author sunkara
 *
 */

//public class Rooster extends chicken implements  Soundable{
public class Rooster extends Chicken implements  Soundable{
	
	public void makeSound() {
		
		System.out.println("Cock-a-doodle-doo");
	}

}
