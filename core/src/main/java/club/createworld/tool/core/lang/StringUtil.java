package club.createworld.tool.core.lang;

/**
 * 字符串工具类
 *
 * @author azwcl
 * @since 0.0.1
 **/

public class StringUtil {
    public static final String EMPTY_STRING = "";

    /**
     * 检查 CharSequence 是否是空
     *
     * <pre>
     * 示例:
     * StringUtil.isEmpty(null)      = true
     * StringUtil.isEmpty("")        = true
     * StringUtil.isEmpty(" ")       = false
     * </pre>
     *
     * @param val 准备检查的值，可能为 null
     * @return true - 如果待检查值为空
     * @since 0.0.1
     */
    public static boolean isEmpty(CharSequence val) {
        return val == null || val.isEmpty();
    }

    /**
     * 检查 CharSequence 是否不为空
     *
     * <pre>
     * 示例:
     * StringUtil.isNotEmpty(null)  = false
     * StringUtil.isNotEmpty("")    = false
     * StringUtil.isNotEmpty(" ")   = false
     * </pre>
     *
     * @param val 准备检查的值，可能为 null
     * @return true - 如果待检查值不为空
     * @since 0.0.1
     */
    public static boolean isNotEmpty(CharSequence val) {
        return !isEmpty(val);
    }

    /**
     * 计算 CharSequence 长度
     * <pre>
     * 示例:
     * StringUtil.length("")        = 0
     * StringUtil.length("cw")      = 2
     * StringUtil.length(" cw ")    = 4
     * </pre>
     *
     * @param val 待计算的值
     * @return CharSequence 长度
     * @since 0.0.1
     */
    public static int length(CharSequence val) {
        return val == null ? 0 : val.length();
    }

