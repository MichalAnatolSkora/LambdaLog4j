
# Lambda Log4j

## Getting Started

Create logger and use lambdas!

```
Logger logger = new Logger(getClass().getName());
logger.Log(e -> e.Info()
        .CorrelationId("fakeCorrelationId")
        .Technical()
        .Message("Created trigger")
        .Field("Method", "testMessage"));
```

Easily log your exception!

```
Logger logger = new Logger(getClass().getName());
try {
    throw new Exception("New exception");
}catch (Exception ex){
    logger.Log(e -> e.Error()
            .CorrelationId("fakeCorrelationId")
            .Technical()
            .Message("Unexpected case")
            .Exception(ex).Field("Method", "testException"));
}
```

Indicate that was a business log.

```
Logger logger = new Logger(getClass().getName());
logger.Log(e -> e.Info()
        .CorrelationId("fakeCorrelationId")
        .Business()
        .Message("Created trigger")
        .Field("Method", "testMessage"));
```

Be cool!