package test02;

public class Test02 {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal[] animals = new Animal[2];
	    animals[0] = new Cat();
	    animals[1] = new Dog();
	    
	    for (int i = 0; i < animals.length; i++) {
	    	animals[i].cry();
	    	animals[i].cry();
	    	animals[i].cry();
	    	
	    }
	    for (int i = 0; i < animals.length; i++) {
	    	if (animals[i] instanceof Cat) {
	    		Cat kitten = (Cat)animals[i];
	    		kitten.grooming();
	    	}
	    	if (animals[i] instanceof Dog) {
	    		Dog puppy = (Dog)animals[i];
	    		puppy.fishTail();
	    	}
	    }
	}

}
