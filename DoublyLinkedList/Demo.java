
import LinkedList.DoublyLinkedList;
import java.util.*;
import java.lang.*;

class Demo
{
  public static void main(String arg[])
  {
    System.out.println("----------------------------------");
    System.out.println("Doubly Linked List By Prathamesh");
    int Choise = 1, iValue = 0, Pos = 0;
    DoublyLinkedList dObj = new DoublyLinkedList();

    while(Choise != 0)
    {
      System.out.println("----------------------------------");
      System.out.println("1. Insert Element At First Position");
      System.out.println("2. Insert Element At Last Position");
      System.out.println("3. Insert Element At Specific Position");
      System.out.println("4. Delete Element At First Position");
      System.out.println("5. Delete Element At Last Position");
      System.out.println("6. Delete Element At Specific Position");
      System.out.println("7. Display All Elements from starting");
      System.out.println("8. Display All Elements from Ending");
      System.out.println("9. Count Element in Linked List");
      System.out.println("0. Exit Application");
      System.out.println("----------------------------------");
      System.out.print("Enter Your Choise : ");
      Choise = SCObj.nextInt();
      System.out.println("----------------------------------");

      switch(Choise)
      {
        case 1:
                System.out.println("Enter Element to Insert");
                iValue = SCObj.nextInt();

                sObj.InsertFirst(iValue);
                break;
        case 2:
                System.out.println("Enter Element to Insert");
                iValue = SCObj.nextInt();

                sObj.InsertLast(iValue);
                break;
        case 3:
                System.out.println("Enter Element to Insert");
                iValue = SCObj.nextInt();

                System.out.println("Enter Position");
                Pos = SCObj.nextInt();

                sObj.InsertAtPos(iValue, Pos);
                break;
        case 4:
                sObj.DeleteFirst();
                break;
        case 5:
                sObj.DeleteLast();
                break;
        case 6:
                System.out.println("Enter Position");
                Pos = SCObj.nextInt();
                sObj.DeleteAtPos(Pos);
                break;
        case 7:
                sObj.Display();
                break;
        case 8:
                sObj.DisplyRev();
                break;
        case 9:
                System.out.println("Elements in Linked List are : "+sObj.Count());
                break;
        case 0:
                System.out.println("Thank you for using my Application");
                System.out.println("----------------------------------");
                break;
      }   //End of Switch case
    }   //End of while loop
  }   //End of Main
}   // End of class
