//java program to initiaize the values from one object to another object


class Student2
{
int id;
String name;
Student2(int i,String n){
id=i;
name=n; 
}
Student2(Student2 s)
{
id=s.id;
name=s.name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Student2 s1=new Student2(111,"vaishu");
Student2 s2=new Student2(s1);
s1.display();
s2.display();
}
}