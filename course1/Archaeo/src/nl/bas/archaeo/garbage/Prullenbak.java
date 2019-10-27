package nl.bas.archaeo.garbage;

public class Prullenbak {

    public void vol(){
        System.out.println("De prullenbak is vol");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("De prullenbak is geleegd");
    }
}
