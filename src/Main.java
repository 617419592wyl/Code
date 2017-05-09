//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Main {
//    public static List<String> list = new ArrayList<String>();
//    public static String a;
//    public static String b;
//
//    /** 请完成下面这个函数，实现题目要求的功能 **/
//    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
//    public static void match(String str, String nstr) {
//           Random r = new Random();
//
//           for(int i=0;i<nstr.length()-1;i++){
//              if(i<3) {
//                  int x = r.nextInt(5) + 1;
//              }
//               int x=r.nextInt(6);
//           }
//    }
//
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        a = s.next();
//        b = s.next();
//        match("", "123455");
//        System.out.println(list.size());
//    }
//}

//
//public class Main {
//
///** 请完成下面这个函数，实现题目要求的功能 **/
//    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
//    static int[] wordCount(String doc, int m, int n, String[] filterWords, String[] countwords) {
//
//
//    }
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int[] res;
//
//        String _doc;
//        try {
//            _doc = in.nextLine();
//        } catch (Exception e) {
//            _doc = null;
//        }
//
//        int _m;
//        _m = Integer.parseInt(in.nextLine().trim());
//
//        int _n;
//        _n = Integer.parseInt(in.nextLine().trim());
//
//        int _filterWords_size = m;
//        _filterWords_size = Integer.parseInt(in.nextLine().trim());
//        String[] _filterWords = new String[_filterWords_size];
//        String _filterWords_item;
//        for(int _filterWords_i = 0; _filterWords_i < _filterWords_size; _filterWords_i++) {
//            try {
//                _filterWords_item = in.nextLine();
//            } catch (Exception e) {
//                _filterWords_item = null;
//            }
//            _filterWords[_filterWords_i] = _filterWords_item;
//        }
//
//        int _countwords_size = n;
//        _countwords_size = Integer.parseInt(in.nextLine().trim());
//        String[] _countwords = new String[_countwords_size];
//        String _countwords_item;
//        for(int _countwords_i = 0; _countwords_i < _countwords_size; _countwords_i++) {
//            try {
//                _countwords_item = in.nextLine();
//            } catch (Exception e) {
//                _countwords_item = null;
//            }
//            _countwords[_countwords_i] = _countwords_item;
//        }
//
//        res = wordCount(_doc, _m, _n, _filterWords, _countwords);
//        for(int res_i=0; res_i < res.length; res_i++) {
//            System.out.println(String.valueOf(res[res_i]));
//        }
//
//    }
//}
//import java.util.Scanner;
//
//
//public class Main {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Scanner cin = new Scanner(System.in);
//        int flag = cin.nextInt();
//        String str = cin.next();
//        if(flag == 0)
//            System.out.println(getShortStr(str));
//        else
//            System.out.println(getLong(str));
//
//    }
//
//    public static String getShortStr(String str){
//        String[] s = str.split(":");
//        String res = "";
//        for (int i = 0; i < s.length - 1; i++) {
//            int first = 0;
//            for (int j = 0; j < s[i].length() - 1; j++) {
//                while (s[i].charAt(j) == '0') {
//                    j++;
//                }
//                s[i] = s[i].substring(j);
//                break;
//            }
//            if (i == s.length - 1) res += s[i];
//            res += s[i];
//            res += ":";
//        }
//        return res;
//    }
//    public static String getLong(String str){
//        String res = "";
//        String[] s = str.split(":");
//        String temp = "000000";
//        for(int i = 0; i < s[i].length()-1;i++){
//            String sub = s[i];
//            if(sub.length()<6&& sub.length()!=0){
//                for(int j = 0; j < 6-sub.length();j++){
//                    res +='0';
//                }
//                res +=sub;
//                res +=':';
//            }else if(sub.length()==0)
//                res+=temp;
//            res +=':';
//
//        }
//
//        return res;
//
//    }
//}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer type = sc.nextInt();
//        String a=sc.nextLine();
        String str = sc.next();

        //压缩
        if (type == 0) {

            String[] s = str.split(":");
            String res = "";
            for (int i = 0; i < s.length - 1; i++) {
                int first = 0;
                for (int j = 0; j < s[i].length() - 1; j++) {
                    while (s[i].charAt(j) == '0') {
                        j++;
                    }
                    s[i] = s[i].substring(j);
                    break;
                }
                if (i == s.length - 1) res += s[i];
                res += s[i];
                res += ":";
            }
            System.out.println(res);
        } else if (type == 1) {
            if(str.charAt(str.length()-1)==':') str+="000000";
            String[] s = str.split(":");
            String res = "";

            for (int i = 0; i < s.length; i++){
                String mid="";
                for(int j=0;j<6-s[i].length();j++){
                   mid+="0";
                }
                mid+=s[i];
                if (i == s.length - 1) {res += mid;break;}
                res += mid;
                res += ":";
            }
            System.out.println(res);
        }
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] doc = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String sentence = scanner.nextLine();
            String[] words = sentence.split(" ");
            int num = scanner.nextInt();
            int c = num % 10;
            num /= 10;
            int b = num % 10;
            num /= 10;
            int a = num % 10;
            String s2 = doc[a] + doc[b] + doc[c];
            String s = scanner.nextLine();

            String result = "";
            int max = 0;
            for (String word : words) {
                int temp = max(word, s2);
                if (temp > max) {
                    result = word;
                    max = temp;
                }
            }
            System.out.println(result);
        }
    }

    private static int max(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) return 0;

        int max = 0;
        int[][] dp = new int[s1.length()][s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    if (i > 0 && j > 0) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = 1;
                    }
                } else {
                    dp[i][j] = 0;
                }
                if (dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }
        return max;
    }
}

