package org.apringframework.action;

import org.apringframework.context.Context;

/***
 * @author Singlerr
 */
public interface Action extends Context {
    void execute();
}
