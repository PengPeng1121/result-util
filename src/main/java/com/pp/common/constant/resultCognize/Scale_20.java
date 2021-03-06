package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 9月16天~10月15天
 */
public enum Scale_20 {

    score_1("1","0-23"),

    score_2("2","24-24"),

    score_3("3","25-26"),

    score_4("4","27-27"),

    score_5("5","28-29"),

    score_6("6","30-30"),

    score_7("7","31-32"),

    score_8("8","33-33"),

    score_9("9","34-35"),

    score_10("10","36-36"),

    score_11("11","37-38"),

    score_12("12","39-39"),

    score_13("13","40-41"),

    score_14("14","42-42"),

    score_15("15","43-44"),

    score_16("16","45-45"),

    score_17("17","46-47"),

    score_18("18","48-48"),

    score_19("19","49-91");

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

    Scale_20(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_20 o : Scale_20.values()) {
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
