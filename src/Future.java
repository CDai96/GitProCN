public class Future {
    public static void main(String[] args) {
        String horoscope = "Le  o";
        String garrisonHoroscope = "ox";
        String mikeHoroscope = "rat";
        printHoroscope(horoscope,2);
        printHoroscope(garrisonHoroscope);
    }

    private static void printHoroscope(String horoscope, int randomNumber) {
        System.out.println("Horoscope sign: " + horoscope);
    }
}
