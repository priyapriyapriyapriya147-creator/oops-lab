import java.util.Scanner;
public class ElectBill
{
public static void main(string[]args)
{
consumer ob =new consumer();
ob.Getdata();
ob.Calc();
ob.Display();
}
}
class consumer
{
Scannner in =new Scanner(system.in);
Scannner in = new Scanner(system.in);
int cno;
string cname,type_of_conn;
doublr pre_reading,curr_reading,unit_consumed,tbill;
void Getdata()
{
system.out.print("\n\t Enter consumer number=");
cno=in.nextInt();
system.out.print("\n\t Enter consumer name=");
cname=in.nextLine();
system.out.print("\n\t Enter the type of connection=");
type_of_conn=in.nextLine();
system.out.print("\n\t Enter pre_month reading=");
Pre_reading=in.nextDouble();
system.out.print("\n\t Enter current_month reading=");
curr_reading=in.nextDouble();
}
void calc()
{
unit_consumed=curr_reading-pre_reading;
if(type_of_conn.contains("domestic"))
{
if(unit_consumed<=100)
tbill=1*unit_consumed;
else if (unit_consumed>100&&unit_consumed<=200)
tbill=2.50*unit_consumed;
else if (unit_consumed>200&&unit_consumed<=500)
tbill=4*unit_consumed;
else
tbill=6*unit_consumed;
}
else if(type_of_conn.contains("commercial"))
{
if(unit_consumed<=100)
tbill=2*unit_consumed;
else if (unit_consumed>100&&unit_consumed<=200)
tbill=4.50*unit_consumed;
else if (unit_consumed>200&&unit_consumed<=500)
tbill=6*unit_consumed;
else
tbill=7*unit_consumed;
}
}
void Display()
{
system.out.print("\n\t  consumer name="+cname);
system.out.print("\n\t total units="+unit_consumed);
system.out.print("\n\t total bill=RS"+tbill);
}
}
