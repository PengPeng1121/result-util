package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 5月6天~5月15天
 */
public enum Scale_15 {

    score_1("1","0-15"),

    score_2("2","16-16"),

    score_3("3","17-17"),

    score_4("4","18-18"),

    score_5("5","19-19"),

    score_6("6","20-21"),

    score_7("7","22-22"),

    score_8("8","23-23"),

    score_9("9","24-24"),

    score_10("10","25-25"),

    score_11("11","26-27"),

    score_12("12","28-28"),

    score_13("13","29-30"),

    score_14("14","31-31"),

    score_15("15","32-32"),

    score_16("16","33-34"),

    score_17("17","35-35"),

    score_18("18","36-37"),

    score_19("19","38-91");

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

    Scale_15(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_15 o : Scale_15.values()) {
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
