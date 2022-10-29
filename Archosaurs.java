public abstract class Archosaurs{ //super class
protected String name; // attributes are protected
protected double age;

// constructor 
public Archosaurs (String name, double age){
	this.name=name;
	this.age=age;
	}
	
	// this method will be override by its subclasses
	public abstract String Move();
	
	public String getName(){
		return name;
		}
		
	public void setName(String name){
		this.name=name;
		}
		
	public double getAge(){
		return age;
		}
		
	public void setAge(double age){
		this.age=age;
		}
}



