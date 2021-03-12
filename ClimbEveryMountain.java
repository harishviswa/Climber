//ClimbEveryMountain
//Harish Viswa
//09.23.20


import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class ClimbEveryMountain {
   public static void main (String[] args){
   
      Display.openWorld("maps/mountain.map");
      Display.setSize(16,16);
      Display.setSpeed(10);
      
      Climber climber1 = new Climber(8);
      Climber climber2 = new Climber(8);
      
   climber1.putBeeper();
   climber1.turnRight();
   climber2.turnRight();
   climber1.move();
   climber2.move();
   climber1.climbUpRight();
   climber2.climbUpRight();
   climber1.climbUpRight();
   climber2.climbUpRight();
   climber1.climbUpRight();
   climber2.climbUpRight();
   climber1.climbDownRight();
   climber2.climbDownRight();
   climber1.climbDownRight();
   climber2.climbDownRight();
   climber1.pickBeeper();
   climber1.turnRight();
   climber2.turnRight();
   climber1.turnRight();
   climber2.turnRight();
   climber1.climbUpLeft();
   climber2.climbUpLeft();
   climber1.climbUpLeft();
   climber2.climbUpLeft();
   climber1.climbDownLeft();
   climber2.climbDownLeft();
   climber1.climbDownLeft();
   climber2.climbDownLeft();
   climber1.climbDownLeft();
   climber2.climbDownLeft();
   climber1.move();
   climber2.move();
   climber1.putBeeper();
   climber1.turnRight();
   climber2.turnRight();
   climber1.move();
   climber2.move();
   
   
 


   }
   
}
   
   