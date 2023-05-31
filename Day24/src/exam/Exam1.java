package exam;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {85, 75, 50, 100, 95};
		ActExam1 act = new ActExam1();
		act.align(a);
		act.show(a);
	}

}
class ActExam1{
	void align(int a[]) {
		int temp;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j< 5; j++) {
				if(a[j]>a[i+1]) {
					temp = a[j];
					a[j] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
	}
	void show(int a[]) {
		for(int i = 0; i<5; i++) {
			System.out.print(a[i]+ "\t" );
		}
	}
}