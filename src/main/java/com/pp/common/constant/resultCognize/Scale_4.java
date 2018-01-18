package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 1月16天~1月25天
 */
public enum Scale_4 {

    score_1("1","0-0"),

    score_2("2","1-1"),

    score_3("3","-"),

    score_4("4","2-2"),

    score_5("5","3-3"),

    score_6("6","4-4"),

    score_7("7","-"),

    score_8("8","5-5"),

    score_9("9","6-6"),

    score_10("10","7-8"),

    score_11("11","9-9"),

    score_12("12","10-10"),

    score_13("13","11-11"),

    score_14("14","12-13"),

    score_15("15","14-14"),

    score_16("16","15-15"),

    score_17("17","16-17"),

    score_18("18","18-18"),

    score_19("19","19-91");

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

    Scale_4(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_4 o : Scale_4.values()) {
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
