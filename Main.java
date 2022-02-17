//
// Add any import statement your program might need
import java.util.ArrayList;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
  // Implement the main method according the the progam specification
  ArrayList<Tweet> mylist = null;

try{
  mylist = TweetLoader.loadAsArrayList("tweet_data.csv");
} catch (IOException e){
  System.out.println(e);
}
Tweet[] myArray = null ;
try{
  myArray = TweetLoader.loadAsArray("tweet_data.csv");
} catch (IOException e){
  System.out.println(e);
}
// Use a call method in order to declare the variable of n and and to call  upon which Array method is being used.
 // print head of ArrayList
        printHead(mylist, 5);
        System.out.println("");
        System.out.println("");
        // print tail of array list
        
        printTail(mylist, 9);
        //line to make the outputs readable
        System.out.println("");
        System.out.println("");
        // print head of Array
        
       printHead(myArray, 4);
       System.out.println("");
       System.out.println("");
        // Print tail of Array
        printTail(myArray, 3);
  }
  // Add any methods, specific to the Main class
  // based on the problem set specification.
public static void printHead(ArrayList<Tweet>list, int n) {
  System.out.println("This is Print Head Array List:");
  for (int i=0; i<n; i++){
  System.out.println(list.get(i));
  }
}
public static void printTail (ArrayList<Tweet>list, int n){
  System.out.println("This is Print Tail Array List:");
  for (int i=list.size()-n; i<list.size(); i++){
  System.out.println(list.get(i));
  }
}

public static void printHead(Tweet[] list, int n){
  System.out.println("This is Print Head Array:");
  for (int i=0; i<n; i++){
  System.out.println(list[i]);
  }
}

public static void printTail (Tweet[]list, int n){
  System.out.println("This is Print Tail Array:");
  for (int i = list.length-n; i<list.length; i++){
  System.out.println(list[i]);
  }
}
} // end of Main class

