package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/30.
 */
public enum Evaluation {

    evaluation_1("异常","0-5"),

    evaluation_2("可疑","6-25"),

    evaluation_3("中-","26-49"),

    evaluation_4("中","50-50"),

    evaluation_5("中+","51-75"),

    evaluation_6("中上","76-95"),

    evaluation_7("上","96-100");

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

    Evaluation(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getEvaluation(Double index) {
        String name = "";
        for (Evaluation o : Evaluation.values()) {
            String arr[] = o.getIndex().split("-");
            if(arr.length!=0){
                Double begin = Double.parseDouble(arr[0]);
                Double end = Double.parseDouble(arr[1]);
                if (begin <= index && index <= end) {
                    name = o.getName();
                    break;
                }
            }
        }
        return name;
    }
}
