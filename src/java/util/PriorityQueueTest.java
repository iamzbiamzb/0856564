package java.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertThrows;

//@RunWith(Parameterized.class)`
class PriorityQueueTest {

    PriorityQueue pq = new PriorityQueue();
//    private int ans;
//    private int x;
//    private int y;

//    @Parameters
//    public static Collection Testcase() {
//        Random ran = new Random();
//        return Arrays.asList(new Integer[][]{
//                {ran.nextInt(),ran.nextInt(),ran.nextInt()},
//                {ran.nextInt(),ran.nextInt(),ran.nextInt()},
//                {ran.nextInt(),ran.nextInt(),ran.nextInt()},
//                {ran.nextInt(),ran.nextInt(),ran.nextInt()},
//                {ran.nextInt(),ran.nextInt(),ran.nextInt()}
//        });
//    }
//
//    public PriorityQueueTest(int expected, int x, int y) {
//        this.ans = expected;
//        this.y = y;
//        this.x = x;
//
//    }

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown(){
        pq = null;
        System.gc();
    }

    @Test
    void add() {
        Exception exception = assertThrows(NullPointerException.class, ()->{
            pq.add(null);
        });
    }

    @Test
    void offer() {
    }

    @Test
    void peek() {
    }

    @Test
    void remove() {
    }

    @Test
    void removeEq() {
    }

    @Test
    void contains() {
    }

    @Test
    void toArray() {
    }

    @Test
    void testToArray() {
    }

    @Test
    void iterator() {
    }

    @Test
    void size() {
    }

    @Test
    void clear() {
    }

    @Test
    void poll() {
    }

    @Test
    void comparator() {
    }

    @Test
    void spliterator() {
    }

    @Test
    void testAdd() {
    }

    @Test
    void testOffer() {
    }

    @Test
    void testPeek() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void testRemoveEq() {
    }

    @Test
    void testContains() {
    }

    @Test
    void testToArray1() {
    }

    @Test
    void testToArray2() {
    }

    @Test
    void testIterator() {
    }

    @Test
    void testSize() {
    }

    @Test
    void testClear() {
    }

    @Test
    void testPoll() {
    }

    @Test
    void testComparator() {
    }

    @Test
    void testSpliterator() {
    }
}