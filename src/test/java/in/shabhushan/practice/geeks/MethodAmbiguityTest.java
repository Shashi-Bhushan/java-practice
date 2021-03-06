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
 * @date Sep 27, 2019
 */
package in.shabhushan.practice.geeks;

import org.junit.Test;

public class MethodAmbiguityTest {
    @Test
    public void testOverloadedMethodOne() {
        //MethodAmbiguity.overloadedMethodOne(null);
        //MethodAmbiguity.overloadedMethodTwo(null);
        //MethodAmbiguity.overloadedMethodThree(null, null);

        // How Child is accessible in spite of being in separate File and Class not being Public
        Child.printX();
    }
}
