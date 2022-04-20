package string;

public class IsDigit {
    private static boolean isNumeric(final CharSequence cs) {
//        if (isEmpty(cs)) {
//            return false;
//        }
        final int sz = cs.length();
        for (int i = 0; i < sz; i++) {
            if (!Character.isDigit(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNumeric("1120"));

    }
}
