public class MusicPlayer { // Consumer class that depends on the MusicService interface.
    // This class uses Dependency Injection to remain flexible with the service implementation.
    private  final MusicService musicService;// Holds the injected MusicService instance.
    // Constructor to inject the MusicService implementation.
    public MusicPlayer(MusicService musicService) {
        this.musicService = musicService;
    }
    // Method to invoke the playMusic method of the injected MusicService instance.
    public void play() {
        musicService.playMusic();
    }
}

