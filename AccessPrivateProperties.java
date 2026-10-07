//package genericMethod;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class AccessPrivateProperties {

    private static int tid = 55;
    private String tstr = "This is Private Data  Member of Class";

    public static void main(String[] args)throws Exception {
        
        AccessPrivateProperties tc = new AccessPrivateProperties();
        Class c1 = tc.getClass();
        System.out.println("Name of Class:"+c1.getName());

        Field[] field = c1.getDeclaredFields();

        for(Field f:field)
        {
            System.out.println(f.getName()+" ->"+Modifier.toString(f.getModifiers()));

        }

        Field str1 = c1.getDeclaredField("tstr");
        str1.setAccessible(true);
        String whatsintstr = (String) str1.get(tc);
        System.out.println("Information hiding in tstr is:"+whatsintstr);
    }
}
