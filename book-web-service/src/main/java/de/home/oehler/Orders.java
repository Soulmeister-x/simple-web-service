package de.home.oehler;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

@Singleton
public class Orders {
    
    private static Orders orders = null;
    private List<Order> orderList = new ArrayList<Order>();
    private int newId;

    private Orders() {
        newId = 0;    
    }

    public static Orders getInstance() {
        if (orders == null)
            orders = new Orders();

        return orders;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Order> addOrder(int bookId, int amount) {
        orderList.add(new Order(newId++, bookId, amount));

        return orderList;
    }


    public Order getOrderById(int id) {
        return orderList.get(id);
    }
    
}
