package aja;

	class Animal{
		public void food() {
			System.out.println("Animal food");
		}
	}
	
	class Cat extends Animal{
		public void catFood() {
			System.out.println("Cat eats Rats");
		}
	}
	
	class Dog extends Animal{
		public void dogFood() {
			System.out.println("Dog eats Cats");
		}
	}
	
public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.food();
		Cat c =new Cat();
		c.catFood();
		Dog d=new Dog();
		d.dogFood();
		
		

	}

}
