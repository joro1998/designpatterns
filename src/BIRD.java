public class BIRD extends Animal{
	
	// The constructor initializes all objects
	
	public BIRD(){
		
		super();
		
		setSound("Tweet");
		
		// We set the Flys interface polymorphically.
		// This sets the behavior as a non-flying Animal.
		
		flyingType = new ItFlys();
		
	}

}
