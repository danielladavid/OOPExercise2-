public class Pterosaur extends Archosaurs { // subclass#1  
	private String bodystructure;

	public Pterosaur(String name, double age, String bodystructure){
		// call the superclass constructor and pass the superclass method 'move'
		super (name, age);
		this.bodystructure=bodystructure;
	}

	@Override
	public String Move() // overriding the superclass method ' /move'
	{
		// TODO: Implement this method
		return "Fly!";
	}

	public String getBodyStructure(){
		return bodystructure;
	}

	public void setBodyStructure(String bodystructure){
		this.bodystructure=bodystructure;
	}   
}
