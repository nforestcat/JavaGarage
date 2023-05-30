package test;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpStack stack = new ImpStack();
		stack.push(5);
		stack.push(80);
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		Stack stack2 = new ImpStack(10);
		stack.push(9);
		stack.push(10);
		stack.push(9);
		stack.push(10);
		stack.push(9);
		stack.push(10);
		stack.push(9);
		stack.push(10);
		stack.push(9);
		stack.push(10);
	}

}
interface Stack{
	int DEFAULT = 100;
	void push(int value);
	int pop();
}
class ImpStack implements Stack{
	int[] stk;
	int top;
	ImpStack(){
		stk = new int[DEFAULT];
		top = 0;
	}
	ImpStack(int size){
		stk = new int[size];
		top = 0;
	}
	public void push(int value) {
		if (top == stk.length) {
			System.out.println("stack full");
		}
		else {
			stk[top++] = value;
		}
	}
	public int pop() {
		int ret = 0;
		if(top <= 0) {
			System.out.println("stack empty");
			ret = -1;
		} else {
			ret = stk[--top];
		}
		return ret;
	}
}
