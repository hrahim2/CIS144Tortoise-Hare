
public class Race {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxPosition = 70;
		
		Hare hare = new Hare(); 
		Tortoise tortoise = new Tortoise(); 
		
		hare.setPosition(1);
		tortoise.setPosition(1);
		
		System.out.println("AND THEY'RE OFF!");
		
		while (hare.getPosition() > 0) {
			
			int move = (int)(Math.random()*10); 
			
			//printTrack(hare, 'H');
			//printTrack(tortoise, 'T'); 
			
			switch(move) {
			
				case 1:
					hare.bigHop(); 
					tortoise.fastPlod();
					break;
				case 2:
					hare.bigHop();
					tortoise.fastPlod();
					break;
				case 3:
					hare.feelAsleep();
					tortoise.fastPlod();
					break;
				case 4:
					hare.feelAsleep();
					tortoise.fastPlod();
					break;
				case 5:
					hare.bigSlip(); 
					tortoise.fastPlod();
					break;
				case 6:
					hare.smallHop();
					tortoise.slip();
					break;
				case 7:
					hare.smallHop();
					tortoise.slip();
					break;
				case 8:
					hare.smallHop();
					tortoise.slowPlod();
					break;
				case 9:
					hare.smallSlip();
					tortoise.slowPlod();
					break;
				case 10:
					hare.smallSlip();
					tortoise.slowPlod();
					break;
				default:
					break;
			}
			
			for (int i = 1; i <= maxPosition; i++) {
			    if (i == tortoise.getPosition()) {
			    	System.out.print("T");
			    } else if (i == hare.getPosition()) {
			    	System.out.print("H"); 
			    } else {
			        System.out.print("_");
			    }
			    System.out.print("|");
			    //System.out.println(i); 
			}
			
			System.out.println();
			System.out.println();
			
			if (hare.getPosition() == maxPosition || tortoise.getPosition() == maxPosition) {    
				
				if (hare.getPosition() == maxPosition) {
					System.out.println("the hare won. YUCK");
					break;
				} else if (tortoise.getPosition() == maxPosition) {
					System.out.println("the TORTOISE WINS!!! YAY!!!");
					break;
				} else if (hare.getPosition() == tortoise.getPosition()) {
					System.out.println("sadly a tie");
					break;
				}
				
			}
			
		}	
		
	}
	
	/*
	
	private static void printTrack(Player player, char symbol) {
	    int position = player.getPosition();
	    for (int i = 0; i < position; i++)
	        System.out.print('_');

	    System.out.print(symbol);

	    for (int i = position + 1; i < 50; i++)
	        System.out.print('_');

	    System.out.println();
	}
	
	*/
	
	// private static void printTrack(Player player1, char symbol1, Player player2, char symbol2); 
	
	private static void printTrack(Player player, char symbol) {
		
		int pos = player.getPosition(); 
		
		for (int i = 0; i < pos; i++) {
			System.out.print('_');
			//System.out.print('|'); 
		}
		
		System.out.print(symbol);
		
		for(int i = pos + 1; i < 70; i++) {
			System.out.print('_'); 
			//System.out.print('|');
			
		}
		
		System.out.println(); 
		
	}
	

}
