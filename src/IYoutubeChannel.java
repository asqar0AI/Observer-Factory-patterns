interface IYoutubeChannel {
	void addSubscriber(YoutubeAccount youtubeAccount);
	
	void removeSubscriber(YoutubeAccount youtubeAccount);
	
	void notifySubscribers(String videoTitle);
}