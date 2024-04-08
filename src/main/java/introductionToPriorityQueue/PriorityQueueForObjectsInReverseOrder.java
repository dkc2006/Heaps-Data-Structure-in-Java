package introductionToPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueForObjectsInReverseOrder {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Bob", 5));
        pq.add(new Student("John", 3));
        pq.add(new Student("Mary", 2));
        pq.add(new Student("Jane", 1));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }

    }

    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

}
