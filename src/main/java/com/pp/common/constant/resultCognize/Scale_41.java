package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 30月16天~31月15天
 */
public enum Scale_41 {

    score_1("1","0-43"),

    score_2("2","44-47"),

    score_3("3","48-51"),

    score_4("4","52-55"),

    score_5("5","56-58"),

    score_6("6","59-61"),

    score_7("7","62-64"),

    score_8("8","65-67"),

    score_9("9","68-70"),

    score_10("10","71-73"),

    score_11("11","74-75"),

    score_12("12","76-76"),

    score_13("13","77-77"),

    score_14("14","78-78"),

    score_15("15","79-79"),

    score_16("16","80-80"),

    score_17("17","81-81"),

    score_18("18","82-82"),

    score_19("19","83-91");

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

    Scale_41(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_41 o : Scale_41.values()) {
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
