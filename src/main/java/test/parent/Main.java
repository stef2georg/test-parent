package test.parent;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test parent running... " + StringUtils.isBlank(""));
        Cache<Object, Object> cache = CacheBuilder.newBuilder().build();
        cache.put("ABC", "EFG");
        System.out.println("Test parent done! " + cache.getIfPresent("ABC"));
    }
}
