package training.refactor.d1_extract;

public class MainD {

    public static void main(String[] args) {
        String output = FilenameUtils.generateJavaFilename("Hey, what is going on?!");
        System.out.println(output);
    }

}
