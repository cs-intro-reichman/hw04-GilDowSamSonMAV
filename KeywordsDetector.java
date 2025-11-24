
public class KeywordsDetector {

    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            String sr = sentences[i];
            for (int j = 0; j < keywords.length; j++) {
                // if (sentences[i].toLowerCase().contains(keywords[j].toLowerCase())) {
                if (contains(sentences[i].toLowerCase(), keywords[j].toLowerCase())) {
                    System.out.println(sentences[i]);
                }
            }
        }
        /*
        Go over each sentence
            search for the first index of the keywords
            after that look if the word found in the sentence is equal to the keyword 

         */
    }

    public static boolean contains(String s1, String s2) {
        for (int i = 0; i < s1.length() - s2.length(); i++) {
            if (s2.charAt(0) == s1.charAt(i)) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s2.charAt(j) != s1.charAt(i + j)) {
                        break;
                    }
                    if (s2.length() - 1 == j) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
