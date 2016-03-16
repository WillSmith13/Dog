package edu.saintjoe.cs.wills.dogWKS;

public class Dog {
	int size;
	String name;
	public static void main(String[] args) {
		// make a Dog object and access it 
		Dog dog1 = new Dog();
		dog1.bark(); 
		dog1.name = "Bart";
		
		// now make a Dog array 
		Dog[] myDogs = new Dog[3];
		// and put some dogs in it 
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;

		//Now access the Dogs using the array 
		// references 
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		// Hmmmmm.. what is myDogs[2] name?
		System.out.print("last the dog's name is ");
//		System.out.println(myDogs[2].name);
		 
		// now loop through the array 
		// and tell all the dogs to bark 
		int x = 0;
		while(x < myDogs.length) {
			myDogs[x].bark();
			x = x+1;
		}
}

	public void bark() {
		if (size > 60) {
			System.out.println("Whoof! Whoof!");
		}
		else if (size > 14) {
			System.out.println("Ruff! Ruff!");
		} else {
			System.out.println("Yip! Yip!");
		}
		System.out.println(name + " says Ruff!");
	
	}
	public void eat() { }
	public void chaseCat() { }
}