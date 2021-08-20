package profiles;

public class Database {

    private String name;

    private String url;

    private String motDepasse;

    private String driver;

    public Database(String name, String url, String motDepasse, String driver) {
        this.name=name;
        this.url = url;
        this.motDepasse = motDepasse;
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public String getMotDepasse() {
        return motDepasse;
    }

    public String getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", motDepasse='" + motDepasse + '\'' +
                ", driver='" + driver + '\'' +
                '}';
    }
}
