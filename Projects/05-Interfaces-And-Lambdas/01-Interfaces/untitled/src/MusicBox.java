public class MusicBox implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("Playing music " + music);
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music");
    }

    @Override
    public void resumeMusic() {
        System.out.println("resuming music " + music);
    }
}
