import java.util.ArrayList;
import java.util.List;

class YoutubeChannel implements IYoutubeChannel, IMonetizeContent {
	private String channelName;
	private String channelType;
	private boolean isMonetized;
	private ArrayList<YoutubeAccount> subscribers = new ArrayList<>();
	private String latestVideoTitle;
	
	public YoutubeChannel(String channelName, boolean isMonetized) {
		this.channelName = channelName;
		setMonetize(isMonetized);
	}
	
	public void uploadVideo(String videoTitle) {
		latestVideoTitle = videoTitle;
		notifySubscribers(videoTitle);
	}
	
	@Override
	public void addSubscriber(YoutubeAccount youtubeAccount) {
		subscribers.add(youtubeAccount);
	}
	
	@Override
	public void removeSubscriber(YoutubeAccount youtubeAccount) {
		subscribers.remove(youtubeAccount);
	}
	
	@Override
	public void notifySubscribers(String videoTitle) {
		for (YoutubeAccount subscriber : subscribers) {
			subscriber.newVideoNotification(channelName, videoTitle);
		}
	}
	
	@Override
	public void setMonetize(boolean isMonetized) {
		this.isMonetized = isMonetized;
	}
}