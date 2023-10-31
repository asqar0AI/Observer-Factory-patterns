public class YoutubeUser implements Observer{
	private String username;
	
	
	public YoutubeUser(String username) {
		this.username = username;
	}
	
	@Override
	public void newVideoNotification(String channelName, String videoTitle) {
		System.out.println(username + ", new video uploaded on channel " + channelName + '\n' + videoTitle);
	}
}
