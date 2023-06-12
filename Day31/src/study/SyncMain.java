package study;

public class SyncMain{
	public static void main(String[] args) {
		Data data = new Data();
		
		Sync s1 = new Sync(data);
		Sync2 s2 = new Sync2(data);
		
		s1.start();
		s2.start();
	}
}
class Data {
	private int num;
	public synchronized void add(int x) {
		num += x;
		System.out.println("증가 실행, num = "+ num);
		if (num > 40) {
			notifyAll();
			
			System.out.println("증가 쓰레드 wait");
			try {
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void sub(int x) {
		num -=x;
		System.out.println("감소실행, num = "+num);
		if(num < 20) {
			notifyAll();
			System.out.println("감소 쓰레드 wait");
			try {
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Sync extends Thread{
	private Data data;
	public Sync(Data data) {
		this.data = data;
	}
	public void run() {
		for(int i = 0; i < 50; i++) {
			data.add(1);
		}
	}
}
class Sync2 extends Thread{
	private Data data;
	Sync2(Data data){
		this.data = data;
	}
	public void run() {
		for(int i = 0; i < 50; i++) {
			data.sub(1);
		}
	}
}