public class test {
    public static boolean pruefePrimzahl(double zahl) {
        boolean istPrimzahl = true;

        for(int i = 2;i < zahl; i++) {
            if(zahl % i == 0) {
                istPrimzahl = false;
            }
        }
        return istPrimzahl;
    }
    public static int berechneQuersumme(int zahl) {
      if(zahl <= 9) {
          return zahl;
       }

         return zahl % 10 + berechneQuersumme(zahl / 10);
    }

    public static boolean istQuersummeUndPrimzahl(int zahl) {
        
    }
    public static void main(String[]args) {
    System.out.println(pruefePrimzahl(11));
        System.out.println(berechneQuersumme(165));
    }
}
