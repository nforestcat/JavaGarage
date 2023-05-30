package my_casting;

	class UpCastingChild  extends UpCastingParent{
		private int z;
		
		public UpCastingChild() {
			x = 100;
			y = 200;
			z = 300;
		}
		public int add() {
			System.out.println("child의 add()");
			return x + y + z;
		}
		public int sub() {
			System.out.println("child의 sub()");
			return x - y - z;
		}
		public int getZ() {
			return z;
		}
		public void setZ(int z) {
			this.z = z;
		}
}
