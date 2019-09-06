public class FakeBinary {
    public static String fakeBin(String numberString) {
        String cadena1 = numberString.replaceAll("[0-4]","0");
        String cadena2 = cadena1.replaceAll("[5-9]","1");
        return cadena2;
    }
}