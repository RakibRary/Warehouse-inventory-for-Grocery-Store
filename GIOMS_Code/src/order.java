public class order {
    private SelectedTrans SelectedTrans;

    public void setSelectedTrans(SelectedTrans strategy){
        this.SelectedTrans = strategy;
    }

    public SelectedTrans getSelectedTrans(){
        return SelectedTrans;
    }

    public void trans(String transportationSelect, String storeID, String orderID){
        SelectedTrans.trans(transportationSelect, storeID, orderID);
    }
}