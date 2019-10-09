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
 * @date Oct 09, 2019
 */
package in.shabhushan.practice.effectivejava;

import java.util.Objects;

public class NoNaturalOrdering implements Comparable<NoNaturalOrdering> {
    private int value;

    public NoNaturalOrdering(int value){
        this.value = value;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof NoNaturalOrdering)
            return this.value == ((NoNaturalOrdering)obj).value;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public int compareTo(NoNaturalOrdering another){
        return 0;
        //return this.value < another.value ? -1 : (this.value == another.value ? 0 : 1);
    }
}
