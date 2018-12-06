package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 5岁 得分和IQ枚举
 */
public enum Year5ScoreEnum {
    SCORE_1(1,59,"0-3"),
    SCORE_2(2,64,"0-3"),
    SCORE_3(3,68,"0-3"),
    SCORE_4(4,73,"0-3"),
    SCORE_5(5,77,"0-3"),
    SCORE_6(6,81,"0-3"),
    SCORE_7(7,86,"0-3"),
    SCORE_8(8,90,"0-3"),
    SCORE_9(9,95,"0-3"),
    SCORE_10(10,99,"0-3"),
    SCORE_11(11,102,"0-3"),
    SCORE_12(12,107,"0-3"),
    SCORE_13(13,112,"0-3"),
    SCORE_14(14,116,"0-3"),
    SCORE_15(15,120,"0-3"),
    SCORE_16(16,124,"0-3"),
    SCORE_117(17,129,"0-3"),
    SCORE_118(18,133,"0-3"),
    SCORE_119(19,137,"0-3"),
    SCORE_120(20,142,"0-3"),
    SCORE_121(21,146,"0-3"),

    SCORE_17(1,58,"4-7"),
    SCORE_18(2,62,"4-7"),
    SCORE_19(3,66,"4-7"),
    SCORE_20(4,70,"4-7"),
    SCORE_21(5,74,"4-7"),
    SCORE_22(6,78,"4-7"),
    SCORE_23(7,83,"4-7"),
    SCORE_24(8,87,"4-7"),
    SCORE_25(9,91,"4-7"),
    SCORE_26(10,95,"4-7"),
    SCORE_27(11,98,"4-7"),
    SCORE_28(12,103,"4-7"),
    SCORE_29(13,107,"4-7"),
    SCORE_30(14,111,"4-7"),
    SCORE_31(15,115,"4-7"),
    SCORE_32(16,119,"4-7"),
    SCORE_233(17,123,"4-7"),
    SCORE_234(18,127,"4-7"),
    SCORE_235(19,131,"4-7"),
    SCORE_236(20,135,"4-7"),
    SCORE_237(21,139,"4-7"),
    SCORE_238(22,143,"4-7"),
    SCORE_239(23,147,"4-7"),
    SCORE_240(24,151,"4-7"),
    SCORE_241(25,155,"4-7"),
    SCORE_242(26,159,"4-7"),

    SCORE_33(1,57,"8-11"),
    SCORE_34(2,61,"8-11"),
    SCORE_35(3,65,"8-11"),
    SCORE_36(4,69,"8-11"),
    SCORE_37(5,73,"8-11"),
    SCORE_38(6,76,"8-11"),
    SCORE_39(7,81,"8-11"),
    SCORE_40(8,85,"8-11"),
    SCORE_41(9,89,"8-11"),
    SCORE_42(10,92,"8-11"),
    SCORE_43(11,95,"8-11"),
    SCORE_44(12,100,"8-11"),
    SCORE_45(13,104,"8-11"),
    SCORE_46(14,108,"8-11"),
    SCORE_47(15,112,"8-11"),
    SCORE_48(16,115,"8-11"),
    SCORE_349(17,119,"8-11"),
    SCORE_350(18,123,"8-11"),
    SCORE_351(19,127,"8-11"),
    SCORE_352(20,131,"8-11"),
    SCORE_353(21,134,"8-11"),
    SCORE_354(22,138,"8-11"),
    SCORE_355(23,142,"8-11"),
    SCORE_356(24,145,"8-11"),
    SCORE_357(25,150,"8-11"),
    SCORE_358(26,153,"8-11");

    private Integer score;

    private Integer IQ;

    private String monthRange;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getMonthRange() {
        return monthRange;
    }

    public void setMonthRange(String monthRange) {
        this.monthRange = monthRange;
    }

    public Integer getIQ() {
        return IQ;
    }

    public void setIQ(Integer IQ) {
        this.IQ = IQ;
    }

    Year5ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year5ScoreEnum o : Year5ScoreEnum.values()) {
            String arr[] = o.getMonthRange().split("-");
            Integer begin = Integer.parseInt(arr[0]);
            Integer end = Integer.parseInt(arr[1]);
            if (begin <= month && month <= end) {
                if(score.equals(o.getScore())){
                    IQ = o.getIQ();
                    break;
                }
            }
        }
        return IQ;
    }
}
