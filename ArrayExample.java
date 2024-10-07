public class ArrayExample {
    public static void main (String args[]){
     
    int[] count={1,2,3,4,5,6,7};
    for(int i = 0; i <6; i++){
      System.out.println(count[i]);
    }
    float[] price={1.1f,13.3f,14.4f,15.5f,16.6f,17.7f};
    for(int i = 5; i>=0; i--){
      System.out.println(price[i]);
    }
    double[] distance={1.2222,2.3333,3.44444,6.8888,7.0000};
    for(int i = 2; i<=4; i++){
      System.out.println(distance[i]);
    }
    long[] population={23333,567777,899990,4433232,64543,};
    for(int i = 2; i>=0; i--){
    System.out.println(population[i]);
    }
    char[] charvalue = {'A','B','C','D','E','F'};
    for(int i=0; i<=5; i=i+2){
    System.out.println(charvalue[i]);
    }
    boolean[] booleanarry = {true,false,true,false,true};
    for (int i=0;i<booleanarry.length;i++){
      System.out.println(booleanarry[i]);
    }
    byte[] bytevalue ={-128,-64,-1,0,64,127 };
    for(int i = bytevalue.length-1; i>=0; i--){
      System.out.println(bytevalue[i]);
    }
    short[] shortvalue ={-32,768,-16,384,-1,0,16,384,32,767};
    for(int i=0; i<=9; i=i+2){
      System.out.println(shortvalue[i]);
}
}
}
