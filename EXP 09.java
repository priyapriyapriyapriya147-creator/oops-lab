import java.util.*;
public class ArrayListExample{
public static void main(String args[]){
ArrayList<String>obj1=new ArrayList<String>();
obj1.add("ajeet");
obj1.add("harry");
obj1.add("chaitanya");
obj1.add("steve");
obj1.add("anuj");
System.out.println("\ncurrently the array list obj1 has following elements:"+obj1);
obj1.add("babu");
obj1.add("kamal");
ArrayList<String>obj2=new ArrayList<String>();
obj2.add("alice");
obj2.add("bob");
obj2.add("raj");
obj1.addAll(obj2);
System.out.println("\nArrayList obj1 after add All:"+obj1);
obj1.add(0,"rahul");
obj1.add(1,"justin");
System.out.println("\nArrayList obj1 after add element at the given index:"+obj1);
System.out.println("\nEnter the search element:");
Scanner input=new Scanner(System.in);
String search=input.nextLine();
System.out.println("\nArrayList obj1 contains the string"+search+":"+obj1.contains(search));
obj1.remove("chaitanya");
obj1.remove("harry");
System.out.println("\nCurrent array list of obj1 after removing element is:"+obj1);
obj1.remove(1);
System.out.println("\nCurrent array list of obj1 after removing element through index is:"+obj1);
System.out.println("\nEnter the letter to display all the string start with given letter:");
search=input.nextLine();
ArrayList<String>obj3=new ArrayList<String>();
for(int i=0;i<obj1.size();i++)
{
if(obj1.get(i).startsWith(search.toUpperCase()))
{
obj3.add(obj1.get(i));
}
}
if(obj3.size()>0)
{
System.out.println("\nArrayList obj1 contains all the string start with given"+search+":"+obj3);
}
else
{
System.out.println("\nNo Name start with"+search+" letter in ArrayList obj1");
}
}
}

