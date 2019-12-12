package miniProject.JDBCversion;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.sql.*;

public class App 
{
    public static void main( String[] args )
    {
    	dbHelper helper = new dbHelper("jdbc:mysql://localhost/tolldb", "falcon2212", "2212");
    	int customerId = 1;
        int tollBoothId = 1;
        int employeeId = 1;
        int billId = 1;
        int ownerId = 1;


        TollBooth toll1 = new TollBooth(345, "Electronic City", "car: 70, truck: 120, motor cycle: 50, auto: 60, bus: 100");
        helper.saveTollBooth(toll1);
        Scanner sc = new Scanner(System.in);
    	System.out.println("Welcome to  Toll gate Management System");
    	System.out.println("Select any one role : Customer, ServiceOwner");
    	String user = sc.next() ;

        HashSet<String> allowedVehicleTypes = new HashSet<String>();
        allowedVehicleTypes.add("car");
        allowedVehicleTypes.add("truck");
        allowedVehicleTypes.add("motor cycle");
        allowedVehicleTypes.add("auto");
        allowedVehicleTypes.add("bus");
        
        
        
        String serviceName = "Electronic City Tollgate";
    	String payMethod = "cash";
    	String time = "12:05";
        if(user.equals("Customer")) {
        	System.out.println("Welcome! to use the toll service kindly enter the following cerdentials");
            System.out.println("Enter your name:");
            String name = sc.next();
            System.out.println("Enter your vehicle type:");  
            String vehicle = sc.next();
            System.out.println("Enter Registration Number of your vehicle:");
            String regNumber = sc.next();
            System.out.println("Are you a Fasttrack memner(answer 'yes' or 'no'):");
            String bool = sc.next();
            int fast = 0;
            if(bool.equals("yes")) fast = 1;
            System.out.println("Enter your Adhaar number:");
            String adhaarNumber = sc.next();
    		Customer c = new Customer(customerId, name, regNumber, vehicle, fast, adhaarNumber);
    		customerId+=1;
            helper.saveCustomer(c);
            System.out.println("Thank you your bill will be processed shortly.");
            
            Bill b = helper.prepareBill(c, toll1, payMethod, time, billId++);
            b.displayBill();
    	}
    	if(user.equals("ServiceOwner")) {
    		System.out.println("Welcome! would you like to modify toll prices(answer 'yes' or 'no')");
            String name = sc.next();
			if(name.equals("yes")){
			System.out.println("Enter new price list");
            name = sc.next();
			helper.updatePrices(toll1, name);	
			}
                            			
    	}
//    	helper.storeBillDetails(bill1);
        System.out.println( "Thank You!" );
    
	}
}