public class Stringex{
public static void main (String args[]){

String state = "karnataka";
String state1 = "maharashtra";
String state2 = "delhi";
String state3 = "maharashtra";
state2 = "kerala";

String city = "banglore";
String city1 = "chennai";
String city2 = "jaipur";
String city3 = "chennai";
String city4 = "surat";

String state4 = new String("karnataka");
String state5 = new String("delhi");
String state6 = new String("bihar");
String state7 = new String("kerala");
String state8 = new String("gujarat");

String city5 = new String ("patna");
String city6 = new String ("pune");
String city7 = new String ("banglore");
String city8 = new String ("mysore");
String city9 = new String ("agra");


System.out.println(state2);
System.out.println(state1.equals(state3));
System.out.println(city1.equals(city3));

char[] charArray = state.toCharArray();
String value = "";
for( int i=charArray.length-1;i>=0;i--){
value = value + charArray[i];
}
System.out.println(value);

char[] charArray1 = city4.toCharArray();
String value1 = "";
for(int i=charArray1.length-1;i>=0;i--){
value1 = value1 + charArray1[i];
}
System.out.println(value1);

}
}

