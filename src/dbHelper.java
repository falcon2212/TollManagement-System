package miniProject.JDBCversion;

import java.sql.*;

public class dbHelper {
	private Connection conn = null;
	private Statement st = null;
	public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public Statement getSt() {
		return st;
	}
	public void setSt(Statement st) {
		this.st = st;
	}
	public PreparedStatement pst = null;
	
	public dbHelper(String url, String user, String pass) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");  
			this.conn = DriverManager.getConnection(url, user, pass);
			this.st = conn.createStatement();
		}		
		catch(Exception e) {
			System.out.println("haha"+e.getMessage()); 
		}
	}
	public void storeBillDetails(Bill r){
		try {
			String sql = "INSERT INTO bill VALUES (?, ?, ?, ?, ?, ?)";
			pst = conn.prepareStatement(sql);
			
			this.pst.setInt(1, r.getBillId());
			this.pst.setInt(2, r.getCustomerId());
			this.pst.setInt(3, r.getTollBoothId());
			this.pst.setInt(4, r.getPaymentAmount());
			this.pst.setString(5, r.getPaymentMethod());
			this.pst.setString(6, r.getTransactionTime());
			this.pst.executeUpdate();
		}
		catch(SQLException e) {
			System.err.println(e.getMessage());
		}
		
	}

	public int computeCost(String costString, String vehicle){
		int lInd = costString.lastIndexOf(vehicle)+2;
		int rInd = lInd;
		while(Character.isDigit(costString.charAt(rInd))){
			rInd++;
		}
		String cost = costString.substring(lInd, rInd);
		return Integer.parseInt(cost);
	}

	public Bill prepareBill(Customer c, TollBooth t, String paymentMethod, String time, int billId){
		try {
				int paymentAmount = 0;
				String vehicleType="car";
				int isFasttag = 0;
				String newCost = "sdf:23";
		
				String sql = "SELECT vehicleType, isFasttag FROM customer WHERE customerId = ?";
				this.pst = conn.prepareStatement(sql);
				this.pst.setInt(1, c.getCustomerId());
				ResultSet rs1 = this.pst.executeQuery();
				while(rs1.next()){
					vehicleType = rs1.getString(1);
					isFasttag = rs1.getInt(2);
				}
				
				String sql2 = "SELECT costByVehicle FROM tollBooth WHERE tollBoothId = ?";
				this.pst = conn.prepareStatement(sql2);
				this.pst.setInt(1, t.getTollBoothId());
				ResultSet rs2 = this.pst.executeQuery();
				while(rs2.next()){
					newCost = rs2.getString(1);
				}
				paymentAmount = computeCost(t.getCostByVehicle(), c.getVehicleType());
				if(isFasttag == 1){
					//assuming 20% discount
					paymentAmount = paymentAmount-(paymentAmount/100)*20;
				}
		
				Bill ret =  new Bill(billId, paymentMethod, paymentAmount, time, c.getCustomerId(), t.getTollBoothId());
				return ret;
		}
		catch(SQLException e) {
			System.err.println("haha1"+e.getMessage());
			return null;
		}
	}
	public void updatePrices(TollBooth t, String newCostString){
		try {
			String sql = "UPDATE tollBooth SET costByVehicle = ? WHERE tollBoothId = ?";
			this.pst = conn.prepareStatement(sql);
			this.pst.setString(1, newCostString);
			this.pst.setInt(2, t.getTollBoothId());
			this.pst.executeUpdate();
		}
		catch(SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	public void saveCustomer(Customer c){
		
		 	try{
				
			 	String sql = "INSERT INTO customer VALUES (?,?,?,?,?,?)";
			 	if(this.conn==null) System.out.println("haha3");
				this.pst = conn.prepareStatement(sql);

				this.pst.setInt(1, c.getCustomerId());
				this.pst.setString(2, c.getCustomereName());
				this.pst.setString(3, c.getVehicleType());
				this.pst.setString(4, c.getVehicleRegNumber());
				this.pst.setInt(5, c.getIsFasttag());
				this.pst.setString(6, c.getProofOfIdentity());
				this.pst.executeUpdate();
		 	}
			catch(SQLException e) {
					System.err.println(e.getMessage());
				} 
	 }
	public void saveTollBooth(TollBooth t){
		try{
	 	String sql = "INSERT INTO tollBooth VALUES (?,?,?,?,?)";
		this.pst = conn.prepareStatement(sql);

		this.pst.setInt(1, t.getTollBoothId());
		this.pst.setInt(2, t.getServiceOwnerId());
		this.pst.setInt(3, t.getEmployeeId());
		this.pst.setString(4, t.getLocation());
		this.pst.setString(5, t.getCostByVehicle());
		this.pst.executeUpdate();
		}
	catch(SQLException e) {
			System.err.println(e.getMessage());
		}

	}

	public void saveServiceOwner(ServiceOwner t){
		try{
	 	String sql = "INSERT INTO serviceowner VALUES (?,?,?)";
		this.pst = conn.prepareStatement(sql);

		this.pst.setInt(1, t.getServiceOwnerID());
		this.pst.setString(2, t.getServiceName());
		this.pst.setInt(3, t.getTollBoothId());
		this.pst.executeUpdate();
		}
	catch(SQLException e) {
			System.err.println(e.getMessage());
		}

	}
	public void saveEmployee(Employee t){
		try{
	 	String sql = "INSERT INTO employee VALUES (?,?,?)";
		this.pst = conn.prepareStatement(sql);

		this.pst.setInt(1, t.getEmployeeId());
		this.pst.setInt(2, t.getSalary());
		this.pst.setInt(3, t.getTollBoothId());
		this.pst.executeUpdate();
		}
	catch(SQLException e) {
			System.err.println(e.getMessage());
		}

	}

}
