package oop;

public class Pakli {
    private Lap[] lapok = new Lap[21];
    
    public Pakli(){
        feltolt();
    }
    
    public void kever(int oszlop){
        Lap[] ujLapok = new Lap[21];
        
        switch(oszlop){
            case 1 -> {
                for (int i = 0; i <= 6; i++) {
                    ujLapok[i] = lapok[19-i*3];
                    ujLapok[i+7] = lapok[18-i*3];
                    ujLapok[i+14] = lapok[20-i*3];
                }
            }
            case 2 -> {
                for (int i = 0; i <= 6; i++) {
                    ujLapok[i] = lapok[18-i*3];
                    ujLapok[i+7] = lapok[19-i*3];
                    ujLapok[i+14] = lapok[20-i*3];
                }
            }
            case 3 -> {
                for (int i = 0; i <= 6; i++) {
                    ujLapok[i] = lapok[18-i*3];
                    ujLapok[i+7] = lapok[20-i*3];
                    ujLapok[i+14] = lapok[19-i*3];
                }
            }
        }
        lapok = ujLapok;
    }
    
    public void feltolt(){
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász","Kir","Fel","X","IX","VIII"};
        int db = 0;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                if (db < 21){
                    lapok[db++] = new Lap(ertek, szin);
                }
            }
        }
    }
    
    public Lap ezVolt(){
        return lapok[10];
    }
    
    public Lap[] getLapok(){
        Lap[] masolat = lapok;
        return masolat;
    }
}