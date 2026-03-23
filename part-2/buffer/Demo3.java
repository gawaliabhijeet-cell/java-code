// public void setCharAt(int index,char newchar)

class Demo3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java programming");
        sb.setCharAt(4, 'd');
        System.out.println(sb);
    }
}