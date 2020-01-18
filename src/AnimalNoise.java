import model.*;

public class AnimalNoise {
	//add your animal class to the model package
	//only push this file and the animal class you created

	public static void main(String[] args) {
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());
		

		Pig mrCuddles = new Pig("Mr. Cuddles", "pink", 4);
		mrCuddles.playInMud();
		System.out.println(mrCuddles.speak());
		mrCuddles.bathe();
		System.out.println(mrCuddles.speak());
		
		
		Lion simba = new Lion(false, 2, "Simba");
		System.out.println(simba.speak());
	}

}
