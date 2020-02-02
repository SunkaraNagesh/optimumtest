/**
 * 
 */
package org.singtel.com.sg.model.question6;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.singtel.com.sg.model.question1.Animal;
import org.singtel.com.sg.model.question1.Bird;
import org.singtel.com.sg.model.question2.Chicken;
import org.singtel.com.sg.model.question2.Duck;
import org.singtel.com.sg.model.question4.Dog;
import org.singtel.com.sg.model.question7.ButterFly;

/**
 * @author sunkara
 *
 */
public class CountTest {
	
	
	

	public static void main(String[] args) {
        Animal[] animals = new Animal[4];
      
        animals[0] = new Dog();
        animals[1] = new Bird();
        animals[2] = new Duck();
        animals[3] = new Dog();
        animals[3] = new ButterFly();
       int walkCount =0;
       int flyCount =0;
        for (int i = 0; i < animals.length; i++) {
           Method[] methods= animals[i].getClass().getDeclaredMethods();
           
         if(Arrays.asList(methods).toString().contains("walk")){
        	 ++walkCount;
        	
          } else if(Arrays.asList(methods).toString().contains("fly")){
        	  ++flyCount;
          }
         
        }
        System.out.println("count of walk implementation>>"+walkCount);
        System.out.println("count of fly implementation>>"+flyCount);
        
    }
	
 
}
