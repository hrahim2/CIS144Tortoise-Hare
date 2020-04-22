
public class Tortoise extends Player {
	
	
	public void fastPlod() {
		position += 3;
	}
	
	public void slowPlod() {
		position += 1;
	}
	
	public void slip() {
		
		if (position > 6) {
			position -= 6; 
		} else {
			position = 1; 
		}
		
	}

}
