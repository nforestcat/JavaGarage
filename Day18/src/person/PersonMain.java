package person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s =new Student();
		
		s.setNum(1);
		int num = s.getNum();
		System.out.println(num);
		
		String[] arr = {"국어","수학"};
		s.setSubjects(arr);
		
		arr = s.getSubjects();
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
