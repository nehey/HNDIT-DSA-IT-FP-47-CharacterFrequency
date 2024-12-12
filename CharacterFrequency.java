package BAT_IT_2022_P_47;

import java.util.HashMap;

public class CharacterFrequency {

    public static void main(String[] args) {
        String input = "banana";
        
        // Call the function to count character frequencies
        HashMap<Character, Integer> freqMap = countCharacterFrequency(input);
        
        // Print the result
        System.out.println(freqMap);
    }
    
    public static HashMap<Character, Integer> countCharacterFrequency(String input) {
        // Create a HashMap to store the frequency of characters
        HashMap<Character, Integer> freqMap = new HashMap<>();
        
        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            // If the character is already in the map, increment its count
            if (freqMap.containsKey(c)) {
                freqMap.put(c, freqMap.get(c) + 1);
            } else {
                // If the character is not in the map, add it with a count of 1
                freqMap.put(c, 1);
            }
        }
        
        return freqMap;
    }
}