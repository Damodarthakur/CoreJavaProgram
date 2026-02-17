package JavaPrograms;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EmployeeEqualAndHashCodeMethod {
    public int id;
    public String name;


    public EmployeeEqualAndHashCodeMethod(int id,String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "EmployeeEqualAndHashCodeMethod{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof EmployeeEqualAndHashCodeMethod employee)) return false;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }




    public static void main(String[] args) {
        EmployeeEqualAndHashCodeMethod emp1 = new EmployeeEqualAndHashCodeMethod(1,"Phani");
        EmployeeEqualAndHashCodeMethod emp2 = new EmployeeEqualAndHashCodeMethod(1,"Phani");

        System.out.println("emp1 : "+ emp1.id +",emp1 : "+emp1.name);
        System.out.println("emp2 : "+ emp1.id +",emp2 : "+emp1.name);

        System.out.println("Equality between emp1 & emp2 objects ="+ emp1.equals(emp2));

        System.out.println("emp1 object hachcode = "+ emp1.hashCode());
        System.out.println("emp2 object hachcode = "+ emp2.hashCode());



        Set<EmployeeEqualAndHashCodeMethod> employees = new HashSet<>();
        employees.add(emp1);
        employees.add(emp2);
        System.out.println("employees "+ employees);
        /*
        // O/P  whithout adding equals and hashcode method

emp1 : 1,emp1 : Phani
emp2 : 1,emp2 : Phani
Equality between emp1 & emp2 :false
emp1 object hachcode = 1607521710
emp2 object hachcode = 764977973
-----------------------------------------------------------

//By Overriding only equal method===
emp1 : 1,emp1 : Phani
emp2 : 1,emp2 : Phani
Equality between emp1 & emp2 objects =true
emp1 object hachcode = 1607521710
emp2 object hachcode = 764977973
--------------------------------
Side effect of only overriding equals method
emp1 : 1,emp1 : Phani
emp2 : 1,emp2 : Phani
Equality between emp1 & emp2 objects =true
emp1 object hachcode = 1607521710
emp2 object hachcode = 764977973
employees [JavaPrograms.EmployeeEqualAndHashCodeMethod@2d98a335, JavaPrograms.EmployeeEqualAndHashCodeMethod@5fd0d5ae]

------------------------------------
After Overriding Hashcode method
emp1 : 1,emp1 : Phani
emp2 : 1,emp2 : Phani
Equality between emp1 & emp2 objects =true
emp1 object hachcode = 77077668
emp2 object hachcode = 77077668
employees [JavaPrograms.EmployeeEqualAndHashCodeMethod@4981ca4]
----------------------------------------
After Overriding toString()
emp1 : 1,emp1 : Phani
emp2 : 1,emp2 : Phani
Equality between emp1 & emp2 objects =true
emp1 object hachcode = 77077668
emp2 object hachcode = 77077668
employees [EmployeeEqualAndHashCodeMethod{id=1, name='Phani'}]


         */

    }
}
