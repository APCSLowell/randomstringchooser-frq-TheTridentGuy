import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
    ArrayList<String> strings = new ArrayList<String>();
  public RandomStringChooser(String[] strs){
      for(String str : strs){
          strings.add(str);
      }
  }
  public String getNext(){
      if(strings.size() == 0){
          return "NONE";
      }
      return strings.remove((int)(Math.random() * strings.size()));
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
