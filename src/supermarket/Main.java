package supermarket;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();

        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue1.offer("Ivan" + i);
        }

        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue2.offer("Peter" + i);
        }

        System.out.println(queue1);
        System.out.println(queue2);
        addNewPerson("Sergey", queue1, queue2);

        System.out.println(queue1);
        System.out.println(queue2);

        removeFromQueue(queue1, queue2);
        System.out.println(queue1);
        System.out.println(queue2);
    }

    public static void addNewPerson(String name, Queue<String> q1, Queue<String > q2) {
        if (q1.size() == q2.size() && q1.size() == 5) {
            System.out.println("Позовите Галю");
            return;
        }
        if (q1.size() > q2.size()) {
            q2.add(name);
            return;
        } else {
            q1.add(name);
        }

    }

    public static void removeFromQueue(Queue<String> q1, Queue<String> q2) {
        if (Math.random() > 0.5) {
            q1.poll();
        } else {
            q2.poll();
        }
    }
}


