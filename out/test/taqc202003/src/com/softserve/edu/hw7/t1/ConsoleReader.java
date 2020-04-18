package com.softserve.edu.hw7.t1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleReader {

    private String stringFromConsole;

    private String wordSearch;

    private String[] split;
    private Scanner scanner;

    public ConsoleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String[] getSplit() {
        return split;
    }

    public String getWordSearch() {
        return wordSearch;
    }

    public String[] enterText() {
        System.out.print("Enter some text divide words at list with one space: ");
        stringFromConsole = scanner.nextLine();
        split = stringFromConsole.split("[- ,.;']");
        return split;
    }

    public String enterSearch() {
        System.out.print("Enter some character for search pattern: ");
        wordSearch = scanner.nextLine();
        return wordSearch;
    }

    public void displayResult() {

        List<String> tmp = new ArrayList<>();
        int counter = 0;
        for (String word : getSplit()) {
            if (word.toLowerCase().contains(getWordSearch())) {
                System.out.println("We have next matchers with text: " + word);
                tmp.add(word);
                counter++;
            }

        }
        if (counter == 0) {
            System.out.println("We do not have any matchers in text -:))");
        }

    }

}
