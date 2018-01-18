package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 3月26天~4月5天
 */
public enum Scale_11 {

    score_1("1","0-8"),

    score_2("2","9-9"),

    score_3("3","10-10"),

    score_4("4","-"),

    score_5("5","11-11"),

    score_6("6","12-12"),

    score_7("7","13-13"),

    score_8("8","14-14"),

    score_9("9","15-16"),

    score_10("10","17-17"),

    score_11("11","18-18"),

    score_12("12","19-19"),

    score_13("13","20-21"),

    score_14("14","22-22"),

    score_15("15","23-24"),

    score_16("16","25-25"),

    score_17("17","26-27"),

    score_18("18","28-28"),

    score_19("19","29-91");

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

    Scale_11(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_11 o : Scale_11.values()) {
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
