package model;

public class BatteryType extends Batteris {
    public final static char BATTERY_LITIO = 'l';
    public final static char BATTERY_NIQUEL_CADIO = 'n';
    public final static double FACTOR_LITIO = 0.92;
    public final static double FACTOR_NIQUE_CADIO = 0.80;
    private int AH;

    public int AH(){
        int option=0;
        System.out.println(" How many amps per hour does the battery have? ");
        sc.nextLine();

        niquel=0.8;

        litio=0.92;
       
    
        System.out.println(
            "Select an option to get started\n" +
            "(1) To Register a nickel-type battery\n" +
            "(2) To Register a lithium-type battery\n" +
            "(0) To go out"
                    );
            option= sc.nextInt();
            sc.nextLine();
            return option;
        }
    

        AH=cost*voltage*capacity/(1000*uses*factor);

    }   






}
