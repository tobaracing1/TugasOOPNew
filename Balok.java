package src;
import java.util.Scanner;

public class Balok {
    public static void main (String [] args){
        int P;
        int L;
        int T;
        int Pilihan = 0;
        Scanner UserInput = new Scanner(System.in);

        while (Pilihan != 2){
            System.out.println("Menu : ");
            System.out.println("1.Eksekusi Program Mencari Volume dan Luas Balok");
            System.out.println("2.Exit");
            System.out.println("\nMasukkan Pilihan : ");
            Pilihan = UserInput.nextInt();

            if (Pilihan == 1){
                System.out.println("Ini adalah Program untuk mencari Luas dan Volume dari bangun Balok");
                System.out.print("Masukkan Panjang dari Balok : ");
                P = UserInput.nextInt();

                System.out.print("Masukkan Lebar dari Balok   : ");
                L = UserInput.nextInt();

                System.out.print("Masukkan Tinggi dari Balok  : ");
                T = UserInput.nextInt();

                System.out.println("");
                int Luas = 2 * (P*L + P*T + L*T);
                int Volume = P*L*T;

                System.out.println("Luas  dari Balok adalah  : " + Luas);
                System.out.println("Volume dari Balok adalah : " + Volume);
                System.out.println();
            }
        }
        UserInput.close();
    }
}

