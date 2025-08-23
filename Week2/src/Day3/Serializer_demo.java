package Day3;
//File 1 continue to...........
import java.io.Serializable;

public class Serializer_demo  implements Serializable{
	int id;
	String name;
	
	Serializer_demo(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public String toString()
	{
		return id + "    " + name;
	}

}
