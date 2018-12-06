package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 7岁 得分和IQ枚举
 */
public enum Year7ScoreEnum {
    SCORE_1(1,52,"0-3"),
    SCORE_2(2,56,"0-3"),
    SCORE_3(3,59,"0-3"),
    SCORE_4(4,62,"0-3"),
    SCORE_5(5,65,"0-3"),
    SCORE_6(6,68,"0-3"),
    SCORE_7(7,71,"0-3"),
    SCORE_8(8,75,"0-3"),
    SCORE_9(9,78,"0-3"),
    SCORE_10(10,81,"0-3"),
    SCORE_11(11,84,"0-3"),
    SCORE_12(12,88,"0-3"),
    SCORE_13(13,91,"0-3"),
    SCORE_14(14,94,"0-3"),
    SCORE_15(15,97,"0-3"),
    SCORE_16(16,100,"0-3"),
    SCORE_117(17,103,"0-3"),
    SCORE_118(18,107,"0-3"),
    SCORE_119(19,110,"0-3"),
    SCORE_120(20,114,"0-3"),
    SCORE_121(21,117,"0-3"),
    SCORE_122(22,120,"0-3"),
    SCORE_123(23,123,"0-3"),
    SCORE_124(24,126,"0-3"),
    SCORE_125(25,129,"0-3"),
    SCORE_126(26,132,"0-3"),
    SCORE_127(27,136,"0-3"),
    SCORE_128(28,139,"0-3"),
    SCORE_129(29,143,"0-3"),
    SCORE_130(30,146,"0-3"),
    SCORE_131(31,149,"0-3"),
    SCORE_132(32,0,"0-3"),
    SCORE_133(33,0,"0-3"),
    SCORE_134(34,0,"0-3"),
    SCORE_135(35,162,"0-3"),
    SCORE_136(36,163,"0-3"),

    SCORE_17(1,51,"4-7"),
    SCORE_18(2,54,"4-7"),
    SCORE_19(3,57,"4-7"),
    SCORE_20(4,60,"4-7"),
    SCORE_21(5,63,"4-7"),
    SCORE_22(6,66,"4-7"),
    SCORE_23(7,69,"4-7"),
    SCORE_24(8,73,"4-7"),
    SCORE_25(9,76,"4-7"),
    SCORE_26(10,79,"4-7"),
    SCORE_27(11,82,"4-7"),
    SCORE_28(12,85,"4-7"),
    SCORE_29(13,88,"4-7"),
    SCORE_30(14,92,"4-7"),
    SCORE_31(15,94,"4-7"),
    SCORE_32(16,97,"4-7"),
    SCORE_233(17,100,"4-7"),
    SCORE_234(18,104,"4-7"),
    SCORE_235(19,107,"4-7"),
    SCORE_236(20,110,"4-7"),
    SCORE_237(21,113,"4-7"),
    SCORE_238(22,116,"4-7"),
    SCORE_239(23,119,"4-7"),
    SCORE_240(24,122,"4-7"),
    SCORE_241(25,125,"4-7"),
    SCORE_242(26,128,"4-7"),
    SCORE_243(27,132,"4-7"),
    SCORE_244(28,135,"4-7"),
    SCORE_245(29,138,"4-7"),
    SCORE_246(30,141,"4-7"),
    SCORE_247(31,144,"4-7"),
    SCORE_248(32,147,"4-7"),
    SCORE_249(33,150,"4-7"),
    SCORE_250(34,153,"4-7"),
    SCORE_251(35,156,"4-7"),
    SCORE_252(36,159,"4-7"),

    SCORE_33(1,50,"8-11"),
    SCORE_34(2,53,"8-11"),
    SCORE_35(3,53,"8-11"),
    SCORE_36(4,58,"8-11"),
    SCORE_37(5,61,"8-11"),
    SCORE_38(6,63,"8-11"),
    SCORE_39(7,66,"8-11"),
    SCORE_40(8,70,"8-11"),
    SCORE_41(9,72,"8-11"),
    SCORE_42(10,75,"8-11"),
    SCORE_43(11,78,"8-11"),
    SCORE_44(12,82,"8-11"),
    SCORE_45(13,85,"8-11"),
    SCORE_46(14,88,"8-11"),
    SCORE_47(15,91,"8-11"),
    SCORE_48(16,94,"8-11"),
    SCORE_349(17,97,"8-11"),
    SCORE_350(18,100,"8-11"),
    SCORE_351(19,103,"8-11"),
    SCORE_352(20,106,"8-11"),
    SCORE_353(21,109,"8-11"),
    SCORE_354(22,112,"8-11"),
    SCORE_355(23,115,"8-11"),
    SCORE_356(24,118,"8-11"),
    SCORE_357(25,121,"8-11"),
    SCORE_358(26,124,"8-11"),
    SCORE_359(27,128,"8-11"),
    SCORE_360(28,131,"8-11"),
    SCORE_361(29,134,"8-11"),
    SCORE_362(30,137,"8-11"),
    SCORE_363(31,140,"8-11"),
    SCORE_364(32,143,"8-11"),
    SCORE_365(33,146,"8-11"),
    SCORE_366(34,149,"8-11"),
    SCORE_367(35,152,"8-11"),
    SCORE_368(36,155,"8-11");

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

    Year7ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year7ScoreEnum o : Year7ScoreEnum.values()) {
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
