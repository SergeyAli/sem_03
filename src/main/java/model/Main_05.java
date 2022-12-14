package model;

import java.util.ArrayList;
import java.util.List;

public class Main_05 {
//Посчитать количество слов в строке*

    public static void main(String[] args) {
        String str = "qwe asd zxc";
        List<String> strList = new ArrayList<>();
        strList.addAll(List.of(str.split(" ")));
        System.out.println("size = "+strList.size());
    }


}
