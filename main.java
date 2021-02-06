
import java.util.Scanner;
import java.lang.Object;
import org.apache.commons.lang3.StringUtils;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Make a joke!");
//        String joke = input.nextLine();
        commenting();


    }

    public static String makeJoke() {
        Scanner input = new Scanner(System.in);
        System.out.println("Make a joke!");
        String joke = input.nextLine();
        return joke;
    }

    public static void commenting() {
        Scanner input = new Scanner(System.in);
        System.out.println("Comment!");
        String comment = input.nextLine();
        if (comment.containsIgnoreCase("nigger")) {
            comment = comment.replace("nigger", "******");
            System.out.println(comment);
        } else if (comment.contains("retard")) {
            comment = comment.replace("retard", "******");
            System.out.println(comment);
        } else if (comment.contains("faggot")) {
            comment = comment.replace("faggot", "******");
            System.out.println(comment);
        } else if (comment.contains("spic")) {
            comment = comment.replace("spic", "****");
            System.out.println(comment);
        } else if (comment.contains("cunt")) {
            comment = comment.replace("cunt", "****");
            System.out.println(comment);
        } else if (comment.contains("fag")) {
            comment = comment.replace("fag", "***");
            System.out.println(comment);
        } else if (comment.contains("negro")) {
            comment = comment.replace("negro", "*****");
            System.out.println(comment);
        }
    }

    public static boolean containsConverting(String src, String what) {
        return src.toLowerCase().contains(what.toLowerCase());
    }

    public static void attachFile() {

    }
}
