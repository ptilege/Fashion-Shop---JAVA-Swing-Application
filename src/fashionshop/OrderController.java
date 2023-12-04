/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fashionshop;

import fashionshop.OrderListImpl.Node;

/**
 *
 * @author thara
 */
public class OrderController {
   

    
     public static boolean addOrder(Order order) {
     OrderList orderList = DBConnection.getInstance().getOrderList();
     return orderList.add(order);   
   }
    public static String generateId(){
        //Insert code to generate an id
        OrderList orderList = DBConnection.getInstance().getOrderList();
        String generatedId = orderList.generateId();
    
        return generatedId;
    }
    public static Node getFirst(){
        OrderList orderList = DBConnection.getInstance().getOrderList();
        return orderList.getFirst();
        
    }
    public static int search(String orderId){
        OrderList orderList = DBConnection.getInstance().getOrderList();
        return orderList.search(orderId);
    }
    public static int size(){
        OrderList orderList = DBConnection.getInstance().getOrderList();
        return orderList.size();
    }
    public static Order getOrder(int index){
        OrderList orderList = DBConnection.getInstance().getOrderList();
        return orderList.getOrder(index);
    }
    public static Order[] isNewCustomer(){
        OrderList orderList = DBConnection.getInstance().getOrderList();
        return orderList.isNewCustomer();
    }
    public static Order remove(Order order){
        OrderList orderList = DBConnection.getInstance().getOrderList();
        return orderList.remove(order);
    }
}
