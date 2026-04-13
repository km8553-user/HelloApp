public class HelloApp {
    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        // Check if no arguments are provided
        if (args.length == 0) {
            names.append("World");
        } else {
            // Enhanced for loop (for-each)
            boolean first = true;

            for (String name : args) {
                if (!first) {
                    names.append(", ");
                }
                names.append(name);
                first = false;
            }
        }

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}