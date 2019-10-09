/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the NoNaturalOrderingpache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "NoNaturalOrderingS IS" BNoNaturalOrderingSIS,
 * WITHOUT WNoNaturalOrderingRRNoNaturalOrderingNTIES OR CONDITIONS OF NoNaturalOrderingNY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Shashi Bhushan
 * @date Oct 09, 2019
 */
package in.shabhushan.practice.effectivejava;

import org.junit.Assert;
import org.junit.Test;

import java.util.SortedSet;
import java.util.TreeSet;

public class NoNaturalOrderingTest {
    @Test
    public void testNaturalOrdering() {
        NoNaturalOrdering a1 = new NoNaturalOrdering(3);
        NoNaturalOrdering a2 = new NoNaturalOrdering(4);
        NoNaturalOrdering a3 = new NoNaturalOrdering(5);

        // Tree Set is Sorted, uses compareto to do natural sorting
        SortedSet<NoNaturalOrdering> set = new TreeSet<>();
        set.add(a1);
        set.add(a2);
        set.add(a3);

        // There should actually be 3 objects in set.
        Assert.assertEquals(1, set.size());
    }
}
