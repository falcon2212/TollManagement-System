package miniProject.JDBCversion;

public class Customer{
	private int CustomerId;
	
	private String customereName;

	private String vehicleRegNumber;

	private String vehicleType;
	
	private int isFasttag;
	
	private String proofOfIdentity;
	public Customer() {
		super();
	}
		
	public Customer(int customerId, String customereName, String vehicleRegNumber, String vehicleType, int isFasttag,
			String proofOfIdentity) {
		super();
		CustomerId = customerId;
		this.customereName = customereName;
		this.vehicleRegNumber = vehicleRegNumber;
		this.vehicleType = vehicleType;
		this.isFasttag = isFasttag;
		this.proofOfIdentity = proofOfIdentity;
	}


	public Customer(int CustomerId, String customereName, String vehicleRegNumber, String vehicleType, int isFasttag) {
		super();
		this.CustomerId = CustomerId;
		this.customereName = customereName;
		this.vehicleRegNumber = vehicleRegNumber;
		this.vehicleType = vehicleType;
		this.isFasttag = isFasttag;
	}

	public String getProofOfIdentity() {
		return proofOfIdentity;
	}


	public void setProofOfIdentity(String proofOfIdentity) {
		this.proofOfIdentity = proofOfIdentity;
	}



	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int CustomerId) {
		this.CustomerId = CustomerId;
	}

	public String getCustomereName() {
		return customereName;
	}

	public void setCustomereName(String customereName) {
		this.customereName = customereName;
	}

	public String getVehicleRegNumber() {
		return vehicleRegNumber;
	}

	public void setVehicleRegNumber(String vehicleRegNumber) {
		this.vehicleRegNumber = vehicleRegNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getIsFasttag() {
		return isFasttag;
	}

	public void setIsFasttag(int isFasttag) {
		this.isFasttag = isFasttag;
	}

	
}