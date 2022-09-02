public class intDemo {
    public static void main(String[] args) {
        int num = 15;
        System.out.println(++num + "  " + num++);

        int s  = 3*10;
        s += -10;
        s = s - 5;
        System.out.println(s);

        boolean one = false && 'c' =='z';
        boolean two = one || true;
        System.out.println(two);

        long l = 100;
        short s1 = (short)(l+10);
        System.out.println(s1);


        byte by = 50;
        boolean bo = by<100;
        if(bo){
            by-=25;

        }else{
            by=100;
        }
        System.out.println(by);

        boolean boo = false;
        if(!boo){
            System.out.println("j");
        }else{
            System.out.println("s");
        }
    }
}
