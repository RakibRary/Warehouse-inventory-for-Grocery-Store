import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void runProgram(){
        List<Products> addToInventory = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while (true) {

            //asks information about the product
            System.out.println("Adding items to the Whole Foods Warehouse. Type out what type of product is it you're adding: \n\n"
                    + "MEAT \n"
                    + "VEGETABLE \n"
                    + "DAIRY\n"
            );

            String type = input.nextLine().toUpperCase();

            if (!Products.TypeOfProducts.contains(type)){
                System.out.println("Type of product does not exist. Terminating program...");
                System.exit(0);
            }

            System.out.println("\nType the product name: ");

            String name = input.nextLine();

            System.out.println("\nType out the product description: ");

            String desc = input.nextLine();

            //product created
            Products newProduct = ProductFactory.getProduct(type, desc, name);

            newProduct.notifyCreation();

            //attempt to add a MeatType to MeatProduct
            if(type.equals("MEAT")){
                System.out.println("\nType out the type of meat created. Type of meat to set to:");
                for(MeatTypes m : EnumSet.allOf(MeatTypes.class)){
                    System.out.println(m);
                }

                String typedMeatType = input.nextLine().toUpperCase();

                for(MeatTypes m : EnumSet.allOf(MeatTypes.class)){

                    if(m.toString().equals(typedMeatType)){
                        MeatProduct.setMeatType((MeatProduct) newProduct, m);
                        System.out.println("\nMeatType set");
                        break;
                    }
                }
            }

            System.out.println("\nDo you have the brand for the product also? Type in 'Y' or 'N': ");

            String decision = "";

            while (!decision.equals("Y") && !decision.equals("N")) {
                decision = input.nextLine().toUpperCase();
                switch (decision) {
                    case "Y" -> {
                        System.out.println("Type in the brand name: ");
                        newProduct.setBrand(input.nextLine());
                    }
                    case "N" -> System.out.println("\nOk, product will be created without a brand");
                    default -> System.out.println("\nInput was not 'Y' or 'N'. Type again: ");
                }
            }

            //add product to Inventory
            addToInventory.add(newProduct);
            System.out.println("\n" + newProduct.getClass().getSimpleName() + " added");
            System.out.println("\nAdding more? Type in 'Y' or 'N': ");

            decision = "";

            while (!decision.equals("Y")) {
                decision = input.nextLine().toUpperCase();
                switch (decision) {
                    case "Y" -> {
                        System.out.println("\nReloading Program...");
                    }
                    case "N" -> {
                        System.out.println("\nTotal Products added to Inventory: " + addToInventory.size());
                        System.out.println("\nTerminating Program...");
                        System.exit(0);
                    }
                    default -> System.out.println("\nInput was not 'Y' or 'N'. Type again: ");
                }
            }
        }
    }

    public static void main(String[] args) {

        // Strategy Pattern - Kevin Ren
        System.out.println("Strategy Pattern - Kevin Ren");
        System.out.println("What is your order number?");
        Scanner scanner = new Scanner(System.in);
        String orderID = scanner.next();

        System.out.println("What is your store number?");
        Scanner scanner1 = new Scanner(System.in);
        String storeID = scanner1.next();

        System.out.println("Choose your shipment method." +
                "\nNote: Recommended distance for driving shouldn't be more than 600 miles. " +
                "\nTruck " +
                "\nPlane " +
                "\nBoat" );
        Scanner scanner2 = new Scanner(System.in);
        String transportationSelect = scanner2.next();

        order o = null;
        o = new order();

        if ("Truck".equalsIgnoreCase(transportationSelect)){
            o.setSelectedTrans(new Plane());
        }
        else if ("Plane".equalsIgnoreCase(transportationSelect)){
            o.setSelectedTrans(new Truck());
        }
        else if ("Boat".equalsIgnoreCase(transportationSelect)){
            o.setSelectedTrans(new Boat());
        }

        // Randomly generates an invoice number
        int min = 100000000;
        int max = 999999999;

        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("Your invoice number is #" + random_int + ".");

        o.trans(transportationSelect, storeID, orderID);

        // Singleton Pattern - Samuel Orellana
        System.out.println("\nSingleton Pattern - Samuel Orellana");
        //reference single instance of admin
        admin object = admin.getInstance();
        //display message
        object.showMessage();

        // Observer Pattern - Ivan Jimenez
        System.out.println("\nObserver Pattern - Ivan Jimenez");
        WarehouseManager manager1 = new WarehouseManager();
        WarehouseManager manager2 = new WarehouseManager();

        Order1 order = new Order1();

        order.subscribe(manager1);
        order.subscribe(manager2);

        order.setDeliveryStatus("Accepted - Shipping Required");
        System.out.println(order.getDeliveryStatus());

        order.unsubscribe(manager2);

        order.setDeliveryStatus("Shipped - In Transit");
        System.out.println(order.getDeliveryStatus());

        // UNCOMMENT THIS BLOCK AND COMMENT ALL OTHERS AND THEN RUN MAIN TO TEST IT
        /*
        // Memento Pattern - Tasfia Hossain
        System.out.println("\nMemento Pattern - Tasfia Hossain");
        // Memento Pattern Test
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        int test1 = 6939;
        int test2 = 240;
        int test3 = 34;
        int test4 = 203;

        originator.setState(test1);
        originator.setState(test2);//sets object to be saved
        careTaker.add(originator.saveStateToMemento());//want to save the object

        originator.setState(test3);
        careTaker.add(originator.saveStateToMemento());

        originator.setState(test4);
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
         */

        // UNCOMMENT THIS BLOCK AND COMMENT ALL OTHERS AND THEN RUN MAIN TO TEST IT
        /*
        // Memento Pattern - Tasfia Hossain
        System.out.println("\nMemento Pattern - Tasfia Hossain");
        // Inventory Interface Test
        Originator originator = new Originator();
        CareTaker caretaker = new CareTaker();

        Scanner myEmployeeInput = new Scanner(System.in);
        Scanner mySaveRedo = new Scanner(System.in);
        Scanner myMeat = new Scanner(System.in);
        Scanner myProduce = new Scanner(System.in);
        Scanner myDairy = new Scanner(System.in);
        String eID;
        String x;

        int meat = 100;
        int produce = 400;
        int dairy = 60;

        originator.setState(meat);
        caretaker.add(originator.saveStateToMemento());

        originator.setState(produce);
        caretaker.add(originator.saveStateToMemento());

        originator.setState(dairy);
        caretaker.add(originator.saveStateToMemento());

        Scanner myShipment = new Scanner(System.in);
        String ship;

        String tasfiaID = "101";
        String dianaID = "201";

        System.out.println("Welcome to the Inventory Management System!\n");

        System.out.println("Please enter your Employee ID:");
        eID = myEmployeeInput.nextLine();


        if(eID.equals(tasfiaID)){
            System.out.println("\n****Welcome Tasfia Hossain****\n");
        }//if

        else if(eID.equals(dianaID)) {
            System.out.println("\n****Welcome Diana Smith****\n");
        }

        else {
            System.out.println("*User Not Found in the System*");
            System.exit(0);
        }

        while(true) {
            System.out.println("Please type out what you will be recording from the following options:"
                    + "\nIncoming Shipment \n"
                    + "Outgoing Shipment \n"
            );

            ship = myShipment.nextLine();

            if (ship.equals("Outgoing Shipment")) {
                System.out.println("\nPlease record the number of Meat, Produce, and Dairy products that will be shipped out:");
                int meat1 = myMeat.nextInt();
                int produce1 = myProduce.nextInt();
                int dairy1 = myDairy.nextInt();

                System.out.println("\n********Outgoing Inventory********");
                System.out.println("\nNumber of Outgoing Meat Shipments: " + meat1 + " units");
                System.out.println("Number of Outgoing Produce Shipments: " + produce1 + " units");
                System.out.println("Number of Outgoing Dairy Shipments: " + dairy1 + " units\n");

                meat = meat - meat1;
                produce = produce - produce1;
                dairy = dairy - dairy1;

                if (meat < 0) {
                    System.out.println("NOT ENOUGH MEAT UNITS AVAILABLE");
                    System.out.println("Please restart the system.");
                    break;
                } else if (produce < 0) {
                    System.out.println("NOT ENOUGH PRODUCE UNITS AVAILABLE");
                    System.out.println("Please restart the system.");
                    break;
                } else if (dairy < 0) {
                    System.out.println("NOT ENOUGH DAIRY UNITS AVAILABLE");
                    System.out.println("Please restart the system.");
                    break;
                }

                System.out.println("\nFinished Entering? Enter Save or Undo.");
                x = mySaveRedo.nextLine();
                if (x.equals("Save")) {

                    System.out.println("File Saved\n");
                    System.out.println("******Updated Inventory Transcript******\n");

                    originator.setState(meat);
                    caretaker.add(originator.saveStateToMemento());
                    System.out.println("New Meat Inventory Value: " + originator.getState() + " units");//saving only meat
                    originator.setState(produce);
                    caretaker.add(originator.saveStateToMemento());
                    System.out.println("New Produce Inventory Value: " + originator.getState() + " units");//saving only produce
                    originator.setState(dairy);
                    caretaker.add(originator.saveStateToMemento());
                    System.out.println("Number of Outgoing Dairy Shipments: " + originator.getState() + " units");//saving only dairy
                    System.exit(0);
                } else if (x.equals("Undo")) {
                    System.out.println("\n****Original Inventory Values****\n");
                    originator.getStateFromMemento(caretaker.get(0));
                    System.out.println("Meat: " + originator.getState() + " units remaining");
                    originator.getStateFromMemento(caretaker.get(1));
                    System.out.println("Produce: " + originator.getState() + "units remaining");
                    originator.getStateFromMemento(caretaker.get(2));
                    System.out.println("Dairy: " + originator.getState() + " units remaining");
                    break;
                }
            } else if (ship.equals("Incoming Shipment")) {
                System.out.println("\nPlease record the number of Meat, Produce, and Dairy products that will be stored in:");
                int meat2 = myMeat.nextInt();
                int produce2 = myProduce.nextInt();
                int dairy2 = myDairy.nextInt();
                System.out.println("Total number of Incoming Meat Shipments: " + meat2 + " units");
                System.out.println("Number of Incoming Produce Shipments: " + produce2 + " units");
                System.out.println("Number of Incoming Dairy Shipments: " + dairy2 + " units");

                meat = meat + meat2;
                produce = produce + produce2;
                dairy = dairy + dairy2;

                System.out.println("\nFinished Entering? Enter Save or Undo.");
                x = mySaveRedo.nextLine();
                if (x.equals("Save")) {
                    System.out.println("\nFile Saved\n");
                    System.out.println("****Updated Inventory Transcript****\n");
                    System.out.println("Meat: " + meat + " units in total");
                    System.out.println("Produce: " + produce + " units in total");
                    System.out.println("Dairy: " + dairy + " units in total");
                    System.exit(0);
                } else if (x.equals("Undo")) {
                    System.out.println("\n****Original Inventory Values****\n");
                    originator.getStateFromMemento(caretaker.get(0));
                    System.out.println("Meat: " + originator.getState() + " units remaining");
                    originator.getStateFromMemento(caretaker.get(1));
                    System.out.println("Produce: " + originator.getState() + " units remaining");
                    originator.getStateFromMemento(caretaker.get(2));
                    System.out.println("Dairy: " + originator.getState() + " units remaining");
                    break;
                }
            }//incoming


            else {
                System.out.println("Invalid Entry");
                System.out.println("Please restart the system.");
                System.exit(0);
            }
        }
        */

        // Iterator Pattern - Rakib Rary
        System.out.println("\nIterator Pattern - Rakib Rary");
        ProductCollection newCollection = new ProductCollection();
        WareHouseItems warehouse = new WareHouseItems(newCollection);//print Warehouse title
        warehouse.printProducts();//print products in array

        // UNCOMMENT THIS BLOCK AND COMMENT ALL OTHERS AND THEN RUN MAIN TO TEST IT
        /*
        // Factory Pattern - Matthew Murillo
        System.out.println("\nFactory Pattern - Matthew Murillo");
        runProgram();
        */

        // Builder Pattern - Yudava Roopnarine
        System.out.println("\nBuilder Pattern - Yudava Roopnarine");
        orderBuilder orderBuilder = new orderBuilder();

        order2 veggies = orderBuilder.veg();
        System.out.println("Shipments 1");
        veggies.showItems();
        System.out.println("Total Price: " + veggies.getCost() + "\r\n");

        order2 meats = orderBuilder.meats();
        System.out.println("Shipments 1");
        meats.showItems();
        System.out.println("Total Price: " + meats.getCost()+ "\r\n");

    }
}