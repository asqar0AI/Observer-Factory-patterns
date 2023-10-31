public interface IYoutubeUser {
	void newVideoNotification(String youtubeChannel, String videoTitle);
	void subscribeTo(YoutubeChannel youtubeChannel);
}
