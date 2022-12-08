public class WarehouseManager implements orderObserver{
    // Implements orderObserver and allows input for the alert that has to be sent
    @Override
    public void update(String status) {
        System.out.println("The order's delivery status was changed to " + status);
    }
}

