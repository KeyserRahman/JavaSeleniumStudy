public class cookie {
    public static void main(String[] args) {
        int num = 35;
        String str = "";

        switch (num){
            case 0:
                str ="c%";
                break;
            case 10:
                str += "is";
                break;
            case 15:
                str = "fun";
            case 20:
                str+="java";
            case 25:
                str+="is";
                break;
            case 30:
                str += "fun";
                break;
            case 35:
                str ="py";
            case 40:
                str+= "90";


        }
        System.out.println(str);

        double pie = 3.14;
        boolean  gfh = pie == 3;
        int n = 0;
        if(pie>=3.14 && !gfh){
            n+=50;
        }else{
            n-=50;
        }

        if(gfh){
            n+=50;

        }
        System.out.println(n);

        boolean dec = true;
        int num1 = 7;
        int num2 = 10;

        if (num1-- > num2*2){
            System.out.println("one");

        }else {
            System.out.println(num2);
        }

//        int who = dec>20?20:10;
//        System.out.println(who);
    }
}
