package Interface;

public class Walkman implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Play through WalkMan");
    }

    @Override
    public void pause() {
        System.out.println("Pause through Walkman");
    }

    @Override
    public void forward() {
        System.out.println("Forward through Walkman");
    }

    @Override
    public void backword() {
        System.out.println("Backword through Walkman");
    }
}
