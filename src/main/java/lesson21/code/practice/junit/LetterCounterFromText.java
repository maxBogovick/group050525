package lesson21.code.practice.junit;

public class LetterCounterFromText {

    public int countLetter(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);

            if (currentLetter == 'a' ||
                    currentLetter == 'o' ||
                    currentLetter == 'i' ||
                    currentLetter == 'e' ||
                    currentLetter == 'u' ||
                    currentLetter == 'y') {
                count++;
            }
        }

        return count;
    }
}
