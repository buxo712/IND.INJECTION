public class Main { // Main class to demonstrate Dependency Injection with flexible service implementations.
    public static void main(String[] args) {
        // Create an instance of the ClassicalMusicService implementation.
        MusicService classicalService = new ClassicalMusicService();
        // Inject the ClassicalMusicService instance into the MusicPlayer.
            MusicPlayer classicalPlayer = new MusicPlayer(classicalService);
        // Call the play method, which plays classical music.
        classicalPlayer.play();

        System.out.println("------------------------------------------------------------");
        // Create an instance of the JazzMusicService implementation.
            MusicService jazzService = new JazzMusicService();
        // Inject the JazzMusicService instance into the MusicPlayer.
            MusicPlayer jazzPlayer = new MusicPlayer(jazzService);
        // Call the play method, which plays jazz music.
        jazzPlayer.play();
        }
    }
