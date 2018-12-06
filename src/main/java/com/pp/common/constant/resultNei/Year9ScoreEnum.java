package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 9岁 得分和IQ枚举
 */
public enum Year9ScoreEnum {

    SCORE_6(6,47,"0-3"),
    SCORE_7(7,50,"0-3"),
    SCORE_8(8,53,"0-3"),
    SCORE_9(9,56,"0-3"),
    SCORE_10(10,60,"0-3"),
    SCORE_11(11,63,"0-3"),
    SCORE_12(12,66,"0-3"),
    SCORE_13(13,69,"0-3"),
    SCORE_14(14,72,"0-3"),
    SCORE_15(15,75,"0-3"),
    SCORE_16(16,78,"0-3"),
    SCORE_117(17,81,"0-3"),
    SCORE_118(18,84,"0-3"),
    SCORE_119(19,87,"0-3"),
    SCORE_120(20,91,"0-3"),
    SCORE_121(21,94,"0-3"),
    SCORE_122(22,97,"0-3"),
    SCORE_123(23,100,"0-3"),
    SCORE_124(24,103,"0-3"),
    SCORE_125(25,106,"0-3"),
    SCORE_126(26,109,"0-3"),
    SCORE_127(27,112,"0-3"),
    SCORE_128(28,115,"0-3"),
    SCORE_129(29,118,"0-3"),
    SCORE_130(30,121,"0-3"),
    SCORE_131(31,124,"0-3"),
    SCORE_132(32,127,"0-3"),
    SCORE_133(33,130,"0-3"),
    SCORE_134(34,133,"0-3"),
    SCORE_135(35,136,"0-3"),
    SCORE_136(36,139,"0-3"),
    SCORE_137(37,142,"0-3"),
    SCORE_138(38,145,"0-3"),
    SCORE_139(39,149,"0-3"),
    SCORE_140(40,152,"0-3"),

    SCORE_22(6,43,"4-7"),
    SCORE_23(7,46,"4-7"),
    SCORE_24(8,49,"4-7"),
    SCORE_25(9,52,"4-7"),
    SCORE_26(10,56,"4-7"),
    SCORE_27(11,59,"4-7"),
    SCORE_28(12,62,"4-7"),
    SCORE_29(13,65,"4-7"),
    SCORE_30(14,68,"4-7"),
    SCORE_31(15,71,"4-7"),
    SCORE_32(16,74,"4-7"),
    SCORE_233(17,77,"4-7"),
    SCORE_234(18,80,"4-7"),
    SCORE_235(19,83,"4-7"),
    SCORE_236(20,87,"4-7"),
    SCORE_237(21,90,"4-7"),
    SCORE_238(22,93,"4-7"),
    SCORE_239(23,96,"4-7"),
    SCORE_240(24,99,"4-7"),
    SCORE_241(25,102,"4-7"),
    SCORE_242(26,105,"4-7"),
    SCORE_243(27,108,"4-7"),
    SCORE_244(28,111,"4-7"),
    SCORE_245(29,115,"4-7"),
    SCORE_246(30,118,"4-7"),
    SCORE_247(31,121,"4-7"),
    SCORE_248(32,124,"4-7"),
    SCORE_249(33,127,"4-7"),
    SCORE_250(34,130,"4-7"),
    SCORE_251(35,133,"4-7"),
    SCORE_252(36,136,"4-7"),
    SCORE_253(37,139,"4-7"),
    SCORE_254(38,142,"4-7"),
    SCORE_255(39,146,"4-7"),
    SCORE_256(40,149,"4-7"),
    SCORE_257(41,152,"4-7"),
    SCORE_258(42,155,"4-7"),
    SCORE_259(43,158,"4-7"),

    SCORE_38(6,40,"8-11"),
    SCORE_39(7,41,"8-11"),
    SCORE_40(8,45,"8-11"),
    SCORE_41(9,48,"8-11"),
    SCORE_42(10,52,"8-11"),
    SCORE_43(11,54,"8-11"),
    SCORE_44(12,57,"8-11"),
    SCORE_45(13,60,"8-11"),
    SCORE_46(14,63,"8-11"),
    SCORE_47(15,66,"8-11"),
    SCORE_48(16,70,"8-11"),
    SCORE_349(17,73,"8-11"),
    SCORE_350(18,76,"8-11"),
    SCORE_351(19,79,"8-11"),
    SCORE_352(20,83,"8-11"),
    SCORE_353(21,86,"8-11"),
    SCORE_354(22,90,"8-11"),
    SCORE_355(23,93,"8-11"),
    SCORE_356(24,96,"8-11"),
    SCORE_357(25,99,"8-11"),
    SCORE_358(26,102,"8-11"),
    SCORE_359(27,106,"8-11"),
    SCORE_360(28,109,"8-11"),
    SCORE_361(29,113,"8-11"),
    SCORE_362(30,116,"8-11"),
    SCORE_363(31,119,"8-11"),
    SCORE_364(32,122,"8-11"),
    SCORE_365(33,125,"8-11"),
    SCORE_366(34,128,"8-11"),
    SCORE_367(35,132,"8-11"),
    SCORE_368(36,135,"8-11"),
    SCORE_369(37,138,"8-11"),
    SCORE_370(38,141,"8-11"),
    SCORE_371(39,145,"8-11"),
    SCORE_372(40,148,"8-11"),
    SCORE_373(41,151,"8-11"),
    SCORE_374(42,155,"8-11"),
    SCORE_375(43,158,"8-11");

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

    Year9ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year9ScoreEnum o : Year9ScoreEnum.values()) {
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
