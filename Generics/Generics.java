import java.util.*;  
class Generics{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();  
list.add("Shivani");  
list.add("Thakkar");  
  
String s=list.get(1);//type casting is not required  
System.out.println("element is: "+s);  
  
Iterator<String> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  