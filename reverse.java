import java.io.*;
import java.util.*;
class reverse
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String st=s.nextLine();
String r=new StringBuffer(st).reverse().toString();
System.out.print(r);
}
}
