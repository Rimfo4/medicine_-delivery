import java.util.Scanner;

public class Medicine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(InputData.name+"님의 진단을 시작하겠습니다.\n"); //사용자 이름 필요
        System.out.println("다음 중 아프신 신체부위를 선택해주세요.");
        System.out.println("1. 머리 | 2. 상체 | 3. 하체");

        String temp = sc.next();
        while(temp.isEmpty() || temp.length() > 3){
            System.out.println("다시 입력해주십시오.");
            temp = sc.next();
        }
        System.out.println();
        while(InputData.calcSelect(temp, '3')){
            System.out.println("다시 제대로 입력해주십시오.");
            temp = sc.next();
            if(!(InputData.calcSelect(temp,'3'))) break;
        }
        String spin1 = temp;
        byte cnt1 = 0;
        while(spin1.length() != cnt1){
            switch(spin1.charAt(cnt1)){
                case '1' -> {
                    System.out.println("머리에서 아프신 부위를 골라주세요.");
                    System.out.println("1. 머리 | 2. 눈 | 3. 코 | 4. 입 | 5. 귀 | 6. 목");
                    temp = sc.next();
                    while(temp.isEmpty() || temp.length() > 6) {
                        System.out.println("다시 입력해주십시오.");
                        temp = sc.next();
                    }
                    while(InputData.calcSelect(temp, '6')){
                        System.out.println("다시 제대로 입력해주십시오.");
                        temp = sc.next();
                        if(!(InputData.calcSelect(temp,'6'))) break;
                    }
                    String spin2 = temp;
                    byte cnt2 = 0;
                    while(spin2.length() != cnt2){
                        System.out.println("현재 겪고있는 증상을 입력해주십시오.");
                        switch(spin2.charAt(cnt2)){
                            case '1' -> {
                                System.out.println("1. 두통 | 2. 어지럼증 | 3. 탈모 | 4. 머리 부종/멍");
                                temp = sc.next();
                                while(temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp, '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp, '4'))) break;
                                }
                                cnt2++;
                            }
                            case '2' -> {
                                System.out.println("1. 시야 흐림 | 2. 눈 충혈 | 3. 눈 통증 | 4. 눈 피로");
                                temp = sc.next();
                                while(temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp, '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp, '4'))) break;
                                }
                                cnt2++;
                            }
                            case '3' -> {
                                System.out.println("1. 코막힘 | 2. 콧물 | 3. 코피 | 4. 재채기 ");
                                temp = sc.next();
                                while(temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp,  '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp,  '4'))) break;
                                }
                                cnt2++;
                            }
                            case '4' -> {
                                System.out.println("1. 입 마름 | 2. 잇몸 출혈 | 3. 입술 갈라짐 ");
                                temp = sc.next();
                                while(temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp,  '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp,  '4'))) break;
                                }
                                cnt2++;
                            }
                            case '5' -> {
                                System.out.println("1. 귀 통증 | 2. 이명(귀울림) | 3. 청력 감소 | 4. 귀 가려움");
                                temp = sc.next();
                                while(temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp,  '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp,  '4'))) break;
                                }
                                cnt2++;
                            }
                            case '6' -> {
                                System.out.println("1. 목 결림 | 2. 삼킴 곤란 | 3. 뻐근함 | 4. 부종");
                                temp = sc.next();
                                while(temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp,  '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp,  '4'))) break;
                                }
                                cnt2++;
                            }
                        }
                    }
                    cnt1++;
                }
                case '2' -> {
                    System.out.println("상체에서 아프신 부위를 골라주세요.");
                    System.out.println("1. 어깨 | 2. 가슴 | 3. 팔 | 4. 손 | 5. 등 | 6. 배 | 7. 허리");
                    temp = sc.next();
                    while(temp.isEmpty() || temp.length() > 7) {
                        System.out.println("다시 입력해주십시오.");
                        temp = sc.next();
                    }
                    while(InputData.calcSelect(temp,  '7')){
                        System.out.println("다시 제대로 입력해주십시오.");
                        temp = sc.next();
                        if(!(InputData.calcSelect(temp,  '7'))) break;
                    }
                    String spin2 = temp;
                    byte cnt2 = 0;
                    while(spin2.length() != cnt2){
                        System.out.println("현재 겪고있는 증상을 입력해주십시오.");
                        switch(spin2.charAt(cnt2)){
                            case '1' -> {
                                System.out.println("1. 어깨 결림 | 2. 관절 통증 | 3. 움직임 제한 | 4. 근육 뭉침");
                                temp = sc.next();
                                while(temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp,  '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp,  '4'))) break;
                                }
                                cnt2++;
                            }
                            case '2' -> {
                                System.out.println("1. 흉통 | 2. 답답함 | 3. 호흡 곤란 | 4. 심계항진");
                                temp = sc.next();
                                while(temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp,  '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp,  '4'))) break;
                                }
                                cnt2++;
                            }
                            case '3' -> {
                                System.out.println("1. 팔 저림 | 2. 근육 통증 | 3. 힘 빠짐 | 4. 관절 통증");
                                temp = sc.next();
                                while(temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp, '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp, '4'))) break;
                                }
                                cnt2++;
                            }
                            case '4' -> {
                                System.out.println("1. 손가락 저림 | 2. 손목 통증 | 3. 손끝 감각 둔화 | 4. 붓기");
                                temp = sc.next();
                                while(temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp, '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!InputData.calcSelect(temp, '4')) break;
                                }
                                cnt2++;
                            }
                            case '5' -> {
                                System.out.println("1. 등 통증 | 2. 근육 긴장 | 3. 허리까지 방사통 | 4. 피로감");
                                temp = sc.next();
                                while(temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp, '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!InputData.calcSelect(temp, '4')) break;
                                }
                                cnt2++;
                            }
                            case '6' -> {
                                System.out.println("1. 복통 | 2. 소화불량 | 3. 구토 | 4. 복부 팽만");
                                temp = sc.next();
                                while(temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp, '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!InputData.calcSelect(temp, '4')) break;
                                }
                                cnt2++;
                            }
                            case '7' -> {
                                System.out.println("1. 요통 | 2. 근육 경직 | 3. 좌골신경통 | 4. 움직임 제한");
                                temp = sc.next();
                                while(temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp, '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!InputData.calcSelect(temp, '4')) break;
                                }
                                cnt2++;
                            }
                        }
                    }
                    cnt1++;
                }
                case '3' -> {
                    System.out.println("하체에서 아프신 부위를 골라주세요.");
                    System.out.println("1. 급소 | 2. 엉덩이 | 3. 허벅지 | 4. 무릎 | 5. 종아리 | 6. 발목 | 7. 발");
                    temp = sc.next();
                    while(temp.isEmpty() || temp.length() > 7) {
                        System.out.println("다시 입력해주십시오.");
                        temp = sc.next();
                    }
                    while(InputData.calcSelect(temp, '4')){
                        System.out.println("다시 제대로 입력해주십시오.");
                        temp = sc.next();
                        if(!InputData.calcSelect(temp, '4')) break;
                    }
                    String spin2 = temp;
                    byte cnt2 = 0;
                    while(spin2.length() != cnt2){
                        System.out.println("현재 겪고있는 증상을 입력해주십시오.");
                        switch (spin2.charAt(cnt2)) {
                            case '1' -> {
                                System.out.println("1. 심한 통증 | 2. 부종 | 3. 타격 시 어지럼 | 4. 힘 빠짐");
                                temp = sc.next();
                                while (temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp, '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp, '4'))) break;
                                }
                                cnt2++;
                            }
                            case '2' -> {
                                System.out.println("1. 근육통 | 2. 좌골신경통 | 3. 피부 통증 | 4. 멍");
                                temp = sc.next();
                                while (temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp, '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp, '4'))) break;
                                }
                                cnt2++;
                            }
                            case '3' -> {
                                System.out.println("1. 근육통 | 2. 타박상 | 3. 근육 경련 | 4. 피부 발진");
                                temp = sc.next();
                                while (temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp, '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp, '4'))) break;
                                }
                                cnt2++;
                            }
                            case '4' -> {
                                System.out.println("1. 통증 | 2. 부종 | 3. 관절 소리 | 4. 움직임 제한");
                                temp = sc.next();
                                while (temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp, '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp, '4'))) break;
                                }
                                cnt2++;
                            }
                            case '5' -> {
                                System.out.println("1. 근육 경련 | 2. 부종 | 3. 통증 | 4. 피로감");
                                temp = sc.next();
                                while (temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp, '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp, '4'))) break;
                                }
                                cnt2++;
                            }
                            case '6' -> {
                                System.out.println("1. 염좌 | 2. 부기 | 3. 통증 | 4. 불안정감");
                                temp = sc.next();
                                while (temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp, '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp, '4'))) break;
                                }
                                cnt2++;
                            }
                            case '7' -> {
                                System.out.println("1. 발바닥 통증 | 2. 무좀 | 3. 발가락 변형 | 4. 저림");
                                temp = sc.next();
                                while (temp.isEmpty() || temp.length() > 4) {
                                    System.out.println("다시 입력해주십시오.");
                                    temp = sc.next();
                                }
                                while(InputData.calcSelect(temp,  '4')){
                                    System.out.println("다시 제대로 입력해주십시오.");
                                    temp = sc.next();
                                    if(!(InputData.calcSelect(temp,  '4'))) break;
                                }
                                cnt2++;
                            }
                        }
                    }
                    cnt1++;
                }
            }
        }
    }
}