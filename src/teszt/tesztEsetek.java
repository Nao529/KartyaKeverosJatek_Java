package teszt;

import oop.Pakli;
import oop.Program;

public class tesztEsetek {
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
