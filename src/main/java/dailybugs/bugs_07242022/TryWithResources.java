package dailybugs.bugs_07242022;

import java.io.Closeable;
import java.io.IOException;

public class TryWithResources {

    /**
     * Try with resources
     * https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
     *
     * Definition:
     * Question 1: what is a resource?
     * a resource is an object which should be closed after the programme is finished with it.
     *
     * Question 2: qu'est ce que c'est le try-with-resources
     *
     * the try-with resources ensure that the resources are closed at the end of statement.
     *
     *
     */

    public TryWithResources() {
        AutoCloseable autoCloseable = new AutoCloseable() {
            @Override
            public void close() throws Exception {

            }
        };


        Closeable closeable = new Closeable() {
            @Override
            public void close() throws IOException {

            }
        };

    }
}
