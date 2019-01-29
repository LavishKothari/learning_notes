import java.util.Arrays;
import java.util.Collections;

public class ListSortingExample {
    public static void main(String[] args) {
        Person p1 = new Person("A", 3);
        Person p2 = new Person("B", 2);
        Person p3 = new Person("C", 1);

        Person[] persons = new Person[]{p1, p2, p3};
        Collections.sort(Arrays.asList(persons)); // this will sort by Comparable - sorting by age
        printPersonArray(persons);

        Person[] persons1 = new Person[]{p1, p2, p3};
        Collections.sort(Arrays.asList(persons1), (person1, person2)->
                person1.getName().compareTo(person2.getName()));
        printPersonArray(persons1); // sorted by name

    }
    private static void printPersonArray(Person[] persons) {
        for(int i=0;i<persons.length;i++) {
            System.out.print(persons[i]);
        }
        System.out.println();
    }
    private static class Person implements Comparable<Person> {
        private final String name;
        private final int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "["+name + ", " + age+"]";
        }

        @Override
        public int compareTo(Person p) {
            return age - p.age;
        }
    }
}
