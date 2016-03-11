package week10;

public class _1401CarTest
{

   public static void main(String[] args)
   {
      _1401CarClass car1=new _1401CarClass("audi","the new one","blue",2017);
      _1401CarClass car2=new _1401CarClass("bmw","the old one","black",2000);
      
      System.out.println(car1.equals(car2));
      _1401CarClass car3=car1.copy();
      System.out.println(car1+"" + "\n"+car3+"\n"+car2);
   }

}
