package clase;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("0?[1-9]|[12][0-9]|3[01]"); //regex es foo
		Matcher matcher = pattern.matcher("Vamos a buscar vena, 10 y cena en este string");
		
		while (matcher.find())
			System.out.println("Encontrams la regex " + matcher.group()+ " en "+matcher.start()+" y termina en "+matcher.end());
		
	}

}
