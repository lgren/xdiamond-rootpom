package com.lgren;

import com.alibaba.fastjson.JSONArray;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.*;

public class ProToJson {
    public static JSONArray proToJSONArray(File resourceFile) {
        //输出结果
        JSONArray resultJson = new JSONArray();
        //获取properties文件信息
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(resourceFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties props = new Properties();
        try {
            props.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        props.forEach((k, v) -> {
            Map map = new HashMap();
            map.put("key", k);
            map.put("value", v);
            map.put("description", "");
            resultJson.add(map);
        });
        return resultJson;
    }

    public static JSONArray proToJSONArray(String resourceName) {
        return proToJSONArray(new File(resourceName));
    }

    public static JSONArray proToJSONArray(String resourceName, boolean isOut) {
        JSONArray jsonArray = proToJSONArray(resourceName);
        if (isOut) {
            File in = new File(resourceName);
            String aimName = resourceName.substring(0, resourceName.indexOf(in.getName()))
                    + in.getName().substring(0, in.getName().indexOf("properties")) + "txt";
            out(jsonArray, new File(aimName));
        }
        return proToJSONArray(resourceName);
    }

    public static Map<String, JSONArray> proToJSONArray(String[] resourceNames) {
        Map<String, JSONArray> jsonArrayList = new HashMap<>();
        for (String resourceName : resourceNames) {
            jsonArrayList.put(resourceName.substring(0, resourceName.indexOf(".properties")), proToJSONArray(resourceName));
        }
        return jsonArrayList;
    }

    public static Map<String, JSONArray> proToJSONArray(String[] resourceNames, boolean isOut) {
        Map<String, JSONArray> jsonArrayList = new HashMap<>();
        for (String resourceName : resourceNames) {
            JSONArray jsonArray = proToJSONArray(resourceName,isOut);
            jsonArrayList.put(resourceName.substring(0, resourceName.indexOf("properties")), jsonArray);
        }
        return jsonArrayList;
    }

    private static void out(JSONArray jsonArray, File aimFile) {
        try {
            OutputStream outputStream = new FileOutputStream(aimFile);
            outputStream.write(jsonArray.toJSONString().getBytes());
            outputStream.flush();
            IOUtils.closeQuietly(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
