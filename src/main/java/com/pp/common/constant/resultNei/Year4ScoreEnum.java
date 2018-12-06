package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 4岁 得分和IQ枚举
 */
public enum Year4ScoreEnum {
    SCORE_1(1,66,"0-3"),
    SCORE_2(2,72,"0-3"),
    SCORE_3(3,77,"0-3"),
    SCORE_4(4,81,"0-3"),
    SCORE_5(5,88,"0-3"),
    SCORE_6(6,93,"0-3"),
    SCORE_7(7,97,"0-3"),
    SCORE_8(8,99,"0-3"),
    SCORE_9(9,108,"0-3"),
    SCORE_10(10,113,"0-3"),
    SCORE_11(11,118,"0-3"),
    SCORE_12(12,123,"0-3"),
    SCORE_13(13,128,"0-3"),
    SCORE_14(14,133,"0-3"),
    SCORE_15(15,139,"0-3"),
    SCORE_16(16,143,"0-3"),
    SCORE_117(17,0,"0-3"),
    SCORE_118(18,151,"0-3"),
    SCORE_119(19,156,"0-3"),
    SCORE_120(20,161,"0-3"),
    SCORE_121(21,167,"0-3"),

    SCORE_17(1,63,"4-7"),
    SCORE_18(2,68,"4-7"),
    SCORE_19(3,73,"4-7"),
    SCORE_20(4,78,"4-7"),
    SCORE_21(5,83,"4-7"),
    SCORE_22(6,88,"4-7"),
    SCORE_23(7,92,"4-7"),
    SCORE_24(8,97,"4-7"),
    SCORE_25(9,102,"4-7"),
    SCORE_26(10,107,"4-7"),
    SCORE_27(11,112,"4-7"),
    SCORE_28(12,116,"4-7"),
    SCORE_29(13,121,"4-7"),
    SCORE_30(14,126,"4-7"),
    SCORE_31(15,131,"4-7"),
    SCORE_32(16,136,"4-7"),
    SCORE_233(17,141,"4-7"),
    SCORE_234(18,145,"4-7"),
    SCORE_235(19,150,"4-7"),
    SCORE_236(20,155,"4-7"),
    SCORE_237(21,160,"4-7"),

    SCORE_33(1,61,"8-11"),
    SCORE_34(2,67,"8-11"),
    SCORE_35(3,71,"8-11"),
    SCORE_36(4,75,"8-11"),
    SCORE_37(5,80,"8-11"),
    SCORE_38(6,85,"8-11"),
    SCORE_39(7,89,"8-11"),
    SCORE_40(8,94,"8-11"),
    SCORE_41(9,99,"8-11"),
    SCORE_42(10,103,"8-11"),
    SCORE_43(11,107,"8-11"),
    SCORE_44(12,112,"8-11"),
    SCORE_45(13,117,"8-11"),
    SCORE_46(14,121,"8-11"),
    SCORE_47(15,126,"8-11"),
    SCORE_48(16,130,"8-11"),
    SCORE_349(17,135,"8-11"),
    SCORE_350(18,139,"8-11"),
    SCORE_351(19,144,"8-11"),
    SCORE_352(20,149,"8-11"),
    SCORE_353(21,153,"8-11");

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

    Year4ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year4ScoreEnum o : Year4ScoreEnum.values()) {
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
