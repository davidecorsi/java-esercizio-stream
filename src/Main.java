import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * Trasformate una lista di stringhe in una mappa dove la chiave sono le stringhe racchiuse tra apici 
 * singoli e il valore è la lunghezza della stringa stessa, inoltre la mappa deve essere ordinata. 
 * Utilizzate gli stream.
 */
public class Main {
	public static void main(String[] args) {
		String[] stringArray = new String[] {"gli", "stream", "ti", "permettono", "di", "compattare", "il",
		"codice"};
		
		Map<String, Integer> map = Arrays.stream(stringArray)
				.collect(Collectors.toMap(s -> "'" + s + "'", String::length, (v1 , v2) -> v1, TreeMap::new));
		
		System.out.println(map);
	}
}
