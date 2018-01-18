package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/16.
 */
public enum Talent {
//    发育商~百分位~可信区间90%~可信区间95%
//
    score_1("1","55~0.1~52-66~51-67"),

    score_2("2","60~0.4~57-70~56-72"),

    score_3("3","65~1~61-75~60-76"),

    score_4("4","70~2~66-79~65-81"),

    score_5("5","75~5~71-84~69-85"),

    score_6("6","80~9~75-89~74-90"),

    score_7("7","85~16~80-93~78-94"),

    score_8("8","90~25~84-98~83-99"),

    score_9("9","95~37~89-102~87-103"),

    score_10("10","100~50~93-107~92-108"),

    score_11("11","105~63~98-111~97-113"),

    score_12("12","110~75~102-116~101-117"),

    score_13("13","115~84~107-120~106-122"),

    score_14("14","120~91~111-125~110-126"),

    score_15("15","125~95~116-129~115-131"),

    score_16("16","130~98~121-134~119-135"),

    score_17("17","135~99~125-139~124-140"),

    score_18("18","140~99.6~130-143~128-144"),

    score_19("19","145~99.9~134-148~133-149");

    private String name;

    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    Talent(String name, String value){
        this.name = name;
        this.value = value;
    }

    //根据索引获取名称
    public static String getTalent(String name) {
        String value = "";
        for (Talent o : Talent.values()) {
            if (name.equals(o.getName())) {
                value = o.getValue();
                break;
            }
        }
        return value;
    }
}
