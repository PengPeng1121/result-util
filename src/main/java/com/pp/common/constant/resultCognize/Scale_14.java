package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 4月26天~5月5天
 */
public enum Scale_14 {

    score_1("1","0-14"),

    score_2("2","15-15"),

    score_3("3","16-16"),

    score_4("4","17-17"),

    score_5("5","18-18"),

    score_6("6","19-19"),

    score_7("7","20-20"),

    score_8("8","21-21"),

    score_9("9","22-22"),

    score_10("10","23-24"),

    score_11("11","25-25"),

    score_12("12","26-26"),

    score_13("13","27-8"),

    score_14("14","29-29"),

    score_15("15","30-30"),

    score_16("16","31-32"),

    score_17("17","33-33"),

    score_18("18","34-35"),

    score_19("19","36-91");

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

    Scale_14(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_14 o : Scale_14.values()) {
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
