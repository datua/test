package com.wzj.test.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by wangzhijiang on 22/03/2017.
 */
public class FileInputStreamTest {

    @Test
    public void testFileInput() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("a.txt");
        int a = fileInputStream.read();
        System.out.println(a);
    }

}
