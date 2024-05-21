package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class SortListOfString {
    public static void main(String[] args) {
        List<String> names=List.of("jkhggj","cxbxcb","werweq","hlhlh","aasdaf");
        List<String> defaultSort=names.stream().sorted().collect(Collectors.toList());
        List<String> decendingOrder=names.stream()
                    .sorted((arg0, arg1) -> arg1.compareTo(arg0))
                    .collect(Collectors.toList());

       System.out.println(defaultSort);
       System.out.println(decendingOrder); 

    }
}
