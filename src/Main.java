import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Main{
    public static void main(String [] args){
        ArrayList<String> books = new ArrayList<>(Arrays.asList("Don Quixote",  "A Tale of Two Cities", "The Lord of the Rings"));
        ArrayList<String> moreBooks = new ArrayList<>(Arrays.asList("The Lord of the Rings", "Harry Potter and the Sorcerer's Stone", "The Alchemist"));

        ArrayList<String> merged = new ArrayList<>(books);
        for (String i : moreBooks){
            if (!merged.contains(i)){
                merged.add(i);
            }
        }
        System.out.println("Merged ArrayList: "+  merged);


        ArrayList<String> movies = new ArrayList<>(Arrays.asList("Harry Potter", "It", "Home Alone"));
        String longest="";
        for(String s : movies){
            if(s.length()>longest.length()){
                longest=s;
            }
        }
        System.out.println("longest movie title: " + longest);


        ArrayList<String> food = new ArrayList<>(Arrays.asList("Pizza", "Burger", "Pizza", "Pizza"));
        int count = 0;
        for(String i : food){
            if(i == "Pizza"){
                count+=1;
            }
        }
        System.out.println("Pizza was in list " + count + " times");

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Apple", "Pear", "Banana"));
        fruits.removeAll(Collections.singleton("Banana"));
        System.out.println(fruits);


        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Green", "Purple", "Blue", "Pink"));
        for (int i = 0; i<colors.size(); i++){
            colors.set(i, "Blackx3");
        }
        System.out.println(colors);
    }
}