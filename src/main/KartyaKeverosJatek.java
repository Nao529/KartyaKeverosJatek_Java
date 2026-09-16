package main;

public class KartyaKeverosJatek {
    
    static String[] pakli = new String[22];
    
    public static void main(String[] args) {
        
        feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();//1 tömb
            melyik();//Scanner
            kever();//középre
        }
        ezVolt();//11. azaz középső lap
    }

    private static void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int db = 0;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                
            }
        }
    }

    private static void kirak() {}
    
    private static void melyik() {}
    
    private static void kever() {}
    
    private static void ezVolt() {}
}
