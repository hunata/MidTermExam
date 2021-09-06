import java.util.Locale;

public class App {
    public static void main(String[] args) {
        String s = "You Only Live Once. But if You do it right. once is Enough";
        int ret1 = countUppercase(s);
        System.out.format("Chuỗi có %d ký tự in hoa\n", ret1);
        String ret2 = convertToUpperCase(s);
        System.out.println(ret2);
        String s2 = convertToUpperCase1(s);
        System.out.println("\n"+s2);

    }

    public static int countUppercase(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (Character.isUpperCase(s.charAt(i))) {
                count = count + 1;
            }
        return count;
    }
//    public static String convertToUpperCase(String s) {
//        String[] arr = s.split(" ");
//        StringBuffer sb = new StringBuffer();
//
//        for (int i = 0; i < arr.length; i++) {
//            sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
//        }
//        return sb.toString().trim();
//    }
    public static String convertToUpperCase(String s){
        String ret = "";
        String[] arr = s.split(" ");
        for(int i = 0; i< arr.length; i++){
            String firstLetter = arr[i].substring(0,1).toUpperCase();
            String remainingLetter = arr[i].substring(1);
            ret +=  firstLetter + remainingLetter + " ";
        }
        return ret.trim();
    }
    public static String convertToUpperCase1(String s){
        String ret = "";
        String[] arr = s.split("\\. ");
        for(int i = 0; i< arr.length; i++){
            String firstLetter = arr[i].substring(0,1).toUpperCase();
            String remainingLetter = arr[i].substring(1).toLowerCase();
            ret +=  firstLetter + remainingLetter + ". ";
        }
        return ret.substring(0,ret.length()-2);
    }

}
