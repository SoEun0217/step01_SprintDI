package sample05;

public class OrderMessageImpl implements OrderMessage {
	private UserBean user;
	private ProductBean product;
	private int orderId;
	private String message;
	
	
	public OrderMessageImpl() {}
	
	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public ProductBean getProduct() {
		return product;
	}

	public void setProduct(ProductBean product) {
		this.product = product;
	}



	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void getOrderMessage() {
		System.out.println("orderId : "+orderId);
		System.out.println("name : " +user.getName());
		System.out.println("phone : "+user.getPhone());
		System.out.println("p_name : "+product.getPname());
		System.out.println("p_price : "+product.getPrice());
		System.out.println("message : "+message);
	}

}
