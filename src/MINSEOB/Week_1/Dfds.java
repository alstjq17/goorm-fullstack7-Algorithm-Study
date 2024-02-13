package MINSEOB.Week_1;

import java.util.Scanner;

public class Dfds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long num = 0;
        // 문제에 제시된 N의 최대값은 1,000,000이므로 long으로 설정해야한다.
        for (int i = 1; i <= x; i++) {
//            이 문제는 시간초과로 인해서 문제접근을 다르게 해야한다.
//            g(6) = f(1) + f(2) + f(3) + f(4) + f(5) + f(6)
            /*
            f(1) = 1
            f(2) = 1 2
            f(3) = 1 3
            f(4) = 1 2 4
            f(5) = 1 5
            f(6) = 1 2 3 6
            g(6)에서 1*6  2*3 3*2 4*1 5*1 6*1 씩이다.
            1은 1로 나눈 몫 6이 들어가고
            2이상도 나눈 몫으로 계산이 되었다.
            */
            num += (x/i)*i;
        }

        System.out.println(num);
    }
}
