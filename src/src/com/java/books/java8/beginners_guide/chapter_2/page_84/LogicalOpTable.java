/*
Наивысший
++ (постфиксная)    -- (постфиксная)
++ (префиксная)     -- (префиксноя)     ~   !   +(унарный плюс)     -(унарныйминус)     (приведениетипов)

*       /       %
+       -
>>      >>>     <<
>       >=      <       <=      instanceof
==      !=
&
^
|
&&
||
?:
=       ор=
Наинизший
 */

package com.java.books.java8.beginners_guide.chapter_2.page_84;

public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = true;
        q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = false;
        q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));

        p = q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        System.out.println((p ^ q) + "\t" + (!p));
    }
}
