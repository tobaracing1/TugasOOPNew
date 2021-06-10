package src;

public class Kubus {
    public static class BangunKubus{
        int S;
        BangunKubus(int s){
            this.S = s ;
        }
    
        int LuasKubusa(){
            System.out.println("");
            int LuasKubus = 6*S*S;
            return LuasKubus;
        }
    
        int VolumeKubusa(){
            System.out.println("");
            int VolumeKubus = S*S*S;
            return VolumeKubus;
        }
    }
}
