package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 6月16天~7月15天
 */
public enum Scale_17 {

    score_1("1","0-18"),

    score_2("2","19-19"),

    score_3("3","20-21"),

    score_4("4","22-22"),

    score_5("5","23-23"),

    score_6("6","24-24"),

    score_7("7","25-26"),

    score_8("8","27-27"),

    score_9("9","28-28"),

    score_10("10","29-30"),

    score_11("11","31-31"),

    score_12("12","32-32"),

    score_13("13","33-34"),

    score_14("14","35-35"),

    score_15("15","36-37"),

    score_16("16","38-38"),

    score_17("17","39-40"),

    score_18("18","41-41"),

    score_19("19","42-91");

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

    Scale_17(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_17 o : Scale_17.values()) {
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
