package core.loging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Veritabanina  Loglandi:"+data);
    }
}
