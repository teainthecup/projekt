public class PoleCisel {

    private int[] poleCisel;

    public PoleCisel(int max){
        poleCisel = new int[max];
    }

    public boolean pridatCislo(int cislo){
        for (int i = 0; i < poleCisel.length; i++) {
            if(poleCisel[i] == 0){
                poleCisel[i] = cislo;
                return true;
            }
        }
        return false;
    }


}
