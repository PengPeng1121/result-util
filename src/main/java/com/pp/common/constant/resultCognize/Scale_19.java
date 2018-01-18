package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 8月16天~9月15天
 */
public enum Scale_19 {

    score_1("1","0-21"),

    score_2("2","22-23"),

    score_3("3","24-24"),

    score_4("4","25-25"),

    score_5("5","26-27"),

    score_6("6","28-28"),

    score_7("7","29-30"),

    score_8("8","31-31"),

    score_9("9","32-33"),

    score_10("10","34-34"),

    score_11("11","35-36"),

    score_12("12","37-37"),

    score_13("13","38-39"),

    score_14("14","40-40"),

    score_15("15","41-42"),

    score_16("16","43-43"),

    score_17("17","44-45"),

    score_18("18","46-46"),

    score_19("19","47-91");

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

    Scale_19(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_19 o : Scale_19.values()) {
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
