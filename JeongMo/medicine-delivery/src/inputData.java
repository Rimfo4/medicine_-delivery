public class InputData {
    static String name;
    static String addr;
    private String inputData = "";

    public String getInputData() {
        return this.inputData;
    }
    public void setInputData(String inputData) {
        this.inputData = inputData;
    }
    public void addData(String data) {
        this.inputData += data;
    }
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
}
