package nl.bas.archaeo.Interfaces;

public interface Teelevisie {
    public abstract void on();
    void off();
    int switchChannel (int newChannel);

    default void ditIsTochEenMethode() {
        System.out.println("Default methode aangeroepen in Televisie INTERFACE");
    }
}
