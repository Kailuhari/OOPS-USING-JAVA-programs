import java.io.*;
import java.util.*;
class monkey
{
void jump()
{
System.out.println("jumping");
}
void bite()
{
System.out.println("biting");
}
}
interface basicanimal
{
void eat();
void sleep();
}
class human extends monkey implements basicanimal
{
public void eat()
{
System.out.println("eating");
}
public void sleep()
{
System.out.println("sleeping");
}
}
class maain
{
public static void main(String args[])
{
human h=new human();
h.eat();
h.bite();
}
}
