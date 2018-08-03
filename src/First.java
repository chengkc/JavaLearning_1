import java.security.SecureRandom;
import java.util.Scanner;

public class First {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int num_times=in.nextInt();//输入次数
        String str_input=in.next();//输入字符串
        char ch_last=' ';
        int num_op=0;
        int num_times_repeat=0;
        for(;num_op<str_input.length();num_op++)
        {
            if(ch_last== str_input.charAt(num_op))
                num_times_repeat++;
            else
            {
                ch_last=str_input.charAt(num_op);
                num_times_repeat=1;
            }

            if(num_times_repeat>=num_times)
            {
                System.out.println(ch_last);
                break;
            }
        }

    }
}
