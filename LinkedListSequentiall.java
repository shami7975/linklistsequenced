/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.LinkedList;
import java.util.List;

public class LinkedListSequential {
    public static void main(String[] args) {
       
        List<String> animals = new LinkedList<>();

        
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
        animals.add("Lion");

        
        animals.add(2, "Zebra"); // Inserts at index 2

       
        System.out.println("Animal at index 2: " + animals.get(2));

       
        animals.set(1, "Wolf");

       
        animals.remove(3);

        
        System.out.println("\nAnimals in the list:");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println("Index " + i + ": " + animals.get(i));
        }
    }
}


