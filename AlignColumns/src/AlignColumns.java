import org.junit.platform.console.shadow.picocli.CommandLine.Help.Ansi.Text;

public class AlignColumns {

    public static String replaceDollarBySpace (String text) { 
        String result = text.replace("$", " ");
        return result.replace("  ", "$ ");
    }

    public static String align(String text) {
        String textReplaced = replaceDollarBySpace(text);
        String[] allLines = textReplaced.split("\n");

        return "a";
    }
}