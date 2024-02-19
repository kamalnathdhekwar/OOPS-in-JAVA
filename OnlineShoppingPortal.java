import java.util.*;

public class OnlineShoppingPortal{
 double amount ;
 static double discount , discountAmount ;
 int customerType;
 String promoCode ;
 
 OnlineShoppingPortal (){
 
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the amount");
  amount = sc.nextDouble();
 
   System.out.println("enter 1 for prime and 2 for regular ");
   customerType = sc.nextInt();
  if(customerType==2)
  {
   System.out.println("enter the promoCode");
  promoCode = sc.next();
 
  this.checkOut(amount , promoCode);
  }
 
  else if(customerType==1)
  {
  this.checkOut(amount);
  }
  else
  { System.out.println("Invalid customer type"); }
 
 }
 
 static void checkOut(double amount)
 {
 if(amount>1000)
 {
 discount = amount * 0.3 ;
  discountAmount = amount - discount;
 }
 else {
  discount = amount * 0.2 ;
  discountAmount = amount - discount;
 }
System.out.println("discounted amount for the prime customer is"+discountAmount);
}

static void checkOut(double amount , String promoCode)
 {
 if(amount<500)
 {
 discount = 10;
 discountAmount = amount - discount ;
 }
 else if(amount>500)
  {
 discount = 10;
 discountAmount = amount - discount ;
 }
 else if(promoCode.equals("GET10")){
 discount = 0.1 * amount;
 discountAmount = amount - discount;
  }
  System.out.println("discounted amount for the regular customer is"+discountAmount);
  }
  // main method //
  public static void main(String[] args)
  {
    OnlineShoppingPortal ob = new OnlineShoppingPortal();

  }
}

