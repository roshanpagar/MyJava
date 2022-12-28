package arrayinjava;

public class Movie {
	int id;
	String name, releaseYear;
	
	Movie(int id, String name, String releaseYear)
	{
		this.id=id;
		this.name=name;
		this.releaseYear=releaseYear;
	}
	public String toString()
	{
		return id+" "+name+" "+releaseYear;
	}

}
