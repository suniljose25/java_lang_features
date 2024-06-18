package textblocks;

public class Main {
    public static void main(String[] args) {
        // Strips the space before the content to the level, that least indented.
        String html = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>""";
        System.out.println(html);

        System.out.println("--------------------------");

        String htmlWithIncorrectFormatting = """
                    <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                """;
        System.out.println(htmlWithIncorrectFormatting);
        System.out.println("End");
    }
}