//import java.util.Scanner;
////判断把激光炮放在车头x和车尾y两处的时候，能摧毁多少运输车，判断只要枚举一遍所有的运输车即可。
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()) {
//            int n = Integer.valueOf(in.nextLine());
//            int[] loca = new int[n];
//            int[] leng = new int[n];
//            for(int i = 0; i < n; i++){
//                loca[i] = in.nextInt();  //某个车头
//                leng[i] = loca[i] + in.nextInt();  //某个车尾
//            }
//            int h = 0;
//            for(int i = 0; i < n; i++) {
//                for(int j = i + 1; j < n; j++) {
//                    int hi = 0;
//                    for(int k = 0; k < n; k++) {
//                        if((loca[k] <= loca[i] && leng[k] >= loca[i]) || (loca[k] <= loca[j] && leng[k] >= loca[j])) {
//                            hi++;
//                        }
//                    }
//                    if(hi > h) {
//                        h = hi;
//                    }
//                }
//            }
//            System.out.println(h);
//        }
//        in.close();
//    }
//}
//
//
//
////import java.util.Scanner;
////public class Main {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int[][] cars=new int[n][2];
////        for(int i=0;i<n;i++){
////            cars[i][0]=sc.nextInt();
////            cars[i][1]=sc.nextInt();
////        }
////        if(cars.length==0)
////            System.out.println(0);
////        int max=1;
////        for(int i=0;i<n;i++){
////            for(int j=1;j<n-1;j++){
////                int[] temp;
////                if(cars[i][0]>cars[j][0]){
////                    temp=cars[i];
////                    cars[i]=cars[i+1];
////                    cars[i+1]=temp;
////                }
////            }
////        }
////    }
////}
////import java.util.HashMap;
////import java.util.Scanner;
////
////public class Main {
////    static double sum = 0;
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int p = sc.nextInt();
////        int q = sc.nextInt();
////        int n = sc.nextInt();
////        double pro = p / 100d;
////        double q1 = q / 100d;
////        total(pro, q1, 0, 0, 2, 1.0, pro);
////        System.out.printf("%.2f", sum);
////
////    }
////
////
////    public static void total(Double pro, Double q, int n, int depth, int target, Double totalpro, Double pp) {
////        if (n == target) {
////            sum += totalpro * depth;
////            return;
////        } else if (n < target) {
////            if (pro >= 1.0) {
////                double pronext = pp / Math.pow(2.0, n + 1);
////                total(pronext, q, n + 1, depth + 1, target, totalpro, pp);
////            } else {
////                total(((Double) pp / Math.pow(2.0, n + 1)), q, n + 1, depth + 1, target, totalpro * pro, pp);
////                total((pro + q), q, n, depth + 1, target, totalpro * (1 - pro), pp);
////            }
////        }
////    }
////}
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////
////            int p = sc.nextInt();
////            int q = sc.nextInt();
////            int n = sc.nextInt();
////
////            System.out.printf("%.2f", calculate(0, n, p, q, p, 0, true));
////
////
////    }
////
////    private static double calculate(int cur, int des, int p, int q, int prob, int length, boolean obtain) {
////        if (cur == des) return length;
////
////        int p1, p2;
////        double res1, res2;
////        if (obtain) {
////            p1 = p / (1 << cur);
////            res1 = calculate(cur + 1, des, p, q, p1, length + 1, true);
////
////            p2 = 100 - p1;
////            res2 = calculate(cur, des, p, q, p2, length + 1, false);
////        } else {
////            p1 = prob + q;
////            p1 = p1 < 100 ? p1 : 100;
////            res1 = calculate(cur + 1, des, p, q, p1, length + 1, true);
////
////            p2 = 100 - p1;
////            res2 = 0D;
////            if (p2 > 0) {
////                res2 = calculate(cur, des, p, q, p2, length + 1, false);
////            }
////        }
////        return (res1 * p1 / 100D) + (res2 * p2 / 100D);
////    }
//
//
//
////import java.util.*;
////
////public class Main {
////    public static void main(String[] args){
////        Scanner in = new Scanner(System.in);
////        String num = in.nextLine();
////        String[] nums = num.split(" ");
////        int libNum = Integer.parseInt(nums[0]);
////        int queryNum = Integer.parseInt(nums[1]);
////        String[] libs = new String[libNum];
////        String[] querys = new String[queryNum];
////        for (int i = 0; i < libNum; i++)
////            libs[i] = in.nextLine();
////        for (int i = 0; i < queryNum; i++)
////            querys[i] = in.nextLine();
////        Map<String, Set<Integer>> allMap = new HashMap<>();
////        for (int i = 0; i < libNum; i++) {
////            String[] words = libs[i].split(" ");
////            for (String word : words) {
////                Set<Integer> wordSet;
////                if (allMap.containsKey(word)) {
////                    wordSet = allMap.get(word);
////                } else {
////                    wordSet = new HashSet<>();
////                    allMap.put(word, wordSet);
////                }
////                wordSet.add(i);
////            }
////        }
////        for (int i = 0; i < queryNum; i++) {
////            int[] recorder = new int[libNum];
////            String[] queryWords = querys[i].split(" ");
////            Set<String> querySet = new HashSet<>();
////            for (String queryWord : queryWords) {
////                if (querySet.add(queryWord) && allMap.containsKey(queryWord)) {
////                    Set<Integer> wordSet = allMap.get(queryWord);
////                    for (int libIndex : wordSet) {
////                        recorder[libIndex]++;
////                    }
////                }
////            }
////            int max = -1, maxLib = -1;
////            for (int j = 0; j < libNum; j++) {
////                if (recorder[j] > max) {
////                    max = recorder[j];
////                    maxLib = j;
////                }
////            }
////            System.out.println(libs[maxLib]);
////        }
////    }
////}
//
////        Arrays.sort(a);
////        if(sum%2==1) {System.out.println(-1);}
////        if(a[n-1]>(sum/2)) System.out.println(-1);
////       else{ int  half=sum/2;
////        int x=0;
////        System.out.println(find(x,half,n-1,a,half));}
//
