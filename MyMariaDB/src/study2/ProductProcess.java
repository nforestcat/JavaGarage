package study2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
//import java.util.Vector;

public class ProductProcess {
	Scanner sc = new Scanner(System.in);
	boolean bFlag = true;
	ServiceImpl service = new ServiceImpl();
	void process() {
		System.out.println("=====================================");
		System.out.println("==========제품관리 프로그램==========");
		System.out.println("=====================================");
		while(bFlag) {
			System.out.println("메뉴를 선택해주세요.");
			System.out.println("1. 종료  2. 제품등록  3. 제품수정  4.제품삭제  5.제품검색  6.전체 제품 목록");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				bFlag = false;
				service.close();
				System.out.println("프로그램 종료");
				break;
			case 2:
				addProduct();
				break;
			case 3:
				modifyProduct();
				break;
			case 4:
				deleteProduct();
				break;
			case 5:
				searchProduct();
				break;
			case 6:
				searchAll();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	void searchAll() {
		System.out.println("------------------------------");
		System.out.println("--------전체 제품 목록--------");
		ArrayList<Product> al = service.selectAll();
		
		Iterator<Product> iter = al.iterator();
		while(iter.hasNext()) {
			Product p = iter.next();
			System.out.println(p);
		}
		System.out.println("------------------------------");
	}
	void searchProduct() {
		searchAll();
		System.out.print("검색하고자 하는 제품의 번호는");
		int num = sc.nextInt();
		Product p = service.select(num);
		System.out.println("검색결과는 다음과 같습니다.");
		if(p==null) {
			System.out.println("존재하지 않는 제품번호입니다.");
		} else {
			System.out.println(p);
		}
	}
	void deleteProduct() {
		searchAll();
		System.out.println("삭제하고자 하는 제품 번호는 ");
		int num = sc.nextInt();
		if(service.select(num)==null) {
			System.out.println("존재하지 않는 제품번호입니다.");
			return;
		}
		if(service.delete(num)) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
	}
	void modifyProduct() {
		searchAll();
		System.out.println("수정하고 싶은 제품 번호는");
		int num = sc.nextInt();
		if(service.select(num)==null) {
			System.out.println("존재하지 않는 제품번호입니다.");
			return;
		}
		System.out.print("제품명");
		String name  = sc.next();
		System.out.print("가격은");
		int price = sc.nextInt();
		
		if(service.update(new Product(num,  name, price))) {
			System.out.println("수정 성공");
		} else {
			System.out.println("수정 실패");
		}
	}
	void addProduct() {
		System.out.print("추가할 제품의 이름은");
		String name  = sc.next();
		System.out.print("추가할 제품의 가격은");
		int price = sc.nextInt();
		
		Product p = new Product(name, price);
		if(service.insert(p)) {
			System.out.println("제품을 추가했습니다");
		} else {
			System.out.println("제품 추가 실패");
		}
	}
}
