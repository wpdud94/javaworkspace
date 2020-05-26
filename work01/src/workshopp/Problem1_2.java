package workshopp;

public class Problem1_2 {

	public static void main(String[] args) {
		int num = 1;
		while(num<=17) {
			switch(num) {
			case 6: System.out.print("\n"+"   "+num+"  ");
				break;
			case 9: System.out.print("\n"+"      "+num+"  ");
				break;
			case 10: System.out.print("\n"+"   "+num+" ");
				break;	
			case 13: System.out.print("\n"+num+" ");
				break;
			case 1: case 2: case 3: case 4 : case 5: case 7: case 8: System.out.print(num+"  ");
				break;
			default : System.out.print(num+" ");
			}
			
			num++;
		}

	}

}
