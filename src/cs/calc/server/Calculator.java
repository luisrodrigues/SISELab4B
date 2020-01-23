package cs.calc.server;

import javax.jws.WebService;
import java.util.concurrent.atomic.AtomicInteger;

@WebService
public class Calculator {
    private AtomicInteger mem = new AtomicInteger(0);

    public int last() {
        return mem.get();
    }
    public int sum(int a, int b) {
        int x = a + b;
        mem.set(x);
        return x;
    }
    public int mul(int a, int b) {
        int x = a * b;
        mem.set(x);
        return x;
    }

}
