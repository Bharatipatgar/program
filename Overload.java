public class Overload{
public static void main (String args[]){
number(7);
number(77,"Bharti");
number("Bharti",77);
userprofile(1);
userprofile(1,"abc");
userprofile("xyz",1);
productcatalog(101);
productcatalog(5.9,63.6f);
productcatalog(77.8f,3.7);
variableargs("vibha","bharti","indu");
}
public static void number(int digit){
System.out.println("display digit:" +digit);
}

public static void number(int digit,String name){
System.out.println("display digit:" +digit);
System.out.println("display name:" +name);
}

public static void number(String name,int digit){
System.out.println("display name:" +name);
System.out.println("display digit:" +digit);
}
public static void userprofile(int id){
System.out.println("userid:" +id); 
}
public static void userprofile(int id,String username){
System.out.println("display userid:" +id);
System.out.println("display username:" +username);
}
public static void userprofile(String username,int id){
System.out.println("display username:" +username);
System.out.println("display userid:" +id);
}
public static void productcatalog(int proid){
System.out.println("proid:" +proid); 
}
public static void productcatalog(double weight,float price){
System.out.println("weight:" +weight);
System.out.println("price:" +price);
}
public static void productcatalog(float price,double weight){
System.out.println("price:" +price);
System.out.println(" weight:" + weight);
}
public static void variableargs(String...names){
for(int i=0;i<names.length;i++){
System.out.println(names[i]);
}
}
}


    








