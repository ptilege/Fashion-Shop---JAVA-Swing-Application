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
public interface OrderList {
    public boolean add(Order order);
    public String generateId();
    public Node getFirst();
    public int search(String orderId);
    public int size();
    public Order getOrder(int index);
    public Order[] isNewCustomer();
    public Order remove(Order order);

}
