package com.hbss.schedule.util;

import java.util.concurrent.LinkedTransferQueue;

/**
 * @author mycat
 */
public class ExecutorUtil {

    public static final NameableExecutor create(String name, int size) {
        return create(name, size, true);
    }

    private static final NameableExecutor create(String name, int size, boolean isDaemon) {
        NameableThreadFactory factory = new NameableThreadFactory(name, isDaemon);
        return new NameableExecutor(name, size, new LinkedTransferQueue<Runnable>(), factory);
    }

   
}