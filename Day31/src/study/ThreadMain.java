package study;

public class ThreadMain {
	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();
		MyThread2 th2 = new MyThread2();
		th2.start();
		MyThread3 th3 = new MyThread3();
		th3.start();
	}
}
class MyThread extends Thread{
	@Override
	public void run() { //run()메소드가 동작하는 시간이 이 쓰레드의 동작시간
		// TODO Auto-generated method stub
		//super.run();
		for(int i = 0; i < 100; i++) {
			System.out.println("MyThread " + i);
			try {
				sleep(500);
			} catch(Exception e) {
				System.out.println("sleep 중 충돌");
			}
		}
		
	}
}
class MyThread2 extends Thread{
	public void run() {
		for(char ch = 'A'; ch < 'Z'; ch++) {
			System.out.println(ch);
			try {
				sleep(3000);
			} catch(Exception e) {
				System.out.println("sleep 중 충돌");
			}
		}
	}
}
class MyThread3 extends Thread{
	@Override
	public void run() { //run()메소드가 동작하는 시간이 이 쓰레드의 동작시간
		// TODO Auto-generated method stub
		//super.run();
		for(int i = 0; i < 100; i++) {
			System.out.println("MyThread3 " + i);
			try {
				sleep(250);
			} catch(Exception e) {
				System.out.println("sleep 중 충돌");
			}
		}
		
	}
}
