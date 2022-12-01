package SingletonDB;

import java.util.ArrayList;
import java.util.List;

public class DBConnection {
    private static DBConnection instance = null;

    private final char[] data = new char[100];

    public DBConnection() {
        if (instance != null) {
            throw new RuntimeException("Cannot use new on singleton class");
        }
    }

    public static synchronized DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }

        return instance;
    }

    public static IConnection getConnection () {
        return Connection.getInstance();

    }
    private static class Connection implements IConnection {
        private static final int MAX_CONNECTIONS = 3;

        private static final List<Connection> connections = new ArrayList<>();
        private static int i = 0;

        private final DBConnection db = DBConnection.getInstance();

        static {
            while (connections.size() < MAX_CONNECTIONS) {
                connections.add(new Connection());
            }
        }

        public static IConnection getInstance() {
            return connections.get(i++ % MAX_CONNECTIONS);
        }

        public char get(int index) {
            return db.data[index];
        }

        public void set(int index, char c) {
            db.data[index] = c;
        }

        public int length() {
            return db.data.length;
        }
    }
}
