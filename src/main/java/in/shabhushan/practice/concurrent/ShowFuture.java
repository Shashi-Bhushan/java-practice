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
package in.shabhushan.practice.concurrent;

import java.util.List;
import java.util.concurrent.*;

class FutureListener {

    public static int calculate(int a, int b) throws InterruptedException {
        // Mock some Computation that requires time to execute
        Thread.sleep(1000);

        return a * b;
    }
}

public class ShowFuture {

    private ExecutorService executor = Executors.newSingleThreadExecutor();

    public Future<Integer> calculate(final int input, final int secondInput) {
        return executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return FutureListener.calculate(input, secondInput);
            }
        });
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long startTime = System.currentTimeMillis();
        ShowFuture showFuture = new ShowFuture();

        Future<Integer> future = showFuture.calculate(10, 20);

        /*
         * The call to future.get() is blocking
         */
        while(!future.isDone()) {
            System.out.println("Calculating");

            Thread.sleep(200);
        }

        // This GET call is a blocking call, which kind of defeats the purpose of using Future. need to implement Async here.
        System.out.println(future.get());

        long endTime = System.currentTimeMillis();
        System.out.println("Code After Future's GET is Done. Time Taken " + (endTime - startTime));

        // Should be using getter, but since it's inside the class
        if(!showFuture.executor.isShutdown()) {
            List<Runnable> runnables = showFuture.executor.shutdownNow();

            System.out.println(runnables);
            System.out.println("Service is down : " + (showFuture.executor.isShutdown() ? "Yes" : "No"));
        }
    }
}
