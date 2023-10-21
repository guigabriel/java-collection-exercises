package org.exercises.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ArrList {

  public void addColor() {
    /*
     *Write a Java program to create an array list, add some colors (strings) and print out the collection.
      **/
    List<String> colors = new ArrayList<>();
    colors.add("Red");
    colors.add("Blue");
    colors.add("Purple");
    colors.add("White");
    colors.add("Orange");
    System.out.println(colors);
  }

  public void listIterator() {
    /*
     * Write a Java program to iterate through all elements in an array list.
      **/
    int max = 10;

    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < max; i++) {
      numbers.add(i);
    }

    for (int i = numbers.size() - 1; i > 0; i--) {
      System.out.println(numbers.get(i));
    }
  }

  public void insertFirstPosition() {
    /*
     * Write a Java program to insert an element into the array list at the first position.
      **/
    List<Boolean> first = new ArrayList<>();
    first.addFirst(false);
    System.out.println(first);
  }

  public void listRetrive () {
    /*
     * Write a Java program to retrieve an element (at a specified index) from a given array list.
     */
    List<String> names = new ArrayList<>();
    names.add("Guilherme");
    names.add("Gabriel");
    names.add("Lisboa");
    names.add("Silva");
    System.out.println(names.get(3));
  }

  public void updateElement() {
    /*
     * Write a Java program to update an array element by the given element.
      **/
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      numbers.add(i);
    }
    System.out.println(numbers);
    numbers.set(2, 7);
    System.out.println(numbers);
  }

  public void removeElement () {
    /*
     * Write a Java program to remove the third element from an array list.
      **/
    List<String> names = new ArrayList<>();
    names.add("GG");
    names.add("LuckGG");
    names.add("Zeca Pagodin");
    System.out.println(names);
    names.remove(3);
    System.out.println(names);
  }

  public void searchElement() {
    /*
     * Write a Java program to search for an element in an array list.
      **/
    List<String> cities = new ArrayList<>();
    cities.add("Florianópolis");
    cities.add("Los Angeles");
    cities.add("Las Vegas");
    cities.add("São Paulo");
    cities.add("Bali");

    if(cities.contains("Las Vegas")){
      System.out.println("City found!!");
    }else {
      System.out.println("City not found");
    }
  }

  public void sortElemens() {
    /*
     * Write a Java program to sort a given array list.
      **/

    List<Integer> numbers = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      numbers.add(random.nextInt(), 1000);
    }
    System.out.println(numbers);
    Collections.sort(numbers);
    System.out.println(numbers);
  }

  public void copyArray() {
    /*
     * Write a Java program to copy one array list into another
      **/
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 10; i ++) {
      numbers.add(i);
    }
    List<Integer> arr2 = new ArrayList<>();
    Collections.copy(arr2, numbers);
    System.out.println(arr2);
  }

  public void shuffleArray() {
    /*
     * Write a Java program to shuffle elements in an array list.
      **/
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    System.out.println("Before shuffle: " +numbers);
    Collections.shuffle(numbers);
    System.out.println("After shuffle: " +numbers);
  }
  public void reverseArray () {
    /*
     * Write a Java program to reverse elements in an array list.
      **/
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      numbers.add(i);
    }
    System.out.println("Before Reverse: " + numbers);
    numbers.reversed();
    System.out.println("After Reverse: " + numbers);
  }

  public void extract () {
    /*
     * Write a Java program to extract a portion of an array list.
      **/

    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 12; i++) {
      numbers.add(i);
    }
    System.out.println(numbers);
    List<Integer> numbers2 = numbers.subList(0,6);
    System.out.println(numbers2);
  }

  public void compareArrays() {
    /*
     * Write a Java program to compare two array lists.
      **/
    List<Integer> numbers = new ArrayList<>();
    List<Integer> numbers2 = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      numbers.add(i);
      numbers2.add(i * 3);
    }
    System.out.println(numbers.equals(numbers2));
  }

  public void swapElements() {
    /*
     * Write a Java program that swaps two elements in an array list.
      **/

    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      numbers.add((i * 4) / 2);
    }
    System.out.println(numbers);
    Collections.swap(numbers, 0, 99);
    System.out.println(numbers);
  }

  public void joinTwoArrays() {
    /*
     * Write a Java program to join two array lists.
      **/

    List<Integer> listOne = new ArrayList<>();
    List<Integer> listTwo = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      listOne.add(i);
      listTwo.add(i * 2);
    }
    List<Integer> newList = Stream.concat(listOne.stream(), listTwo.stream()).toList();
    System.out.println(newList);
  }

  public void cloneArrays() {
    /*
     * Write a Java program to clone an array list to another array list.
      **/

    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 6; i++) {
      numbers.add(i);
    }
    List<Integer> cloneNumbers = new ArrayList<>();
    cloneNumbers = (ArrayList)numbers;
    System.out.println(cloneNumbers);
  }

  public void emptyList () {
    /*
    * Write a Java program to empty an array list.
     * */

    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      numbers.add(i);
    }
    System.out.println(numbers);
    numbers.subList(0, numbers.size() ).clear();
//    numbers.removeAll(numbers);
    System.out.println(numbers);
  }

  public void isEmptyList() {
    /*
    * Write a Java program to test whether an array list is empty or not
     * */
    List<String> names = new ArrayList<>();
    names.add("Gui");
    names.add("Fael");
    names.add("Gi");

    if(names.isEmpty()) {
      System.out.println("Lista Vazia");
    }
    System.out.println("Lista não vazia");
  }

  public void arrayCapacity () {
    /*
    * Write a Java program for trimming the capacity of an array list.
     * */

    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      numbers.add(i);
    }
    numbers.subList(0, numbers.size() / 2);
    System.out.println(numbers);
  }

}
