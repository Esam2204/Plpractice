import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayDeque;
public class Main{
    public static void main(String [] args){
        //Task1
        ArrayList<String> books = new ArrayList<>(Arrays.asList("Don Quixote",  "A Tale of Two Cities", "The Lord of the Rings"));
        ArrayList<String> moreBooks = new ArrayList<>(Arrays.asList("The Lord of the Rings", "Harry Potter and the Sorcerer's Stone", "The Alchemist"));

        ArrayList<String> merged = new ArrayList<>(books);
        for (String i : moreBooks){
            if (!merged.contains(i)){
                merged.add(i);
            }
        }
        System.out.println("Merged ArrayList: "+  merged);

//      Task 2
        ArrayList<String> movies = new ArrayList<>(Arrays.asList("Harry Potter", "It", "Home Alone"));
        String longest="";
        for(String s : movies){
            if(s.length()>longest.length()){
                longest=s;
            }
        }
        System.out.println("longest movie title: " + longest);

        //Task3
        ArrayList<String> food = new ArrayList<>(Arrays.asList("Pizza", "Burger", "Pizza", "Pizza"));
        int count = 0;
        for(String i : food){
            if(i == "Pizza"){
                count+=1;
            }
        }
        System.out.println("Pizza was in list " + count + " times");


        //Task4
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Apple", "Pear", "Banana"));
        fruits.removeAll(Collections.singleton("Banana"));
        System.out.println(fruits);

        //Task5
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Green", "Purple", "Blue", "Pink"));
        for (int i = 0; i<colors.size(); i++){
            colors.set(i, "Black");
        }
        System.out.println(colors);

        //Task6
        ArrayList<String> sports = new ArrayList<>(Arrays.asList("Football", "Basketball", "Tennis", "Cricket"));

        ArrayList<String> checkSports = new ArrayList<>(Arrays.asList("Football", "Tennis"));

        boolean found = true;
        for (String s : checkSports) {
            if (!sports.contains(s)) {
                found = false;
                break;
            }
        }
        if (found) {
            System.out.println("Sports list contains sports");
        } else {
            System.out.println("Some sports are missing");
        }

        //Task7

        ArrayList<String> flowers = new ArrayList<>(Arrays.asList("Tulip", "Rose", "Lily", "Rose", "Daisy", "Rose"));

        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i).equals("Rose")) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }
        System.out.println("First index of Rose: " + firstIndex);
        System.out.println("Last index of Rose: " + lastIndex);

        //Task 8
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Cat","Dog","Cat","Rabbit","Dog"));
        ArrayList<String> newAnimals = new ArrayList<>(new HashSet<>(animals));
        System.out.println("List without duplicates: " + newAnimals);

        //Task 9
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Paris", "London", "Tokyo", "Bishkek"));
        String[] citiesArray = cities.toArray(new String[0]);
        System.out.println(Arrays.toString(citiesArray));

        //Task 10
        Integer[] numbers = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(list);

        //Task11
        ArrayList<String> countries1 = new ArrayList<>(
                Arrays.asList("France", "Germany", "Kyrgyzstan", "Spain"));

        ArrayList<String> countries2 = new ArrayList<>(
                Arrays.asList("Kyrgyzstan", "Portugal", "Germany", "Brazil"));

        ArrayList<String> common = new ArrayList<>();

        for (String c : countries1) {
            if (countries2.contains(c) && !common.contains(c)) {
                common.add(c);
            }
        }
        System.out.println("Common countries between two arrays: " + common);

        //Task 12
        ArrayList<String> names = new ArrayList<>(
                Arrays.asList("Anna", "Bob", "Maria", "Tom", "Alex", "John"));

        for (int i = names.size() - 1; i >= 0; i--) {
            if (names.get(i).length() % 2 == 0) {
                names.remove(i);
            }
        }
        System.out.println(names);

        //Task 13
        ArrayList<String> songs = new ArrayList<>(
                Arrays.asList("Around the world", "One", "Bohemian Rhapsody", "Dancin"));

        String shortest = songs.get(0);

        for (String s : songs) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }
        System.out.println(shortest);

        //Task 14
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("apple", "orange", "banana"));

        for (int i = 0; i < words.size(); i++) {
            String w = words.get(i);
            w = w.replaceAll("[AEIOUaeiou]", "*");
            words.set(i, w);
        }
        System.out.println(words);

        //Task 15
        ArrayList<Integer> number = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)
        );

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int n : number) {
            if (n % 2 == 0) {
                even.add(n);
            } else {
                odd.add(n);
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        //Task 16
        ArrayList<String> days = new ArrayList<>(
                Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

        int k = 2;
        int size = days.size();
        for (int i = 0; i < k; i++) {
            String last = days.get(size - 1);
            days.remove(size - 1);
            days.add(0, last);
        }
        System.out.println(days);

        //Task 17
        ArrayList<String> students = new ArrayList<>(
                Arrays.asList("Anna", null, "Bob", null, "Maria")
        );
        for (int i = students.size() - 1; i >= 0; i--) {
            if (students.get(i) == null) {
                students.remove(i);
            }
        }
        System.out.println(students);

        //Task 18
        ArrayList<String> moviesFind = new ArrayList<>(
                Arrays.asList("It", "Avatar", "Inception", "Up", "Interstellar"));

        String largest = "";
        String secondLargest = "";

        for (String m : moviesFind) {
            if (m.length() > largest.length()) {
                secondLargest = largest;
                largest = m;
            } else if (m.length() > secondLargest.length() && !m.equals(largest)) {
                secondLargest = m;
            }
        }
        System.out.println(secondLargest);

        //Task 19
        ArrayList<String> fruit = new ArrayList<>(
                Arrays.asList("Apple", "Banana", "Kiwi", "Mango")
        );

        for (int i = 0; i < fruit.size(); i++) {
            String s = fruit.get(i);
            fruit.set(i, String.valueOf(s.length()));
        }

        System.out.println(fruit);

        //Task 20
        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> it = new ArrayList<>(
                Arrays.asList("Alice", "Bob", "Charlie"));

        ArrayList<String> hr = new ArrayList<>(
                Arrays.asList("Diana", "Eve"));

        ArrayList<String> sales = new ArrayList<>(
                Arrays.asList("Frank", "Grace", "Helen"));

        departments.add(it);
        departments.add(hr);
        departments.add(sales);

        System.out.println(departments);



    }
}