package projects;

import java.util.Scanner;
public class Project1 {

    int clubS = 179;
    int classicb = 119;
    int pizza = 279;
    int fries = 89;
    int drinks = 40;
    int garlic = 139;
    int custard = 80;
    int ch;
    int quantity;
    static int total;
    String again;

    Scanner sc = new Scanner(System.in);

    public void displayMenu() {
    	
        System.out.println("**************** Welcome To our Restaurant ****************");
        System.out.println("===========================================================");
        System.out.println("           1.Club Sandwich               179/-");
        System.out.println("           2.Classic Burger              119/-");
        System.out.println("           3.Pizza                       279/-");
        System.out.println("           4.French Fries                 89/-");
        System.out.println("           5.Soft Drinks 500ml            40/-");
        System.out.println("           6.Garlic Bread Sticks         139/-");
        System.out.println("           7.Caramel Custard             80/- ");
        System.out.println("           8.Exit                                  ");
        System.out.println("======================================================");
        System.out.println("          What Do you Want to Order Today??");
    }

    public void generateBill()
    {
        System.out.println();
        System.out.println("***************** Thank You for Ordering ******************");
        System.out.println("**************** Your Bill is : Rs. " +total+" *****************");
    }

    public void order() {
        while (true) {
            System.out.print("Enter Your Choice ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("You have Selected Club Sandwich");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * clubS;

                    break;

                case 2:
                    System.out.println("You have Selected Classic Burger");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * classicb;

                    break;

                case 3:
                    System.out.println("You have Selected Pizza");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * pizza;

                    break;
                case 4:
                    System.out.println("You have Selected French Fries");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * fries;

                    break;
                case 5:
                    System.out.println("You have Selected Cold Coffee");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * drinks;

                    break;

                case 6:
                    System.out.println("You have Selected Garlic Bread");
                    System.out.println();
                    System.out.println("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * garlic;

                    break;

                case 7:
                    System.out.println("You have Selected Caramel Custard");
                    System.out.println();
                    System.out.println("Enter the desired Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * custard;

                    break;
                
                case 8:
                	System.exit(1);
                	
                	break;
                	
                default:
                	
                	break;
                    
            }
            System.out.println();
            System.out.print("Do you wish to order anything else (Y/N) : ");
            again = sc.next();
            
            if
            (again.equalsIgnoreCase("Y"))
            	
            {
            	order();
            }
            
            else if
            (again.equalsIgnoreCase("N"))
            {
            	generateBill();
            	System.exit(1);
            }
            
            else
            {
            	System.out.println("Invalid Choice");
            }
        }
    }
}

