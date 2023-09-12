
//Student Name: Sarah Mohammed Althobiti  Student ID: 444004881
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class main {
 public static void main(String[] args) {
    CircularlyLinkedList<Integer> myList = new CircularlyLinkedList<>();
    Scanner scnr = new Scanner(System.in);
    boolean flag = true;
    while(flag){
      System.out.println("1.Add new node to CLL");
      System.out.println("2.Delete a node from CLL");
      System.out.println("3.Show how many nodes in CLL");
      System.out.println("4.Print all data in the Cll");
      System.out.println("5.Rotat the nodes");
      System.out.println("6.Exit");
      int num = scnr.nextInt();
      int key;
      int number;
      if(num == 1){
       System.out.println("1. to add first ");
       System.out.println("2. to add last");
       number = scnr.nextInt();
       if(number == 1){
       System.out.println("enter the element to add");
       key = scnr.nextInt();
       myList.addFirst(key);
       } else{
         System.out.println("enter the element to add");
         key = scnr.nextInt();
         myList.addLast(key);
         }

    }else if(num == 2){
      myList.removeFirst();
    }else if(num == 3){
      myList.size();
    }else if(num == 4){
      myList.traversal();
    }else if(num == 5){
      myList.rotate();
    }else{
      flag = false;
    }


  } 
  System.out.println("the first element is: "+myList.first());
  System.out.println("the last element is: "+myList.last());     
}
}