package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 8岁 得分和IQ枚举
 */
public enum Year8ScoreEnum {

    SCORE_6(6,59,"0-3"),
    SCORE_7(7,62,"0-3"),
    SCORE_8(8,66,"0-3"),
    SCORE_9(9,68,"0-3"),
    SCORE_10(10,71,"0-3"),
    SCORE_11(11,73,"0-3"),
    SCORE_12(12,77,"0-3"),
    SCORE_13(13,81,"0-3"),
    SCORE_14(14,84,"0-3"),
    SCORE_15(15,87,"0-3"),
    SCORE_16(16,90,"0-3"),
    SCORE_117(17,93,"0-3"),
    SCORE_118(18,96,"0-3"),
    SCORE_119(19,99,"0-3"),
    SCORE_120(20,102,"0-3"),
    SCORE_121(21,105,"0-3"),
    SCORE_122(22,108,"0-3"),
    SCORE_123(23,111,"0-3"),
    SCORE_124(24,114,"0-3"),
    SCORE_125(25,117,"0-3"),
    SCORE_126(26,120,"0-3"),
    SCORE_127(27,123,"0-3"),
    SCORE_128(28,126,"0-3"),
    SCORE_129(29,129,"0-3"),
    SCORE_130(30,132,"0-3"),
    SCORE_131(31,135,"0-3"),
    SCORE_132(32,138,"0-3"),
    SCORE_133(33,141,"0-3"),
    SCORE_134(34,144,"0-3"),
    SCORE_135(35,147,"0-3"),
    SCORE_136(36,150,"0-3"),

    SCORE_22(6,56,"4-7"),
    SCORE_23(7,59,"4-7"),
    SCORE_24(8,62,"4-7"),
    SCORE_25(9,65,"4-7"),
    SCORE_26(10,68,"4-7"),
    SCORE_27(11,71,"4-7"),
    SCORE_28(12,74,"4-7"),
    SCORE_29(13,77,"4-7"),
    SCORE_30(14,80,"4-7"),
    SCORE_31(15,83,"4-7"),
    SCORE_32(16,86,"4-7"),
    SCORE_233(17,89,"4-7"),
    SCORE_234(18,92,"4-7"),
    SCORE_235(19,95,"4-7"),
    SCORE_236(20,98,"4-7"),
    SCORE_237(21,101,"4-7"),
    SCORE_238(22,104,"4-7"),
    SCORE_239(23,107,"4-7"),
    SCORE_240(24,110,"4-7"),
    SCORE_241(25,113,"4-7"),
    SCORE_242(26,116,"4-7"),
    SCORE_243(27,119,"4-7"),
    SCORE_244(28,122,"4-7"),
    SCORE_245(29,125,"4-7"),
    SCORE_246(30,128,"4-7"),
    SCORE_247(31,131,"4-7"),
    SCORE_248(32,134,"4-7"),
    SCORE_249(33,137,"4-7"),
    SCORE_250(34,140,"4-7"),
    SCORE_251(35,143,"4-7"),
    SCORE_252(36,146,"4-7"),
    SCORE_253(37,149,"4-7"),
    SCORE_254(38,152,"4-7"),
    SCORE_255(39,155,"4-7"),
    SCORE_256(40,159,"4-7"),

    SCORE_38(6,52,"8-11"),
    SCORE_39(7,55,"8-11"),
    SCORE_40(8,58,"8-11"),
    SCORE_41(9,61,"8-11"),
    SCORE_42(10,64,"8-11"),
    SCORE_43(11,67,"8-11"),
    SCORE_44(12,70,"8-11"),
    SCORE_45(13,73,"8-11"),
    SCORE_46(14,76,"8-11"),
    SCORE_47(15,79,"8-11"),
    SCORE_48(16,82,"8-11"),
    SCORE_349(17,85,"8-11"),
    SCORE_350(18,88,"8-11"),
    SCORE_351(19,91,"8-11"),
    SCORE_352(20,95,"8-11"),
    SCORE_353(21,98,"8-11"),
    SCORE_354(22,101,"8-11"),
    SCORE_355(23,104,"8-11"),
    SCORE_356(24,107,"8-11"),
    SCORE_357(25,110,"8-11"),
    SCORE_358(26,113,"8-11"),
    SCORE_359(27,116,"8-11"),
    SCORE_360(28,119,"8-11"),
    SCORE_361(29,122,"8-11"),
    SCORE_362(30,125,"8-11"),
    SCORE_363(31,128,"8-11"),
    SCORE_364(32,131,"8-11"),
    SCORE_365(33,134,"8-11"),
    SCORE_366(34,137,"8-11"),
    SCORE_367(35,140,"8-11"),
    SCORE_368(36,143,"8-11"),
    SCORE_369(37,146,"8-11"),
    SCORE_370(38,149,"8-11"),
    SCORE_371(39,152,"8-11"),
    SCORE_372(40,156,"8-11");

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

    Year8ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year8ScoreEnum o : Year8ScoreEnum.values()) {
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
