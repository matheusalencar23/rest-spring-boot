package io.github.matheusalencar23;

public class Gretting {
	
	private final long id;
	private final String name;
	
	public Gretting(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
}
