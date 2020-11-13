package sample06;

import java.util.List;

public class ListBean {
	private List<Integer> inList;
	private List<String> strList;
	private List<Customer> customerList;
	
	public void setInList(List<Integer> inList) {
		this.inList = inList;
		System.out.println(inList);
	}
	public void setStrList(List<String> strList) {
		this.strList = strList;
		System.out.println(strList);
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
		System.out.println(customerList);
	}
	
}
