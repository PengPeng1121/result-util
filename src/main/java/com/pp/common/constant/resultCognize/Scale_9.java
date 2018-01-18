package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 3月6天~3月15天
 */
public enum Scale_9 {

    score_1("1","0-4"),

    score_2("2","5-5"),

    score_3("3","6-6"),

    score_4("4","7-7"),

    score_5("5","8-8"),

    score_6("6","9-9"),

    score_7("7","10-10"),

    score_8("8","11-11"),

    score_9("9","12-12"),

    score_10("10","13-13"),

    score_11("11","14-14"),

    score_12("12","15-16"),

    score_13("13","17-17"),

    score_14("14","18-18"),

    score_15("15","19-20"),

    score_16("16","21-21"),

    score_17("17","22-22"),

    score_18("18","23-24"),

    score_19("19","25-91");

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

    Scale_9(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_9 o : Scale_9.values()) {
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
