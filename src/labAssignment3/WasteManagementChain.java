package labAssignment3;

public class WasteManagementChain implements WasteCollector {
    private WasteCollector chain;

    public WasteManagementChain() {
        // Initialize handlers
        this.chain = new OrganicCollector();
        WasteCollector c2 = new RecyclableCollector();
        WasteCollector c3 = new HazardousCollector();
        WasteCollector c4 = new ElectronicCollector();

        // Set the chain sequence
        chain.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
    }

    @Override
    public void setNextChain(WasteCollector nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void collect(WasteContainer container) {
        chain.collect(container);
    }
}