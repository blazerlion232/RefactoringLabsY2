//DiscountService.java







/**

 * This class has some CODE SMELLS like

 * a) long method

 * b) duplicated logic in nested if blocks

 * c) String literals scattered

 * @TODO - mandatory:

 * refactor step by step <strong>without having to change the main method</strong>

 * a) use EXTRACT METHOD to separate

 * (i) calculating discount for regular customers

 * (ii) calculating discount for premium customers

 * b) Introduce constants or an enum for customer types instead of string literals

 * @TODO - Extensions:

 * a) Extract printing logic into a separate method to reduce duplication

 * b) Write a test class

 */

public class DiscountService {

  public double calculateDiscount(String customerType, double purchaseAmount){

    double discount = 0.0;

    if(customerType.equals("Regular")){

      if(purchaseAmount > 1000){

        discount = purchaseAmount * 0.1;

      }else {

        discount = purchaseAmount * 0.05;

      }

      System.out.println("Regular customer get discount of "+discount);

    }else if(customerType.equals("Premium")){

      if(purchaseAmount > 1000){

        discount = purchaseAmount * 0.2;

      }else {

        discount = purchaseAmount * 0.1;

      }

      System.out.println("Premium customer get discount of "+discount);

    } else if (customerType.equals("Guest")){

      discount = 0.0;

      System.out.println("Guest customer gets no discount");

    }

    return discount;

  }



  public static void main(String[] args) {

    DiscountService discountService = new DiscountService();

    discountService.calculateDiscount("Regular", 1200);

    discountService.calculateDiscount("Premium", 800);

    discountService.calculateDiscount("Guest", 500);

  }

}