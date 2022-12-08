public class admin {
    //create one object of admin
    private static final admin instance = new admin();

    //make the constructor private to prevent more instances of admin
    private admin(){}

    //get the single occurrence of admin
    public static admin getInstance(){
        return instance;
    }
    public void showMessage() {
        System.out.println("Admin Referenced");
    }
}