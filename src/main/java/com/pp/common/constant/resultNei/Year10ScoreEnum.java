package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 10岁 得分和IQ枚举
 */
public enum Year10ScoreEnum {


    SCORE_11(11,42,"0-3"),
    SCORE_12(12,46,"0-3"),
    SCORE_13(13,50,"0-3"),
    SCORE_14(14,53,"0-3"),
    SCORE_15(15,57,"0-3"),
    SCORE_16(16,60,"0-3"),
    SCORE_117(17,64,"0-3"),
    SCORE_118(18,72,"0-3"),
    SCORE_119(19,75,"0-3"),
    SCORE_120(20,79,"0-3"),
    SCORE_121(21,82,"0-3"),
    SCORE_122(22,86,"0-3"),
    SCORE_123(23,89,"0-3"),
    SCORE_124(24,92,"0-3"),
    SCORE_125(25,96,"0-3"),
    SCORE_126(26,99,"0-3"),
    SCORE_127(27,103,"0-3"),
    SCORE_128(28,106,"0-3"),
    SCORE_129(29,110,"0-3"),
    SCORE_130(30,113,"0-3"),
    SCORE_131(31,117,"0-3"),
    SCORE_132(32,120,"0-3"),
    SCORE_133(33,123,"0-3"),
    SCORE_134(34,126,"0-3"),
    SCORE_135(35,131,"0-3"),
    SCORE_136(36,134,"0-3"),
    SCORE_137(37,137,"0-3"),
    SCORE_138(38,140,"0-3"),
    SCORE_139(39,144,"0-3"),
    SCORE_140(40,148,"0-3"),
    SCORE_141(41,151,"0-3"),
    SCORE_142(42,155,"0-3"),
    SCORE_143(43,158,"0-3"),

    SCORE_27(11,42,"4-7"),
    SCORE_28(12,46,"4-7"),
    SCORE_29(13,50,"4-7"),
    SCORE_30(14,53,"4-7"),
    SCORE_31(15,57,"4-7"),
    SCORE_32(16,60,"4-7"),
    SCORE_233(17,64,"4-7"),
    SCORE_234(18,68,"4-7"),
    SCORE_235(19,71,"4-7"),
    SCORE_236(20,75,"4-7"),
    SCORE_237(21,78,"4-7"),
    SCORE_238(22,82,"4-7"),
    SCORE_239(23,85,"4-7"),
    SCORE_240(24,89,"4-7"),
    SCORE_241(25,93,"4-7"),
    SCORE_242(26,96,"4-7"),
    SCORE_243(27,100,"4-7"),
    SCORE_244(28,103,"4-7"),
    SCORE_245(29,107,"4-7"),
    SCORE_246(30,111,"4-7"),
    SCORE_247(31,114,"4-7"),
    SCORE_248(32,118,"4-7"),
    SCORE_249(33,122,"4-7"),
    SCORE_250(34,125,"4-7"),
    SCORE_251(35,129,"4-7"),
    SCORE_252(36,132,"4-7"),
    SCORE_253(37,136,"4-7"),
    SCORE_254(38,139,"4-7"),
    SCORE_255(39,143,"4-7"),
    SCORE_256(40,147,"4-7"),
    SCORE_257(41,150,"4-7"),
    SCORE_258(42,154,"4-7"),
    SCORE_259(43,157,"4-7"),
    SCORE_260(44,161,"4-7"),

    SCORE_43(11,41,"8-11"),
    SCORE_44(12,45,"8-11"),
    SCORE_45(13,49,"8-11"),
    SCORE_46(14,52,"8-11"),
    SCORE_47(15,56,"8-11"),
    SCORE_48(16,59,"8-11"),
    SCORE_349(17,63,"8-11"),
    SCORE_350(18,67,"8-11"),
    SCORE_351(19,70,"8-11"),
    SCORE_352(20,73,"8-11"),
    SCORE_353(21,76,"8-11"),
    SCORE_354(22,80,"8-11"),
    SCORE_355(23,83,"8-11"),
    SCORE_356(24,87,"8-11"),
    SCORE_357(25,91,"8-11"),
    SCORE_358(26,94,"8-11"),
    SCORE_359(27,98,"8-11"),
    SCORE_360(28,101,"8-11"),
    SCORE_361(29,105,"8-11"),
    SCORE_362(30,109,"8-11"),
    SCORE_363(31,112,"8-11"),
    SCORE_364(32,115,"8-11"),
    SCORE_365(33,119,"8-11"),
    SCORE_366(34,122,"8-11"),
    SCORE_367(35,126,"8-11"),
    SCORE_368(36,129,"8-11"),
    SCORE_369(37,133,"8-11"),
    SCORE_370(38,136,"8-11"),
    SCORE_371(39,140,"8-11"),
    SCORE_372(40,144,"8-11"),
    SCORE_373(41,147,"8-11"),
    SCORE_374(42,151,"8-11"),
    SCORE_375(43,154,"8-11"),
    SCORE_376(44,157,"8-11");

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

    Year10ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year10ScoreEnum o : Year10ScoreEnum.values()) {
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
