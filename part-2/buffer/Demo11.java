// public in capacity()

class Demo11 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        int a;
        a = sb.capacity();// 16
        System.out.println(a);
        sb.append("java programming language");
        a = sb.capacity();
        System.out.println(a);
    }
}