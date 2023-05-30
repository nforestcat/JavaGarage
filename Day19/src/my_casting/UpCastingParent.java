package my_casting;

	class UpCastingParent {
		protected int x;
		protected int y;
		UpCastingParent(){
			x = 10;
			y = 20;
		}
		int add() {
			System.out.println("parent의 add()");
			return x + y;
		}
}
