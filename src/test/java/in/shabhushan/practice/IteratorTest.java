package in.shabhushan.practice;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.Assert.assertEquals;

public class IteratorTest {

    @Test
    public void testHashMapIterator() throws InterruptedException {
        ConcurrentHashMap<String,String> premiumPhone =
                new ConcurrentHashMap<String,String>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S5");
        premiumPhone.put("Sony", "Xperia Z");
        Iterator<String> iterator = premiumPhone.keySet().iterator();

        while (iterator.hasNext())
        {
            Thread.sleep(1000);
            String key = iterator.next();
            System.out.println(key + "- " + premiumPhone.get(key));
            premiumPhone.put("Samsung", "Xperia Z");

            // Not Unsupported Exception, will remove entry
            // iterator.remove();
        }

        System.out.println(premiumPhone);
    }

    @Test
    public void testCOWALIterator() throws InterruptedException {
        List<String> premiumPhone =
                new CopyOnWriteArrayList<String>();
        premiumPhone.add("Apple");
        premiumPhone.add("HTC");
        premiumPhone.add("Samsung");
        premiumPhone.add("Sony");
        Iterator<String> iterator = premiumPhone.iterator();

        while (iterator.hasNext())
        {
            Thread.sleep(1000);
            String key = iterator.next();
            System.out.println(key);
            premiumPhone.add("Samsung");

            // Unsupported Operation Exception
            // iterator.remove();
        }

        // Samsung added 4 times
        assertEquals(8, premiumPhone.size());
    }
}
