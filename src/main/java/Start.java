import java.util.Arrays;
import java.util.stream.Collectors;

public class Start {

    public static String spacify(String str){
        return Arrays.asList(str.split("")).stream().map(letter -> letter+" ").collect( Collectors.joining( "" ) ).trim();
    }


}
