// public Stringbuffer delete(int beginIntdex,int endIndex)

class Demo8 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java programming");
        sb.delete(3, 11);
        System.out.println(sb);
    }
}