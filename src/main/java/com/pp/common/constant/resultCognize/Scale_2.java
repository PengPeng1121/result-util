package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 26天~1月5天
 */
public enum Scale_2 {

    score_1("1","0-0"),

    score_2("2","-"),

    score_3("3","1-1"),

    score_4("4","-"),

    score_5("5","2-2"),

    score_6("6","-"),

    score_7("7","3-3"),

    score_8("8","4-4"),

    score_9("9","5-5"),

    score_10("10","6-6"),

    score_11("11","7-7"),

    score_12("12","8-9"),

    score_13("13","10-10"),

    score_14("14","11-11"),

    score_15("15","12-12"),

    score_16("16","13-14"),

    score_17("17","15-15"),

    score_18("18","16-17"),

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

    Scale_2(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_2 o : Scale_2.values()) {
            String arr[] = o.getIndex().split("-");
            if(arr.length!=0){
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
