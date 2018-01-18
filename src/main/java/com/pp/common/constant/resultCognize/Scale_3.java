package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 1月6天~1月15天
 */
public enum Scale_3 {

    score_1("1","0-0"),

    score_2("2","-"),

    score_3("3","1-1"),

    score_4("4","-"),

    score_5("5","2-2"),

    score_6("6","3-3"),

    score_7("7","4-4"),

    score_8("8","5-5"),

    score_9("9","6-6"),

    score_10("10","7-7"),

    score_11("11","8-8"),

    score_12("12","9-9"),

    score_13("13","10-11"),

    score_14("14","12-12"),

    score_15("15","13-13"),

    score_16("16","14-14"),

    score_17("17","15-16"),

    score_18("18","17-17"),

    score_19("19","18-91");

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

    Scale_3(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_3 o : Scale_3.values()) {
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
