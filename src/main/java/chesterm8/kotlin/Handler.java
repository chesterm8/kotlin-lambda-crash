package chesterm8.kotlin;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<ScheduledEvent, String> {

    @Override
    public String handleRequest(final ScheduledEvent input, final Context context) {
        LambdaLogger lambdaLogger = context.getLogger();

        lambdaLogger.log(">> Handling Request");

        return "Request handled";
    }

}
