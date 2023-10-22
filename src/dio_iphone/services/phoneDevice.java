package dio_iphone.services;

public interface phoneDevice {
	
	public void call(String number);
	public void answerCall();
	public void beginVoiceMail(String number, String message);

}
