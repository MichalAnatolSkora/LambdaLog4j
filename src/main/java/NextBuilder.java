package main.java;

import java.util.HashMap;

public class NextBuilder {
    private BuilderEventsHolder builderEventsHolder;
    private LogLevel logLevel;

    public NextBuilder(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public NextBuilder Message(String message) {
        builderEventsHolder.AddBuilderEvent("Message", message);
        return this;
    }

    public NextBuilder Field(String name, String value) {
        builderEventsHolder.AddBuilderEvent(name, value);
        return this;
    }

    public NextBuilder Exception(Exception exception) {
        builderEventsHolder.AddBuilderEvent("Exception", exception.toString());
        return this;
    }

    public NextBuilder Business() {
        builderEventsHolder.AddBuilderEvent("Type", "Business");
        return this;
    }

    public NextBuilder Technical() {
        builderEventsHolder.AddBuilderEvent("Type", "Technical");
        return this;
    }

    protected String Generate() {
        return null;
    }
}

