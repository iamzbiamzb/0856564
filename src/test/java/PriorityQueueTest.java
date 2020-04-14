import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.*;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class PriorityQueueTest {

    PriorityQueue pq = new PriorityQueue();
    private Integer a1;
    private Integer a2;
    private Integer a3;

    public PriorityQueueTest(Integer a1, Integer a2, Integer a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }


    @Parameters
    public static Collection ParaTest() {
        Random ran = new Random();
        return Arrays.asList(new Integer[][]{
                {ran.nextInt(30)-50,ran.nextInt(30),ran.nextInt(30)},
                {ran.nextInt(30)-50,ran.nextInt(30),ran.nextInt(30)},
                {40,10,78},
                {3,45,32},
                {1,50,50}
        });
    }


    @Test(expected =  NullPointerException.class)
    public void addTest() {
        pq.add(null);
    }

    @Test
    public void pollTest() {
        pq.add(a1);
        pq.add(a2);
        pq.add(a3);
        Integer ans = (Integer) pq.poll();
        System.out.println(ans);
        assertEquals(a1, ans);
    }

    @Test
    public void RemoveTest() {
        boolean flag = pq.remove(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void InitTest() {
        PriorityQueue<Integer> test1 = new PriorityQueue(0);
    }

    @Test(expected = NoSuchElementException.class)
    public void InitTest1() {
        //Arrays as = new Arrays.asList(Integer[] )
        PriorityQueue<Integer> pq = new PriorityQueue();
        pq.element();

    }

}



