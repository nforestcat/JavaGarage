package example;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 1, day = 1;
		for (month = 1; month < 13; month++) {
			System.out.println("\t\t\t"+month+"월");
			for(day = 1; day < 31; day ++) {
				if(month%7==1) {
					System.out.print(day+"\t");
					if(day % 7 ==0) {
						System.out.println();
					}
				} else if(month%7==2) {
					if (day==1) {
					System.out.print("\t\t");
					}
					System.out.print(day+"\t");
					if((day+2) % 7 ==0) {
						System.out.println();
					}
				} else if(month%7==3) {
					if (day==1) {
						System.out.print("\t\t\t\t");
						}
					System.out.print(day+"\t");
					if((day+4) % 7 ==0) {
						System.out.println();
					}
				} else if(month%7==4) {
					if (day==1) {
						System.out.print("\t\t\t\t\t\t");
						}
					System.out.print(day+"\t");
					if((day+6) % 7 ==0) {
						System.out.println();
					}
				} else if(month%7==5) {
					if (day==1) {
						System.out.print("\t");
						}
					System.out.print(day+"\t");
					if((day+1) % 7 ==0) {
						System.out.println();
					}
				} else if(month%7==6) {
					if (day==1) {
						System.out.print("\t\t\t");
						}
					System.out.print(day+"\t");
					if((day+3) % 7 ==0) {
						System.out.println();
					}
				}
				 else if(month%7==0) {
					 if (day==1) {
						System.out.print("\t\t\t\t\t");
					 }
						System.out.print(day+"\t");
						if((day+5) % 7 ==0) {
							System.out.println();
						}
					}
					
				
			}
			System.out.println();
		}
	}

}
