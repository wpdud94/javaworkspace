package workshopp;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		Scanner ty = new Scanner(System.in);
		int type = ty.nextInt(); 
		
		/*System.out.println("가위 바위 보 중 하나를 선택해 해당 번호를 눌러주세요.");
		System.out.println("가위 or 바위 or 보");
		Scanner temp = new Scanner(System.in);
int humC = temp.nextInt();*/
		
		
		
		
		int humWin = 0;
		int comWin = 0;
		
		if(type == 1) {
			
			for(int t = 0; t < 100 ;t++ ) {
							
				if(humWin != 3 && comWin != 3 ) {
					System.out.println("가위 바위 보 중 하나를 선택해 해당 번호를 눌러주세요.");
					System.out.println("가위 : 1 or 바위 : 2 or 보 : 3");
					Scanner sc = new Scanner(System.in);
					int humC = sc.nextInt();
					
					int comC = (int)(Math.random()*3)+1;
				
					if(humC==1) {
						if(comC == 1) System.out.println("플레이어 가위 vs 컴퓨터 가위"+", " +"비겼습니다");
						
						else if(comC == 2) {comWin++;
										System.out.println("플레이어 가위 vs 컴퓨터 바위"+", " +"졌습니다");}
							
						else if(comC == 3) {humWin++;
										System.out.println("플레이어 가위 vs 컴퓨터 보"+", " +"이겼습니다");}
					}
			
					if(humC==2) {
					
						if(comC == 2) System.out.println("플레이어 바위 vs 컴퓨터 바위"+", " +"비겼습니다");
					
						else if(comC == 3) {comWin++;
										System.out.println("플레이어 바위 vs 컴퓨터 보"+", " +"졌습니다");}
						
						else if(comC == 1) {humWin++;
										System.out.println("플레이어 바위 vs 컴퓨터 가위"+", " +"이겼습니다");}	
					}
					
					if(humC==3) {
					
						if(comC == 3) System.out.println("플레이어 보 vs 컴퓨터 보"+", " +"비겼습니다");
					
						else if(comC == 2) {humWin++; System.out.println("플레이어 보 vs 컴퓨터 바위"+", " +"이겼습니다");}
					
						else if(comC == 1) {comWin++; System.out.println("플레이어 보 vs 컴퓨터 가위"+", " +"졌습니다");}
					
					
					}
					continue;
				}
			
				if(humWin == 3) {
					System.out.println("### 플레이어 승");
					break;
			}
				if(comWin == 3) {
					System.out.println("### 컴퓨터 승");
					break;
			}
		}
		}
		
		if(type == 2) {
			
			for(int t = 0; t < 100 ;t++ ) {
							
				if(humWin != 2 && comWin != 2 ) {
					System.out.println("가위 바위 보 중 하나를 선택해 해당 번호를 눌러주세요.");
					System.out.println("가위 : 1 or 바위 : 2 or 보 : 3");
					Scanner sc = new Scanner(System.in);
					int humC = sc.nextInt();
					
					int comC = (int)(Math.random()*3)+1;
				
					if(humC==1) {
						if(comC == 1) System.out.println("플레이어 가위 vs 컴퓨터 가위"+", " +"비겼습니다");
						
						else if(comC == 2) {comWin++;
										System.out.println("플레이어 가위 vs 컴퓨터 바위"+", " +"졌습니다");}
							
						else if(comC == 3) {humWin++;
										System.out.println("플레이어 가위 vs 컴퓨터 보"+", " +"이겼습니다");}
					}
			
					if(humC==2) {
					
						if(comC == 2) System.out.println("플레이어 바위 vs 컴퓨터 바위"+", " +"비겼습니다");
					
						else if(comC == 3) {comWin++;
										System.out.println("플레이어 바위 vs 컴퓨터 보"+", " +"졌습니다");}
						
						else if(comC == 1) {humWin++;
										System.out.println("플레이어 바위 vs 컴퓨터 가위"+", " +"이겼습니다");}	
					}
					
					if(humC==3) {
					
						if(comC == 3) System.out.println("플레이어 보 vs 컴퓨터 보"+", " +"비겼습니다");
					
						else if(comC == 2) {humWin++; System.out.println("플레이어 보 vs 컴퓨터 바위"+", " +"이겼습니다");}
					
						else if(comC == 1) {comWin++; System.out.println("플레이어 보 vs 컴퓨터 가위"+", " +"졌습니다");}
					
					
					}
					continue;
				}
			
				if(humWin == 2) {
					System.out.println("### 플레이어 승");
					break;
			}
				if(comWin == 2) {
					System.out.println("### 컴퓨터 승");
					break;
			}
		}
		}

		if(type == 3) {
			
			for(int t = 0; t < 100 ;t++ ) {
							
				if(humWin != 1 && comWin != 1 ) {
					System.out.println("가위 바위 보 중 하나를 선택해 해당 번호를 눌러주세요.");
					System.out.println("가위 : 1 or 바위 : 2 or 보 : 3");
					Scanner sc = new Scanner(System.in);
					int humC = sc.nextInt();
					
					int comC = (int)(Math.random()*3)+1;
				
					if(humC==1) {
						if(comC == 1) System.out.println("플레이어 가위 vs 컴퓨터 가위"+", " +"비겼습니다");
						
						else if(comC == 2) {comWin++;
										System.out.println("플레이어 가위 vs 컴퓨터 바위"+", " +"졌습니다");}
							
						else if(comC == 3) {humWin++;
										System.out.println("플레이어 가위 vs 컴퓨터 보"+", " +"이겼습니다");}
					}
			
					if(humC==2) {
					
						if(comC == 2) System.out.println("플레이어 바위 vs 컴퓨터 바위"+", " +"비겼습니다");
					
						else if(comC == 3) {comWin++;
										System.out.println("플레이어 바위 vs 컴퓨터 보"+", " +"졌습니다");}
						
						else if(comC == 1) {humWin++;
										System.out.println("플레이어 바위 vs 컴퓨터 가위"+", " +"이겼습니다");}	
					}
					
					if(humC==3) {
					
						if(comC == 3) System.out.println("플레이어 보 vs 컴퓨터 보"+", " +"비겼습니다");
					
						else if(comC == 2) {humWin++; System.out.println("플레이어 보 vs 컴퓨터 바위"+", " +"이겼습니다");}
					
						else if(comC == 1) {comWin++; System.out.println("플레이어 보 vs 컴퓨터 가위"+", " +"졌습니다");}
					
					
					}
					continue;
				}
			
				if(humWin == 1) {
					System.out.println("### 플레이어 승");
					break;
			}
				if(comWin == 1) {
					System.out.println("### 컴퓨터 승");
					break;
			}
		}
		}
		

	}

}
