import info.gridworld.actor.Rock;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Actor;
import java.util.*;
import java.awt.Color;

public class BlackPlagueCritter extends Critter {
  public void processActors(ArrayList<Actor> actors) {
      for(Actor x : actors){
          if (!(x instanceof Rock)) 
                   x.setColor(Color.GREEN);


           }
      int n = actors.size(); if (n == 0) return;
      int r = (int) (Math.random() * n);
      Actor other = actors.get(r);
         if(!(other instanceof Rock) && !(other instanceof Critter)) 
                other.removeSelfFromGrid();
}
}