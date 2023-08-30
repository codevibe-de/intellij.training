package training.refactor.d1_extract;

import java.util.Arrays;
import java.util.stream.Collectors;

//
public class FilenameUtils {

    /**
     * Accepts some random String like "Psionic Hyper Engine, v2" and generates a valid Java
     * class-filename like "PsionicHyperEngineV2.java"
     */
    public static String generateJavaFilename(String s) {
        // TODO extract the regexp into a constant
        String[] parts = s.split("[^\\w]+");

        // TODO extract the for loop into a separate method
        for (int i = 0; i < parts.length; i++) {
            String p = parts[i].toLowerCase();
            parts[i] = Character.toUpperCase(p.charAt(0)) + p.substring(1);
        }

        // TODO extract the `Collectors.joining(..)` expression into a variable
        // TODO extract the ".java" string into a parameter
        return Arrays.stream(parts).collect(Collectors.joining("")) + ".java";
    }

}
