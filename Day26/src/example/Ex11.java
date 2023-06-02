package example;

public class Ex11 {
	public static void main(String[] args) {
		throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
	}
}
class UnsupportedFunctionException extends RuntimeException{
	final private int ERR_CODE = 100;
	private String message;
	public int getErrorCode() {
		return ERR_CODE;
	}
	public String getMessage() {
		return "["+ERR_CODE+"]지원하지 않는 기능입니다.";
	}
	public UnsupportedFunctionException(String s, int i) {
		super();
		
	}
}