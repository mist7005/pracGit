package oop;
class Song
{
	void rhythm()
	{
		System.out.println("slow pace");
	}
	public static void main(String[] args) {
		System.out.println("hello");
	}
	
}

class RemixSong extends Song
{
	void rhythm()
	{
		System.out.println("fast and terror");
	}
	public static void main(String[] args) {
		System.out.println("bye");
	}
	
}

public class DriverRTP extends Song{
	

	public static void main(String[] args) {
		RemixSong ob=new RemixSong();
		ob.rhythm();
		

	}

}
