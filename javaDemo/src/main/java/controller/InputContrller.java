package controller;

import java.util.Scanner;
import java.util.regex.Pattern;
import static config.Ten2ThirtySix.DeciamlToThirtySix;
import static config.Ten2ThirtySix.ThirtysixToDeciaml;


public class InputContrller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputString;
        while (true) {//当输入的数据是exit退出输入
            System.out.println("请输入（0~9）或（A~Z）： ");
            inputString = sc.nextLine();

            if (!inputString.matches("^[0-9A-Z]+$")) {
                System.out.println("您输入的字符串含有特殊字符，请重新输入：");
                continue;
            }
            if (inputString.length() > 4) {
                System.out.println("您输入的字符串不符合，请输入长度小于或等于4");
                continue;
            }
            //判断输入数字是否含有字母，以确认采用的进制
            if (Pattern.matches(".*[A-Z]+.*", inputString)) {
                //输入的参数含有字母
                //1.1将36进制数字转换成十进制数
                int x = ThirtysixToDeciaml(inputString);
                if (x < 9999) {
                    System.out.println("温馨提示：您输入数值没有达到十进制四位数上限，可以采用（0~9的四位数满足需求）");
                }
                //1.2在十进制数上加1，然后转换成36进制数，打印输出
                System.out.println(DeciamlToThirtySix(x + 1));
            } else {
                String outputString;
                //输入的参数不包含字母
                if (!inputString.equals("9999")) {
                    int outputint = Integer.parseInt(inputString) + 1;
                    outputString = Integer.toString(outputint);
                } else {
                    outputString = "999A";
                }
                System.out.println(outputString);
            }

        }
    }
}
