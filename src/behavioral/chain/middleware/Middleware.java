package behavioral.chain.middleware;

// Base Middleware class
public abstract class Middleware {

    protected Middleware next;

    public static Middleware link(Middleware first, Middleware... chains) {

        Middleware head = first;

        for (Middleware nextChain: chains) {
            head.next = nextChain;
            head = nextChain;
        }
        return first;
    }

    public abstract boolean check(String email, String password);

    public boolean checkNext(String email, String password) {
        if (next == null) {
            return false;
        }

        return next.check(email, password);
    }

}
