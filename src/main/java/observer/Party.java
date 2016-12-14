package observer;

import java.awt.Color;

public class Party {
	private String name;
	private Color color;
	
	public Party(String name, Color color) {
		this.setName(name);
		this.setColor(color);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
