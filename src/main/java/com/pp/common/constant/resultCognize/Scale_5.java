package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 1月26天~2月5天
 */
public enum Scale_5 {

    score_1("1","0-0"),

    score_2("2","1-1"),

    score_3("3","2-2"),

    score_4("4","3-3"),

    score_5("5","-"),

    score_6("6","4-4"),

    score_7("7","5-5"),

    score_8("8","6-6"),

    score_9("9","7-7"),

    score_10("10","8-8"),

    score_11("11","9-9"),

    score_12("12","10-11"),

    score_13("13","12-12"),

    score_14("14","13-13"),

    score_15("15","14-15"),

    score_16("16","16-16"),

    score_17("17","17-18"),

    score_18("18","19-19"),

    score_19("19","20-91");

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

    Scale_5(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_5 o : Scale_5.values()) {
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
