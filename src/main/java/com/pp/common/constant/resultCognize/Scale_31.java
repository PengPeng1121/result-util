package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 20月16天~21月15天
 */
public enum Scale_31 {

    score_1("1","0-36"),

    score_2("2","37-39"),

    score_3("3","40-42"),

    score_4("4","43-45"),

    score_5("5","46-47"),

    score_6("6","48-49"),

    score_7("7","50-52"),

    score_8("8","53-54"),

    score_9("9","55-56"),

    score_10("10","57-58"),

    score_11("11","59-60"),

    score_12("12","61-62"),

    score_13("13","63-64"),

    score_14("14","65-65"),

    score_15("15","66-66"),

    score_16("16","67-67"),

    score_17("17","68-68"),

    score_18("18","69-69"),

    score_19("19","70-91");

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

    Scale_31(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_31 o : Scale_31.values()) {
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
