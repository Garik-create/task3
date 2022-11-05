package transport;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AutoService<A extends Transport> {
    private Queue<A> queue = new LinkedList<>();

    public void addAuto(A transport) {

        if (!transport.getClass().equals(Bus.class)) {
            queue.offer(transport);
        } else {
            throw new RuntimeException("Автобусы не нуждаются в техобслуживании.");
        }
    }

    public void doService() {
        A transport = queue.poll();
        if (transport != null) {
            System.out.println("\nПроводим техосмтр " + transport.getBrand() + " " + transport.getModel());
            doService();
        }
    }

}
