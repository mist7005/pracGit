package prac;

public class Language extends Backend implements Frontend{
	String lang="java";
	public void showFront()
	{
		System.out.println("front"+lang);
	}

	public static void main(String[] args) {
		
		Language ob=new Language();
		ob.showFront();
		ob.showBack(ob.lang);

	}

}
