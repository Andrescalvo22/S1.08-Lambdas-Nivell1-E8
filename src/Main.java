public class Main {
    public static void main(String[] args) {
        StringList reverser = (text) -> {
            StringBuilder stringBuilder = new StringBuilder(text);
            return stringBuilder.reverse().toString();
        };
        System.out.println(reverser.reverse("Hello"));
    }
}


