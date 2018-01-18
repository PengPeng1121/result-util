package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 5月16天~6月15天
 */
public enum Scale_16 {

    score_1("1","0-17"),

    score_2("2","18-18"),

    score_3("3","19-19"),

    score_4("4","20-20"),

    score_5("5","21-21"),

    score_6("6","22-22"),

    score_7("7","23-24"),

    score_8("8","25-25"),

    score_9("9","26-26"),

    score_10("10","27-27"),

    score_11("11","28-29"),

    score_12("12","30-30"),

    score_13("13","31-32"),

    score_14("14","33-33"),

    score_15("15","34-34"),

    score_16("16","35-36"),

    score_17("17","37-37"),

    score_18("18","38-39"),

    score_19("19","40-91");

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

    Scale_16(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_16 o : Scale_16.values()) {
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
