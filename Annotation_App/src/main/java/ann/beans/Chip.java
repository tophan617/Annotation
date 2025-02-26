package ann.beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	
	public Chip() {
		System.out.println("Chip :: Constructor.");
		System.out.println("Giri");
	}

	public String chipType() {
		return "32-bit";
	}
}
