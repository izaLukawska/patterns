package singleton;

public enum  SingletonEnum {

    INSTANCE;

    private String username = "iza";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
