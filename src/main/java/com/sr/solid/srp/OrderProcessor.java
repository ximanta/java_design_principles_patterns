package com.sr.solid.srp;
import java.math.BigDecimal;

public class OrderProcessor {

    public void processOrder(Order order) {
        // 1. Validate order
        if (!validateOrder(order)) {
            throw new IllegalArgumentException("Invalid order");
        }

        // 2. Check inventory and update stock
        if (!checkInventory(order)) {
            throw new IllegalStateException("Insufficient stock");
        }
        updateStock(order);

        // 3. Handle payment
        processPayment(order);

        // 4. Send order confirmation email
        sendOrderConfirmation(order);

        // 5. Arrange shipping
        arrangeShipping(order);
    }

    private boolean validateOrder(Order order) {
        // Validation logic
        return true;
    }

    private boolean checkInventory(Order order) {
        // Inventory check logic
        return true;
    }

    private void updateStock(Order order) {
        // Update stock logic
    }

    private void processPayment(Order order) {
        // Payment processing logic
    }

    private void sendOrderConfirmation(Order order) {
        // Email sending logic
    }

    private void arrangeShipping(Order order) {
        // Shipping arrangement logic
    }

    public class Order {
        private String orderId;
        private long quantity;
        private BigDecimal totalAmount;
        private String status;

        public Order(String orderId, long quantity, BigDecimal totalAmount) {
            this.orderId = orderId;
            this.quantity = quantity;
            this.totalAmount = totalAmount;
            this.status = "Pending";
        }
    }
}
