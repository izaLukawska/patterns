package singleton;

public class SingletonLazy {

    private String username = "Iza";

    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance(){
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
