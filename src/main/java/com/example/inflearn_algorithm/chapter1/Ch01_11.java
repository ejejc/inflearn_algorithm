package com.example.inflearn_algorithm.chapter1;

import java.util.Scanner;

public class Ch01_11 {
    /**
     * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우
     * 반복되는 문자 바로 오른쪽에 반복횟수를 표기하는 방법으로
     * 문자열을 압축하는 프로그램을 작성하시오.
     * 단, 반복횟수가 1인 경우 생략
     *
     * KKHSSSSSSSE > K2HS7E
     * KSTTTSEEKFKKKDJJGG > KST3SE2KFK3DJ2G2b
     */


    public static void print() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    private static String solution(String str) {
        String result = "";
        str = str + " ";
        int cnt = 1;
        for (int i=0; i<str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) {
                cnt ++;
            } else {
                result += str.charAt(i);
                if (cnt != 1) {
                    result += Integer.toString(cnt);
                }
                cnt = 1;
            }
        }
        return result;
    }

    private static String compressionStr(String str) {
        String result = "";
        char tmp = str.charAt(0);
        int idx = 0;
        for (int i=0;i<str.length();i++) {
            if (str.charAt(i) == tmp) {
                idx++;
                tmp = str.charAt(i);
                if (i == str.length()-1) {
                    if (idx == 1) {
                        result = result + tmp;
                    } else {
                        result = result + (tmp + Integer.toString(idx));
                    }
                }
            } else {
                if (idx == 1) {
                    result = result + tmp;
                } else {
                    result = result + (tmp + Integer.toString(idx));
                }
                tmp = str.charAt(i);
                idx = 1;
                if (i == str.length()-1) {
                    if (idx == 1) {
                        result = result + tmp;
                    } else {
                        result = result + (tmp + Integer.toString(idx));
                    }
                }
            }
        }
        return result;
    }
}
