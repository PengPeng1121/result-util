package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 25月16天~26月15天
 */
public enum Scale_36 {

    score_1("1","0-40"),

    score_2("2","41-44"),

    score_3("3","45-48"),

    score_4("4","49-51"),

    score_5("5","52-54"),

    score_6("6","55-56"),

    score_7("7","57-59"),

    score_8("8","60-61"),

    score_9("9","62-64"),

    score_10("10","65-66"),

    score_11("11","67-68"),

    score_12("12","69-70"),

    score_13("13","71-72"),

    score_14("14","73-73"),

    score_15("15","74-74"),

    score_16("16","-"),

    score_17("17","75-75"),

    score_18("18","76-76"),

    score_19("19","77-91");

    private String name;

    private String index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    Scale_36(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_36 o : Scale_36.values()) {
            String arr[] = o.getIndex().split("-");
            if(arr.length!=0) {
                Integer begin = Integer.parseInt(arr[0]);
                Integer end = Integer.parseInt(arr[1]);
                if (begin <= index && index <= end) {
                    name = o.getName();
                    break;
                }
            }
        }
        return name;
    }
}
