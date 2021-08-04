public class App {
    static String global;
    public static void main (String[] args){
        sum();

        short s = 10; //-332768 -> 32767
        int i = 100; // -2^23 -> 2^31-1
        long l=100l;
        long l2 = 100000000; //-2^63
        // chuỗi dùng nháy đôi, kí tự thì nháy đơn

        float f = 4.14f;
        double d = 5.7;
        char c3 = 65; //=> kí tự số 65 trong bảng mã SKII = 'A'
        char c1 = 'a';
        char c = '5';
        boolean b1 = true;
        boolean b2 = false;
        Integer ref_i = 100;

        Integer a = 100;
        Integer b = 200;
        System.out.println("a=" + a + ", b=" +b);
        swap (a,b);
        System.out.println("a=" + a + ", b=" +b);

        SimpleSeason se = SimpleSeason.AUTUMM;
        System.out.println(se);

        Season se1 = Season.SPRING;
        System.out.println(se1.getValue());
    }


    static void swap(Integer a, Integer b){
        Integer tmp=a;
        a=b;
        b=tmp;
        System.out.println(" swap: a=" + a + ", b=" +b);
    }
    public static void sum (){
        System.out.println(global);
    }
}
