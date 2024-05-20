package Statement14;
import java.util.*;

class Time{
  private int hours, mins, seconds;
  
  Time(int h, int m, int s){
    hours = h;
    mins = m;
    seconds = s;
  }
  
  void add(Time t){
    int newSec = this.seconds + t.seconds;
    int newMins = this.mins + t.mins + newSec/60;
    int newHours = this.hours + t.hours + newMins/60;
    
    newSec %= 60;
    newMins = newMins%60;
    newHours %= 24;
    
    System.out.println("New Time is: " + newHours + ":" + newMins + ":" + newSec); 
  }
}

public class Statement14 {
    public static void main(String[] args) {
      Time t1 = new Time(21,0,0);
      Time t2 = new Time(4,23,23);
      
      t1.add(t2);
  }
}