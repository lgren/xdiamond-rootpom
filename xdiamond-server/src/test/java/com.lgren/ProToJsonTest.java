package com.lgren;

import org.junit.Test;

public class ProToJsonTest {

    @Test
    public void test1() {
        String resource = "E:\\JavaIdeaSpace\\xdiamond-master\\xdiamond-server\\src\\test\\resources\\properties\\mysql.properties";
        System.out.println(ProToJson.proToJSONArray(resource));
    }
}
