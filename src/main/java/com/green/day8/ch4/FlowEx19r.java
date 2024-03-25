package com.green.day8.ch4;

public class FlowEx19r {
    public static void main(String[]args) {
        final int LAST_NUM=3;

        for(int i=1; i<LAST_NUM; i++) {
            for (int z = 1; z < LAST_NUM; z++) {
                for (int s = 1; s < LAST_NUM; s++) {

                    System.out.printf("%d%d%d\n", i, z, s);
//                    System.out.println();
                }

            }
//            System.out.println();
        }
//        System.out.println();








        /*
        반복문을 활용하여 이렇게 출력해 주세요
        111
        112
        113
        121
        122
        123
        131
        132
        133
        ...
        333

         */
    }
}
