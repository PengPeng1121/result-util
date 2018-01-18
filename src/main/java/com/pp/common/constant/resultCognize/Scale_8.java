package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 2月26天~3月5天
 */
public enum Scale_8 {

    score_1("1","0-3"),

    score_2("2","4-4"),

    score_3("3","5-5"),

    score_4("4","-"),

    score_5("5","6-6"),

    score_6("6","7-7"),

    score_7("7","8-8"),

    score_8("8","9-9"),

    score_9("9","10-10"),

    score_10("10","11-1"),

    score_11("11","12-13"),

    score_12("12","13-14"),

    score_13("13","15-15"),

    score_14("14","16-17"),

    score_15("15","18-18"),

    score_16("16","19-19"),

    score_17("17","20-21"),

    score_18("18","22-22"),

    score_19("19","23-91");

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

    Scale_8(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_8 o : Scale_8.values()) {
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
