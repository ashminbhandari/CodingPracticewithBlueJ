
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reversed = "";
        for (int i = valueToBeReversed.length() - 1; i >=0; i--) {
            reversed += valueToBeReversed.charAt(i);
        }
        return reversed;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        return word.charAt(word.length()/2);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String ret = "";
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) != charToRemove) {
                ret += value.charAt(i);
            }
        }
        return ret;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        int idx = sentence.length() - 1;
        while (sentence.charAt(idx) != ' ') {
            idx--;
        }
        return sentence.substring(idx + 1);
    }
}
