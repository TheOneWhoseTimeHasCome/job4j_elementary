package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when1And0To2And0then1() {
        double expected = 1;
        Point point1 = new Point(1, 0);
        Point point2 = new Point(2, 0);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when6And5To3And10then5Dot83() {
        double expected = 5.83;
        Point point1 = new Point(6, 5);
        Point point2 = new Point(3, 10);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1And2To3And4then2Dot82() {
        double expected = 2.82;
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        double out = point1.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

}