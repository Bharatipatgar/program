public class BicycleInfo {

  static Bicycle[] bicycleData = new Bicycle[8];

  public static void main(String[] args) {

      
      Bicycle bicycle1 = new Bicycle(1, 20, "Bianchi", "Red");
      Bicycle bicycle2 = new Bicycle(2, 30, "Giant", "Purple");
      Bicycle bicycle3 = new Bicycle(3, 10, "Kona", "Yellow");
      Bicycle bicycle4 = new Bicycle(4, 40, "Scott", "Pink");
      Bicycle bicycle5 = new Bicycle(1, 50, "Pinarello", "White");
      Bicycle bicycle6 = new Bicycle(5, 60, "Trek", "Lavender");
      Bicycle bicycle7 = new Bicycle(7, 70, "Orbea", "Black");
      Bicycle bicycle8 = new Bicycle(2, 10, "Canyon", "Brown");
      
      
      saveBicycle(bicycle1);
      saveBicycle(bicycle2);
      saveBicycle(bicycle3);
      saveBicycle(bicycle4);
      saveBicycle(bicycle5);
      saveBicycle(bicycle6);
      saveBicycle(bicycle7);
      saveBicycle(bicycle8);
      

      
      for (int i = 0; i < bicycleData.length; i++) {
          if (bicycleData[i] != null) {
              bicycleData[i].BicycleInfo();  
          }
      }
  }

  
  public static boolean saveBicycle(Bicycle bicycle) {  
      for (int i = 0; i < bicycleData.length; i++) {
          if (bicycleData[i] == null) {
              bicycleData[i] = bicycle;
              System.out.println("Bicycle is saved");
              return true;
          }
      }
      System.out.println("No space in the array");
      return false;
  }
}
