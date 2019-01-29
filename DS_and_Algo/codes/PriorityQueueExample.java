import java.util.PriorityQueue;


public class PriorityQueueExample {
    public static void main(String[] args) {
        test1(true);
        System.out.println("=====");
        test1(false);
    }

    private static void test1(boolean takeComparator) {
        PriorityQueue<Person> personPriorityQueue;
        if (takeComparator)
            personPriorityQueue = new PriorityQueue<>((p1, p2) -> p1.getName().compareTo(p2.getName()));
        else
            personPriorityQueue = new PriorityQueue<>();
        personPriorityQueue.offer(new Person("A", 5));
        personPriorityQueue.offer(new Person("E", 1));
        personPriorityQueue.offer(new Person("C", 3));
        personPriorityQueue.offer(new Person("B", 4));
        personPriorityQueue.offer(new Person("D", 2));

        while (personPriorityQueue.size() != 0) {
            System.out.println(personPriorityQueue.poll());
        }
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
            return name + ", " + age;
        }

        @Override
        public int compareTo(Person p) {
            return age - p.age;
        }
    }
}
