package nl.bas.archaeo.garbage;

public class App {

    public static void main(String[] args) throws InterruptedException{


        bar();

        for(int i=0; i<3; i++){
            Prullenbak p = new Prullenbak();
            p.vol();
        }

        System.gc();
        Thread.sleep(3000);

    }

    public static void bar(){

    }


}
