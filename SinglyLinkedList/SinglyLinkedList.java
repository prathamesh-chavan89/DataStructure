package LinkedList;
import java.util.*;
import java.lang.*;

class Node    // Similer Like Structure
{
  public int Data;
  public Node Next;

  public Node(int iNo)
  {
    Data = iNo;
    Next = null;
  }
}

public class SinglyLinkedList
{
  public Node Head;         //Charactristics
  public int iCnt;          //Charactristics

  public SinglyLinkedList()   //Constructor
  {
    Head = null;
    int iCnt = 0;
  }

  public void InsertFirst(int iNo)    //Method
  {
    Node newn = new Node(iNo);

    if(Head == null)
    {
      Head = newn;
      iCnt++;
    }
    else
    {
      newn.Next = Head;
      Head = newn;
      iCnt++;
    }
  }

  public void InsertLast(int iNo)     //Method
  {
    Node newn = new Node(iNo);
    if(Head == null)
    {
      Head = newn;
      iCnt++;
    }
    else
    {
      if(Head.Next == null)
      {
        Head.Next = newn;
        iCnt++;
      }
      else
      {
        Node Temp = Head;
        while(Temp.Next != null)
        {
          Temp = Temp.Next;
        }
        Temp.Next = newn;
        iCnt++;
      }
    }
  }

  public void InsertAtPos(int iNo, int iPos)      //Method
  {
    if((iPos < 1) || (iPos > iCnt + 1))
    {
      return;
    }

    if(iPos == 1)
    {
      InsertFirst(iNo);
    }

    if(iPos == iCnt + 1)
    {
      InsertLast(iNo);
    }
    else
    {
      Node newn = new Node(iNo);
      Node Temp = Head;
      for(int i = 1; i < (iPos - 1); i++)
      {
        Temp = Temp.Next;
      }
      newn.Next = Temp.Next;
      Temp.Next = newn;
      iCnt++;
    }
  }

  public void DeleteFirst()   //Method
  {
    if(Head == null)
    {
      return;
    }
    else
    {
      Head = Head.Next;
      iCnt--;
    }
  }

  public void DeleteLast()    //Method
  {
    if(Head == null)
    {
      return;
    }
    else
    {
      if(Head.Next == null)
      {
          Head = null;
      }
      else
      {
        Node Temp = Head;
        while(Temp.Next.Next != null)
        {
          Temp = Temp.Next;
        }
        Temp.Next = null;
        iCnt--;
      }
    }
  }

  public void DeleteAtPos(int iPos)   //Method
  {
    if((iPos < 1) || (iPos > iCnt))
    {
      return;
    }
    if(iPos == 1)
    {
      DeleteFirst();
    }
    if(iPos == iCnt)
    {
      DeleteLast();
    }
    else
    {
      Node Temp = Head;
      int i = 1;
      while(i < (iPos-1))
      {
        Temp = Temp.Next;
        i++;
      }
      Temp.Next = Temp.Next.Next;
      iCnt--;
    }
  }

  public void Display()   //Method
  {
    Node Temp = Head;
    while(Temp != null)
    {
      System.out.print("|"+Temp.Data+"|->");
      Temp = Temp.Next;
    }
    System.out.print("null");
    System.out.println();
  }

  public int Count()    //Method
  {
    return iCnt;
  }
}
