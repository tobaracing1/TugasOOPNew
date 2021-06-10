package src;
import java.util.Scanner;
public class Tabung {
    public static class BangunTabung{
        int RuasTab;
        int TinggiTab;
        final float phi = 3.14f;
        Scanner UserInput = new Scanner (System.in);
        public BangunTabung(){
            System.out.println("Ini adalah Program untuk mencari Luas dan Volume dari bangun Tabung");
            System.out.print("Masukkan Ruas dari Tabung : ");
            RuasTab = UserInput.nextInt();

            System.out.print("Masukkan Tinggi dari Tabung : ");
            TinggiTab = UserInput.nextInt();
            System.out.println("");
        }

        public void setRuasTab(int Ruas){
            this.RuasTab = Ruas;
        }
        public int getRuasTab(){
            return RuasTab;
        }

        public void setTinggiTab(int Tinggi){
            this.TinggiTab = Tinggi;
        }
        public int getTinggiTab(){
            return TinggiTab;
        }


        float LuasTabunga(){
            System.out.println("");
            float LuasTabung = (float)2*phi*RuasTab*(RuasTab+TinggiTab);
            return LuasTabung;
        }

        float VolumeTabunga(){
            float VolumeTabung = (float)phi*RuasTab*RuasTab*TinggiTab;
            return VolumeTabung;
        }

        @Override
        public String toString() {
            return "\nRuas Tab : " + RuasTab + 
                "\nTinggi Tab : " + TinggiTab;
        }
        
    }
}
