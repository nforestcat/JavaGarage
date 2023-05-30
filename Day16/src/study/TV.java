package study;

public class TV {
	// member variable
	String color;
	boolean power;
	int channel;
	
	//method
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	void setColor(String c) {
		color = c;
	}
	String getColor() {
		return color;
	}
	void setPower(boolean p) {
		power = p;
	}
	boolean getPower() {
		return power;
	}
	void setChannel(int ch) {
		channel = ch;
	}
	int getChannel() {
		return channel;
	}
}
