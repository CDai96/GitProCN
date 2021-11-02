public class Greeter {
<<<<<<< HEAD
    public static void greeter(String name){

        System.out.println("Greetings ");

        System.out.println("Greetings " + name);

=======
    public static void greeter(String name, String greetWord){
        System.out.println(greetWord +  "! " + name);
>>>>>>> 3819cd93e45bdbd44c0e648e3287154687caa016
    }

    public static void main(String[] args) {
        greeter("Mike", "Nihao");
    }
}
