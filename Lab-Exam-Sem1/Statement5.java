import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Statement5 {
    public static void main(String[] args) {
    //    List<String> companies = new ArrayList<>(Arrays.asList("Google","Apple","Microsoft","Amazon","Facebook"));
        List<String> companies = new ArrayList<>();
        Collections.addAll(companies,"Google","Apple","Microsoft","Amazon","Facebook");
        
       companies.add("CapGemini");
        
       System.out.println(companies);

       companies.set(2,"Barclays");
       System.out.println(companies);

       companies.remove(3);
       System.out.println(companies);

       List<String> sub_companies = new ArrayList<>(Arrays.asList("Walmart","Cognizant","HSBC"));
       companies.addAll(2,sub_companies);

       System.out.println(companies);
    }
}
