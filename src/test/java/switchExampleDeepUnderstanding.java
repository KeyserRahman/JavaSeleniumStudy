public class switchExampleDeepUnderstanding {
    public static void main(String[] args) {
//        int x = 2;
//        switch (x){
//
//            case 0:
//                System.out.println("0");
//                break;
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            default:
//                System.out.println("default");


                String token = "123";
                int tokenType = switch(token) {
                    case "123" : yield 0;
                    case "abc" : yield 1;
                    default : yield -1;
                };
                String poken = "ab";
                int pokenType = 2;
                switch (poken){
                    case "123" :
                        pokenType = 0;
                        break;
                    case "abc" :
                        pokenType = 1;
                        break;
                    default:
                        pokenType = -1;
                }
        System.out.println(pokenType);

                int x = 8;
                int y = x++;
        System.out.println("" + x + " " + y);
        }
    }

