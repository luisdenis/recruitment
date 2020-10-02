package com.citi.sg.recruitment.exercise1.comparator;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.citi.sg.recruitment.utils.FileRead;

public class ComparatorTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(byte[] data) {
        testIn = new ByteArrayInputStream(data);
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    public void test1() throws IOException {
        provideInput(FileRead.getFile("comparator/test1_input.txt"));
        Main.main(new String[0]);
        String expected = new String(FileRead.getFile("comparator/test1_expected.txt")).replaceAll("\\r", "");
        String result = getOutput();
        assertEquals(expected, result);
    }

    @Test
    public void test2() throws IOException {
        provideInput(FileRead.getFile("comparator/test2_input.txt"));
        Main.main(new String[0]);
        String expected = new String(FileRead.getFile("comparator/test2_expected.txt")).replaceAll("\\r", "");
        String result = getOutput().replaceAll("\\r", "");
        assertEquals(expected, result);
    }

    @Test
    public void test3() throws IOException {
        provideInput(FileRead.getFile("comparator/test3_input.txt"));
        Main.main(new String[0]);
        String expected = new String(FileRead.getFile("comparator/test3_expected.txt")).replaceAll("\\r", "");
        String result = getOutput().replaceAll("\\r", "");
        assertEquals(expected, result);
    }

    @Test
    public void test4() throws IOException {
        provideInput(FileRead.getFile("comparator/test4_input.txt"));
        Main.main(new String[0]);
        String expected = new String(FileRead.getFile("comparator/test4_expected.txt")).replaceAll("\\r", "");
        String result = getOutput().replaceAll("\\r", "");
        assertEquals(expected, result);
    }

}
