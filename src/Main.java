

public class Main {
    public static void main(String[] args) {
        // Create a YouTube channel
        
        YoutubeAccount contentCreator = new YoutubeAccount("Asqar");
        
        YoutubeChannel techChannel = contentCreator.createYoutubeChannel("Coding Guides", YoutubeChannelType.ADULT);
        
        // Create subscribers
        YoutubeAccount subscriber1 = new YoutubeAccount("User1");
        YoutubeAccount subscriber2 = new YoutubeAccount("User2");
        
        // Subscribers subscribe to the channel
        subscriber1.subscribeTo(techChannel);
        subscriber2.subscribeTo(techChannel);
        
        // Channel uploads a new video
        techChannel.uploadVideo("\"Introduction to Observer Pattern\"");
        
        // Subscribers receive notifications
    }
}