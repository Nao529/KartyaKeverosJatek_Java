package teszt;

import oop.Lap;
import oop.Pakli;

public class Tesztek {
    
    public static void main(String[] args) {
        Tesztek teszt = new Tesztek();
        teszt.teszt21LapVan();
        teszt.tesztLapMegjelenitese();
        teszt.tesztLapErteke();
        teszt.tesztEzVolt();
    }
    
    //Nao
    Pakli pakli;
    Lap lap;
    void peldanyosit() {
        pakli = new Pakli();
        lap = new Lap("Ász", "P");
    }
    // teszt: a pakli pontosan 21 lapot tartalmaz
    void teszt21LapVan() {
        peldanyosit();
        assert pakli.getLapok().length == 21 : "nem 21 lap van a pakliban";
    }
    // teszt: a lap megjelenítése helyes
    void tesztLapMegjelenitese() {
        peldanyosit();
        assert lap.megjelenit().equals("P_Ász") : "hibás lapmegjelenítés";
    }
    // teszt: a lap értéke helyesen lett beállítva
    void tesztLapErteke() {
        peldanyosit();
        assert lap.getErtek().equals("Ász") : "hibás lapérték";
    }
    // teszt: az ezVolt() valóban a középső lapot adja vissza
    void tesztEzVolt() {
        peldanyosit();
        assert pakli.ezVolt() == pakli.getLapok()[10] : "nem a középső lapot adja vissza";
    }
    
    
    
    // Viki
    public static void feltoltTeszt(){
        Pakli p = new Pakli();
        assert p.getLapok()[0].megjelenit().equals("P_Ász");
        assert p.getLapok()[1].megjelenit().equals("P_Kir");
        assert p.getLapok()[2].megjelenit().equals("P_Fel");
        
        assert p.getLapok()[18].megjelenit().equals("M_Ász");
        assert p.getLapok()[19].megjelenit().equals("M_Kir");
        assert p.getLapok()[20].megjelenit().equals("M_Fel");
    }
    public static void keverElsoOszlopTeszt(){
        Pakli p = new Pakli();
        p.kever(1);
        
        assert p.getLapok()[0].megjelenit().equals("M_Kir");
        assert p.getLapok()[7].megjelenit().equals("M_Ász");
        assert p.getLapok()[14].megjelenit().equals("M_Fel");
    }
    public static void keverMasodikOszlopTeszt(){
        Pakli p = new Pakli();
        p.kever(2);
        
        assert p.getLapok()[0].megjelenit().equals("M_Ász");
        assert p.getLapok()[7].megjelenit().equals("M_Kir");
        assert p.getLapok()[14].megjelenit().equals("M_Fel");
    }
    public static void keverHarmadikOszlopTeszt(){
        Pakli p = new Pakli();
        p.kever(3);
        
        assert p.getLapok()[0].megjelenit().equals("M_Ász");
        assert p.getLapok()[7].megjelenit().equals("M_Fel");
        assert p.getLapok()[14].megjelenit().equals("M_Kir");
    }
}
