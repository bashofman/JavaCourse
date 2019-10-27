package nl.bas.archaeo.Interfaces;

public class App {
    public static void main(String[] args) {

        Teelevisie tv = new Samsung();

        tv.on();

        tv.switchChannel(6);

        tv.ditIsTochEenMethode();

    }
}
