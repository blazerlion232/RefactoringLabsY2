//DiscountService.java

import java.sql.SQLData;

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


public void displayText(double Disc, String cType){
        System.out.println(cType + " customer gets discount of " + Disc);
    }

public boolean pChecker(double purchaseAmount){
    if(purchaseAmount > 1000){
        return true;
    }else{
        return false;
    }
}

public int customerType(String customerType){
    switch(customerType){
        case "Premium":
            return 0;
        case "Regular":
            return 1;
        case "Guest":
            return 2;
    }
    return 10;
}

public double discountValue(String customerType, double purchaseAmount){

    int tempCT = customerType(customerType);
    boolean purchaseValue = pChecker(purchaseAmount);

    if(tempCT == 0 && purchaseValue == true ){
        return 0.2;
    }else if(tempCT == 0 && purchaseValue == false){
        return 0.1;
    }
    else if(tempCT == 1 && purchaseValue == true){
        return 0.1;
    }
    else if(tempCT == 1 && purchaseValue == false){
        return 0.05;
    }else if(tempCT == 10){
        throw new IllegalArgumentException("strange customer type");
    }else{
        return 0.0;
    }
}

    

  public void calculateDiscount(String customerType, double purchaseAmount){

    double disc = discountValue(customerType, purchaseAmount);
    displayText(disc, customerType);
  }

  public static void main(String[] args) {
    DiscountService discountService = new DiscountService();
    discountService.calculateDiscount("Regular", 1200);
    discountService.calculateDiscount("Premium", 800);
    discountService.calculateDiscount("Guest", 500);
  }

}