package com.example.inflearn_algorithm.arrays_algorithm;

import java.sql.Array;
import java.util.*;

public class Ch02_12 {
    /**
     * 현수네 반 선생님은 반 학생들의 수학점수를 향상시키기 위해 멘토링 시스템을 만들었다.
     * 멘토링은 멘토와 멘티가 한 짝이 되어 멘토가 멘티의 수학공부를 도와주는 것이다.
     *
     * 선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정하게 된다.
     * 만약 A학생이 멘토이고 B학생이 멘티가 되는 짝이 되었다면,
     * A학생은 M번의 수학테스트에서 모두 B학생 보다 등수가 엎서야 한다.
     *
     */

    public static void prints() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, m, arr));
    }

    private static int solution(int sn, int tn, int[][] arr) {
        int result = 0;
        int[] studentArr = new int[sn];
        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<Integer, Integer> cntMap = new HashMap<>();
        // 학생들의 번호를 넣어준다.
        for (int i=0; i<sn; i++) {
            studentArr[i] = arr[0][i];
            map.put(studentArr[i], new ArrayList<>());
            cntMap.put(studentArr[i], 0);
        }

        for (int x=0; x<tn; x++) {
            for (int t=0; t<sn; t++) {
                List<Integer> list =map.get(studentArr[t]);
                for (int y=0; y<sn; y++) {
                    if (arr[x][y] == studentArr[t]) break;
                    list.add(arr[x][y]);
                }
                map.put(studentArr[t], list);
            }
        }

        for (int i=0; i<sn; i++) {
            List<Integer> list = map.get(studentArr[i]);
            for (int seq : list) {
                int cnt = cntMap.get(seq);
                cnt = cnt + 1;
                cntMap.put(seq, cnt);
            }
            for (int j=0; j<sn; j++) {
                int cnt = cntMap.get(studentArr[j]);
                if (cnt == tn)  result++;
                cntMap.put(studentArr[j], 0);
            }
        }


        return result;
    }

    private static int solution2(int n, int m, int[][] arr) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            for (int j=1;j<=n;j++) {
                int cnt = 0;
                for (int k=0; k<m; k++) {
                    int pi=0, pj=0;
                    for (int s=0; s<n; s++) {
                        if (arr[k][s] == i) pi = s;
                        if (arr[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) answer++;
            }
        }
        return answer;
    }
}
