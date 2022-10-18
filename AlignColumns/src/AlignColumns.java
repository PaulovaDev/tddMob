public class AlignColumns {

    public static String replaceDollarBySpace (String text) { 
        String result = text.replace("$", " ");
        return result.replace("  ", "$ ");
    }

}

//[Cuesta$20, todo]
