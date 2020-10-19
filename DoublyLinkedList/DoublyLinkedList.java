package LinkedList;

import java.lang.*;
import java.util.*;

class Node    //Structure
{
  public Node Prev;
  public int Data;
  public Node Next;

  public Node(int iNo)    //Parameterised Constructor
  {
    Data = iNo;
    Next = null;
    Prev = null;
  }
}

public class DoublyLinkedList
{
  public Node Head;
  public int iCnt;

  public DoublyLinkedList()
  {
    Head = null;
    iCnt = 0;
  }

  public void InsertFirst(int iNo)
  {
    Node newn = new Node(iNo);

    if(Head == null)
    {
      Head = newn;
    }
    else
    {
      Head.Prev = newn;
      newn.Next = Head;
      Head = newn;
    }
    iCnt++;
  }

  public void InsertLast(int iNo)
  {
    Node newn = new Node(iNo);
    Node Temp = Head;

    if(Head == null)
    {
      Head = newn;
    }
    else
    {
      if(Head.Next == null)
      {
        Head.Next = newn;
        newn.Prev = Head;
      }
      else
      {
        while(Temp.Next != null)
        {
          Temp = Temp.Next;
        }
        Temp.Next = newn;
        newn.Prev = Temp;
      }
    }
    iCnt++;
  }

  public void InsertAtPos(int iNo, int iPos)
  {
    if((iPos < 1) || (iPos > iCnt + 1))
    {
      System.out.println("Enter Position is wrong");
      return;
    }

    if(iPos == 1)
    {
      InsertFirst(iNo);
    }

    if(iPos == (iCnt + 1))
    {
      InsertLast(iNo);
    }

    else
    {
      Node newn = new Node(iNo);
      Node Temp = Head;

      for(int  i = 1; i < iPos - 1; i++)
      {
        Temp = Temp.Next;
      }
      newn.Next = Temp.Next;
      newn.Next.Prev = newn;
      newn.Prev = Temp;
      Temp.Next = newn;
      iCnt++;
    }
  }

  public void DeleteFirst()
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
        Head = Head.Next;
        Head.Prev = null;
      }
      iCnt--;
    }
  }

  public void DeleteLast()
  {
    if(Head == null)
    {
      return;
    }
    else
    {
      if((Head.Next == null) && (Head.Prev == null))
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
        Temp.Next.Prev = null;
        Temp.Next = null;
      }//End of else inside else
    }//End of else
  }//End of Method

  public void DeleteAtPos(int iPos)
  {
    if((iPos < 1) || (iPos > iCnt))
    {
      System.out.println("Error : Wrong Position");
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
      for(int i = 1; i < iPos - 1; i++)
      {
        Temp = Temp.Next;
      }
      Node Temp2 = Temp.Next;
      Temp.Next = Temp2.Next;
      Temp.Next.Prev = Temp;
      iCnt--;
    }
  }

  public void Display()
  {
    Node Temp = Head;
    while(Temp != null)
    {
      System.out.print("|"+Temp.Data+"|<=>");
      Temp = Temp.Next;
    }
    /*while(Temp != null) // Print reverce order
    {
      System.out.print("|"+Temp.Data+"|->");
      Temp = Temp.Prev;
    }*/
    System.out.println();
  }
  public int Count()
  {
    return iCnt;
  }
}
