package com.designpatterns.singleton;

public class Database {

    private static Database instance = new Database();

    private static Database instanceOld;

    private Database() {
    }

    // First way (Eager initialization) (thread safe)
    public static Database getInstance() {
        return instance;
    }

    // Second way (Lazy initialization) (not thread safe)
    public static Database getInstanceOld() {
        if (instanceOld == null) {
            instanceOld = new Database();
        }
        return instanceOld;
    }

    // Third way (thread safe)
    public static Database getInstanceThreadSafe() {
        if (instanceOld == null) {
            synchronized (Database.class) {
                if (instanceOld == null) {
                    instanceOld = new Database();
                }
            }
        }
        return instanceOld;
    }

    // Fourth way
    /**
     * SingletonHolder is loaded on the first execution of Singleton.getInstance() or the first access to
     * SingletonHolder.INSTANCE, not before.
     */
    private static class SingletonHolder {

        public static final Database INSTANCE = new Database();
    }

    public static Database getInstanceNew() {
        return SingletonHolder.INSTANCE;
    }

    // Fifth way
    public enum Singleton {
        INSTANCE;

        // Singleton method
        public void getInstance() {
        }
    }

    // Singleton.INSTANCE.getInstance();
}
