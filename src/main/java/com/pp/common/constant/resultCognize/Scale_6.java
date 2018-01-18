package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 2月6天~2月15天
 */
public enum Scale_6 {

    score_1("1","0-1"),

    score_2("2","2-2"),

    score_3("3","3-3"),

    score_4("4","-"),

    score_5("5","4-4"),

    score_6("6","5-5"),

    score_7("7","6-6"),

    score_8("8","7-7"),

    score_9("9","8-8"),

    score_10("10","9-9"),

    score_11("11","10-10"),

    score_12("12","11-12"),

    score_13("13","13-13"),

    score_14("14","14-14"),

    score_15("15","15-15"),

    score_16("16","16-17"),

    score_17("17","18-18"),

    score_18("18","19-20"),

    score_19("19","21-91");

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

    Scale_6(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_6 o : Scale_6.values()) {
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
