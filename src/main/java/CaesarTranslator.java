/**
 * Created by jakala on 2017-03-16.
 */
public class CaesarTranslator implements Translator {

    int nSteps;
    String alphabet;

    public char translate(char c) {
        return alphabet.charAt((alphabet.indexOf(c) + nSteps) % alphabet.length());
    }

    CaesarTranslator(int nSteps) {
        this.nSteps = nSteps;
        populateAlphabet();
    }

    void populateAlphabet() {
        alphabet = "abcdefghijklmnopqrstuvxyz";
    }

}
