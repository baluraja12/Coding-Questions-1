package practice;

import java.util.*;

public class SecondHighestSalary {

    public static void main(String[] args) {

        List<Integer> employees = Arrays.asList(20000,50000,70000,80000,900000);
        
        Integer second  = employees.stream()
          .distinct()
          .sorted(Comparator.reverseOrder())
          .skip(1)
          .findFirst()
          .orElse(null);
        
        System.out.println(second);
    }
}