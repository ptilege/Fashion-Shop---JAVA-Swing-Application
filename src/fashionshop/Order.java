/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashionshop;

/**
 *
 * @author thara
 */
public class Order {
    private String orderId;
	private String phoneNumber;
	private String size;
	private int orderQuantity;
	private int orderStatus;
	private double totalAmount;
	private int allQty;
	private double amount;
	
	public Order(){
		
	}
	
	
	public Order(String orderId, String phoneNumber, String size, int orderQuantity, int orderStatus){
		this.orderId=orderId;
		this.phoneNumber=phoneNumber;
		this.size=size;
		this.orderQuantity=orderQuantity;
		this.orderStatus=orderStatus;		
	}
	public Order(String phoneNumber,int allQty,double totalAmount ){
		this.phoneNumber=phoneNumber;
		this.allQty=allQty;
		this.totalAmount=totalAmount;
	}
	public Order(String phoneNumber){
		this.phoneNumber=phoneNumber;
		
	}

    

    
	
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    
    public int getOrderStatus() {
        return orderStatus;
    }

   
    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

   
    public double getTotalAmount() {
        return totalAmount;
    }

   
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
     public int getAllQty() {
        return allQty;
    }

   
    public void setAllQty(int allQty) {
        this.allQty = allQty;
    }
     public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
	
}
