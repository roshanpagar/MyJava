package arrayinjava;

import java.util.Arrays;

public class Theater {
	int id;
	String name;
	Theater movie[];
	
	Theater(int id,String name, Theater movie[])
	{
		this.id=id;
		this.name=name;
		this.movie=movie;
	}
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(movie)+"\n";
	}

}
