/**
 * @author : joisen
 * @date : 9:52 2022/10/23
 */
public class TestOperator {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        Boolean isEqual = s1 == s2;
        System.out.println(isEqual);
        System.out.println(s1.equals(s2));
        System.out.println("===========================");
        // 赋值运算符
        byte b = 10;
        b = (byte) (b+1); // 需要强转
        b += 1;  // 不需要强转
        System.out.println(b);

        int x = 15;
        int y = x ++;// 先将x赋值给y  再执行x+1操作
        System.out.println("x="+x+",y="+y);
        x = 15;
        y = ++ x;// 先对x执行+1操作，再赋值
        System.out.println("x="+x+",y="+y);

        // 执行过程： 底层将该操作拆分：temp = x++;x=tmp
        x = 23;
        x = x ++;
        System.out.println("x="+x);

    }
}
