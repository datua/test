package com.wzj.test.io;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by wangzhijiang on 20/04/2017.
 */
public class CharsetTest {
    @Test
    public void aliases() {
        Charset charset = Charset.forName("utf-8");
        Set<String> aliases = charset.aliases();
        for (String alias : aliases) {
            System.out.println(alias);
        }

        Iterator<String> iterator = aliases.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void plus() {
        int a = 1, b = 2;
//        System.out.println(a + b);
        int c = a + b;
        System.out.println(c + "aa");
    }
}
