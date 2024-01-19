package hessian;

import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;
import com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl;
import com.sun.syndication.feed.impl.ObjectBean;

import javax.xml.transform.Templates;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.HashMap;


public class Hessian_Test {
    public static void main(String[] args) throws Exception {

        testMap t= new testMap();
        t.put(1,2);
        ByteArrayOutputStream ser = new ByteArrayOutputStream();
        HessianOutput hessianOutput=new HessianOutput(ser);
        hessianOutput.writeObject(t);
        hessianOutput.close();

        System.out.println(ser);
//        System.out.println(ser.toByteArray()[0]);


        HessianInput hessianInput=new HessianInput(new ByteArrayInputStream(ser.toByteArray()));
        hessianInput.readHeader();
        hessianInput.readObject();
    }
}