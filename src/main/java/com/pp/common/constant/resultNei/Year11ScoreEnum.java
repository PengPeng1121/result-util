package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 11岁 得分和IQ枚举
 */
public enum Year11ScoreEnum {


    SCORE_11(11,41,"0-3"),
    SCORE_12(12,44,"0-3"),
    SCORE_13(13,48,"0-3"),
    SCORE_14(14,51,"0-3"),
    SCORE_15(15,54,"0-3"),
    SCORE_16(16,57,"0-3"),
    SCORE_117(17,61,"0-3"),
    SCORE_118(18,65,"0-3"),
    SCORE_119(19,68,"0-3"),
    SCORE_120(20,71,"0-3"),
    SCORE_121(21,74,"0-3"),
    SCORE_122(22,78,"0-3"),
    SCORE_123(23,81,"0-3"),
    SCORE_124(24,85,"0-3"),
    SCORE_125(25,88,"0-3"),
    SCORE_126(26,92,"0-3"),
    SCORE_127(27,95,"0-3"),
    SCORE_128(28,98,"0-3"),
    SCORE_129(29,102,"0-3"),
    SCORE_130(30,106,"0-3"),
    SCORE_131(31,109,"0-3"),
    SCORE_132(32,112,"0-3"),
    SCORE_133(33,116,"0-3"),
    SCORE_134(34,119,"0-3"),
    SCORE_135(35,122,"0-3"),
    SCORE_136(36,126,"0-3"),
    SCORE_137(37,129,"0-3"),
    SCORE_138(38,132,"0-3"),
    SCORE_139(39,137,"0-3"),
    SCORE_140(40,140,"0-3"),
    SCORE_141(41,143,"0-3"),
    SCORE_142(42,147,"0-3"),
    SCORE_143(43,150,"0-3"),
    SCORE_144(44,153,"0-3"),

    SCORE_27(11,40,"4-7"),
    SCORE_28(12,43,"4-7"),
    SCORE_29(13,47,"4-7"),
    SCORE_30(14,50,"4-7"),
    SCORE_31(15,53,"4-7"),
    SCORE_32(16,56,"4-7"),
    SCORE_233(17,60,"4-7"),
    SCORE_234(18,63,"4-7"),
    SCORE_235(19,66,"4-7"),
    SCORE_236(20,69,"4-7"),
    SCORE_237(21,73,"4-7"),
    SCORE_238(22,76,"4-7"),
    SCORE_239(23,79,"4-7"),
    SCORE_240(24,83,"4-7"),
    SCORE_241(25,86,"4-7"),
    SCORE_242(26,90,"4-7"),
    SCORE_243(27,93,"4-7"),
    SCORE_244(28,96,"4-7"),
    SCORE_245(29,100,"4-7"),
    SCORE_246(30,103,"4-7"),
    SCORE_247(31,106,"4-7"),
    SCORE_248(32,109,"4-7"),
    SCORE_249(33,113,"4-7"),
    SCORE_250(34,116,"4-7"),
    SCORE_251(35,119,"4-7"),
    SCORE_252(36,123,"4-7"),
    SCORE_253(37,126,"4-7"),
    SCORE_254(38,129,"4-7"),
    SCORE_255(39,133,"4-7"),
    SCORE_256(40,136,"4-7"),
    SCORE_257(41,139,"4-7"),
    SCORE_258(42,143,"4-7"),
    SCORE_259(43,146,"4-7"),
    SCORE_260(44,149,"4-7"),
    SCORE_261(45,152,"4-7"),
    SCORE_262(46,155,"4-7"),
    SCORE_263(47,158,"4-7"),
    SCORE_264(48,162,"4-7"),

    SCORE_46(14,48,"8-11"),
    SCORE_47(15,51,"8-11"),
    SCORE_48(16,54,"8-11"),
    SCORE_349(17,58,"8-11"),
    SCORE_350(18,61,"8-11"),
    SCORE_351(19,64,"8-11"),
    SCORE_352(20,67,"8-11"),
    SCORE_353(21,71,"8-11"),
    SCORE_354(22,74,"8-11"),
    SCORE_355(23,77,"8-11"),
    SCORE_356(24,81,"8-11"),
    SCORE_357(25,84,"8-11"),
    SCORE_358(26,88,"8-11"),
    SCORE_359(27,91,"8-11"),
    SCORE_360(28,94,"8-11"),
    SCORE_361(29,98,"8-11"),
    SCORE_362(30,101,"8-11"),
    SCORE_363(31,104,"8-11"),
    SCORE_364(32,107,"8-11"),
    SCORE_365(33,111,"8-11"),
    SCORE_366(34,114,"8-11"),
    SCORE_367(35,117,"8-11"),
    SCORE_368(36,121,"8-11"),
    SCORE_369(37,124,"8-11"),
    SCORE_370(38,127,"8-11"),
    SCORE_371(39,131,"8-11"),
    SCORE_372(40,134,"8-11"),
    SCORE_373(41,137,"8-11"),
    SCORE_374(42,141,"8-11"),
    SCORE_375(43,144,"8-11"),
    SCORE_376(44,147,"8-11"),
    SCORE_377(45,150,"8-11"),
    SCORE_378(46,153,"8-11"),
    SCORE_379(47,156,"8-11"),
    SCORE_380(48,159,"8-11");

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

    Year11ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year11ScoreEnum o : Year11ScoreEnum.values()) {
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
