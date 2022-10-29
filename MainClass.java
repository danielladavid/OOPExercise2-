public class MainClass{ // main class
   public static void main (String[] args){
	   Archosaurs archosaurs; // super class object
	  // subject class object
	   Dinosaur dinosaur = new Dinosaur("Trixie...", 68, "Triceratops");
	   Pterosaur pterosaur = new Pterosaur("Thunderclap...", 150 , "Wings");
	   
	   archosaurs=dinosaur;
	   // calling the accessors from the super class object 
	   System.out.println(archosaurs.Move() + " " + "My dino " + archosaurs.getName());
	   
	   archosaurs=pterosaur;
	   System.out.println(archosaurs.Move() + " " + "My ptero " + archosaurs.getName());
	   }
   }
   
