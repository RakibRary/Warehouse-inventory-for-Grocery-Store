public class Plane implements SelectedTrans {
    public void trans(String transportationSelect, String storeID, String orderID){
        System.out.println("You have requested for " + transportationSelect + " method of shipping.");
        System.out.println("Your items will be delivered to store number " + storeID + " in 3-5 business days for order #" + orderID + ".");
    }
}