// The interface is implemented by many other
// subclasses that allow for many types of flying
// without effecting Animal, or Fly.

// Classes that implement new Fly interface
// subclasses can allow other classes to use
// that code eliminating code duplication

// I'm decoupling : encapsulating the concept that varies

public interface FLYS {
	
	String fly();

}

// Class used if the Animal can fly

class ItFlys implements FLYS{

	public String fly() {

		return "Flying High";

    }

}

//Class used if the Animal can't fly

class CantFly implements FLYS{

	public String fly() {

		return "I can't fly";

}

}