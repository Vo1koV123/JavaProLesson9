import coffee.order.CoffeeOrderBoard;
import coffee.order.Order;

public class Main {
    public static void main(String[] args) {

                CoffeeOrderBoard board = new CoffeeOrderBoard();
                board.add(new Order("Bogdan"));
                board.add(new Order("Alex"));
                board.add(new Order("Max"));
                board.add(new Order("Denis"));
                board.draw();
                System.out.println("Delivering next order: " + board.deliver().getName());
                board.draw();
                System.out.println("Delivering order 3: " + board.deliver(3).getName());
                board.draw();
            }
        }



