package chapter_one;

public class PhraseOMatic {
    public static void main(String[] args) {

        // Make three sets of words to choose from
        String[] wordListOne = {"24/7", "12.000.000", "auto products", "Berlin", "Oxford"};

        String[] wordListTwo = {"Pierwszy element", "LAB", "Enum", "Spring", "Maven"};

        String[] wordListThree = {"proces", "java", "365", "tablica"};

        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // print out the phrase
        System.out.println("What we need is a: " + phrase);
    }
}
