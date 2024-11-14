
abstract class OrderProcess {
  
    public abstract void selectItems();
    public abstract void makePayment();
    public abstract void processOrder();

    
    public void printReceipt() {
        System.out.println("Printing receipt for your order...");
    }
}


class DineInOrder extends OrderProcess {
    @Override
    public void selectItems() {
        System.out.println("Selecting items for Dine-In Order...");
    }

    @Override
    public void makePayment() {
        System.out.println("Making payment at the table for Dine-In Order...");
    }

    @Override
    public void processOrder() {
        System.out.println("Preparing and serving food at the table for Dine-In Order...");
    }
}


class TakeawayOrder extends OrderProcess {
    @Override
    public void selectItems() {
        System.out.println("Selecting items for Takeaway Order...");
    }

    @Override
    public void makePayment() {
        System.out.println("Making payment at the counter for Takeaway Order...");
    }

    @Override
    public void processOrder() {
        System.out.println("Packing food for Takeaway Order...");
    }
}


class DeliveryOrder extends OrderProcess {
    @Override
    public void selectItems() {
        System.out.println("Selecting items for Delivery Order...");
    }

    @Override
    public void makePayment() {
        System.out.println("Processing online payment for Delivery Order...");
    }

    @Override
    public void processOrder() {
        System.out.println("Preparing and dispatching food for Delivery Order...");
    }
}


public class OrderManagement {
    public static void main(String[] args) {
        
        OrderProcess dineInOrder = new DineInOrder();
        OrderProcess takeawayOrder = new TakeawayOrder();
        OrderProcess deliveryOrder = new DeliveryOrder();

        System.out.println("Dine-In Order Process:");
        dineInOrder.selectItems();
        dineInOrder.makePayment();
        dineInOrder.processOrder();
        dineInOrder.printReceipt();

        System.out.println();

       
        System.out.println("Takeaway Order Process:");
        takeawayOrder.selectItems();
        takeawayOrder.makePayment();
        takeawayOrder.processOrder();
        takeawayOrder.printReceipt();

        System.out.println();

        
        System.out.println("Delivery Order Process:");
        deliveryOrder.selectItems();
        deliveryOrder.makePayment();
        deliveryOrder.processOrder();
        deliveryOrder.printReceipt();
    }
}
