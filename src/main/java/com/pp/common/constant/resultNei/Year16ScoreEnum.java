package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 16岁 得分和IQ枚举
 */
public enum Year16ScoreEnum {

    SCORE_118(18,43,"0-3"),
    SCORE_119(19,47,"0-3"),
    SCORE_120(20,50,"0-3"),
    SCORE_121(21,52,"0-3"),
    SCORE_122(22,55,"0-3"),
    SCORE_123(23,58,"0-3"),
    SCORE_124(24,61,"0-3"),
    SCORE_125(25,64,"0-3"),
    SCORE_126(26,67,"0-3"),
    SCORE_127(27,70,"0-3"),
    SCORE_128(28,73,"0-3"),
    SCORE_129(29,75,"0-3"),
    SCORE_130(30,78,"0-3"),
    SCORE_131(31,81,"0-3"),
    SCORE_132(32,85,"0-3"),
    SCORE_133(33,88,"0-3"),
    SCORE_134(34,90,"0-3"),
    SCORE_135(35,93,"0-3"),
    SCORE_136(36,97,"0-3"),
    SCORE_137(37,100,"0-3"),
    SCORE_138(38,103,"0-3"),
    SCORE_139(39,106,"0-3"),
    SCORE_140(40,108,"0-3"),
    SCORE_141(41,111,"0-3"),
    SCORE_142(42,114,"0-3"),
    SCORE_143(43,117,"0-3"),
    SCORE_144(44,120,"0-3"),
    SCORE_145(45,122,"0-3"),
    SCORE_146(46,125,"0-3"),
    SCORE_147(47,128,"0-3"),
    SCORE_148(48,131,"0-3"),
    SCORE_149(49,135,"0-3"),
    SCORE_150(50,138,"0-3"),
    SCORE_151(51,139,"0-3"),

    SCORE_234(18,43,"4-7"),
    SCORE_235(19,47,"4-7"),
    SCORE_236(20,50,"4-7"),
    SCORE_237(21,52,"4-7"),
    SCORE_238(22,55,"4-7"),
    SCORE_239(23,58,"4-7"),
    SCORE_240(24,61,"4-7"),
    SCORE_241(25,64,"4-7"),
    SCORE_242(26,67,"4-7"),
    SCORE_243(27,70,"4-7"),
    SCORE_244(28,73,"4-7"),
    SCORE_245(29,75,"4-7"),
    SCORE_246(30,78,"4-7"),
    SCORE_247(31,81,"4-7"),
    SCORE_248(32,84,"4-7"),
    SCORE_249(33,87,"4-7"),
    SCORE_250(34,89,"4-7"),
    SCORE_251(35,92,"4-7"),
    SCORE_252(36,95,"4-7"),
    SCORE_253(37,98,"4-7"),
    SCORE_254(38,101,"4-7"),
    SCORE_255(39,104,"4-7"),
    SCORE_256(40,106,"4-7"),
    SCORE_257(41,109,"4-7"),
    SCORE_258(42,112,"4-7"),
    SCORE_259(43,115,"4-7"),
    SCORE_260(44,118,"4-7"),
    SCORE_261(45,120,"4-7"),
    SCORE_262(46,123,"4-7"),
    SCORE_263(47,126,"4-7"),
    SCORE_264(48,129,"4-7"),
    SCORE_265(49,132,"4-7"),
    SCORE_266(50,135,"4-7"),
    SCORE_267(51,136,"4-7"),

    SCORE_350(18,43,"8-11"),
    SCORE_351(19,46,"8-11"),
    SCORE_352(20,49,"8-11"),
    SCORE_353(21,52,"8-11"),
    SCORE_354(22,54,"8-11"),
    SCORE_355(23,57,"8-11"),
    SCORE_356(24,60,"8-11"),
    SCORE_357(25,63,"8-11"),
    SCORE_358(26,66,"8-11"),
    SCORE_359(27,68,"8-11"),
    SCORE_360(28,71,"8-11"),
    SCORE_361(29,74,"8-11"),
    SCORE_362(30,76,"8-11"),
    SCORE_363(31,79,"8-11"),
    SCORE_364(32,82,"8-11"),
    SCORE_365(33,85,"8-11"),
    SCORE_366(34,87,"8-11"),
    SCORE_367(35,91,"8-11"),
    SCORE_368(36,94,"8-11"),
    SCORE_369(37,97,"8-11"),
    SCORE_370(38,99,"8-11"),
    SCORE_371(39,102,"8-11"),
    SCORE_372(40,105,"8-11"),
    SCORE_373(41,108,"8-11"),
    SCORE_374(42,110,"8-11"),
    SCORE_375(43,113,"8-11"),
    SCORE_376(44,116,"8-11"),
    SCORE_377(45,118,"8-11"),
    SCORE_378(46,121,"8-11"),
    SCORE_379(47,124,"8-11"),
    SCORE_380(48,127,"8-11"),
    SCORE_381(49,130,"8-11"),
    SCORE_382(50,133,"8-11"),
    SCORE_383(51,134,"8-11");

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

    Year16ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year16ScoreEnum o : Year16ScoreEnum.values()) {
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
