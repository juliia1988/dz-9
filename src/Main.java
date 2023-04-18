import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] words = new String[]{"mama", "papa", "dogma", "lampa"};

        String[] name = new String[]{"Alexx9800"};

        for (String charsAlex : name) {
            char[] chars = charsAlex.toCharArray();

            System.out.println("Завдання: Написати Alexx9800 по одный літері вертикально: ");


            for (int j = 0; j < charsAlex.length(); j++) {
                System.out.println(chars[j]);

            }
        }

        int[] numbers = new int[]{8,2,3,4,5,6,7};

        System.out.println("Завдання: вивести сумму всіх чисел, які діляться на два:  ");

        for (int element : numbers) {
            if (element % 2 == 0) {
                System.out.println(element);
            }

        }


        solver(words);

    }

    public static void solver(String[] words) {

        System.out.println("Основне завдання:  ");

        List<String> helpList = new ArrayList<>();

        for (String word : words) {
            char[] chars = word.toCharArray();

            Map<Character, Integer> helpMap = new HashMap<>();

            for (Character character : chars) {
                if (helpMap.containsKey(character)) {
                    Integer value = helpMap.get(character) + 1;
                    helpMap.put(character, value);
                } else {
                    helpMap.put(character, 1);
                }
            }

            System.out.println(helpMap);

            boolean isRightWord = true;

            for (Character key : helpMap.keySet()) {
                if (helpMap.get(key) % 2 != 0) {
                    isRightWord = false;
                }

            }

            if (isRightWord) {
                helpList.add(word);
                System.out.println(word);
            }

        }


        Set<Character> mySet = new HashSet<>();
        for (String word : helpList) {
            for (Character character : word.toCharArray()) {
                mySet.add(character);
            }

        }


    }

}