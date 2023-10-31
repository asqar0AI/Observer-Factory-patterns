import java.util.ArrayList;
import java.util.List;

class YoutubeChannel implements Subject {
	private String channelName;
	private List<Observer> subscribers = new ArrayList<>();
	private String latestVideoTitle;
	
	public YoutubeChannel(String channelName) {
		this.channelName = channelName;
	}
	
	public void uploadVideo(String videoTitle) {
		latestVideoTitle = videoTitle;
		notifySubscribers(videoTitle);
	}
	
	@Override
	public void subscribe(Observer observer) {
		subscribers.add(observer);
	}
	
	@Override
	public void unsubscribe(Observer observer) {
		subscribers.remove(observer);
	}
	
	@Override
	public void notifySubscribers(String videoTitle) {
		for (Observer subscriber : subscribers) {
			subscriber.newVideoNotification(channelName, videoTitle);
		}
	}
}