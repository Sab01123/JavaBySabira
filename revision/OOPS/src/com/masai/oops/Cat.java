package com.masai.oops;

public class Cat extends Animal{

	
	String nickName;
	
	public Cat() {
	}
	
	public Cat(String nickName) {
		this.nickName = nickName;
	}
	
public Cat(String nickName, String name) {
		super(name);
		this.nickName = nickName;
	}



	public String getNickName() {
	return nickName;
}

public void setNickName(String nickName) {
	this.nickName = nickName;
}

	@Override
	public void makeNoise() {
		System.out.println("Cat is making a noise");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat is eating");
		
	}

	public void	jump() {
		System.out.println("Cat is jumping");
	}


}
