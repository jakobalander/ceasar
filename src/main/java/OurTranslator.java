/**
 * Created by jakala on 2017-03-16.
 */
public class OurTranslator {
    public static void main(String[] args) {
        Translator trans = new CaesarTranslator(3);
        Character c = trans.translate('h');
        System.out.println(c);
    }
}
