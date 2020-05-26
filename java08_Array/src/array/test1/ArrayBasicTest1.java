package array.test1;

class ArrayExam{
	String type="�迭";
	public String type() {
		return type;
	}
}
public class ArrayBasicTest1 {
	public static void main(String[] args) {
		ArrayExam exam = new ArrayExam();
		//1. ����� ����
		int[ ] arr = new int[3];//   |0|0|0|
		
		/*for(int i=0; i<arr.length; i++) {//length() �� �ƴϴ�.
			System.out.print(arr[i]+" ");
		}*/
		
		System.out.println("=== Default Value ====");
		//���� for��...���� ���ȿ��� ���ư��°�?
		for(int val : arr) System.out.print(val+" ");
		//FQCN(Full Qualified Class Name)
		System.out.println("\n"+exam);
		System.out.println("\n"+exam.toString());
		
		System.out.println(arr);
		
		//2. �迭�� �ʱ�ȭ
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		for(int val : arr) System.out.print(val+" ");
		System.out.println(" ");
		
		//3. ���� + ���� + �ʱ�ȭ�� �Ѳ�����
		int [ ] arr2 = {11,22,33};
		for(int val : arr2) System.out.print(val+" ");
		System.out.println("\n arr2 �迭�� ũ�� "+arr2.length); //3
		
		//4. arr2
		/*
		 * �迭�� Resizing�� �ȵȴ�.
		 * ���࿡ ����� �����ϸ� ���ο� �迭��ü�� ����...
		 */
		arr2 = new int[5];
		arr2[3] = 44; arr2[4] = 55; 
		for(int val : arr2) System.out.println(val+" ");
	}
}












