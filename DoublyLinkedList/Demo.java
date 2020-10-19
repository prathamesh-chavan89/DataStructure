
import LinkedList.DoublyLinkedList;
import java.util.*;
import java.lang.*;

class Demo
{
  public static void main(String arg[])
  {
    System.out.println("Doubly Linked List");

    DoublyLinkedList dObj = new DoublyLinkedList();

    dObj.InsertFirst(15);
    dObj.Display();
    dObj.InsertFirst(10);
    dObj.Display();
    dObj.InsertFirst(5);
    dObj.Display();
    dObj.InsertLast(20);
    dObj.Display();
    dObj.InsertLast(25);
    dObj.Display();
    dObj.InsertLast(30);
    dObj.Display();
    dObj.InsertAtPos(17, 3);
    dObj.Display();
    System.out.println("Count is :"+dObj.Count());
    dObj.DeleteFirst();
    dObj.Display();
    System.out.println("Count is :"+dObj.Count());
    dObj.DeleteLast();
    dObj.DeleteAtPos(3);
    System.out.println("Count is :"+dObj.Count());
    dObj.Display();
  }
}
