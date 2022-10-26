package de.home.res;

import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.home.oehler.Order;
import de.home.oehler.Orders;

@Path("/orders")
public class OrderService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> getAllOrders() {
        
        return Orders.getInstance().getOrderList();
    }

    @GET
    @Path("{orderId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Order getOrderById(@PathParam("orderId") int orderId) {
        return Orders.getInstance().getOrderById(orderId);
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> postNewOrder(final List<Order> newOrders) {
        
        Orders orders = Orders.getInstance();

        for (Order o : newOrders)
        {
            int amount = o.getAmount();
            if (amount == 0) amount = 1;
            orders.addOrder(o.getBookId(), amount);
        }

        return orders.getOrderList();
    }
/* */
/*
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Orders postNewOrders(final JsonArray newOrders) {

        Orders orders = Orders.getInstance();

        newOrders.forEach(o -> o.getInt("bookId"));
        

        orders.addOrder(new Order(bookId, amount));

        return orders;
    }
/* */



}
