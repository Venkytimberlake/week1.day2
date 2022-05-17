package week1.day2;

public class Intersection {

	public void findIntersection(int[] numArr1,int[] numArr2) {

		for(int i=0;i<numArr1.length;i++) {
			for(int j=0;j<numArr2.length;j++) {
				if(numArr1[i]==numArr2[j]) {
					System.out.println(numArr1[i]);
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr1 = {3,2,11,4,6,7};
		int[] numArr2 = {1,2,8,4,9,7};
		Intersection intObj=new Intersection();
		intObj.findIntersection(numArr1, numArr2);

	}

}
