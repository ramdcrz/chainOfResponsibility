package labAssignment3;

public class ElectronicCollector implements WasteCollector {
    private WasteCollector nextInChain;

    @Override
    public void setNextChain(WasteCollector nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void collect(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("Electronic")) {
            System.out.println("Electronic Collector: Disposing " + container.getCapacity() + "kg of electronic waste.");
        } else if (nextInChain != null) {
            nextInChain.collect(container);
        } else {
            System.out.println("Waste type " + container.getType() + " could not be handled.");
        }
    }
}