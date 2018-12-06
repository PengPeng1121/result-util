package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 6岁 得分和IQ枚举
 */
public enum Year6ScoreEnum {
    SCORE_1(1,57,"0-3"),
    SCORE_2(2,60,"0-3"),
    SCORE_3(3,63,"0-3"),
    SCORE_4(4,67,"0-3"),
    SCORE_5(5,72,"0-3"),
    SCORE_6(6,74,"0-3"),
    SCORE_7(7,78,"0-3"),
    SCORE_8(8,82,"0-3"),
    SCORE_9(9,86,"0-3"),
    SCORE_10(10,86,"0-3"),
    SCORE_11(11,92,"0-3"),
    SCORE_12(12,96,"0-3"),
    SCORE_13(13,100,"0-3"),
    SCORE_14(14,103,"0-3"),
    SCORE_15(15,108,"0-3"),
    SCORE_16(16,111,"0-3"),
    SCORE_117(17,114,"0-3"),
    SCORE_118(18,118,"0-3"),
    SCORE_119(19,124,"0-3"),
    SCORE_120(20,126,"0-3"),
    SCORE_121(21,129,"0-3"),
    SCORE_122(22,133,"0-3"),
    SCORE_123(23,136,"0-3"),
    SCORE_124(24,140,"0-3"),
    SCORE_125(25,144,"0-3"),
    SCORE_126(26,147,"0-3"),

    SCORE_17(1,56,"4-7"),
    SCORE_18(2,59,"4-7"),
    SCORE_19(3,62,"4-7"),
    SCORE_20(4,66,"4-7"),
    SCORE_21(5,70,"4-7"),
    SCORE_22(6,73,"4-7"),
    SCORE_23(7,76,"4-7"),
    SCORE_24(8,80,"4-7"),
    SCORE_25(9,83,"4-7"),
    SCORE_26(10,86,"4-7"),
    SCORE_27(11,90,"4-7"),
    SCORE_28(12,93,"4-7"),
    SCORE_29(13,97,"4-7"),
    SCORE_30(14,100,"4-7"),
    SCORE_31(15,104,"4-7"),
    SCORE_32(16,107,"4-7"),
    SCORE_233(17,110,"4-7"),
    SCORE_234(18,114,"4-7"),
    SCORE_235(19,117,"4-7"),
    SCORE_236(20,121,"4-7"),
    SCORE_237(21,124,"4-7"),
    SCORE_238(22,128,"4-7"),
    SCORE_239(23,131,"4-7"),
    SCORE_240(24,134,"4-7"),
    SCORE_241(25,138,"4-7"),
    SCORE_242(26,141,"4-7"),
    SCORE_243(27,145,"4-7"),
    SCORE_244(28,149,"4-7"),
    SCORE_245(29,152,"4-7"),
    SCORE_246(30,155,"4-7"),
    SCORE_247(31,158,"4-7"),

    SCORE_33(1,54,"8-11"),
    SCORE_34(2,57,"8-11"),
    SCORE_35(3,60,"8-11"),
    SCORE_36(4,64,"8-11"),
    SCORE_37(5,68,"8-11"),
    SCORE_38(6,71,"8-11"),
    SCORE_39(7,74,"8-11"),
    SCORE_40(8,78,"8-11"),
    SCORE_41(9,81,"8-11"),
    SCORE_42(10,84,"8-11"),
    SCORE_43(11,87,"8-11"),
    SCORE_44(12,91,"8-11"),
    SCORE_45(13,94,"8-11"),
    SCORE_46(14,97,"8-11"),
    SCORE_47(15,101,"8-11"),
    SCORE_48(16,104,"8-11"),
    SCORE_349(17,107,"8-11"),
    SCORE_350(18,111,"8-11"),
    SCORE_351(19,114,"8-11"),
    SCORE_352(20,118,"8-11"),
    SCORE_353(21,121,"8-11"),
    SCORE_354(22,124,"8-11"),
    SCORE_355(23,128,"8-11"),
    SCORE_356(24,130,"8-11"),
    SCORE_357(25,134,"8-11"),
    SCORE_358(26,137,"8-11"),
    SCORE_359(27,141,"8-11"),
    SCORE_360(28,144,"8-11"),
    SCORE_361(29,148,"8-11"),
    SCORE_362(30,151,"8-11"),
    SCORE_363(31,154,"8-11");

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

    Year6ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year6ScoreEnum o : Year6ScoreEnum.values()) {
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
