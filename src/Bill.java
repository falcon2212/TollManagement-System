package miniProject.JDBCversion;

public class Bill  {
	private int billId;
	
	private String paymentMethod;
	
	private int paymentAmount;
	
	private String transactionTime;
	
	private int customerId;
	
	private int tollBoothId;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getTollBoothId() {
		return tollBoothId;
	}
	public void setTollBoothId(int tollBoothId) {
		this.tollBoothId = tollBoothId;
	}
	
	public Bill() {
		super();
	}
	public Bill(int billId, String paymentMethod, int paymentAmount, String transactionTime, int customerId, int tollBoothId) {
		super();
		this.billId = billId;
		this.paymentMethod = paymentMethod;
		this.paymentAmount = paymentAmount;
		this.transactionTime = transactionTime;
		this.customerId = customerId;
		this.tollBoothId = tollBoothId;
	}
	public Bill( String paymentMethod, int paymentAmount, String transactionTime) {
		super();
		this.paymentMethod = paymentMethod;
		this.paymentAmount = paymentAmount;
		this.transactionTime = transactionTime;
	}
	public void displayBill() {
		System.out.println("Amount of "+ this.paymentAmount+" has been paid through "+this.paymentMethod+"on "+this.transactionTime);
	}
	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
	
}
