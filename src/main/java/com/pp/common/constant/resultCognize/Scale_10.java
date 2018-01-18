package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 3月16天~3月25天
 */
public enum Scale_10 {

    score_1("1","0-6"),

    score_2("2","7-7"),

    score_3("3","8-8"),

    score_4("4","-"),

    score_5("5","9-9"),

    score_6("6","10-10"),

    score_7("7","11-11"),

    score_8("8","12-12"),

    score_9("9","13-14"),

    score_10("10","15-15"),

    score_11("11","16-16"),

    score_12("12","17-17"),

    score_13("13","18-19"),

    score_14("14","20-20"),

    score_15("15","21-21"),

    score_16("16","22-23"),

    score_17("17","24-24"),

    score_18("18","25-26"),

    score_19("19","27-91");

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

    Scale_10(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_10 o : Scale_10.values()) {
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
