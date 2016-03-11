package week10;

public class HotelRoom
{
private int roomNumber;
private double rent;
private String guest;

public HotelRoom(int roomNumber, double rent,String guest)
   {
   this.roomNumber=roomNumber;
   this.rent=rent;
   this.guest=guest;
   }

public HotelRoom(int roomNumber, double rent)
   {
   this.roomNumber=roomNumber;
   this.rent=rent;
   this.guest="no one";
   }

public int getRoomNumber()
   {
   return roomNumber;
   }

public String getGuest()
   {
   return guest;
   }

public double getRent()
   {
   return rent;
   }

public void setRent(double rent)
   {
   this.rent=rent;
   }

public boolean isAvailable()
   {
   if (guest=="no one") return true;
   else return false;
   }

public void checkIn(String guest)
   {
   if (this.guest=="no one")
   {
      this.guest=guest;
   }
   }

public void checkOut()
{
   this.guest="no one";
}

public String toString()
{
   if (this.guest == "no one") 
      
      return "room number "+roomNumber+"   rent: "+rent;
      
   else 
      return "room number "+roomNumber+"   rent: "+rent+"   guest name:  "+guest;
      
}

   }

