public class Dinosaur extends Archosaurs { // subclass#1  
   private String classification;
   
   public Dinosaur(String name, double age, String classification){
	   // call the superclass constructor and pass the superclass method 'move'
	   super (name, age);
	   this.classification=classification;
   }

   @Override
   public String Move() // overriding the superclass method ' /move'
   {
	   // TODO: Implement this method
	   return "Run!";
   }

	   public String getClassification(){
		   return classification;
		  }
		  
	   public void setClassification(String classification){
		   this.classification=classification;
		   }   
}
