import java.lang.reflect.Array;

/**
 * Created by jakala on 2017-03-16.
 */
public class CaesarTranslator implements Translator {

    int nSteps;
    char[] alphabet;

    public Character translate(Character c) {
        for(int i=0; i<alphabet.length; i++) {
            System.out.println("index: " + i + ", represents: " + alphabet[i]);
            if(c == alphabet[i]) {
                System.out.println("found a match for " + c);
                return alphabet[i + nSteps];
            }
        }
        return null;
    }

    CaesarTranslator(int nSteps) {
        this.nSteps = nSteps;
        populateAlphabet();
    }

    void populateAlphabet() {
        alphabet = new char[25];
        for(int i=0; i<alphabet.length; i++) {
            alphabet[i] = (char) ('a' + i);
        };
    }

}
