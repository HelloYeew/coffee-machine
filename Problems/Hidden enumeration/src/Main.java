import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
//        Secret[] keys = Secret.values();
//        keys = Arrays.toString(keys);
        int n = 0;
        for (Secret status : Secret.values()) {
            String statuses = status.toString();
            if (statuses.startsWith("STAR")) {
                n++;
            }
        }
        System.out.println(n);
    }
}

/* sample enum for inspiration
   enum Secret {
    STAR, CRASH, START, // ...
}
*/