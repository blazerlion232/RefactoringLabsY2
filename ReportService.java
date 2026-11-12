/**

 * This class has code smells.

 * a) It has repeated report methods (load, calculate, print and email)

 * b) class handles data loading, calculations, printing, and emailing customers etc.

 * these are too many responsibilities in one method, let alone a class.

 *

 * Refactor the code to:

 * @TODO mandatory: Extract common steps to their own separate methods

 * like loadData(String type or Enum etc.), printReport (String title, String body) etc.

 * @TODO extension: The above fix will not address all the issues. If you can, split this

 * class into smaller classes like ReportGenerator, EmailSender etc. to make it more SOLID.

 */

public class ReportService {



  public void generateSalesReport(){

    //load sales data

    System.out.println("Loading sales data from database...");

    //calculating totals

    System.out.println("Calculating totals...");

    //print report

    System.out.println("Sales Report");

    System.out.println("++++++++++++");

    System.out.println("Total Sales: 10000");

    //send by email

    System.out.println("Sending report by email...");

  }

  public void generateInventoryReport(){

    //loading inventory data

    System.out.println("Loading inventory data from database...");

    //calculating totals

    System.out.println("Calculating totals...");

    //print report

    System.out.println("Inventory Report");

    System.out.println("++++++++++++");

    System.out.println("Items in stock: 500");

    //send by email

    System.out.println("Sending report by email...");

  }



  public static void main(String[] args) {

    ReportService reportService = new ReportService();

    reportService.generateSalesReport();

    reportService.generateInventoryReport();

  }

}