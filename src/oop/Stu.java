package oop;

public class Stu {
int id;
String name;

Stu(int id,String name)
{
this.id	=id;
this.name=name;
}

@Override
public String toString() {
	return "Stu [id=" + id + ", name=" + name + "]";
}

}
