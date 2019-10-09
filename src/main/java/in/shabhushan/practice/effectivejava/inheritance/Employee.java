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
 * @date Oct 07, 2019
 */
package in.shabhushan.practice.effectivejava.inheritance;

import java.util.Objects;

/**
 * If I change the object after setting the key, then two things will happen.
 *
 * 1. a Hash will be checked first.
 * That means, when I create a new object, it's name should be same as what was before the change. ("Shashi" in this case)
 * Since hash will be same in this case, the check will move forward.
 *
 * 2. an equals method will be checked.
 * Now, the object with name as "Shashi" will be checked for equality with the object "Shashi Bhushan"
 * This will fail. Hence, the second false.
 *
 * Now, if i change the map's object to it's original value back, I could get the object back using a new object as well.
 * Since, this new object will now pass both the checks.
 *
 * There could be multiple solutions for this problem of being able to fetch objects in map.
 * 1. make immutable Employee object. Only provide all values in Constructor
 *   1.1. If flexibility is needed, use Builder pattern
 * 2. Use only required fields in equals and hashcode, empId in this case.
 *
 * @see <a href="https://stackoverflow.com/questions/58299084/is-there-a-way-to-manually-rehash-map-in-java">
 *     Stack Overflow discussion</a>
 */
public class Employee {

    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmpId() == employee.getEmpId() &&
                Objects.equals(getEmpName(), employee.getEmpName());
        //return Objects.equals(getEmpName(), employee.getEmpName());
    }

    @Override
    public int hashCode() {
        //return Objects.hash(getEmpId());
        return Objects.hash(getEmpId(), getEmpName());
    }
}
