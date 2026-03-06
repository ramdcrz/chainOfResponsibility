package labAssignment3;

public class RecyclableCollector implements WasteCollector {
    private WasteCollector nextInChain;

    @Override
    public void setNextChain(WasteCollector nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Recyclable")) {
            System.out.println("Recyclable Collector: Processing " + container.getCapacity() + "kg of recyclable materials.");
        } else if (nextInChain != null) {
            nextInChain.collect(container);
        } else {
            System.out.println("Waste type " + container.getType() + " could not be handled.");
        }
    }
}