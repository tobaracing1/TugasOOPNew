package src;
import java.util.Scanner;
public class Balok {
    public static class BangunBalok{
        int P;
        int L;
        int T;
        Scanner UserInput = new Scanner(System.in);

        public BangunBalok(){

            System.out.println("Ini adalah Program untuk mencari Luas dan Volume dari bangun Balok");
            System.out.print("Masukkan Panjang dari Balok : ");
            P= UserInput.nextInt();
                
            System.out.print("Masukkan Lebar dari Balok   : ");
            L= UserInput.nextInt();

            System.out.print("Masukkan Tinggi dari Balok  : ");
            T = UserInput.nextInt();
        }

        public void setP(int P){
            this.P = P;
        }
        public int getP(){
            return P;
        }

        public void setL(int L){
            this.L = L;
        }
        public int getL(){
            return L;
        }
        
        public void setT(int T){
            this.T = T;
        }
        public int getT(){
            return T;
        }

        int LuasBaloka(){
            System.out.println("");
            int LuasBaloks = 2 * (P*L + P*T + L*T);
            return LuasBaloks;
        }

        int VolumeBaloka(){
            int VolumeBalok = P*L*T;
            return VolumeBalok;
        }


        @Override
        public String toString() {
            return "\nPanjang : " + P + 
            "\nLebar : " + L + "\nTinggi : " + T ;
        }

    }
}
