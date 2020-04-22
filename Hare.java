
public class Hare extends Player {
	
	
	public void feelAsleep() {
		position = position; 
	}
	
	public void bigHop() {
		position += 9;
	}
	
	public void bigSlip() {
		
		if (position > 12) {
			position += 12;
		} else {
			position = 1; 
		}
		
	}
	
	public void smallHop() {
		position += 1;
	}

	public void smallSlip() {
		
		if (position > 2) {
			position += 2;
		} else {
			position = 1; 
		}
		
		
	}
	
}
