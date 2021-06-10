package src;
import src.Kubus.BangunKubus;
import src.Balok.BangunBalok;
import src.Tabung.BangunTabung;
import java.util.Scanner;


public class BangunRuangEnkapsul {
    public static void main(String[] aaa){
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
            System.out.println("");

            if (Pilihan == 1){
                int pa;
                int le;
                int ti;
                System.out.println("Ini adalah Program untuk mencari Luas dan Volume dari bangun Balok");
                System.out.print("Masukkan Panjang dari Balok : ");
                pa= UserInput.nextInt();
                
                System.out.print("Masukkan Lebar dari Balok   : ");
                le= UserInput.nextInt();

                System.out.print("Masukkan Tinggi dari Balok  : ");
                ti = UserInput.nextInt();
                BangunBalok balok = new BangunBalok(pa, le, ti);

                System.out.println("Luas  dari Balok adalah  : " + balok.LuasBaloka());
                System.out.println("Volume dari Balok adalah : " + balok.VolumeBaloka());
                System.out.println();
            }

            else if(Pilihan == 2){
                int sisi;
                System.out.println("Ini adalah Program untuk mencari Luas dan Volume dari bangun Kubus");
                System.out.print("Masukkan Sisi dari Kubus : ");
                sisi = UserInput.nextInt();
                System.out.println("");
                
                BangunKubus kubus = new BangunKubus(sisi);

                System.out.println("Luas  dari Kubus adalah  : " + kubus.LuasKubusa());
                System.out.println("Volume dari Kubus adalah : " + kubus.VolumeKubusa());
                System.out.println();
            }

            else if( Pilihan == 3){
                int RuasTabung;
                int TinggiTabung;
                
                System.out.println("Ini adalah Program untuk mencari Luas dan Volume dari bangun Tabung");
                System.out.print("Masukkan Ruas dari Tabung : ");
                RuasTabung = UserInput.nextInt();

                System.out.print("Masukkan Tinggi dari Tabung : ");
                TinggiTabung = UserInput.nextInt();
                System.out.println("");

                BangunTabung tabung = new BangunTabung(RuasTabung, TinggiTabung);
                System.out.println("Luas  dari Tabung adalah  : " + tabung.LuasTabunga());
                System.out.println("Volume dari Tabung adalah : " + tabung.VolumeTabunga());
                System.out.println(); 
            }
            
            else if (Pilihan == 4){
                break;
            }

            else{
                System.out.println("Maaf,Input yang anda masukkan salah atau tidak tersedia diformat mohon dicoba lagi .....");
                System.out.println();
            }
        }
        UserInput.close();
    }

    }

