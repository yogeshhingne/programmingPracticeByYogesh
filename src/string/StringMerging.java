package string;

public class StringMerging {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Yogesh ");
        StringBuffer s1=new StringBuffer("Hingne");
        s.append(s1);
        System.out.println(s);
    }
}
