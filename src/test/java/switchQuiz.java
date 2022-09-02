public class switchQuiz {
    public static void main(String[] args) {
        int num = 0;
        boolean b = false;
        switch (num){
            case 0:
                b = true;
            case 1:
                System.out.println(1);
            case 2:
                if(b){
                    System.out.println(2);
                }else {
                    b = false;
                }
            case 3:
                if(b){
                    System.out.println(3);
                    break;
                }else{
                    b = true;
                }
            case 4:
                System.out.println(4);
            case 5:
                if(!b){
                    break;
                }else {
                    System.out.println(5);
                }
        }
    }
}
