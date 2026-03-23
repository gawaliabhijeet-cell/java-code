// public void trimToSize

public class Demo13 {
    public static void main(String arg[]) {
        StringBuffer sb = new StringBuffer(100);
        System.out.println(sb.capacity());
        sb.append("java");
        sb.trimToSize();
        System.out.println(sb.capacity());
    }

}
