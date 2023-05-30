package example;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] arrbyte = null;
		arrbyte = new byte[5];
		for(int i = 0; i < arrbyte.length; i++) {
			arrbyte[i]=(byte) (i+1);
		}
		for(int i = 0; i < arrbyte.length; i++) {
			System.out.println(arrbyte[i]);
		}
		
		char[] arrchar = null;
		arrchar = new char[5];
		for(int i = 0; i < arrchar.length; i++) {
			arrchar[i]=(char) (i+65);
		}
		for(int i = 0; i < arrchar.length; i++) {
			System.out.println(arrchar[i]);
		}
		
		boolean[] arrboolean = new boolean[5];
		for (int i = 0; i < arrboolean.length; i++) {
			if (i % 2 == 1) {
				arrboolean[i]=true;
			} else {
				arrboolean[i]=false;
			}
		}
		for(int i = 0; i < arrboolean.length; i++) {
			System.out.println(arrboolean[i]);
		}
		
		short[] arrshort = new short[5];
		for (int i = 0; i < arrshort.length; i++) {
			if(i==0) {
				arrshort[i]=100;
			} else {
			arrshort[i]=(short) (arrshort[i-1]+100);
			}
		}
		for(int i = 0; i < arrshort.length; i++) {
			System.out.println(arrshort[i]);
		}
		
		long[] arrlong = new long[5];
		for (int i = 0; i < arrlong.length; i++) {
			if(i==0) {
				arrlong[i]=90;
			} else {
			arrlong[i]=(long) (arrlong[i-1]+45);
			}
		}
		for(int i = 0; i < arrlong.length; i++) {
			System.out.println(arrlong[i]);
		}
		
		float[] arrfloat = new float[5];
		for (int i = 0; i < arrfloat.length; i++) {
			if(i==0) {
				arrfloat[i]=3.14f;
			} else {
			arrfloat[i]=(float) (arrfloat[0]*(i+1));
			}
		}
		for(int i = 0; i < arrfloat.length; i++) {
			System.out.println(arrfloat[i]);
		}
		
		double[] arrdouble = new double[5];
		for (int i = 0; i < arrdouble.length; i++) {
			arrdouble[i] = 3.141592d;
			System.out.println(arrdouble[i]);
		}
	}

}
