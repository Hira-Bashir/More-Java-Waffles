import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class SimpleJavaProgram{
    public static void main(String args[]){
      System.out.println("");
      DateFormat currentDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
      Date date = new Date();
      System.out.println("Congratulations! You just did it on Jenkins.");
      System.out.println(currentDate.format(date)); 
    }
}
  
