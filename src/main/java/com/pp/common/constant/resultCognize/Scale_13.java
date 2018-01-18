package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 4月16天~4月25天
 */
public enum Scale_13 {

    score_1("1","0-12"),

    score_2("2","13-13"),

    score_3("3","14-14"),

    score_4("4","15-15"),

    score_5("5","16-16"),

    score_6("6","17-17"),

    score_7("7","18-18"),

    score_8("8","19-19"),

    score_9("9","20-20"),

    score_10("10","21-21"),

    score_11("11","22-23"),

    score_12("12","24-24"),

    score_13("13","25-25"),

    score_14("14","26-27"),

    score_15("15","28-28"),

    score_16("16","29-30"),

    score_17("17","31-31"),

    score_18("18","32-33"),

    score_19("19","34-91");

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

    Scale_13(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_13 o : Scale_13.values()) {
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
