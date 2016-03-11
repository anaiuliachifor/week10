package week10;

public class _1401CarClass
{
private String make,model, color, licenseNr;
private int year;

public _1401CarClass(String make, String model, String color, String licenseNr, int year)
   {
   this.make=make;
   this.model=model;
   this.color=color;
   this.licenseNr=licenseNr;
   this.year=year;
   }

public _1401CarClass(String make, String model, String color, int year)
   {
   this.make=make;
   this.model=model;
   this.color=color;
   this.licenseNr="no face no name no number";
   this.year=year;
   }

public String getMake()
   {
   return make;
   }

public String getColor()
   {
   return color;
   }
public int getYear()
   {
   return year;
   }

public void setColor(String color)
   {
   this.color=color;
   }

public void setLicense(String license)
   {
   this.licenseNr=license;
   }

public _1401CarClass copy()
   {
   return new _1401CarClass(make, model, color, year);
   }

public String toString()
   {
   return make+"  "+model+"  "+color+"  "+year;
   }

public boolean equals(_1401CarClass object2)
   {
   if (model==object2.model && make==object2.make && color==object2.color && year==object2.year)
      return true;
   else return false;
   }
}
