/**
 * Created by Administrator on 2016/11/23.
 */
public class Num12 {
    private static String[] g = {"", "I","II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static String[] s = {"", "X","XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static String[] b = {"", "C","CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static String[] q = {"", "M","MM", "MMM"};

    public String intToRoman(int num) {

        StringBuilder roman = new StringBuilder();
        return roman.append(q[num / 1000])
                .append(b[num / 100 % 10])
                .append(s[num / 10 % 10])
                .append(g[num % 10]).toString();
    }
}
