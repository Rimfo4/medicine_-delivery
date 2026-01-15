import java.util.Scanner;

public class InputData {
    static String name;
    static String addr;
    static String disease_name;
    static String drug;
    //1. 감기
    //2. 근육통
    //3. 신경통
    //4. 척추통
    //5. 흉부통
    //6. 만성 피로
    //7. 알레르기
    //8. 관절염
    //9. 배뇨 이상
    //10. 영양 결핍
    static int[] disease = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    static public boolean calcSelect(String str, char b){
        //81 == 선택지의 최소값(숫자 1), b == 선택지의 최대값
        boolean flag = false;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < '1' || str.charAt(i) > b){ // **선택지 범위를 넘어가면 true**
                flag = true;
            }
        }
        return flag;
    }
    static public String calcException(String str, int leng, Scanner sc){
        while(str.isEmpty() || str.length() > leng) {
            System.out.println("다시 입력해주십시오.");
            str = sc.next();
        }
        while(InputData.calcSelect(str, Integer.toString(leng).charAt(0))){
            System.out.println("다시 제대로 입력해주십시오.");
            str = sc.next();
            if(!(InputData.calcSelect(str,Integer.toString(leng).charAt(0)))) break;
        }
        return str;
    }
    static public void rank(){
        int max = 0;
        for (int i = 0; i < disease.length-1; i++) {
            if (disease[0] < disease[i+1]){
                max=i+1;
            }
        }
        switch (max){
            case 0: disease_name = "감기"; drug = "타이레놀"; break;
            case 1: disease_name = "근육통"; drug = "리렉스펜"; break;
            case 2: disease_name = "신경통"; drug = "클라렉신"; break;
            case 3: disease_name = "척추통"; drug = "에어탈"; break;
            case 4: disease_name = "흉부통"; drug = "박사르"; break;
            case 5: disease_name = "만성 피로"; drug = "투 엑스비"; break;
            case 6: disease_name = "알레르기"; drug = "알레그라"; break;
            case 7: disease_name = "관절염"; drug = "콕스비토"; break;
            case 8: disease_name = "배뇨 이상"; drug = "유리타민"; break;
            case 9: disease_name = "영양 결핍"; drug = "비나폴로"; break;

        }
    }
    static public void calcRanked(String str, int i){
        byte cnt = 0;
        while(str.length() != cnt){
            switch(i){
                case 1 -> {
                    switch(str.charAt(cnt)){
                        case '1' -> {
                            disease[0] += 5;
                            disease[5] += 3;
                            cnt++;
                        }
                        case '2' ->{
                            disease[0] += 3;
                            disease[5] += 5;
                            cnt++;
                        }
                        case '3' ->{
                            disease[0] += 1;
                            disease[5] += 1;
                            disease[9] += 5;
                            cnt++;
                        }
                        case '4' ->{
                            disease[0] += 3;
                            disease[5] += 3;
                            disease[9] += 1;
                            cnt++;
                        }
                    }
                }
                case 2 ->{
                    switch(str.charAt(cnt)){
                        case '1' -> {
                            disease[9] += 5;
                            cnt++;
                        }
                        case '2' -> {
                            disease[6] += 5;
                            disease[5] += 3;
                            cnt++;
                        }
                        case '3' ->{
                            disease[9] += 1;
                            disease[6] += 3;
                            cnt++;
                        }
                        case '4' -> {
                            disease[6] += 3;
                            disease[9] += 1;
                            disease[5] += 5;
                            cnt++;
                        }

                    }
                }
                case 3 ->{
                    switch(str.charAt(cnt)){
                        case '1', '3' ->{
                            disease[0] += 5;
                            disease[6] += 3;
                            cnt++;
                        }
                        case '2','4' -> {
                            disease[0] += 3;
                            disease[6] += 5;
                            cnt++;
                        }
                    }
                }
                case 4 -> {
                    switch(str.charAt(cnt)){
                        case '1', '3' -> {
                            disease[5] += 5;
                            disease[9] += 3;
                            cnt++;
                        }
                        case '2' -> {
                            disease[5] += 1;
                            disease[9] += 5;
                            cnt++;
                        }
                    }
                }
                case 5 -> {
                    switch(str.charAt(cnt)){
                        case '1' -> {
                            disease[6] += 5;
                            cnt++;
                        }
                        case '2' -> {
                            disease[0] += 1;
                            disease[6] += 5;
                            cnt++;
                        }
                    }
                }
                case 6 -> {
                    switch(str.charAt(cnt)){
                        case '1', '2' -> {
                            disease[2] += 1;
                            disease[3] += 5;
                            cnt++;
                        }
                        case '3' -> {
                            disease[0] += 3;
                            disease[3] += 3;
                            cnt++;
                        }
                    }
                }
                case 7 -> {
                    switch(str.charAt(cnt)){
                        case '1' -> {
                            disease[1] += 5;
                            disease[7] += 3;
                            cnt++;
                        }
                        case '2' -> {
                            disease[1] += 3;
                            disease[7] += 5;
                            cnt++;
                        }
                        case '3' -> {
                            disease[1] += 5;
                            disease[7] += 1;
                            cnt++;
                        }
                    }
                }
                case 8 -> {
                    switch(str.charAt(cnt)){
                        case '1', '2' -> {
                            disease[4] += 5;
                            cnt++;
                        }
                        case '3' -> {
                            disease[0] += 3;
                            disease[4] += 5;
                            cnt++;
                        }
                    }
                }
                case 9 ->{
                    switch(str.charAt(cnt)){
                        case '1' -> {
                            disease[2] += 5;
                            cnt++;
                        }
                        case '2' -> {
                            disease[1] += 5;
                            cnt++;
                        }
                        case '3', '4' -> {
                            disease[1] += 3;
                            cnt++;
                        }
                    }
                }
                case 10 -> {
                    switch(str.charAt(cnt)){
                        case '1' -> {
                            disease[2] += 5;
                            cnt++;
                        }
                        case '2' -> {
                            disease[7] += 5;
                            cnt++;
                        }
                    }
                }
                case 11 -> {
                    switch(str.charAt(cnt)){
                        case '1', '3' -> {
                            disease[3] += 5;
                            cnt++;
                        }
                        case '2', '4' -> {
                            disease[5] += 5;
                            cnt++;
                        }
                    }
                }
                case 12 ->{
                    switch(str.charAt(cnt)){
                        case '1' -> {
                            disease[6] += 5;
                            cnt++;
                        }
                        case '2', '3' -> {
                            disease[9] += 5;
                            cnt++;
                        }
                        case '4' -> {
                            disease[8] += 5;
                            cnt++;
                        }
                    }
                }
                case 13 -> {
                    switch(str.charAt(cnt)){
                        case '1' -> {
                            disease[3] += 5;
                            disease[8] += 5;
                            cnt++;
                        }
                        case '2' -> {
                            disease[3] += 5;
                            disease[9] += 3;
                            cnt++;
                        }
                        case '3', '4' -> {
                            disease[2] += 5;
                            cnt++;
                        }
                    }
                }
                case 14 ->{
                    switch(str.charAt(cnt)){
                        case '1', '2' -> {
                            disease[8] += 5;
                            cnt++;
                        }
                    }
                }
                case 15 ->{
                    switch(str.charAt(cnt)){
                        case '1' -> {
                            disease[1] += 5;
                            cnt++;
                        }
                        case '2' -> {
                            disease[2] += 5;
                            cnt++;
                        }
                        case '3' -> {
                            disease[6] += 5;
                            cnt++;
                        }
                    }
                }
                case 16 ->{
                    switch(str.charAt(cnt)){
                        case '1' -> {
                            disease[1] += 5;
                            cnt++;
                        }
                        case '2' -> {
                            disease[9] += 5;
                            cnt++;
                        }
                        case '3' -> {
                            disease[6] += 5;
                            cnt++;
                        }
                    }
                }
                case 17 ->{
                    switch(str.charAt(cnt)){
                        case '1' -> {
                            disease[4] += 5;
                            cnt++;
                        }
                        case '2' -> {
                            disease[8] += 5;
                            cnt++;
                        }
                        case '3', '4' -> {
                            disease[7] += 5;
                        }
                    }
                }
                case 18 ->{
                    switch(str.charAt(cnt)){
                        case '1' -> {
                            disease[1] += 5;
                            disease[9] += 5;
                            cnt++;
                        }
                        case '2' -> {
                            disease[8] += 5;
                            cnt++;
                        }
                        case '3' -> {
                            disease[3] += 5;
                            disease[8] += 5;
                            cnt++;
                        }
                        case '4' -> {
                            disease[5] += 5;
                            cnt++;
                        }
                    }
                }
                case 19 ->{
                    switch(str.charAt(cnt)){
                        case '1', '2' -> {
                            disease[2] += 5;
                            cnt++;
                        }
                        case '3' -> {
                            disease[3] += 5;
                            disease[8] += 5;
                            cnt++;
                        }
                        case '4' -> {
                            disease[7] += 5;
                            cnt++;
                        }
                    }
                }
                case 20 ->{
                    switch(str.charAt(cnt)){
                        case '1', '2', '3' -> {
                            disease[5] += 5;
                            cnt++;
                        }
                        case '4' -> {
                            disease[2] += 5;
                            cnt++;
                        }
                    }
                }
            }
        }
    }
}
