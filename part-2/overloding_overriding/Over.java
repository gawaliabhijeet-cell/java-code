class Text
{
    int a, b;

    void putdata()
    {
        a = 10;
        b = 23;
    }

    void putdata(int a1)
    {
        a = a1;
        b = 200;
    }

    void putdata(int a1, int b2)
    {
        a = a1;
        b = b2;   //  corrected
    }

    void display()
    {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}

class Over
{
    public static void main(String arg[])
    {
        Text t1 = new Text();
        Text t2 = new Text();
        Text t3 = new Text();

        t1.putdata();
        t2.putdata(100);
        t3.putdata(1000, 2000);

        t1.display();
        t2.display();
        t3.display();
    }
}
