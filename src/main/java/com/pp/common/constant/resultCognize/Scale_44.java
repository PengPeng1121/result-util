package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 33月16天~34月15天
 */
public enum Scale_44 {

    score_1("1","0-43"),

    score_2("2","44-47"),

    score_3("3","48-52"),

    score_4("4","53-56"),

    score_5("5","57-60"),

    score_6("6","61-63"),

    score_7("7","64-66"),

    score_8("8","67-69"),

    score_9("9","70-73"),

    score_10("10","74-76"),

    score_11("11","77-78"),

    score_12("12","79-79"),

    score_13("13","-"),

    score_14("14","80-80"),

    score_15("15","81-81"),

    score_16("16","-"),

    score_17("17","82-82"),

    score_18("18","83-83"),

    score_19("19","84-91");

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

    Scale_44(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_44 o : Scale_44.values()) {
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
