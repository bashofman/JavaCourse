package nl.bas.archaeo.Interfaces;

public class Samsung implements Teelevisie {

    private boolean on;
    private int currentChannel;
    private boolean up;


    @Override
    public void on () {
        this.on = true;
        System.out.println ("Samsung TV is now on");

    }

    @Override
    public void off(){
        this.on = false;
        System.out.println ("Samsung TV is now off");
    }

    @Override
    public int switchChannel(int newChannel) {
        this.currentChannel = newChannel;

        System.out.println("Samsung is on channel: " + this.currentChannel);

        return this.currentChannel;
    }




}
