package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 23月16天~24月15天
 */
public enum Scale_34 {

    score_1("1","0-39"),

    score_2("2","40-42"),

    score_3("3","43-46"),

    score_4("4","47-49"),

    score_5("5","50-51"),

    score_6("6","52-54"),

    score_7("7","55-56"),

    score_8("8","57-59"),

    score_9("9","60-61"),

    score_10("10","62-63"),

    score_11("11","64-65"),

    score_12("12","66-67"),

    score_13("13","68-69"),

    score_14("14","70-70"),

    score_15("15","71-71"),

    score_16("16","72-72"),

    score_17("17","-"),

    score_18("18","73-73"),

    score_19("19","74-91");

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

    Scale_34(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_34 o : Scale_34.values()) {
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
