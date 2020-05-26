package workshopp;

public class Problem1_1 {

	public static void main(String[] args) {
		
		/*for(int i=1;i<6;i++) {
			System.out.print(i);
			System.out.print("  ");
		}
		System.out.print("\n"+"   ");
		for(int i=6;i<10;i++) {
			System.out.print(i+"  ");
		}
		System.out.print("\n"+"      ");
		for(int i=10;i<13;i++) {
			System.out.print(i+" ");
		}
		System.out.print("\n"+"         ");
		for(int i=13;i<15;i++) {
			System.out.print(i+" ");
		}
		System.out.print("\n"+"            ");
		for(int i=15;i<16;i++) {
			System.out.print(i);
		}*/
		int num = 1;
		while(num<=15) {
			switch(num) {
			case 6: System.out.print("\n"+"   "+num+"  ");
				break;
			case 10: System.out.print("\n"+"      "+num+" ");
				break;	
			case 13: System.out.print("\n"+"         "+num+" ");
				break;
			case 15: System.out.print("\n"+"            "+num+" ");
				break;
			case 1: case 2: case 3: case 4 : case 5: case 7: case 8: case 9: System.out.print(num+"  ");
				break;
			default : System.out.print(num+" ");
			}
			
			num++;
		}
		
	}
}

