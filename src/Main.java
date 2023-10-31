import java.nio.channels.Channel;

public class Main {
    public static void main(String[] args) {
        // Create a YouTube channel
        YoutubeChannel techChannel = new YoutubeChannel("Tech Videos");
        
        // Create subscribers
        YoutubeUser subscriber1 = new YoutubeUser("User1");
        YoutubeUser subscriber2 = new YoutubeUser("User2");
        
        // Subscribers subscribe to the channel
        techChannel.subscribe(subscriber1);
        techChannel.subscribe(subscriber2);
        
        // Channel uploads a new video
        techChannel.uploadVideo("Introduction to Observer Pattern");
        
        // Subscribers receive notifications
    }
}