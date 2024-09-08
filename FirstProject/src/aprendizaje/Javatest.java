package aprendizaje;
public class Javatest {
    public static void main(String[] args) {
        char [] word = "The quick brow fox".toCharArray();
        
        for (int i = word.length -1; i >=0; i--) {
            System.out.println(word[i]);
        }
    }
}
