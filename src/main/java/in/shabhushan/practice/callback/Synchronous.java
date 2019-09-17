/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Shashi Bhushan
 * @date Sep 17, 2019
 */
package in.shabhushan.practice.callback;

interface EventListener {
    void listen();
}

class EventListenerImpl implements EventListener {

    @Override
    public void listen() {
        // perform some Routine Operation
        try {
            Thread.sleep(5000);
        } catch (InterruptedException cause) {
            cause.printStackTrace();
        }

        System.out.println("Performing callback after Synchronous call.");
    }
}

class EventCaller {
    private EventListener listener;


    public void registerListener(EventListener listener) {
        this.listener = listener;
    }

    public void doStuff() {
        System.out.println("Performing Callback before Synchronous call.");

        if(null != this.listener)
            this.listener.listen();
    }
}

public class Synchronous {
    public static void main(String[] args) {
        EventCaller caller = new EventCaller();

        EventListener listener = new EventListenerImpl();
        caller.registerListener(listener);

        long startTime = System.currentTimeMillis();
        // do sync call
        caller.doStuff();
        long endTime = System.currentTimeMillis();

        System.out.println("Time Taken : " + (endTime - startTime));
    }
}
