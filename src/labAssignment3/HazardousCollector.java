package labAssignment3;

public class HazardousCollector implements WasteCollector {
    private WasteCollector nextInChain;

    @Override
    public void setNextChain(WasteCollector nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Hazardous")) {
            System.out.println("Hazardous Collector: CAUTION! Safely disposing of " + container.getCapacity() + "kg of hazardous waste.");
        } else if (nextInChain != null) {
            nextInChain.collect(container);
        } else {
            System.out.println("Waste type " + container.getType() + " could not be handled.");
        }
    }
}