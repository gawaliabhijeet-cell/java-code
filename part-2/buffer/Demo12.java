// public void insureCapacity(int capacity)

public class Demo12 {

    public static void main(String arg[]) {
        StringBuffer sb = new StringBuffer();
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

    }
}