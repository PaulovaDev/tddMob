public class AlignColumns {

    public static String align(String text) {

        if (text.contains("$$")) {
            String[] subStrings = text.split("$$");
            for (String string : subStrings) {
                string = string.replace("$", " ");
                
            }
        }
        return text.replace("$", " ");
    }
}

//[Cuesta$20, todo]
