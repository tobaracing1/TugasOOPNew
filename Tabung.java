package src;

public class Tabung {
    public static class BangunTabung{
        int RuasTab;
        int TinggiTab;
        final float phi = 3.14f;

        public BangunTabung(int Ruas , int Tinggi){
            this.RuasTab = Ruas;
            this.TinggiTab = Tinggi ;
        }

        float LuasTabunga(){
            System.out.println("");
            float LuasTabung = (float)2*phi*RuasTab*(RuasTab+TinggiTab);
            return LuasTabung;
        }

        float VolumeTabunga(){
            System.out.println("");
            float VolumeTabung = (float)phi*RuasTab*RuasTab*TinggiTab;
            return VolumeTabung;
        }
    }
}
