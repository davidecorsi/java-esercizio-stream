import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * Trasformate questa lista aggiungendo degli apici singoli all'inizio ed alla fine di ogni stringa. 
 */
public class Main {
	public static void main(String[] args) {
		String[] stringArray = new String[] {"gli", "stream", "ti", "permettono", "di", "compattare", "il",
		"codice"};
		
		List<String> stringList = Arrays.stream(stringArray)
				.map(s -> "'" + s + "'")
				.collect(Collectors.toList());
		
		stringList.forEach(System.out::println);
	}
}
