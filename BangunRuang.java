package src;
import java.util.Scanner;

public class BangunRuang {
    public static void main (String [] args){
        int Pilihan = 0;
        Scanner UserInput = new Scanner(System.in);

        while (Pilihan != 4){
            System.out.println("Menu : ");
            System.out.println("1.Eksekusi Program Mencari Volume dan Luas Balok");
            System.out.println("2.Eksekusi Program Mencari Volume dan Luas Kubus");
            System.out.println("3.Eksekusi Program Mencari Volume dan Luas Tabung");
            System.out.println("4.Exit");
            System.out.println("\nMasukkan Pilihan : ");
            Pilihan = UserInput.nextInt();

            if (Pilihan == 1){
                int P;
                int L;
                int T;

                System.out.println("Ini adalah Program untuk mencari Luas dan Volume dari bangun Balok");
                System.out.print("Masukkan Panjang dari Balok : ");
                P = UserInput.nextInt();

                System.out.print("Masukkan Lebar dari Balok   : ");
                L = UserInput.nextInt();

                System.out.print("Masukkan Tinggi dari Balok  : ");
                T = UserInput.nextInt();

                System.out.println("");
                int LuasBalok = 2 * (P*L + P*T + L*T);
                int VolumeBalok = P*L*T;

                System.out.println("Luas  dari Balok adalah  : " + LuasBalok);
                System.out.println("Volume dari Balok adalah : " + VolumeBalok);
                System.out.println();
            }

            else if(Pilihan == 2){
                int sisi;
                System.out.println("Ini adalah Program untuk mencari Luas dan Volume dari bangun Kubus");
                System.out.print("Masukkan Sisi dari Kubus : ");
                sisi = UserInput.nextInt();
                System.out.println("");
                
                int LuasKubus = 6*sisi*sisi;
                int VolumeKubus = sisi*sisi*sisi;

                System.out.println("Luas  dari Balok adalah  : " + LuasKubus);
                System.out.println("Volume dari Balok adalah : " + VolumeKubus);
                System.out.println();
            }

            else if( Pilihan == 3){
                float Phi = 3.14f;
                int RuasTabung;
                int TinggiTabung;
                
                System.out.println("Ini adalah Program untuk mencari Luas dan Volume dari bangun Tabung");
                System.out.print("Masukkan Ruas dari Tabung : ");
                RuasTabung = UserInput.nextInt();

                System.out.print("Masukkan Tinggi dari Tabung : ");
                TinggiTabung = UserInput.nextInt();
                System.out.println("");

                float LuasTabung = (float)2*Phi*RuasTabung*(RuasTabung+TinggiTabung);
                float VolumeTabung = (float)Phi*RuasTabung*RuasTabung*TinggiTabung;

                System.out.println("Luas  dari Tabung adalah  : " + LuasTabung);
                System.out.println("Volume dari Tabung adalah : " + VolumeTabung);
                System.out.println(); 
            }
            else{
                System.out.println("Maaf,Input yang anda masukkan salah atau tidak tersedia diformat mohon dicoba lagi .....");
                System.out.println();
            }
        }
        UserInput.close();
    }
}

