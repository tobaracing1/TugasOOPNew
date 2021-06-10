package src;
import java.util.Scanner;
public class Kubus {
    public static class BangunKubus{
        int S;
        Scanner UserInput = new Scanner(System.in);

        BangunKubus(){
            System.out.println("Ini adalah Program untuk mencari Luas dan Volume dari bangun Kubus");
            System.out.print("Masukkan Sisi dari Kubus : ");
            S = UserInput.nextInt();
            System.out.println("");
        }

        public void setS(int S){
            this.S = S;
        }
        public int getS(){
            return S;
        }
    
        int LuasKubusa(){
            System.out.println("");
            int LuasKubus = 6*S*S;
            return LuasKubus;
        }
    
        int VolumeKubusa(){
            int VolumeKubus = S*S*S;
            return VolumeKubus;
        }

        @Override
        public String toString() {
            return "\nSisi : " + S ;
    }

    }
}
