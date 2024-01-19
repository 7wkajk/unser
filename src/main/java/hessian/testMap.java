package hessian;

import java.util.HashMap;

public class testMap extends HashMap {
    @Override
    public Object put(Object key, Object value) {

        System.out.println(key);
        System.out.println("test");

        return super.put(key, value);
    }
}
