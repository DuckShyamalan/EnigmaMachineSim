
//defining the Reflector class which extends the Rotor class
public class Reflector extends Rotor {

	//constructor method
	public Reflector(String name) {
		this.initialise(name);  //calls the initialise method
	}


	//method to initialise the reflector by taking a String value from the constructor
	public void initialise(String init) {

		//sets the type of reflector as necessary
		if (init.equals("ReflectorI")) {
			mapping = new Integer[] { 24, 17, 20, 7, 16, 18, 11, 3, 15, 23, 13, 6, 14, 10, 12, 8, 4, 1, 5, 25, 2, 22, 21, 9, 0, 19 };
		}
		else if(init.equals("ReflectorII")) {
			mapping = new Integer[] { 5, 21, 15, 9, 8, 0, 14, 24, 4, 3, 17, 25, 23, 22, 6, 2, 19, 10, 20, 16, 18, 1, 13, 12, 7, 11 };
		}
	}


	//method to substitute the number with the one mapped to it in the array
	public int substitute(int subsIn) throws Exception {
		int subsOut = mapping[subsIn];
		return subsOut;
	}
}
