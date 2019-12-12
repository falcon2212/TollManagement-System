package miniProject.JDBCversion;

public class ServiceOwner  {
	private int ServiceOwnerID;
	
	private String serviceName;
	
	private int TollBoothId;

	public ServiceOwner() {
		super();
	}
	
	public ServiceOwner(int serviceOwnerID, String serviceName, int TollBoothId) {
		super();
		ServiceOwnerID = serviceOwnerID;
		this.serviceName = serviceName;
		this.TollBoothId = TollBoothId;
	}

	public int getServiceOwnerID() {
		return ServiceOwnerID;
	}

	public void setServiceOwnerID(int serviceOwnerID) {
		ServiceOwnerID = serviceOwnerID;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public int getTollBoothId() {
		return TollBoothId;
	}

	public void setTollBoothId(int TollBoothId) {
		this.TollBoothId = TollBoothId;
	}
	
}
