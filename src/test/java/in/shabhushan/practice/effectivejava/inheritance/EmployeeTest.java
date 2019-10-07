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

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {

    @Test
    public void testEquals() {
        Map<Employee, String> map = new HashMap<>();;

        // Set Employee with Name Shashi
        Employee emp = new Employee();
        emp.setEmpId(1);
        emp.setEmpName("Shashi");

        // Add to Map
        map.put(emp, emp.getEmpName());

        // Modify The Original Employee object
        emp.setEmpName("Shashi Bhushan");
        //map.put(emp, "Modified Shashi");

        Assert.assertFalse(map.containsKey(emp));

        Employee similarEmployee = new Employee();
        similarEmployee.setEmpId(1);
        similarEmployee.setEmpName("Shashi");

        // This is False
        Assert.assertFalse(map.containsKey(similarEmployee));

        Employee anotherSimilarEmployee = new Employee();
        anotherSimilarEmployee.setEmpId(1);
        anotherSimilarEmployee.setEmpName("Shashi Bhushan");

        // This is also False
        Assert.assertFalse(map.containsKey(anotherSimilarEmployee));

        // Now, if I keep the same name as before, i could again fetch using the new created object as well.
        // Since, this new object will be equivalent to the old object.
        emp.setEmpName("Shashi");
        Assert.assertTrue(map.containsKey(similarEmployee));
    }

    @Test
    public void testAfterMutatingDS() {
        Employee similarEmployee = new Employee();
        similarEmployee.setEmpId(1);
        similarEmployee.setEmpName("Shashi");

        //final String s = map.get(similarEmployee);
    }
 }
