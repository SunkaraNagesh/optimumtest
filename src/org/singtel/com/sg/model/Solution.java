package org.singtel.com.sg.model;

import org.singtel.com.sg.model.question1.Bird;
import org.singtel.com.sg.model.question2.Chicken;
import org.singtel.com.sg.model.question2.Duck;
import org.singtel.com.sg.model.question3.Rooster;
import org.singtel.com.sg.model.question4.Cat;
import org.singtel.com.sg.model.question4.Dog;
import org.singtel.com.sg.model.question4.Parrot;
import org.singtel.com.sg.model.question5.Clownfish;
import org.singtel.com.sg.model.question5.Shark;
import org.singtel.com.sg.model.question7.ButterFly;

/**
 * Hello world!
 *
 */
public class Solution 
{
    public static void main(String args[])
    {
    	//Question1 
    	System.out.println("Question1 output:");
   	 	 Bird bird = new Bird();
         bird.walk();
         bird.fly();
         bird.sing();
         
         
       //Question 2
         System.out.println("Question2 output:");
        Duck duck = new Duck();
        Chicken chicken =new Chicken();
        duck.swim();
        duck.makeSound();
        chicken.makeSound();
        
       //Question 3
       //thru inheritance 
      // Chicken rooster = new Rooster();
      // rooster.makeSound();
       
       //through interface
        System.out.println("Question3 output:");
       Rooster rooster = new Rooster();
       rooster.makeSound();
       
       //Question 4
       System.out.println("Question4 output:");
       Parrot parrot1 = new Parrot(new Dog());
       parrot1.getDog().makeSound();
       Parrot parrot2 = new Parrot(new Cat());
       parrot2.getCat().makeSound();
       Parrot parrot3 = new Parrot(new Rooster());
       parrot3.getRooster().makeSound();
       
       Parrot parrot4 = new Parrot(new Duck());
       parrot4.getDuck().makeSound();
       
       
       
     //Question 5
       System.out.println("Question5 output:");
       Shark shark = new Shark();
       shark.setColor();
       shark.setSize();
       shark.setEatFish();
      System.out.println("Size:"+shark.getSize());
      System.out.println("Color:"+shark.getColor());
      System.out.println("EatFish:"+shark.isEatFish());
      
      Clownfish clownFish = new Clownfish();
      clownFish.setColor();
      clownFish.setSize();
      clownFish.setMakeJokes();
     System.out.println("Size:"+clownFish.getSize());
     System.out.println("Color:"+clownFish.getColor());
     System.out.println("MakeJokes:"+clownFish.isMakeJokes());
     
     
   //Question 7
     ButterFly butterFly = new ButterFly();
     butterFly.setCaterpiller(true);
     butterFly.fly();
     butterFly.sing();
     butterFly.walk();
    }
}
