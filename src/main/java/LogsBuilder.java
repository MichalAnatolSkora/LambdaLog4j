package main.java;

public class LogsBuilder implements LevelLogsBuilder, ContextLogsBuilder, TypeLogsBuilder {
    private BuilderEventsHolder builderEventsHolder;
    private LogLevel logLevel;

    public LogsBuilder Info() {
        builderEventsHolder.AddBuilderEvent("Level", LogLevel.Info.toString());
        return this;
    }

    public LogsBuilder Warning() {
        builderEventsHolder.AddBuilderEvent("Level", LogLevel.Warning.toString());
        return this;
    }

    public LogsBuilder Error() {
        builderEventsHolder.AddBuilderEvent("Level", LogLevel.Error.toString());
        return this;
    }

    public LogsBuilder Message(String message) {
        builderEventsHolder.AddBuilderEvent("Message", message);
        return this;
    }

    public LogsBuilder Field(String name, String value) {
        builderEventsHolder.AddBuilderEvent(name, value);
        return this;
    }

    public LogsBuilder Exception(Exception exception) {
        builderEventsHolder.AddBuilderEvent("Exception", exception.toString());
        return this;
    }

    public LogsBuilder Business() {
        builderEventsHolder.AddBuilderEvent("Type", "Business");
        return this;
    }

    public LogsBuilder Technical() {
        builderEventsHolder.AddBuilderEvent("Type", "Technical");
        return this;
    }

    public LogsBuilder CorrelationId(String correlationId) {
        builderEventsHolder.AddBuilderEvent("CorrelationId", correlationId);
        return this;
    }

    protected String Generate() {
        return null;
    }
}

