import java.util.ArrayList;
import java.util.List;

public class YoutubeAccount implements IYoutubeUser {
	private String username;
	private ArrayList<YoutubeChannel> channels = new ArrayList<>();
	
	public YoutubeAccount(String username) {
		this.username = username;
	}
	public YoutubeChannel createYoutubeChannel(String channelName, YoutubeChannelType type)
	{
		YoutubeChannel youtubeChannel = null;
		if (type == YoutubeChannelType.ADULT) {
			youtubeChannel = new YoutubeChannel(channelName, true);
		} else {
			youtubeChannel = new YoutubeChannel(channelName, false);
		}
		channels.add(youtubeChannel);
		return youtubeChannel;
	}
	
	public void subscribeTo(YoutubeChannel youtubeChannel) {
		if (!channels.contains(youtubeChannel)) {
			youtubeChannel.addSubscriber(this);
		}
	}
	
	@Override
	public void newVideoNotification(String channelName, String videoTitle) {
		System.out.println(username + ", new video uploaded on channel " + channelName + '\n' + videoTitle);
	}
}
