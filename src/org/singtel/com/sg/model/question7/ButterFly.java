package org.singtel.com.sg.model.question7;

import org.singtel.com.sg.model.question1.Bird;
import org.singtel.com.sg.model.question1.Soundable;

public  class ButterFly extends Bird implements Soundable{

	
	boolean isCaterpiller= false;	

	public boolean isCaterpiller() {
		return isCaterpiller;
	}

	public void setCaterpiller(boolean isCaterpiller) {
		this.isCaterpiller = isCaterpiller;
	}
	
	public void fly() {
		// TODO Auto-generated method stub
		if(isCaterpiller){
			System.out.println("I can not fly..");
		}else{
			System.out.println("I can fly..");
		}
	}
	@Override
	public  void sing() {
		// TODO Auto-generated method stub
		System.out.println("I can not sing...");
	}
	@Override
	public  void walk() {
		// TODO Auto-generated method stub
		if(isCaterpiller){
			System.out.println("I can walk...");
		}
	}
	@Override
	public  void makeSound() {
		// TODO Auto-generated method stub
		if(!isCaterpiller){
			System.out.println("I can make sound..");
		}
		
	}
	



}
