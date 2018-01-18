package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 7月16天~8月15天
 */
public enum Scale_18 {

    score_1("1","0-20"),

    score_2("2","21-21"),

    score_3("3","22-22"),

    score_4("4","23-24"),

    score_5("5","25-25"),

    score_6("6","26-26"),

    score_7("7","27-28"),

    score_8("8","29-29"),

    score_9("9","30-31"),

    score_10("10","32-32"),

    score_11("11","33-33"),

    score_12("12","34-35"),

    score_13("13","36-36"),

    score_14("14","37-38"),

    score_15("15","39-39"),

    score_16("16","40-41"),

    score_17("17","42-42"),

    score_18("18","43-44"),

    score_19("19","45-91");

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

    Scale_18(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_18 o : Scale_18.values()) {
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
