public class ReverseCharacters {

    public String reverseStringData(String data) {
        String[] words = data.split("\\s+");
        StringBuilder reverseStringResult = new StringBuilder();
        for (String word : words) {
            reverseStringResult.append(reverseWord(word)).append(" ");
        }
        return reverseStringResult.toString();
    }

    private String reverseWord(String word) {
        StringBuilder reverseWordResult = new StringBuilder();
        char[] symbols = word.toCharArray();
        char[] points = {'.'};
        StringBuilder letters = new StringBuilder();
        for (int i = 0; i < symbols.length; i++) {
            if (Character.isLetter(symbols[i])) {
                letters.append(symbols[i]);
                symbols[i] = points[0];
            }
        }
        char[] reverseLetters = reverseLetter(letters.toString()).toCharArray();
        for (char reverseLetter : reverseLetters) {
            for (int i = 0; i < symbols.length; i++) {
                if (symbols[i] == points[0]) {
                    symbols[i] = reverseLetter;
                    break;
                }
            }
        }
        for (char symbol : symbols) {
            reverseWordResult.append(symbol);
        }
        return reverseWordResult.toString();
    }

    private String reverseLetter(String letters) {
        StringBuilder reverseLettersResult = new StringBuilder();
        char[] lettersArray = letters.toCharArray();
        for (int i = lettersArray.length - 1; i >= 0; i--) {
            reverseLettersResult.append(lettersArray[i]);
        }
        return reverseLettersResult.toString();
    }
}