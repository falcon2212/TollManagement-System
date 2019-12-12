package miniProject.JDBCversion;

import java.util.*;
public class TollBooth {
	private int TollBoothId;
	
	private String location;

	private String costByVehicle;
	
	private int serviceOwnerId;
	private int employeeId;
	private List<Employee> employeeList;

	public TollBooth() {
		super();
	}

	public TollBooth(int TollBoothId, String location, String costByVehicle) {
		super();
		this.TollBoothId = TollBoothId;
		this.location = location;
		this.costByVehicle = costByVehicle;
	}
	
	public int getServiceOwnerId() {
		return serviceOwnerId;
	}

	public void setServiceOwnerId(int serviceOwnerId) {
		this.serviceOwnerId = serviceOwnerId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getTollBoothId() {
		return TollBoothId;
	}

	public void setTollBoothId(int TollBoothId) {
		this.TollBoothId = TollBoothId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCostByVehicle() {
		return costByVehicle;
	}

	public void setCostByVehicle(String costByVehicle) {
		this.costByVehicle = costByVehicle;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}


	
}
