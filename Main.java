public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println(" ");
            System.exit(1);
        }

        String str1 = args[0];
        String str2 = args[1];

        System.out.println("The first string is " + str1);
        System.out.println("The second string is " + str2);
    }
}
