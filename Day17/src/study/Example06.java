package study;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class SutdaCard{
	int num;
	boolean isKwang;
	SutdaCard(int num, boolean kwang){
		this.num = num;
		this.isKwang = kwang;
	}
	SutdaCard getSutdaCard() {
		return this;
	}
	void setNum(int n){
		num=n;
	}
	int getNum() {
		return num;
	}
	void setIsKwang(boolean kwang) {
		isKwang=kwang;
	}
	boolean getIsKwang() {
		return isKwang;
	}
}
