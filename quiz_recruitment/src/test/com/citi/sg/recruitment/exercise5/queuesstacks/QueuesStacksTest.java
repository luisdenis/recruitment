package com.citi.sg.recruitment.exercise5.queuesstacks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.citi.sg.recruitment.utils.FileRead;

public class QueuesStacksTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @BeforeEach
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

    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    @Test
    void test1() throws IOException {
        provideInput(FileRead.getFile("queuesstacks/test1_input.txt"));
        Main.main(new String[0]);
        String expected = new String(FileRead.getFile("queuesstacks/test1_expected.txt")).replaceAll("\\r", "");
        String result = getOutput().replaceAll("\\r", "");
        assertEquals(expected, result);
    }

    @Test
    void test2() throws IOException {
        provideInput(FileRead.getFile("queuesstacks/test2_input.txt"));
        Main.main(new String[0]);
        String expected = new String(FileRead.getFile("queuesstacks/test2_expected.txt")).replaceAll("\\r", "");
        String result = getOutput().replaceAll("\\r", "");
        assertEquals(expected, result);
    }

    @Test
    void test3() throws IOException {
        provideInput(FileRead.getFile("queuesstacks/test3_input.txt"));
        Main.main(new String[0]);
        String expected = new String(FileRead.getFile("queuesstacks/test3_expected.txt")).replaceAll("\\r", "");
        String result = getOutput().replaceAll("\\r", "");
        assertEquals(expected, result);
    }

}
