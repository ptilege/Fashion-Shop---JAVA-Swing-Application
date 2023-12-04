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
public class OrderListImpl implements OrderList {
    private Node first;

    private OrderList orderList;
    private PlaceOrderForm placeOrderForm;
    public OrderListImpl(OrderList orderList) {
        this.orderList = orderList;
        this.placeOrderForm = placeOrderForm;
        //this.SearchOrderFrom = SearchOrderFrom;
    }
    
    @Override
    public Node getFirst() {
        return first;
    }
    
    private boolean isEmpty(){
	return first==null;
    }

    @Override
    public boolean add(Order order) {
    Node n1 = new Node(order);
    if (isEmpty()) {
        first = n1;
    } else {
        Node lastNode = first;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = n1;
    }
    
    // Return true to indicate that the order was successfully added
    return true;
}
  
    @Override
    public String generateId() {
        int maxId = 0;

    Node currentNode = first;

    while (currentNode != null) {
        Order order = currentNode.order;
        if (order != null) {
            String orderId = order.getOrderId();
            int id = Integer.parseInt(orderId.split("#")[1]);
            if (id > maxId) {
                maxId = id;
            }
        }

        currentNode = currentNode.next;
    }

    maxId++;
    return String.format("ODR#%05d", maxId);
    }
     
     @Override
     public int search(String orderId){
		int index=0;
		Node temp=first;
		while(temp!=null){
			if(temp.order != null && temp.order.getOrderId().equals(orderId)){
				return index;
			}
			index++;
			temp=temp.next;
		}
		return -1;
		
	}
     
    @Override
     public int size(){
		int count=0;
		Node temp=first;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
     
    @Override
     public Order getOrder(int index){		
		Node temp=first;
		int currentIndex = 0;
		while(temp!=null){
			if(currentIndex==index){
				return temp.order;
			}
			currentIndex++;
			temp=temp.next;
		}
		return null;
		
	}
     
    @Override
     public Order[] isNewCustomer() {
        Order[] customers = new Order[0];
        Node currentNode = first;
        
        while (currentNode != null) {
            Order order = currentNode.order;
            boolean isNewCustomer = true;
            
            for (Order existingOrder : customers) {
                if (existingOrder != null && existingOrder.getPhoneNumber().equals(order.getPhoneNumber())) {
                    isNewCustomer = false;
                    break;
                }
            }
            
            if (isNewCustomer) {
                Order[] temp = new Order[customers.length + 1];
                System.arraycopy(customers, 0, temp, 0, customers.length);
                temp[customers.length] = order;
                customers = temp;
            }
            
            currentNode = currentNode.next;
        }
        
        return customers;
    }
     
    @Override
     public Order remove(Order order){
		Node temp = first;
		Node prev = null;
		while(temp!=null){
			if(temp.order.equals(order)){
				if(prev == null){
					first = temp.next;
				}else{
					prev.next = temp.next;
				}
			}
			prev = temp;
			temp = temp.next;
		}
		return order;   
   }
    
    class Node{
		private Order order;
		private Node next;
		
		public Node(Order order) {
        this.order = order;
      }

      public Order getOrder() {
         return order;
      }

       public Node getNext() {
        return next;
       }
	}
}
