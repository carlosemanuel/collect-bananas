package xyz.cems;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MonkeyIslandTest {

    private MonkeyIsland monkeyIsland = new MonkeyIsland();

    @Test
    public void test1() {
        int matrix[][] = {{1, 3, 3} ,
                {2, 1, 4} ,
                {0, 6, 4}};

        assertEquals( 12, monkeyIsland.collectBananas(matrix) );
    }

    @Test
    public void test2() {
        int matrix[][] = {
                        {1, 3, 1, 5} ,
                        {2, 2, 4, 1} ,
                        {5, 0, 2, 3},
                        {0, 6, 1, 2},
                };

        assertEquals( 16, monkeyIsland.collectBananas(matrix) );
    }

    @Test
    public void test3() {
        int matrix[][] = {
                {10, 33, 13, 15} ,
                {22, 21, 4, 1 } ,
                {5, 0, 2, 3},
                {0, 6, 14, 2},
        };

        assertEquals( 83, monkeyIsland.collectBananas(matrix) );
    }

    @Test
    public void test4() {
        int matrix[][] = {
                {1, 5, 12} ,
                {2, 4, 4} ,
                {0, 6, 4},
                {3, 0, 0},
        };

        assertEquals( 19, monkeyIsland.collectBananas(matrix) );
    }
}
