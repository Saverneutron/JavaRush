package com.javarush.test.level12.lesson04.task05;

/**
 * JavaRush.ru
 * Level 12, Lesson 04, Task 05
 * <p/>
 * Написать методы: int max(int, int), long max (long, long), double max (double, double). Каждый метод должен
 * возвращать максимальное из двух переданных в него чисел.
 * Date: 26.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        System.out.println( max( 5, 25 ) );
        System.out.println( max( 27L, 18L ) );
        System.out.println( max( 3.14, 2.71 ) );
    }

    public static int max( int x, int y )
    {
        return ( x > y ) ? x : y;
    }

    public static long max( long x, long y )
    {
        return ( x > y ) ? x : y;
    }

    public static double max( double x, double y )
    {
        return ( x > y ) ? x : y;
    }
}
