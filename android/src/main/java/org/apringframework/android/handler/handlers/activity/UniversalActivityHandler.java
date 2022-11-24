package org.apringframework.android.handler.handlers.activity;

import org.apringframework.android.handler.AndroidHandler;
import org.apringframework.context.Context;
import org.apringframework.handler.Handler;

/***
 * Process actions associated with activity
 * e.g. start activity, close activity...
 */
public class UniversalActivityHandler implements AndroidHandler {

    /***
     * Handle {@param action}
     * @param context current context
     * @param action object to handle
     * @return result state of handler
     */
    @Override
    public boolean handle(Context context, Object action) {
        //TODO("How to handle?")
        return true;
    }
}