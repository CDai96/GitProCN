public class Cheerer {
    public static void cheer(String teamName, String name){
        System.out.println("We are " + teamName);
        System.out.println(name);
    }

    public static void main(String[] args) {
        cheer("java lovers", "Garrison");
    }
}