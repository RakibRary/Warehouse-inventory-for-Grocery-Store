import java.util.ArrayList;
import java.util.List;

public class Order1 extends WarehouseManager {

    private String deliveryStatus;
    // Stores in the ArrayList all the warehouse managers that have to be notified
    private List<WarehouseManager> warehouseManagers = new ArrayList<>();

    // Adds a warehouse manager to the ArrayList
    public void subscribe(WarehouseManager manager){
        this.warehouseManagers.add(manager);
    }

    // Removes a warehouse manager from the ArrayList
    public void unsubscribe(WarehouseManager manager){
        this.warehouseManagers.remove(manager);
    }

    // Goes through all the warehouse managers in the ArrayList and sends them an appropriate message
    public void setDeliveryStatus(String deliveryStatus){
        this.deliveryStatus = deliveryStatus;
        for(WarehouseManager manager: this.warehouseManagers){
            manager.update(this.deliveryStatus);
        }
    }

    public String getDeliveryStatus(){ return deliveryStatus; }

    public List<WarehouseManager> getWarehouseManagers(){ return warehouseManagers; }
}



