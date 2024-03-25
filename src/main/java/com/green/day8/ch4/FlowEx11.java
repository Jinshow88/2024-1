package com.green.day8.ch4;

import java.util.Scanner;

public class FlowEx11 {
    public static void main(String[] args){
        System.out.print("당신의 주민등록 번호를 입력해 주세요 >>> ");
        Scanner scan = new Scanner(System.in);
        String id=scan.nextLine();
        char genderVal =id.charAt(7);
        String direcrion = "남";
        String gender = "전";
        switch(genderVal){
            default :
                System.out.println("유효하지않은 주민번호 입니다.");
                break;
            case '1': case '3':
                switch (genderVal){
                    case '3':direcrion = "후";
                }
                System.out.printf("당신은 2000년 이%s에 출생한%s자입니다.", direcrion, gender);
                break;
            case '2': case '4':
                gender = "여";
                switch(genderVal){
                    case '4': direcrion = "후";
                }
                System.out.printf("당신은 2000년 이%s에 출생한%s자입니다.", direcrion, gender);
                break;

        }
        }





//        String re = switch(ee){
//            case '1' ->"당신은 2000년 이전에 출생한 남자입니다. ";
//            case '3' ->"당신은 2000년 이후에 출생한 남자입니다. ";
//            case '2' ->"당신은 2000년 이전에 출생한 여자입니다. ";
//            case '4' ->"당신은 2000년 이후에 출생한 남여입니다. ";
//            default -> "유효하지 않은 주민등록 번호 입니다.";
//        };
//        System.out.println(re);







        /*
        1,3 >남
        2,4 >여
        '1' > "당신은 2000년 이전에 출생한 남자입니다."
        '3' > "당신은 2000년 이후에 출생한 남자입니다."
        '2' > "당신은 2000년 이전에 출생한 여자입니다."
        '4' > "당신은 2000년 이후에 출생한 여자입니다."

        Scanner객체를 통해 주민번호를 입력받으시고
        주민번호를 확인하여 여자인지 남자인지 유효하지않는 주민번호를 인지 출력
        switch
         */
    }
//}
