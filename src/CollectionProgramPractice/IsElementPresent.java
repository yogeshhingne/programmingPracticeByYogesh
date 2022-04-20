package CollectionProgramPractice;

import java.util.Arrays;
import java.util.List;

public class IsElementPresent {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Gayatri","Jagruti","Jayashri","Yogesh");
        boolean check=list.contains("Gayatri");
        if(check){
            System.out.println("present");
        }
        else
            System.out.println("absent");
    }
}
