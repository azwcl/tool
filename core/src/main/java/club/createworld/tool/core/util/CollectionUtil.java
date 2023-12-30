package club.createworld.tool.core.util;

import java.util.Collection;
import java.util.Map;

/**
 * 集合工具类
 *
 * @author azwcl
 * @since 0.0.1
 **/
public class CollectionUtil {

    /**
     * 判断一个集合是否为空集合
     *
     * @param collection 待判断集合，可能为 null
     * @return true - 如果待判断集合为空集合
     * @since 0.0.1
     */
    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * 判断一个集合是否为空集合
     *
     * @param map 待判断集合，可能为 null
     * @return true - 如果待判断集合为空集合
     * @since 0.0.1
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    /**
     * 判断一个集合是否不为空集合
     *
     * @param collection 待判断集合，可能为 null
     * @return true - 如果待判断集合不为空集合
     * @since 0.0.1
     */
    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    /**
     * 判断一个集合是否不为空集合
     *
     * @param map 待判断集合，可能为 null
     * @return true - 如果待判断集合不为空集合
     * @since 0.0.1
     */
    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }

    /**
     * 集合转换成数组
     *
     * @param collection 待转换集合
     * @param <T>        泛型标识
     * @return 返回转换完成数组；可能为 null，当传入的 collection 为 null 时；
     * @since 0.0.1
     */
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(Collection<T> collection) {
        if (collection == null) {
            return null;
        }
        if (isEmpty(collection)) {
            return (T[]) new Object[0];
        }

        T[] array = (T[]) new Object[collection.size()];

        return collection.toArray(array);
    }
}
