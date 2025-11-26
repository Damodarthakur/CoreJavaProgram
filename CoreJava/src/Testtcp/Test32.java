package Testtcp;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test32 {
    public static void main(String[] args) {

        List<Employeee2> emplist = new ArrayList<>();


         Employeee2 emp1 = new Employeee2(1,"ravi","CS");
        Employeee2 emp2 = new Employeee2(2,"madhaw","eee");
        Employeee2 emp3 = new Employeee2(3,"Arvind","IT");
         emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp3);

       List<Employeee2> sortedList = emplist.stream().sorted(Comparator.comparing(e->e.getName())).collect(Collectors.toList());

        sortedList.forEach(e->System.out.println(e));
        //System.out.println(sortedList);

       
    }
}
