package seminar4;

public class PrintFormat {
    public static String printStrFormatted(String str, int length){
        String whitespace = " ";
        String result;
        if (str.length() < length) {
            result = str + whitespace.repeat(length - str.length());
        } else {
            result = str;
        }
    return result;
    }
}
