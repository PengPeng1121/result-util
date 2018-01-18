package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 2月16天~2月25天
 */
public enum Scale_7 {

    score_1("1","0-2"),

    score_2("2","3-3"),

    score_3("3","-"),

    score_4("4","4-4"),

    score_5("5","5-5"),

    score_6("6","6-6"),

    score_7("7","7-7"),

    score_8("8","8-8"),

    score_9("9","9-9"),

    score_10("10","10-10"),

    score_11("11","11-11"),

    score_12("12","12-13"),

    score_13("13","14-14"),

    score_14("14","15-15"),

    score_15("15","16-17"),

    score_16("16","18-18"),

    score_17("17","19-19"),

    score_18("18","20-21"),

    score_19("19","22-91");

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

    Scale_7(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_7 o : Scale_7.values()) {
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
