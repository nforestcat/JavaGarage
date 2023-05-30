package study;

public class CaptionTVMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("hello, world");
		ctv.caption=true;
		ctv.displayCaption("hello, world");
		ctv.channelDown();
		
	}

}
class Tv{
	int channel;
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}

class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}