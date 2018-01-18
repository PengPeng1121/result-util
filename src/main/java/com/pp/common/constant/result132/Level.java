package com.pp.common.constant.result132;

/**
 * Created by asus on 2018/1/15.
 */
public enum Level {
//
//评定等级:
//            标准分   等级
//5分     极重
//6分     重
//7分     中度
//8分     轻度
//9分     边缘
//
//标准分   等级
//10分      正常
//11分      高常
//12分      优秀
//13分      非常优秀

    LEVEL_5("极重","5"),

    LEVEL_6("重","6"),

    LEVEL_7("中度","7"),

    LEVEL_8("轻度","8"),

    LEVEL_9("边缘","9"),

    LEVEL_10("正常","10"),

    LEVEL_11("高常","11"),

    LEVEL_12("优秀","12"),

    LEVEL_13("非常优秀","13");

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

    Level(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getLevelByStandardScore(String index) {
        String name = "没有找到结果！";
        for (Level o : Level.values()) {
            if (index .equals(o.getIndex())) {
                name = o.getName();
                break;
            }
        }
        return name;
    }
}
