package study;

import java.io.IOException;

public class ExceptionMain {

	static void method3() throws IOException{
		try {
			throw new IOException();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("method3");
		}
		throw new IOException();
		
	}
	public static void method2(){
		throw new ArithmeticException("/ by zero");
	}
	
	
	public static void method1() throws IOException{
//		try {
//			method2();
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//		}
		//method2();
		System.out.println("method1");
		method3();
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
//throw new ArithmeticException("/ by zero");
//int i = 4/0;
//6번 문제 4번
//7번
//try {
//	method();
//} catch(Exception e) {
//	
//} catch(NumberException e) {
//	
//}