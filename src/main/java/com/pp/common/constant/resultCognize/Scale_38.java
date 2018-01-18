package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 27月16天~28月15天
 */
public enum Scale_38 {

    score_1("1","0-41"),

    score_2("2","42-45"),

    score_3("3","46-49"),

    score_4("4","50-53"),

    score_5("5","54-56"),

    score_6("6","57-58"),

    score_7("7","59-61"),

    score_8("8","62-64"),

    score_9("9","65-67"),

    score_10("10","68-69"),

    score_11("11","70-71"),

    score_12("12","72-73"),

    score_13("13","74-74"),

    score_14("14","75-75"),

    score_15("15","76-76"),

    score_16("16","77-77"),

    score_17("17","78-78"),

    score_18("18","79-79"),

    score_19("19","80-91");

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

    Scale_38(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_38 o : Scale_38.values()) {
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
