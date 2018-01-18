package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 39月16天~42月15天
 */
public enum Scale_48 {

    score_1("1","0-48"),

    score_2("2","49-52"),

    score_3("3","53-56"),

    score_4("4","57-60"),

    score_5("5","61-64"),

    score_6("6","65-68"),

    score_7("7","69-71"),

    score_8("8","72-74"),

    score_9("9","75-77"),

    score_10("10","78-79"),

    score_11("11","80-81"),

    score_12("12","82-82"),

    score_13("13","83-83"),

    score_14("14","84-84"),

    score_15("15","-"),

    score_16("16","85-85"),

    score_17("17","-"),

    score_18("18","86-86"),

    score_19("19","87-91");

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

    Scale_48(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_48 o : Scale_48.values()) {
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
