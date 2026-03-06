package labAssignment3;

public class AutomatedWasteSystem {
    public static void main(String[] args) {
        // Initialize the collection system
        WasteManagementChain wasteSystem = new WasteManagementChain();

        // Create different waste containers
        WasteContainer bin1 = new WasteContainer("Organic", 25);
        WasteContainer bin2 = new WasteContainer("Recyclable", 10);
        WasteContainer bin3 = new WasteContainer("Hazardous", 5);
        WasteContainer bin4 = new WasteContainer("Electronic", 15);

        // Trigger collection process
        System.out.println("--- Starting Waste Collection Process ---");
        wasteSystem.collect(bin1);
        wasteSystem.collect(bin2);
        wasteSystem.collect(bin3);
        wasteSystem.collect(bin4);
    }
}