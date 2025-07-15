public class Computer implements VideoPlayer, MusicPlayer {
    @Override
    public void playVideo() {
        System.out.println("Playing video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Stopping video");
    }

    @Override
    public void resumeVideo() {
        System.out.println("Resuming video");
    }

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
