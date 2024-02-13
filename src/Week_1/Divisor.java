package Week_1;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        // 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다.
        // 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
        // 첫째 줄에 N의 진짜 약수의 개수가 주어진다.
        // 둘째 줄에는 N의 진짜 약수가 주어진다.
        // 1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다. int범위
        // 2 약수의 개수
        // 4 2 약수들
        // 약수들의 최솟값과 최고값을 곱한 값이 N이 되겠다!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n != 1) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int max = a[0];
            int min = a[1];
            for (int i = 0; i < n; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
                if (a[i] > max) {
                    max = a[i];
                }
            }
            System.out.println(min * max);

        }else {
            int a = sc.nextInt();
            System.out.println(a * a);
        }




    }
}
