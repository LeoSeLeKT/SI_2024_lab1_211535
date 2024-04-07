import java.util.List;

public class SILab1_2 {

    private static String makeBigStringFrom (List<String> list, int minLength) {
        StringBuilder sb = new StringBuilder();
        for (String el : list) {
            if (el.length() >= minLength) { //tuka >=
                sb.append(el);
            }
        }
        return sb.toString();
    }
}