package com.green.day8.ch4;

public class FlowEx19 {
    public static void main(String[]args) {

        for(int i=1; i<4; i++) {
            for (int z = 1; z < 4; z++) {
                for (int s = 1; s < 4; s++) {

                    System.out.printf("%d%d%d", i, z, s);
                    System.out.println();
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
