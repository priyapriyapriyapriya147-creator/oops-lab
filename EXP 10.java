import java.util.Scanner;
import java.io.File;
class FileDemo{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
System.out.print("enter file path:");
String s=input.nextLine();
File f1=new File(s);
System.out.println("File Name:"+f1.getName());
System.out.println("Path:"+f1.getPath());
System.out.println("Absolute Path:"+f1.getAbsolutePath());
System.out.println("Parent:"+f1.getParent());
System.out.println("this file is:"+(f1.exists()?"Exists":"does not exist"));
System.out.println("Is file:"+f1.isFile());
System.out.println("Is Directory:"+f1.isDirectory());
System.out.println("Is readable:"+f1.canRead());
System.out.println("Is writable:"+f1.canWrite());
System.out.println("Is Absolute:"+f1.isAbsolute());
System.out.println("File Last Modified :"+f1.lastModified());
System.out.println("File size:"+f1.length()+"bytes");
System.out.println("Is Hidden:"+f1.isHidden());
}
}
