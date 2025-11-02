package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        int int7 = stack1.size();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push((int) (short) 100);
        boolean boolean12 = stack1.isEmpty();
        stack1.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        int int13 = stack1.size();
        int int14 = stack1.pop();
        stack1.push((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(10);
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        int int4 = stack1.size();
        int int5 = stack1.peek();
        int int6 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push(35);
        int int11 = stack1.pop();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) ' ');
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.peek();
        int int16 = stack1.pop();
        int int17 = stack1.pop();
        int int18 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        int int13 = stack1.peek();
        stack1.push(0);
        int int16 = stack1.size();
        int int17 = stack1.pop();
        int int18 = stack1.size();
        stack1.push((int) (byte) 1);
        int int21 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        stack1.push(0);
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        int int13 = stack1.size();
        int int14 = stack1.pop();
        int int15 = stack1.size();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.peek();
        stack1.push((int) (byte) 10);
        int int17 = stack1.peek();
        int int18 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(10);
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.peek();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        stack1.push((int) (byte) 100);
        stack1.push((int) (byte) 100);
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.size();
        int int17 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.size();
        int int11 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) (byte) 10);
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        stack1.push(0);
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((-1));
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        int int8 = stack1.pop();
        stack1.push(0);
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        stack1.push((int) '#');
        int int6 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.pop();
        int int15 = stack1.size();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.pop();
        int int8 = stack1.size();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) (byte) -1);
        int int13 = stack1.peek();
        int int14 = stack1.size();
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push(0);
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.pop();
        boolean boolean15 = stack1.isFull();
        boolean boolean16 = stack1.isEmpty();
        boolean boolean17 = stack1.isEmpty();
        int int18 = stack1.pop();
        boolean boolean19 = stack1.isFull();
        int int20 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 0);
        int int2 = stack1.size();
        int int3 = stack1.size();
        boolean boolean4 = stack1.isEmpty();
        int int5 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            stack1.push((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is full");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        stack1.push((-1));
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.pop();
        int int15 = stack1.peek();
        boolean boolean16 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.pop();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.pop();
        stack1.push(97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        int int5 = stack1.peek();
        int int6 = stack1.peek();
        int int7 = stack1.pop();
        int int8 = stack1.size();
        int int9 = stack1.size();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 0);
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) '#');
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) '4');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push(0);
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        stack1.push((int) (byte) 1);
        int int6 = stack1.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.peek();
        int int15 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isEmpty();
        stack1.push((int) (byte) -1);
        int int16 = stack1.size();
        stack1.push((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) '#');
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push((int) (short) 100);
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        stack1.push((int) (short) 100);
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        stack1.push((int) ' ');
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        stack1.push((int) '4');
        int int18 = stack1.size();
        int int19 = stack1.peek();
        int int20 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        stack1.push(32);
        int int11 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.example.app.Stack stack1 = new com.example.app.Stack(5);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        stack1.push(4);
        stack1.push((int) (short) -1);
        int int17 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isFull();
        stack1.push((int) (short) 10);
        boolean boolean12 = stack1.isEmpty();
        stack1.push((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        stack1.push(0);
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        int int13 = stack1.size();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        stack1.push(2);
        int int8 = stack1.pop();
        stack1.push(52);
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        stack1.push(4);
        stack1.push((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 10);
        stack1.push(10);
        int int4 = stack1.pop();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        stack1.push(1);
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        stack1.push((int) (byte) 10);
        boolean boolean12 = stack1.isFull();
        stack1.push(97);
        boolean boolean15 = stack1.isEmpty();
        boolean boolean16 = stack1.isFull();
        int int17 = stack1.size();
        int int18 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(2);
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.peek();
        int int13 = stack1.peek();
        int int14 = stack1.pop();
        int int15 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        stack1.push(0);
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isEmpty();
        stack1.push(10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isFull();
        stack1.push(0);
        int int11 = stack1.size();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isEmpty();
        stack1.push(0);
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) 'a');
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.example.app.Stack stack1 = new com.example.app.Stack(1);
        boolean boolean2 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.peek();
        int int13 = stack1.peek();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push((int) (short) 100);
        stack1.push((int) (byte) 1);
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        boolean boolean4 = stack1.isFull();
        stack1.push((int) (short) 100);
        stack1.push((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(2);
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.peek();
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        stack1.push((int) (byte) -1);
        int int6 = stack1.size();
        int int7 = stack1.peek();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        stack1.push((int) (short) 100);
        stack1.push(10);
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.peek();
        int int15 = stack1.size();
        boolean boolean16 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) ' ');
        stack1.push(2);
        int int4 = stack1.peek();
        int int5 = stack1.peek();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        int int8 = stack1.size();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) '#');
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        stack1.push((int) '4');
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        stack1.push((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push(0);
        stack1.push(100);
        int int15 = stack1.size();
        boolean boolean16 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        stack1.push(32);
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        int int13 = stack1.peek();
        stack1.push(0);
        boolean boolean16 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isFull();
        boolean boolean16 = stack1.isEmpty();
        stack1.push(35);
        int int19 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        stack1.push(100);
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(1);
        int int9 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        stack1.push(4);
        int int15 = stack1.size();
        stack1.push(97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) 'a');
        int int9 = stack1.size();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        stack1.push((int) 'a');
        stack1.push((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.peek();
        boolean boolean17 = stack1.isEmpty();
        int int18 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(2);
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.peek();
        int int13 = stack1.pop();
        int int14 = stack1.peek();
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        int int5 = stack1.pop();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        boolean boolean9 = stack1.isFull();
        stack1.push((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push((-1));
        int int11 = stack1.size();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        stack1.push((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        stack1.push((int) '4');
        int int18 = stack1.peek();
        boolean boolean19 = stack1.isEmpty();
        int int20 = stack1.pop();
        boolean boolean21 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.size();
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.size();
        stack1.push(4);
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        stack1.push((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        int int9 = stack1.size();
        stack1.push(3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        stack1.push((int) 'a');
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.pop();
        int int14 = stack1.pop();
        stack1.push((int) (byte) 0);
        boolean boolean17 = stack1.isFull();
        int int18 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        int int8 = stack1.pop();
        stack1.push((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(2);
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        stack1.push((int) (byte) 1);
        boolean boolean10 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.size();
        stack1.push((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) ' ');
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.pop();
        boolean boolean16 = stack1.isFull();
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        int int7 = stack1.pop();
        stack1.push((int) (short) -1);
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        stack1.push(0);
        int int16 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isEmpty();
        stack1.push(0);
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.peek();
        int int9 = stack1.pop();
        stack1.push((int) (byte) 10);
        int int12 = stack1.peek();
        stack1.push(52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) ' ');
        stack1.push(2);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.peek();
        int int6 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isEmpty();
        stack1.push(10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        stack1.push((int) 'a');
        boolean boolean13 = stack1.isFull();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        int int12 = stack1.size();
        int int13 = stack1.size();
        int int14 = stack1.size();
        stack1.push(52);
        boolean boolean17 = stack1.isFull();
        boolean boolean18 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        stack1.push((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.size();
        int int13 = stack1.size();
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        stack1.push(0);
        int int14 = stack1.size();
        stack1.push((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isEmpty();
        stack1.push(5);
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) '#');
        int int9 = stack1.peek();
        stack1.push((int) (byte) 100);
        int int12 = stack1.peek();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) 'a');
        int int9 = stack1.size();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.pop();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        stack1.push((int) 'a');
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(1);
        boolean boolean9 = stack1.isFull();
        stack1.push((int) (byte) 100);
        int int12 = stack1.size();
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        int int7 = stack1.size();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        int int6 = stack1.peek();
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push((int) '#');
        boolean boolean12 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        stack1.push(0);
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.size();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.pop();
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) '#');
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(2);
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        stack1.push((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) 100);
        stack1.push((int) (short) 10);
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.example.app.Stack stack1 = new com.example.app.Stack(2);
        boolean boolean2 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) '#');
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        stack1.push((-1));
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        stack1.push((int) (byte) -1);
        int int9 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(2);
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        stack1.push((int) (byte) 0);
        int int13 = stack1.peek();
        int int14 = stack1.size();
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.peek();
        boolean boolean17 = stack1.isEmpty();
        boolean boolean18 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.pop();
        boolean boolean5 = stack1.isEmpty();
        stack1.push((-1));
        boolean boolean8 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(1);
        boolean boolean9 = stack1.isFull();
        stack1.push((int) (short) 100);
        int int12 = stack1.size();
        stack1.push((int) (byte) 10);
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(2);
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (byte) 10);
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        int int7 = stack1.size();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push((int) (short) 100);
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.pop();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isEmpty();
        stack1.push(10);
        int int7 = stack1.pop();
        stack1.push(10);
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        int int7 = stack1.pop();
        stack1.push((int) (byte) 10);
        int int10 = stack1.size();
        stack1.push(4);
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        stack1.push((int) (byte) -1);
        stack1.push(52);
        stack1.push(0);
        int int16 = stack1.pop();
        boolean boolean17 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        int int11 = stack1.size();
        stack1.push(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) '4');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        int int8 = stack1.pop();
        stack1.push(0);
        stack1.push((int) 'a');
        int int13 = stack1.pop();
        stack1.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (short) -1);
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) '#');
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        stack1.push((int) (short) 100);
        stack1.push((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        int int11 = stack1.size();
        int int12 = stack1.pop();
        stack1.push(32);
        int int15 = stack1.peek();
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.pop();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.pop();
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (byte) 0);
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        boolean boolean16 = stack1.isFull();
        int int17 = stack1.peek();
        boolean boolean18 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        stack1.push((int) (byte) 10);
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        stack1.push((int) '#');
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        boolean boolean16 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.peek();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        stack1.push(4);
        boolean boolean15 = stack1.isFull();
        boolean boolean16 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.example.app.Stack stack1 = new com.example.app.Stack(97);
        boolean boolean2 = stack1.isEmpty();
        stack1.push((int) (short) 100);
        boolean boolean5 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.peek();
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 1);
        int int2 = stack1.size();
        stack1.push(97);
        int int5 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        stack1.push(1);
        int int15 = stack1.pop();
        stack1.push((int) (short) 100);
        int int18 = stack1.peek();
        int int19 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        int int12 = stack1.size();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) '4');
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        java.lang.Class<?> wildcardClass4 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) '#');
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        int int4 = stack1.size();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        int int12 = stack1.size();
        int int13 = stack1.pop();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        stack1.push(3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.pop();
        stack1.push((int) (byte) -1);
        stack1.push((int) (short) 10);
        boolean boolean16 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) '#');
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 10);
        stack1.push(10);
        int int4 = stack1.pop();
        int int5 = stack1.size();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        stack1.push(10);
        int int14 = stack1.pop();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        stack1.push((int) (byte) 100);
        stack1.push((int) (byte) 100);
        int int15 = stack1.pop();
        stack1.push(32);
        int int18 = stack1.pop();
        boolean boolean19 = stack1.isEmpty();
        int int20 = stack1.size();
        int int21 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        stack1.push((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        stack1.push((int) (byte) 0);
        boolean boolean16 = stack1.isEmpty();
        boolean boolean17 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        stack1.push((int) (short) 100);
        stack1.push(10);
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        int int12 = stack1.size();
        int int13 = stack1.size();
        int int14 = stack1.size();
        stack1.push(3);
        int int17 = stack1.peek();
        stack1.push((int) (short) 0);
        int int20 = stack1.peek();
        boolean boolean21 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        int int5 = stack1.peek();
        int int6 = stack1.peek();
        int int7 = stack1.pop();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.peek();
        stack1.push((int) (byte) 10);
        int int17 = stack1.peek();
        int int18 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        stack1.push((int) (short) 1);
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        stack1.push((int) '#');
        int int6 = stack1.size();
        boolean boolean7 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        stack1.push((int) (short) 100);
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        stack1.push(0);
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        stack1.push(0);
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = stack1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        stack1.push((int) (byte) 1);
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        stack1.push((int) (byte) 100);
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isEmpty();
        stack1.push((int) ' ');
        boolean boolean18 = stack1.isFull();
        java.lang.Class<?> wildcardClass19 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isEmpty();
        stack1.push(10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isFull();
        stack1.push(0);
        int int11 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.peek();
        boolean boolean16 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        int int13 = stack1.peek();
        int int14 = stack1.pop();
        boolean boolean15 = stack1.isEmpty();
        boolean boolean16 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        stack1.push(35);
        int int9 = stack1.size();
        int int10 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) ' ');
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.pop();
        boolean boolean16 = stack1.isEmpty();
        int int17 = stack1.pop();
        boolean boolean18 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isEmpty();
        int int5 = stack1.peek();
        int int6 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.pop();
        stack1.push((int) (byte) -1);
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.size();
        int int16 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) 'a');
        int int9 = stack1.size();
        stack1.push(100);
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        stack1.push((int) (byte) 10);
        int int12 = stack1.peek();
        int int13 = stack1.peek();
        stack1.push(0);
        int int16 = stack1.size();
        stack1.push((int) (byte) 10);
        int int19 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        int int5 = stack1.peek();
        boolean boolean6 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isFull();
        stack1.push((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.peek();
        int int11 = stack1.size();
        int int12 = stack1.peek();
        int int13 = stack1.peek();
        int int14 = stack1.size();
        int int15 = stack1.peek();
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.example.app.Stack stack1 = new com.example.app.Stack(2);
        boolean boolean2 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        stack1.push(0);
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (short) 100);
        stack1.push(2);
        boolean boolean16 = stack1.isFull();
        boolean boolean17 = stack1.isFull();
        boolean boolean18 = stack1.isEmpty();
        boolean boolean19 = stack1.isFull();
        int int20 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.size();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.pop();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        int int4 = stack1.size();
        int int5 = stack1.size();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        stack1.push((int) '#');
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isEmpty();
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        stack1.push((int) '4');
        boolean boolean12 = stack1.isFull();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (short) 100);
        int int14 = stack1.peek();
        stack1.push((int) (byte) 100);
        boolean boolean17 = stack1.isFull();
        boolean boolean18 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass19 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        int int11 = stack1.pop();
        int int12 = stack1.peek();
        int int13 = stack1.pop();
        stack1.push((int) (short) 100);
        int int16 = stack1.pop();
        boolean boolean17 = stack1.isFull();
        int int18 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        int int12 = stack1.peek();
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        stack1.push((int) (byte) 100);
        stack1.push((int) (byte) 100);
        int int15 = stack1.pop();
        stack1.push((int) (short) 10);
        boolean boolean18 = stack1.isFull();
        java.lang.Class<?> wildcardClass19 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) 'a');
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.peek();
        boolean boolean17 = stack1.isEmpty();
        stack1.push((int) 'a');
        boolean boolean20 = stack1.isEmpty();
        boolean boolean21 = stack1.isFull();
        int int22 = stack1.pop();
        boolean boolean23 = stack1.isEmpty();
        stack1.push(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        stack1.push((int) '4');
        int int18 = stack1.size();
        int int19 = stack1.peek();
        stack1.push(35);
        java.lang.Class<?> wildcardClass22 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        int int12 = stack1.peek();
        stack1.push(97);
        int int15 = stack1.size();
        int int16 = stack1.peek();
        boolean boolean17 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.example.app.Stack stack1 = new com.example.app.Stack(35);
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isEmpty();
        int int5 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        stack1.push((int) '4');
        int int13 = stack1.size();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) ' ');
        stack1.push(97);
        stack1.push((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        stack1.push((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.peek();
        stack1.push((int) (byte) 10);
        stack1.push((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        stack1.push(32);
        int int12 = stack1.peek();
        stack1.push((int) (byte) 0);
        int int15 = stack1.peek();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        boolean boolean16 = stack1.isFull();
        int int17 = stack1.pop();
        int int18 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        stack1.push(0);
        stack1.push((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 100);
        stack1.push((int) '4');
        stack1.push(1);
        stack1.push((int) (byte) 1);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) '#');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 100);
        stack1.push((int) (short) 100);
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (short) 100);
        int int10 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        int int5 = stack1.pop();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) 'a');
        int int9 = stack1.size();
        stack1.push(100);
        int int12 = stack1.pop();
        int int13 = stack1.size();
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.peek();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        int int13 = stack1.size();
        int int14 = stack1.peek();
        stack1.push((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) '#');
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        stack1.push((int) (short) 10);
        int int14 = stack1.pop();
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) 1);
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        stack1.push((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.peek();
        int int13 = stack1.size();
        int int14 = stack1.peek();
        stack1.push((int) (byte) 1);
        boolean boolean17 = stack1.isFull();
        boolean boolean18 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.pop();
        int int10 = stack1.size();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        stack1.push(0);
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.size();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        stack1.push((int) (short) 1);
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        stack1.push(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        int int4 = stack1.size();
        int int5 = stack1.size();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        stack1.push(32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        int int11 = stack1.pop();
        int int12 = stack1.peek();
        stack1.push((int) (byte) 0);
        int int15 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.pop();
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        stack1.push((int) '#');
        boolean boolean12 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        stack1.push(2);
        int int8 = stack1.size();
        stack1.push((int) (byte) 100);
        int int11 = stack1.pop();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) '#');
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        stack1.push(97);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        int int11 = stack1.pop();
        stack1.push(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        stack1.push(10);
        stack1.push(1);
        int int17 = stack1.pop();
        boolean boolean18 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        stack1.push(3);
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isFull();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) (short) 100);
        stack1.push(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        int int5 = stack1.pop();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        stack1.push((int) (short) 0);
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(1);
        boolean boolean9 = stack1.isFull();
        stack1.push((int) (short) 100);
        int int12 = stack1.size();
        int int13 = stack1.pop();
        int int14 = stack1.peek();
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 10);
        stack1.push(10);
        int int4 = stack1.pop();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push(1);
        stack1.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        int int7 = stack1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        int int12 = stack1.size();
        int int13 = stack1.size();
        int int14 = stack1.size();
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push((-1));
        int int11 = stack1.size();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        stack1.push((int) (byte) 100);
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        stack1.push((int) (byte) 100);
        stack1.push((int) (byte) 100);
        stack1.push((int) (byte) 10);
        boolean boolean17 = stack1.isEmpty();
        boolean boolean18 = stack1.isEmpty();
        int int19 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        stack1.push((int) (byte) -1);
        int int6 = stack1.size();
        java.lang.Class<?> wildcardClass7 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.peek();
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        int int9 = stack1.peek();
        int int10 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.peek();
        int int14 = stack1.pop();
        stack1.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.pop();
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.example.app.Stack stack1 = new com.example.app.Stack(100);
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isFull();
        stack1.push(35);
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        stack1.push(0);
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        int int11 = stack1.pop();
        stack1.push((int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(35);
        boolean boolean12 = stack1.isFull();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isEmpty();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) ' ');
        stack1.push(2);
        boolean boolean4 = stack1.isFull();
        stack1.push((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        int int11 = stack1.pop();
        int int12 = stack1.peek();
        stack1.push((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push(3);
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.peek();
        boolean boolean16 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((int) (byte) 100);
        int int21 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isFull();
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        stack1.push((int) (short) 100);
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.example.app.Stack stack1 = new com.example.app.Stack(4);
        boolean boolean2 = stack1.isEmpty();
        stack1.push(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.size();
        stack1.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        int int4 = stack1.size();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isFull();
        stack1.push(0);
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        int int12 = stack1.peek();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        int int7 = stack1.size();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isEmpty();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) ' ');
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.peek();
        int int16 = stack1.pop();
        stack1.push((int) ' ');
        boolean boolean19 = stack1.isEmpty();
        boolean boolean20 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) 'a');
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isFull();
        stack1.push((int) ' ');
        stack1.push((int) (short) 10);
        int int19 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean18 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        stack1.push(52);
        int int15 = stack1.peek();
        int int16 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        stack1.push((int) (short) 0);
        stack1.push((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push((-1));
        int int11 = stack1.size();
        int int12 = stack1.size();
        boolean boolean13 = stack1.isFull();
        stack1.push((int) (byte) 1);
        int int16 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.size();
        stack1.push(100);
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        int int7 = stack1.size();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push((int) (short) 100);
        int int12 = stack1.peek();
        stack1.push(35);
        boolean boolean15 = stack1.isEmpty();
        int int16 = stack1.peek();
        int int17 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.example.app.Stack stack1 = new com.example.app.Stack(0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.pop();
        stack1.push(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) ' ');
        stack1.push((int) '4');
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        stack1.push((int) (byte) 100);
        stack1.push((int) (byte) 100);
        int int15 = stack1.pop();
        stack1.push((int) (short) 10);
        int int18 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.example.app.Stack stack1 = new com.example.app.Stack(2);
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isEmpty();
        int int4 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        stack1.push(0);
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        stack1.push((-1));
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.pop();
        int int15 = stack1.peek();
        int int16 = stack1.peek();
        boolean boolean17 = stack1.isFull();
        boolean boolean18 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.peek();
        int int14 = stack1.pop();
        int int15 = stack1.peek();
        int int16 = stack1.peek();
        int int17 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        stack1.push(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push((-1));
        int int11 = stack1.size();
        int int12 = stack1.size();
        stack1.push(35);
        int int15 = stack1.peek();
        int int16 = stack1.pop();
        int int17 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        stack1.push(10);
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.peek();
        boolean boolean16 = stack1.isEmpty();
        int int17 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        stack1.push(97);
        boolean boolean17 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        int int6 = stack1.peek();
        int int7 = stack1.pop();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        stack1.push(5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) '#');
        int int9 = stack1.peek();
        stack1.push((int) (byte) 10);
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (byte) -1);
        stack1.push(4);
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        stack1.push(1);
        int int15 = stack1.pop();
        stack1.push((int) (short) 100);
        int int18 = stack1.peek();
        boolean boolean19 = stack1.isEmpty();
        boolean boolean20 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.size();
        int int14 = stack1.pop();
        int int15 = stack1.size();
        boolean boolean16 = stack1.isEmpty();
        int int17 = stack1.pop();
        int int18 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.pop();
        stack1.push((int) (byte) -1);
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) '#');
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        int int11 = stack1.pop();
        int int12 = stack1.size();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.size();
        boolean boolean15 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        stack1.push(32);
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) (short) 100);
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        stack1.push((int) (byte) 100);
        stack1.push((int) (byte) 100);
        int int15 = stack1.pop();
        stack1.push(32);
        int int18 = stack1.pop();
        boolean boolean19 = stack1.isEmpty();
        boolean boolean20 = stack1.isFull();
        java.lang.Class<?> wildcardClass21 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.pop();
        stack1.push((int) (byte) -1);
        int int14 = stack1.size();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        int int8 = stack1.size();
        stack1.push((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        stack1.push((int) (byte) 10);
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push((-1));
        int int11 = stack1.size();
        int int12 = stack1.size();
        stack1.push(35);
        int int15 = stack1.peek();
        boolean boolean16 = stack1.isEmpty();
        int int17 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        stack1.push((int) (short) 0);
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        stack1.push(2);
        int int13 = stack1.pop();
        stack1.push(5);
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        stack1.push(10);
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.peek();
        boolean boolean16 = stack1.isEmpty();
        int int17 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 10);
        stack1.push(10);
        int int4 = stack1.pop();
        java.lang.Class<?> wildcardClass5 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        stack1.push((int) 'a');
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push((int) (byte) 100);
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isFull();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push(0);
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        stack1.push(0);
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        int int13 = stack1.pop();
        int int14 = stack1.peek();
        int int15 = stack1.pop();
        boolean boolean16 = stack1.isFull();
        int int17 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.size();
        boolean boolean7 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        boolean boolean12 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        int int7 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isEmpty();
        stack1.push(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        stack1.push(0);
        int int14 = stack1.size();
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        stack1.push((int) (short) 100);
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        stack1.push((int) (short) 1);
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.size();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        int int12 = stack1.size();
        int int13 = stack1.size();
        int int14 = stack1.size();
        stack1.push(3);
        stack1.push((int) (byte) 0);
        stack1.push(1);
        boolean boolean21 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        stack1.push(2);
        int int8 = stack1.pop();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        stack1.push(0);
        boolean boolean9 = stack1.isEmpty();
        stack1.push((int) (byte) -1);
        stack1.push(4);
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        int int12 = stack1.peek();
        stack1.push(97);
        boolean boolean15 = stack1.isEmpty();
        int int16 = stack1.size();
        int int17 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        stack1.push((int) (byte) 10);
        boolean boolean6 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        stack1.push((int) (short) 1);
        int int10 = stack1.pop();
        stack1.push((int) (byte) 10);
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        stack1.push(0);
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.pop();
        int int14 = stack1.size();
        int int15 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.pop();
        int int13 = stack1.peek();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.pop();
        int int14 = stack1.peek();
        stack1.push(97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        int int11 = stack1.size();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) '4');
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isFull();
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) '#');
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push((int) (byte) 100);
        int int4 = stack1.pop();
        stack1.push(4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        boolean boolean11 = stack1.isEmpty();
        stack1.push(1);
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push(0);
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        stack1.push(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        stack1.push((int) '4');
        stack1.push((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(2);
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(1);
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        int int12 = stack1.pop();
        int int13 = stack1.pop();
        int int14 = stack1.size();
        int int15 = stack1.size();
        stack1.push((int) '4');
        int int18 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(1);
        boolean boolean9 = stack1.isFull();
        stack1.push((int) (byte) 100);
        int int12 = stack1.size();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        stack1.push((int) (short) -1);
        int int13 = stack1.size();
        stack1.push((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        int int5 = stack1.size();
        stack1.push((int) '4');
        int int8 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.size();
        boolean boolean15 = stack1.isEmpty();
        boolean boolean16 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(97);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        int int6 = stack1.peek();
        int int7 = stack1.pop();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        int int9 = stack1.size();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        stack1.push((int) (byte) 100);
        stack1.push((int) (byte) 100);
        int int15 = stack1.pop();
        stack1.push(32);
        int int18 = stack1.pop();
        boolean boolean19 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        boolean boolean22 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        stack1.push(32);
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push((-1));
        int int11 = stack1.size();
        int int12 = stack1.size();
        stack1.push(35);
        boolean boolean15 = stack1.isFull();
        boolean boolean16 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) ' ');
        stack1.push(2);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.peek();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        int int11 = stack1.pop();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.peek();
        stack1.push((int) (byte) 10);
        boolean boolean17 = stack1.isFull();
        boolean boolean18 = stack1.isEmpty();
        stack1.push((int) (byte) 1);
        int int21 = stack1.pop();
        int int22 = stack1.size();
        boolean boolean23 = stack1.isEmpty();
        int int24 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 100);
        stack1.push((int) '4');
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) '#');
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        int int6 = stack1.peek();
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isFull();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push(1);
        boolean boolean9 = stack1.isFull();
        stack1.push(97);
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        stack1.push((int) (byte) 10);
        boolean boolean12 = stack1.isFull();
        stack1.push(97);
        int int15 = stack1.peek();
        int int16 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        stack1.push(100);
        int int10 = stack1.peek();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (short) 0);
        stack1.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        int int5 = stack1.size();
        int int6 = stack1.size();
        stack1.push(3);
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        stack1.push((int) (short) 100);
        stack1.push((int) (short) 10);
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.example.app.Stack stack1 = new com.example.app.Stack(3);
        boolean boolean2 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) '#');
        boolean boolean9 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        int int4 = stack1.size();
        stack1.push(0);
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        java.lang.Class<?> wildcardClass9 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        stack1.push((int) '4');
        int int13 = stack1.size();
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) 'a');
        int int13 = stack1.pop();
        int int14 = stack1.size();
        stack1.push(97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 100);
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isEmpty();
        int int5 = stack1.peek();
        int int6 = stack1.size();
        int int7 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) 100);
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        int int13 = stack1.peek();
        stack1.push(0);
        int int16 = stack1.size();
        int int17 = stack1.pop();
        boolean boolean18 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        stack1.push(35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        int int12 = stack1.size();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        stack1.push(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        stack1.push((int) '#');
        int int8 = stack1.size();
        int int9 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.peek();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        stack1.push(2);
        int int8 = stack1.size();
        stack1.push(35);
        stack1.push((int) (byte) 10);
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push(3);
        stack1.push((int) ' ');
        int int13 = stack1.pop();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        stack1.push((int) (byte) 100);
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isEmpty();
        int int16 = stack1.pop();
        stack1.push(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) '#');
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        stack1.push((-1));
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) (short) 100);
        int int11 = stack1.pop();
        int int12 = stack1.pop();
        int int13 = stack1.size();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.peek();
        boolean boolean16 = stack1.isFull();
        stack1.push((int) '4');
        boolean boolean19 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass20 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        int int11 = stack1.size();
        stack1.push(3);
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        int int12 = stack1.size();
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (short) 100);
        int int14 = stack1.peek();
        stack1.push(97);
        int int17 = stack1.size();
        int int18 = stack1.size();
        java.lang.Class<?> wildcardClass19 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.peek();
        boolean boolean16 = stack1.isFull();
        stack1.push((int) '4');
        int int19 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (short) 100);
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        stack1.push(100);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        stack1.push(0);
        boolean boolean16 = stack1.isFull();
        int int17 = stack1.size();
        int int18 = stack1.pop();
        stack1.push(0);
        int int21 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.example.app.Stack stack1 = new com.example.app.Stack(97);
        boolean boolean2 = stack1.isEmpty();
        stack1.push((int) (short) 100);
        boolean boolean5 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        stack1.push(100);
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        stack1.push(52);
        stack1.push((int) (short) -1);
        boolean boolean16 = stack1.isFull();
        boolean boolean17 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.example.app.Stack stack1 = new com.example.app.Stack(100);
        stack1.push((int) (byte) 10);
        int int4 = stack1.peek();
        int int5 = stack1.pop();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        stack1.push((int) (short) -1);
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        stack1.push(10);
        int int15 = stack1.pop();
        int int16 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        int int11 = stack1.size();
        int int12 = stack1.pop();
        int int13 = stack1.size();
        stack1.push(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        int int12 = stack1.peek();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isFull();
        stack1.push((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isFull();
        stack1.push(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        int int7 = stack1.size();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.peek();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        int int7 = stack1.size();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        stack1.push((int) (byte) -1);
        boolean boolean12 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) 'a');
        int int9 = stack1.size();
        stack1.push(100);
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.size();
        int int11 = stack1.size();
        stack1.push(3);
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.peek();
        int int16 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        stack1.push((int) (short) 10);
        stack1.push((int) ' ');
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        int int11 = stack1.peek();
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        stack1.push(0);
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        stack1.push((-1));
        int int11 = stack1.size();
        int int12 = stack1.size();
        stack1.push(35);
        int int15 = stack1.peek();
        int int16 = stack1.peek();
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) ' ');
        stack1.push((int) '4');
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        stack1.push((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        int int12 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        int int7 = stack1.size();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        stack1.push((int) (short) 100);
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        stack1.push((int) '4');
        int int7 = stack1.size();
        int int8 = stack1.pop();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = stack1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.example.app.Stack stack1 = new com.example.app.Stack(4);
        boolean boolean2 = stack1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        stack1.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.size();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) 'a');
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        stack1.push(1);
        int int9 = stack1.pop();
        stack1.push(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.example.app.Stack stack1 = new com.example.app.Stack(4);
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isEmpty();
        stack1.push((-1));
        int int6 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }
}

