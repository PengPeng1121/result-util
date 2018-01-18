package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 4月6天~4月15天
 */
public enum Scale_12 {

    score_1("1","0-10"),

    score_2("2","11-11"),

    score_3("3","12-12"),

    score_4("4","-"),

    score_5("5","13-13"),

    score_6("6","14-14"),

    score_7("7","15-16"),

    score_8("8","17-17"),

    score_9("9","18-18"),

    score_10("10","19-19"),

    score_11("11","20-20"),

    score_12("12","21-22"),

    score_13("13","23-23"),

    score_14("14","24-24"),

    score_15("15","25-26"),

    score_16("16","27-27"),

    score_17("17","28-29"),

    score_18("18","30-30"),

    score_19("19","31-91");

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

    Scale_12(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_12 o : Scale_12.values()) {
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
