package Interface;

import Casting.Machine;

public class DVD implements MusicPlayer {


    @Override
    public void play() {
        System.out.println("Play through DvD");
    }

    @Override
    public void pause() {
        System.out.println("Pause through DVD");
    }

    @Override
    public void forward() {
        System.out.println("Forword through DVD");
    }

    @Override
    public void backword() {
        System.out.println("Backword  through DVD");
    }
}
