package array.test1;
/*
 * �迭�� ����� �����Ҽ� ������
 * ����� �ٸ� �迭�� ��Ҹ� copy���� �����ü��� �ִ�.
 * 
 */
public class ArrayCopyTest2 {

	public static void main(String[] args) {
		int[ ] target = {1,2,3,4,5,6};
		int[ ] source = {10,9,8,7,6,5,4,3,2,1};
		
		//8,7,6,5,4,3...target
		System.arraycopy(source, 2, target, 0, target.length);
		
		for(int i : target)System.out.println(i);
	}

}






