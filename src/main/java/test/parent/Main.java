package test.parent;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("Test parent running... " + StringUtils.isBlank(""));

        Cache<Object, Object> cache = CacheBuilder.newBuilder().build();
        cache.put("ABC", "EFG");
        System.out.println("Test parent done! " + cache.getIfPresent("ABC"));

        Class<?> clazz = Class.forName("test.child.Task");
        Method addMethod = clazz.getMethod("add", int.class, int.class);
        Integer result = (Integer) addMethod.invoke(null,2, 3);
        System.out.println("Result " + result);
    }
}
