package labAssignment3;

public interface WasteCollector {
    void setNextChain(WasteCollector nextChain);
    void collect(WasteContainer container);
}