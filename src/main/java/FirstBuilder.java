package main.java;

public class FirstBuilder {
    public NextBuilder Info() {
        NextBuilder builder = new NextBuilder(LogLevel.Info);
        return builder;
    }

    public NextBuilder Warning() {
        NextBuilder builder = new NextBuilder(LogLevel.Warning);
        return builder;
    }

    public NextBuilder Error() {
        NextBuilder builder = new NextBuilder(LogLevel.Error);
        return builder;
    }
}
