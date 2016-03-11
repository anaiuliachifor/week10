package week10;

import java.util.Scanner;

public class HotelRoomTest
{

   public static void main(String[] args)
   {
      HotelRoom room1 = new HotelRoom(1,500,"John");
      HotelRoom room2 = new HotelRoom(2,300);
      
      if (room1.isAvailable() == true)
      {
         System.out.println("the room is for rent");
      }
      else System.out.println(room1.getGuest());

      if (room2.isAvailable()== true)
      {
         System.out.println("the room is for rent");
      }
      else System.out.println(room2.getGuest());
      
      room1.checkOut();
      room2.checkIn("Mary");
      System.out.println(room2.getGuest());
      
      Scanner kb= new Scanner(System.in);
     
      
      while (true)   
      {
         System.out.println("enter new rent: ");
         room1.setRent(kb.nextDouble());
      if (room1.getRent() > 0)
      {
         break;
      }
      

   }
   
System.out.println(room1);    
System.out.println(room2);
     
   }
}

