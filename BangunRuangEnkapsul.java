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
                BangunBalok balok = new BangunBalok();
                System.out.println(balok.toString());
                System.out.println("Luas  dari Balok adalah  : " + balok.LuasBaloka());
                System.out.println("Volume dari Balok adalah : " + balok.VolumeBaloka());
                System.out.println();
            }

            else if(Pilihan == 2){
                BangunKubus kubus = new BangunKubus();
                System.out.println(kubus.toString());
                System.out.println("Luas  dari Kubus adalah  : " + kubus.LuasKubusa());
                System.out.println("Volume dari Kubus adalah : " + kubus.VolumeKubusa());
                System.out.println();
            }

            else if( Pilihan == 3){
                BangunTabung tabung = new BangunTabung();
                System.out.println(tabung.toString());
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

