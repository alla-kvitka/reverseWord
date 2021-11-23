public class ReverseCharacters {
    public static String readScanner(String data) {
        String[] lines = data.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append(reverseArray(line)).append(" ");
        }
        return sb.toString();
    }

    public static String reverseArray(String word) {
        StringBuilder result = new StringBuilder();
        char[] symbols = word.toCharArray();
        char[] points = {'.'};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < symbols.length; i++) {
            if (Character.isLetter(symbols[i])) {
                sb.append(symbols[i]);
                symbols[i] = points[0];
            }
        }
        char[] reverseLetters = reverseWord(sb.toString()).toCharArray();
        for (char reverseLetter : reverseLetters) {
            for (int i = 0; i < symbols.length; i++) {
                if (symbols[i] == points[0]) {
                    symbols[i] = reverseLetter;
                    break;
                }
            }
        }
        for (char symbol : symbols) {
            result.append(symbol);
        }
        return result.toString();
    }

    public static String reverseWord(String sb) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] reversedSymbols = sb.toCharArray();
        for (int i = reversedSymbols.length - 1; i >= 0; i--) {
            stringBuilder.append(reversedSymbols[i]);
        }
        return stringBuilder.toString();
    }
}
