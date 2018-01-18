package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 26月16天~27月15天
 */
public enum Scale_37 {

    score_1("1","0-41"),

    score_2("2","42-45"),

    score_3("3","46-49"),

    score_4("4","50-52"),

    score_5("5","53-55"),

    score_6("6","56-57"),

    score_7("7","58-60"),

    score_8("8","62-63"),

    score_9("9","64-66"),

    score_10("10","67-68"),

    score_11("11","69-70"),

    score_12("12","71-72"),

    score_13("13","73-73"),

    score_14("14","74-74"),

    score_15("15","-"),

    score_16("16","75-75"),

    score_17("17","76-76"),

    score_18("18","77-77"),

    score_19("19","78-91");

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

    Scale_37(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_37 o : Scale_37.values()) {
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
