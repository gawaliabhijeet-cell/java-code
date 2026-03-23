// public void setLength(int length)

class Demo1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java programming");
        sb.setLength(2);
        System.out.println(sb);
        System.out.println(sb.length());
    }
}