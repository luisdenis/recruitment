package com.citi.sg.recruitment.quiz.result;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        String[] array = { "abc", "2", "10", "0" };
        List<String> list = Arrays.asList(array);
        Collections.sort(list);
        System.out.println(Arrays.toString(array));
    }

}
