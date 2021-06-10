package src;
public class Balok {
    public static class BangunBalok{
        int P;
        int L;
        int T;


        public BangunBalok(int p , int l , int t){
            this.P = p ;
            this.L = l ;
            this.T = t ;
        }

        int LuasBaloka(){
            System.out.println("");
            int LuasBaloks = 2 * (P*L + P*T + L*T);
            return LuasBaloks;
        }

        int VolumeBaloka(){
            System.out.println("");
            int VolumeBalok = P*L*T;
            return VolumeBalok;
        }
    }
}