    /**
     * 检查 CharSequence 是否是空白字符串
     *
     * <pre>
     * 示例：
     * StringUtil.isBlank(null)     = true
     * StringUtil.isBlank("")       = true
     * StringUtil.isBlank(" ")      = true
     * StringUtil.isBlank("cw")     = false
     * StringUtil.isBlank(" cw ")   = false
     * </pre>
     *
     * @param val - 准备检查的值，可能为 null
     * @return true - 如果待检查的值为空白字符串
     * @since 0.0.1
     */
    public static boolean isBlank(CharSequence val) {
        int len = length(val);
        if (len == 0) {
            return true;
        }
        int i = 0;
        while (i < len) {
            if (!Character.isWhitespace(val.charAt(i++))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查 CharSequence 是否是空白字符串
     *
     * <pre>
     * 示例：
     * StringUtil.isBlank(null)     = false
     * StringUtil.isBlank("")       = false
     * StringUtil.isBlank(" ")      = false
     * StringUtil.isBlank("cw")     = true
     * StringUtil.isBlank(" cw ")   = true
     * </pre>
     *
     * @param val - 准备检查的值，可能为 null
     * @return true - 如果待检查的值不为空白字符串
     * @since 0.0.1
     */
    public static boolean isNotBlank(CharSequence val) {
        return !isBlank(val);
    }

    /**
     * 转为字符串
     *
     * @param object     对象
     * @param defaultVal 默认值
     * @return 调用对象 toString 方法；如果对象为空，则返回默认值
     * @since 0.0.1
     */
    public static String toString(Object object, String defaultVal) {
        return object == null ? defaultVal : object.toString();
    }

    /**
     * null转为字符串值
     *
     * @param object 待传输对象，可能为 null
     * @return 如果不为 null 的对象，调用其 toString 方法返回；返回空字符串，如果传入的对象是 null；
     * @since 0.0.1
     */
    public static String null2String(Object object) {
        return object == null ? EMPTY_STRING : object.toString();
    }

    /**
     * 将字符串转为 Integer 类型
     *
     * @param val 待转换的值
     * @return 返回转换的值；如果无法转换，返回 null
     * @since 0.0.1
     */
    public static Integer toInteger(CharSequence val) {
        if (isEmpty(val)) {
            return null;
        }
        try {
            return Integer.parseInt(val.toString());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * 将字符串转为 Integer 类型
     *
     * @param val          待转换的值
     * @param defaultValue 当无法转换时，返回该默认值
     * @return 返回转换的值；如果无法转换，返回传进的默认值
     * @since 0.0.1
     */
    public static Integer toInteger(CharSequence val, Integer defaultValue) {
        if (isEmpty(val)) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(val.toString());
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    /**
     * 将字符串转为 Integer 类型
     *
     * @param val          待转换 CharSequence
     * @param startIndex   起始 CharSequence 的下标，由 0 开始
     * @param endIndex     结束 CharSequence 的下标
     * @param defaultValue 默认值
     * @return 返回转换结果；如果无法转换，返回传进的默认值
     * @since 0.0.1
     */
    public static Integer toInteger(CharSequence val, Integer startIndex, Integer endIndex, Integer defaultValue) {
        int len = length(val);
        if (len == 0) {
            return defaultValue;
        }
        if (startIndex < 0 || endIndex > len - 1) {
            return defaultValue;
        }
        return toInteger(val.subSequence(startIndex, endIndex), defaultValue);
    }

    /**
     * 将字符串转为 Long 类型
     *
     * @param val 待转换的值
     * @return 返回转换的值；如果无法转换，返回 null
     * @since 0.0.1
     */
    public static Long toLong(CharSequence val) {
        if (isEmpty(val)) {
            return null;
        }
        try {
            return Long.parseLong(val.toString());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * 将字符串转为 Long 类型
     *
     * @param val          待转换的值
     * @param defaultValue 当无法转换时，返回该默认值
     * @return 返回转换的值；如果无法转换，返回传进的默认值
     * @since 0.0.1
     */
    public static Long toLong(CharSequence val, Long defaultValue) {
        if (isEmpty(val)) {
            return defaultValue;
        }
        try {
            return Long.parseLong(val.toString());
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    /**
     * 将字符串转为 Long 类型
     *
     * @param val          待转换 CharSequence
     * @param startIndex   起始 CharSequence 的下标，由 0 开始
     * @param endIndex     结束 CharSequence 的下标
     * @param defaultValue 默认值
     * @return 返回转换结果；如果无法转换，返回传进的默认值
     * @since 0.0.1
     */
    public static Long toLong(CharSequence val, Integer startIndex, Integer endIndex, Long defaultValue) {
        int len = length(val);
        if (len == 0) {
            return defaultValue;
        }
        if (startIndex < 0 || endIndex > len - 1) {
            return defaultValue;
        }
        return toLong(val.subSequence(startIndex, endIndex), defaultValue);
    }


    /**
     * 将字符串转为 Double 类型
     *
     * @param val 待转换的值
     * @return 返回转换的值；如果无法转换，返回 null
     * @since 0.0.1
     */
    public static Double toDouble(CharSequence val) {
        if (isEmpty(val)) {
            return null;
        }
        try {
            return Double.parseDouble(val.toString());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * 将字符串转为 Double 类型
     *
     * @param val          待转换的值
     * @param defaultValue 当无法转换时，返回该默认值
     * @return 返回转换的值；如果无法转换，返回传进的默认值
     * @since 0.0.1
     */
    public static Double toDouble(CharSequence val, Double defaultValue) {
        if (isEmpty(val)) {
            return defaultValue;
        }
        try {
            return Double.parseDouble(val.toString());
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    /**
     * 将字符串转为 Double 类型
     *
     * @param val          待转换 CharSequence
     * @param startIndex   起始 CharSequence 的下标，由 0 开始
     * @param endIndex     结束 CharSequence 的下标
     * @param defaultValue 默认值
     * @return 返回转换结果；如果无法转换，返回传进的默认值
     * @since 0.0.1
     */
    public static Double toDouble(CharSequence val, Integer startIndex, Integer endIndex, Double defaultValue) {
        int len = length(val);
        if (len == 0) {
            return defaultValue;
        }
        if (startIndex < 0 || endIndex > len - 1) {
            return defaultValue;
        }
        return toDouble(val.subSequence(startIndex, endIndex), defaultValue);
    }

    /**
     * 翻转字符串
     * <pre>
     * 示例：
     * StringUtils.reverse(null) = null
     * StringUtils.reverse("123") = "321"
     * StringUtils.reverse("123 ") = " 321"
     * StringUtils.reverse(" 123") = "321 "
     * StringUtils.reverse(" 123 ") = " 321 "
     * </pre>
     *
     * @param val 待翻转的字符串
     * @return 翻转后字符串
     * @since 0.0.1
     */
    public static String reverse(String val) {
        if (isBlank(val) || val.length() == 1) {
            return val;
        }

        char[] charArray = val.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char tmp = charArray[left];
            charArray[left++] = charArray[right];
            charArray[right--] = tmp;
        }

        return new String(charArray);
    }

    /**
     * 替换字符串中指定子串
     * <p>
     * <pre>
     * 示例：
     * StringUtil.replace("Hello, world!","Hello", "hi") = "hi, world!"
     * StringUtil.replace("Hello, world!"," ", ",") = "Hello,,world!"
     * StringUtil.replace("   "," ", "hi ") = "hi hi hi "
     * </pre>
     *
     * @param source      源字符串
     * @param target      目标字符串
     * @param replacement 替换字符串
     * @return 返回替换完成字符串
     * @since 0.0.1
     */
    public static String replace(String source, String target, String replacement) {
        if (source == null || target == null || replacement == null || isEmpty(target)) {
            return source;
        }

        StringBuilder result = new StringBuilder();
        int idx = 0;
        int targetLength = target.length();

        while (idx < source.length()) {
            int foundIndex = source.indexOf(target, idx);

            if (foundIndex == -1) {
                result.append(source.substring(idx));
                break;
            }

            result.append(source, idx, foundIndex);
            result.append(replacement);
            idx = foundIndex + targetLength;
        }

        return result.toString();
    }
}
