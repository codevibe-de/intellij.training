package training.refactor.d_extract;

import java.util.Arrays;
import java.util.stream.Collectors;

//
public class FilenameUtils {
	
	/**
	 * Accepts some random String like "Psionic Hyper Engine, v2" and generates a valid Java 
	 * class-filename like "PsionicHyperEngineV2.java"
	 */
	public static String generateJavaFilename(String s) {
		// 
		String[] parts = s.split("[^\\w]+");
		
		// 
		for (int i = 0; i < parts.length; i++) {
			String p = parts[i].toLowerCase();
			parts[i] = Character.toUpperCase(p.charAt(0)) + p.substring(1); 
		}
		return Arrays.stream(parts).collect(Collectors.joining("")) + ".java";
	}

}
