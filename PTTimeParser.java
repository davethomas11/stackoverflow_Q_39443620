import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PTTimeParser {
	
	public static PTTime parseTime(String duracaoStr) {

		// Create a Pattern object
	    Pattern pattern = Pattern.compile("PT(\\d+H)?(\\d+M)?(\\d+S)?");
	    // Now create matcher object.
	    Matcher matcher = pattern.matcher(duracaoStr);

	    int hour = 0;
	    int minute = 0;
	    int second = 0;
	    if(matcher.matches()){
	        for(int i = 1; i<=matcher.groupCount();i++){
	            String group = matcher.group(i);
	            int number = new Integer(group.substring(0, group.length()-1));
	            if(matcher.group(i).endsWith("H")){
	                hour = number;
	            } else if(matcher.group(i).endsWith("M")){
	                minute = number;
	            } else if(matcher.group(i).endsWith("S")){
	                second = number;
	            } 
	        }
	    }

	    return new PTTime(hour, minute, second);
	}
}