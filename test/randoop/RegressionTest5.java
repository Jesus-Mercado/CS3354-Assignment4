package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) '#');
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 100);
        stack1.push((-1));
        int int4 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        stack1.push(0);
        int int15 = stack1.pop();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.example.app.Stack stack1 = new com.example.app.Stack(1);
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        stack1.push(3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
        stack1.push(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        int int5 = stack1.peek();
        int int6 = stack1.size();
        int int7 = stack1.peek();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        stack1.push((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        stack1.push(35);
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push((int) (byte) 100);
        int int4 = stack1.peek();
        int int5 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) '#');
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.size();
        int int15 = stack1.size();
        stack1.push((int) (byte) -1);
        int int18 = stack1.pop();
        boolean boolean19 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        stack1.push(97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) '#');
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isFull();
        stack1.push(3);
        int int6 = stack1.pop();
        int int7 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        stack1.push((int) (short) 1);
        int int10 = stack1.pop();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        int int6 = stack1.peek();
        int int7 = stack1.pop();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) '4');
        stack1.push((-1));
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        int int19 = stack1.pop();
        boolean boolean20 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        boolean boolean11 = stack1.isFull();
        stack1.push(0);
        int int14 = stack1.peek();
        stack1.push((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        int int7 = stack1.pop();
        stack1.push((int) (byte) 10);
        int int10 = stack1.peek();
        int int11 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(1);
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
        int int16 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        stack1.push((int) (byte) -1);
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        int int13 = stack1.pop();
        stack1.push(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isEmpty();
        stack1.push((int) (short) -1);
        int int11 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) '#');
        boolean boolean2 = stack1.isFull();
        boolean boolean3 = stack1.isFull();
        stack1.push(3);
        stack1.push(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.example.app.Stack stack1 = new com.example.app.Stack(100);
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isFull();
        int int4 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.pop();
        int int6 = stack1.size();
        stack1.push((int) (byte) 100);
        stack1.push(52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push((int) '#');
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        int int11 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        java.lang.Class<?> wildcardClass11 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isEmpty();
        stack1.push(0);
        int int8 = stack1.size();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 10);
        stack1.push(10);
        int int4 = stack1.pop();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 100);
        stack1.push((int) '4');
        int int4 = stack1.peek();
        stack1.push((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        stack1.push(4);
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        stack1.push((int) (short) 10);
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) '#');
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.pop();
        int int8 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        stack1.push((int) (byte) 0);
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
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        int int12 = stack1.pop();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        stack1.push((int) (byte) 10);
        stack1.push((int) (byte) 0);
        stack1.push((int) (byte) 100);
        int int20 = stack1.size();
        boolean boolean21 = stack1.isEmpty();
        boolean boolean22 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.peek();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        int int14 = stack1.size();
        int int15 = stack1.size();
        int int16 = stack1.peek();
        stack1.push((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        int int11 = stack1.pop();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        stack1.push((int) ' ');
        int int13 = stack1.size();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        int int8 = stack1.pop();
        boolean boolean9 = stack1.isFull();
        stack1.push(4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.pop();
        int int14 = stack1.size();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        stack1.push(35);
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) ' ');
        stack1.push(1);
        boolean boolean16 = stack1.isFull();
        int int17 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.pop();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) '#');
        boolean boolean10 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int13 = stack1.size();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        stack1.push(0);
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        int int19 = stack1.pop();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        stack1.push((-1));
        int int16 = stack1.pop();
        int int17 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        boolean boolean17 = stack1.isEmpty();
        int int18 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) 100);
        int int10 = stack1.size();
        int int11 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        stack1.push(0);
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
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.size();
        boolean boolean13 = stack1.isEmpty();
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        stack1.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        int int5 = stack1.peek();
        int int6 = stack1.size();
        int int7 = stack1.peek();
        int int8 = stack1.pop();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(10);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        stack1.push((-1));
        int int8 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isEmpty();
        stack1.push(0);
        stack1.push(3);
        int int10 = stack1.pop();
        int int11 = stack1.size();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        int int5 = stack1.peek();
        int int6 = stack1.peek();
        int int7 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        stack1.push((int) (short) 10);
        stack1.push((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        int int12 = stack1.size();
        int int13 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        boolean boolean14 = stack1.isFull();
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
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        stack1.push((int) '4');
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        int int15 = stack1.pop();
        boolean boolean16 = stack1.isFull();
        int int17 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.example.app.Stack stack1 = new com.example.app.Stack(0);
        boolean boolean2 = stack1.isEmpty();
        boolean boolean3 = stack1.isFull();
        boolean boolean4 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        stack1.push((int) '#');
        stack1.push((int) (short) 0);
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        stack1.push((int) ' ');
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        boolean boolean18 = stack1.isEmpty();
        boolean boolean19 = stack1.isEmpty();
        boolean boolean20 = stack1.isEmpty();
        boolean boolean21 = stack1.isFull();
        int int22 = stack1.size();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.peek();
        stack1.push(52);
        int int11 = stack1.size();
        stack1.push(32);
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isEmpty();
        int int16 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        int int13 = stack1.peek();
        int int14 = stack1.peek();
        int int15 = stack1.size();
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push(0);
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isEmpty();
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        int int20 = stack1.pop();
        int int21 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        boolean boolean20 = stack1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        int int11 = stack1.pop();
        stack1.push((int) (short) -1);
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.size();
        boolean boolean16 = stack1.isEmpty();
        int int17 = stack1.peek();
        int int18 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        int int13 = stack1.size();
        int int14 = stack1.pop();
        stack1.push(10);
        int int17 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        int int6 = stack1.pop();
        stack1.push((int) 'a');
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        int int5 = stack1.pop();
        boolean boolean6 = stack1.isEmpty();
        stack1.push((int) (short) 1);
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        stack1.push((int) 'a');
        int int14 = stack1.pop();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push(1);
        boolean boolean9 = stack1.isFull();
        stack1.push(97);
        int int12 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        stack1.push(0);
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.pop();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isEmpty();
        stack1.push(0);
        int int8 = stack1.size();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        int int19 = stack1.pop();
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(10);
        stack1.push(100);
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        int int5 = stack1.peek();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        int int15 = stack1.peek();
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        int int18 = stack1.size();
        boolean boolean19 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isFull();
        int int15 = stack1.peek();
        int int16 = stack1.peek();
        int int17 = stack1.size();
        stack1.push((int) (byte) 10);
        stack1.push((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.example.app.Stack stack1 = new com.example.app.Stack(5);
        stack1.push((int) (byte) 0);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        stack1.push(52);
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        int int11 = stack1.size();
        stack1.push((int) (byte) 100);
        int int14 = stack1.size();
        stack1.push(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) -1);
        boolean boolean9 = stack1.isFull();
        stack1.push(32);
        int int12 = stack1.size();
        int int13 = stack1.size();
        stack1.push((int) (byte) 1);
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        stack1.push(4);
        int int15 = stack1.peek();
        int int16 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        stack1.push(2);
        stack1.push(97);
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.size();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) '4');
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        stack1.push(10);
        stack1.push(100);
        int int11 = stack1.pop();
        int int12 = stack1.peek();
        stack1.push(32);
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        int int17 = stack1.pop();
        stack1.push(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        stack1.push(4);
        java.lang.Class<?> wildcardClass16 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        stack1.push((int) '#');
        int int17 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        int int5 = stack1.peek();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        stack1.push(1);
        int int18 = stack1.pop();
        int int19 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.size();
        int int16 = stack1.pop();
        int int17 = stack1.size();
        int int18 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        int int15 = stack1.pop();
        boolean boolean16 = stack1.isFull();
        stack1.push(4);
        stack1.push((int) 'a');
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
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) (byte) 1);
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        stack1.push((int) (short) 100);
        int int14 = stack1.size();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        int int14 = stack1.pop();
        boolean boolean15 = stack1.isFull();
        boolean boolean16 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.peek();
        stack1.push(52);
        int int11 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        int int13 = stack1.size();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isEmpty();
        stack1.push(0);
        int int8 = stack1.size();
        int int9 = stack1.size();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        boolean boolean12 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 1);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.size();
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.peek();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isFull();
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isEmpty();
        int int5 = stack1.size();
        int int6 = stack1.size();
        stack1.push(100);
        int int9 = stack1.pop();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 100);
        stack1.push((int) '4');
        stack1.push((int) (byte) -1);
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass8 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        int int12 = stack1.pop();
        stack1.push((int) '#');
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        stack1.push(0);
        boolean boolean13 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isFull();
        int int4 = stack1.size();
        boolean boolean5 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 100);
        stack1.push((int) '4');
        boolean boolean4 = stack1.isEmpty();
        int int5 = stack1.pop();
        boolean boolean6 = stack1.isFull();
        boolean boolean7 = stack1.isEmpty();
        stack1.push((int) (byte) 0);
        boolean boolean10 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 10);
        stack1.push(10);
        int int4 = stack1.pop();
        stack1.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        int int12 = stack1.pop();
        stack1.push((int) '#');
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        stack1.push(0);
        int int13 = stack1.size();
        int int14 = stack1.size();
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        int int14 = stack1.peek();
        boolean boolean15 = stack1.isFull();
        int int16 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        int int5 = stack1.peek();
        int int6 = stack1.size();
        stack1.push((int) (byte) 1);
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(2);
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        stack1.push((int) (byte) 0);
        boolean boolean13 = stack1.isFull();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 1);
        boolean boolean2 = stack1.isFull();
        int int3 = stack1.size();
        int int4 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        boolean boolean11 = stack1.isEmpty();
        boolean boolean12 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 10);
        stack1.push(10);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        int int17 = stack1.pop();
        int int18 = stack1.pop();
        stack1.push((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (short) 100);
        stack1.push((int) '4');
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.pop();
        stack1.push((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        int int14 = stack1.pop();
        boolean boolean15 = stack1.isEmpty();
        int int16 = stack1.pop();
        int int17 = stack1.size();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = stack1.peek();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stack is empty");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        boolean boolean13 = stack1.isEmpty();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        int int13 = stack1.peek();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.peek();
        int int16 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        stack1.push((int) (byte) 1);
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        boolean boolean19 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isEmpty();
        stack1.push(10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        stack1.push(97);
        stack1.push(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        stack1.push(52);
        int int13 = stack1.pop();
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        stack1.push((int) ' ');
        boolean boolean17 = stack1.isFull();
        int int18 = stack1.pop();
        int int19 = stack1.size();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        stack1.push((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.size();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        stack1.push(32);
        int int9 = stack1.peek();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) '#');
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
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        stack1.push((int) (short) -1);
        boolean boolean16 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        stack1.push((-1));
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        int int17 = stack1.size();
        boolean boolean18 = stack1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        int int12 = stack1.peek();
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
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        boolean boolean17 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        stack1.push(0);
        stack1.push((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        int int10 = stack1.pop();
        stack1.push((int) '4');
        int int13 = stack1.size();
        stack1.push(0);
        int int16 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.size();
        stack1.push(5);
        boolean boolean13 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isEmpty();
        stack1.push(0);
        stack1.push(3);
        int int10 = stack1.pop();
        stack1.push(100);
        int int13 = stack1.size();
        int int14 = stack1.peek();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        stack1.push((int) (short) 1);
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        stack1.push((int) '#');
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        int int8 = stack1.size();
        boolean boolean9 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.pop();
        int int13 = stack1.size();
        int int14 = stack1.peek();
        int int15 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        int int2 = stack1.size();
        boolean boolean3 = stack1.isEmpty();
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isEmpty();
        stack1.push(0);
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        int int15 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        stack1.push(100);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        int int18 = stack1.peek();
        int int19 = stack1.peek();
        int int20 = stack1.pop();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        boolean boolean13 = stack1.isFull();
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        stack1.push((int) (short) 0);
        int int19 = stack1.size();
        int int20 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        stack1.push(0);
        boolean boolean12 = stack1.isEmpty();
        stack1.push(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isEmpty();
        stack1.push(10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        boolean boolean7 = stack1.isFull();
        stack1.push(0);
        boolean boolean10 = stack1.isEmpty();
        boolean boolean11 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass12 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.size();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        int int12 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        boolean boolean14 = stack1.isEmpty();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
        int int18 = stack1.peek();
        boolean boolean19 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        stack1.push((int) 'a');
        java.lang.Class<?> wildcardClass23 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        stack1.push((int) (short) 10);
        int int15 = stack1.pop();
        stack1.push(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isFull();
        stack1.push(52);
        int int13 = stack1.pop();
        boolean boolean14 = stack1.isEmpty();
        int int15 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        java.lang.Class<?> wildcardClass13 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        int int10 = stack1.pop();
        int int11 = stack1.size();
        stack1.push((int) 'a');
        int int14 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        int int8 = stack1.size();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.size();
        boolean boolean12 = stack1.isFull();
        int int13 = stack1.size();
        int int14 = stack1.peek();
        int int15 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        stack1.push((int) (short) 100);
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.example.app.Stack stack1 = new com.example.app.Stack(2);
        boolean boolean2 = stack1.isEmpty();
        stack1.push(35);
        java.lang.Class<?> wildcardClass5 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.peek();
        boolean boolean10 = stack1.isFull();
        int int11 = stack1.peek();
        int int12 = stack1.size();
        int int13 = stack1.size();
        int int14 = stack1.peek();
        boolean boolean15 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.size();
        boolean boolean11 = stack1.isEmpty();
        stack1.push((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        stack1.push((int) (short) -1);
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isFull();
        int int10 = stack1.peek();
        stack1.push(4);
        int int13 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
        int int13 = stack1.pop();
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
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(2);
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.size();
        int int13 = stack1.size();
        int int14 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.size();
        java.lang.Class<?> wildcardClass10 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        int int18 = stack1.size();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        int int10 = stack1.size();
        stack1.push((int) (short) 1);
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        java.lang.Class<?> wildcardClass15 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        stack1.push((int) (short) 1);
        int int17 = stack1.size();
        boolean boolean18 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        int int13 = stack1.size();
        stack1.push(10);
        stack1.push(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isEmpty();
        stack1.push(10);
        int int7 = stack1.pop();
        boolean boolean8 = stack1.isFull();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.peek();
        int int11 = stack1.peek();
        boolean boolean12 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        stack1.push((int) '#');
        stack1.push((int) '#');
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        stack1.push(1);
        int int15 = stack1.size();
        boolean boolean16 = stack1.isFull();
        java.lang.Class<?> wildcardClass17 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.size();
        int int5 = stack1.peek();
        stack1.push((int) (short) 0);
        boolean boolean8 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.peek();
        boolean boolean8 = stack1.isEmpty();
        boolean boolean9 = stack1.isEmpty();
        int int10 = stack1.size();
        int int11 = stack1.pop();
        boolean boolean12 = stack1.isEmpty();
        int int13 = stack1.size();
        stack1.push((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        stack1.push((int) (short) 10);
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isEmpty();
        int int12 = stack1.size();
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        stack1.push(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.pop();
        int int9 = stack1.pop();
        int int10 = stack1.size();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        stack1.push(3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.peek();
        stack1.push((-1));
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.size();
        int int9 = stack1.size();
        int int10 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean13 = stack1.isEmpty();
        java.lang.Class<?> wildcardClass14 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        int int14 = stack1.size();
        int int15 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        int int4 = stack1.size();
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        boolean boolean14 = stack1.isFull();
        boolean boolean15 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        boolean boolean11 = stack1.isFull();
        int int12 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
        int int18 = stack1.pop();
        int int19 = stack1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        stack1.push(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        int int21 = stack1.size();
        int int22 = stack1.peek();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
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
        int int12 = stack1.pop();
        boolean boolean13 = stack1.isFull();
        stack1.push(0);
        boolean boolean16 = stack1.isEmpty();
        int int17 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        com.example.app.Stack stack1 = new com.example.app.Stack(100);
        stack1.push(52);
        boolean boolean4 = stack1.isEmpty();
        boolean boolean5 = stack1.isFull();
        java.lang.Class<?> wildcardClass6 = stack1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        stack1.push((int) 'a');
        boolean boolean17 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
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
        int int19 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        int int5 = stack1.size();
        boolean boolean6 = stack1.isEmpty();
        int int7 = stack1.size();
        int int8 = stack1.size();
        stack1.push(97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        int int7 = stack1.size();
        boolean boolean8 = stack1.isEmpty();
        int int9 = stack1.pop();
        boolean boolean10 = stack1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
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
        boolean boolean13 = stack1.isFull();
        boolean boolean14 = stack1.isFull();
        stack1.push((int) (short) 1);
        int int17 = stack1.size();
        boolean boolean18 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isFull();
        boolean boolean5 = stack1.isEmpty();
        boolean boolean6 = stack1.isFull();
        stack1.push((int) ' ');
        int int9 = stack1.size();
        int int10 = stack1.size();
        stack1.push(2);
        int int13 = stack1.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 10);
        stack1.push((int) (byte) -1);
        int int4 = stack1.size();
        stack1.push(0);
        stack1.push(1);
        boolean boolean9 = stack1.isEmpty();
        boolean boolean10 = stack1.isFull();
        boolean boolean11 = stack1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        boolean boolean14 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) (byte) 100);
        int int2 = stack1.size();
        stack1.push((int) (byte) 0);
        boolean boolean5 = stack1.isFull();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isEmpty();
        int int8 = stack1.peek();
        int int9 = stack1.peek();
        stack1.push((int) (byte) -1);
        stack1.push((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        stack1.push((int) (short) 0);
        boolean boolean4 = stack1.isEmpty();
        stack1.push(10);
        int int7 = stack1.pop();
        stack1.push(5);
        int int10 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        int int13 = stack1.size();
        boolean boolean14 = stack1.isEmpty();
        stack1.push(2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        com.example.app.Stack stack1 = new com.example.app.Stack((int) 'a');
        boolean boolean2 = stack1.isFull();
        stack1.push((int) (short) 0);
        boolean boolean5 = stack1.isEmpty();
        int int6 = stack1.peek();
        boolean boolean7 = stack1.isFull();
        boolean boolean8 = stack1.isFull();
        int int9 = stack1.size();
        boolean boolean10 = stack1.isEmpty();
        int int11 = stack1.pop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
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
        int int13 = stack1.pop();
        stack1.push(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        int int15 = stack1.peek();
        boolean boolean16 = stack1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        com.example.app.Stack stack1 = new com.example.app.Stack(10);
        stack1.push((int) 'a');
        stack1.push(100);
        boolean boolean6 = stack1.isFull();
        stack1.push(2);
        int int9 = stack1.peek();
        int int10 = stack1.peek();
        stack1.push((int) (byte) 0);
        int int13 = stack1.peek();
        int int14 = stack1.peek();
        stack1.push((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }
}

