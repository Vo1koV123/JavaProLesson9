package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private final List<Order> orders;
    private int lastOrderNumber;

    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
        lastOrderNumber = 0;
    }

    public void add(Order order) {
        order.setNumber(++lastOrderNumber);
        orders.add(order);
    }

    public Order deliver() {
        if (orders.isEmpty()) {
            return null;
        }
        Order nextOrder = orders.get(0);
        for (Order order : orders) {
            if (order.getNumber() < nextOrder.getNumber()) {
                nextOrder = order;
            }
        }
        orders.remove(nextOrder);
        return nextOrder;
    }

    public Order deliver(int orderNumber) {
        for (Order order : orders) {
            if (order.getNumber() == orderNumber) {
                orders.remove(order);
                return order;
            }
        }
        return null;
    }

    public void draw() {
        System.out.println("=============");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getNumber() + " | " + order.getName());
        }
    }
}
