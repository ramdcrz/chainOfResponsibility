package labAssignment3;

public class OrganicCollector implements WasteCollector {
    private WasteCollector nextInChain;

    @Override
    public void setNextChain(WasteCollector nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Organic")) {
            System.out.println("Organic Collector: Disposing of " + container.getCapacity() + "kg of organic waste.");
        } else if (nextInChain != null) {
            nextInChain.collect(container);
        } else {
            System.out.println("Waste type " + container.getType() + " could not be handled.");
        }
    }
}