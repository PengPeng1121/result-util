package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 15岁 得分和IQ枚举
 */
public enum Year15ScoreEnum {

    SCORE_118(18,44,"0-3"),
    SCORE_119(19,47,"0-3"),
    SCORE_120(20,50,"0-3"),
    SCORE_121(21,52,"0-3"),
    SCORE_122(22,56,"0-3"),
    SCORE_123(23,59,"0-3"),
    SCORE_124(24,63,"0-3"),
    SCORE_125(25,65,"0-3"),
    SCORE_126(26,69,"0-3"),
    SCORE_127(27,72,"0-3"),
    SCORE_128(28,75,"0-3"),
    SCORE_129(29,78,"0-3"),
    SCORE_130(30,81,"0-3"),
    SCORE_131(31,84,"0-3"),
    SCORE_132(32,88,"0-3"),
    SCORE_133(33,91,"0-3"),
    SCORE_134(34,94,"0-3"),
    SCORE_135(35,97,"0-3"),
    SCORE_136(36,100,"0-3"),
    SCORE_137(37,103,"0-3"),
    SCORE_138(38,106,"0-3"),
    SCORE_139(39,110,"0-3"),
    SCORE_140(40,113,"0-3"),
    SCORE_141(41,116,"0-3"),
    SCORE_142(42,120,"0-3"),
    SCORE_143(43,123,"0-3"),
    SCORE_144(44,126,"0-3"),
    SCORE_145(45,129,"0-3"),
    SCORE_146(46,132,"0-3"),
    SCORE_147(47,135,"0-3"),
    SCORE_148(48,138,"0-3"),
    SCORE_149(49,142,"0-3"),
    SCORE_150(50,145,"0-3"),
    SCORE_151(51,148,"0-3"),

    SCORE_234(18,43,"4-7"),
    SCORE_235(19,47,"4-7"),
    SCORE_236(20,50,"4-7"),
    SCORE_237(21,52,"4-7"),
    SCORE_238(22,55,"4-7"),
    SCORE_239(23,58,"4-7"),
    SCORE_240(24,62,"4-7"),
    SCORE_241(25,65,"4-7"),
    SCORE_242(26,68,"4-7"),
    SCORE_243(27,71,"4-7"),
    SCORE_244(28,74,"4-7"),
    SCORE_245(29,77,"4-7"),
    SCORE_246(30,80,"4-7"),
    SCORE_247(31,83,"4-7"),
    SCORE_248(32,87,"4-7"),
    SCORE_249(33,90,"4-7"),
    SCORE_250(34,93,"4-7"),
    SCORE_251(35,96,"4-7"),
    SCORE_252(36,99,"4-7"),
    SCORE_253(37,102,"4-7"),
    SCORE_254(38,105,"4-7"),
    SCORE_255(39,108,"4-7"),
    SCORE_256(40,112,"4-7"),
    SCORE_257(41,115,"4-7"),
    SCORE_258(42,118,"4-7"),
    SCORE_259(43,121,"4-7"),
    SCORE_260(44,124,"4-7"),
    SCORE_261(45,127,"4-7"),
    SCORE_262(46,130,"4-7"),
    SCORE_263(47,133,"4-7"),
    SCORE_264(48,136,"4-7"),
    SCORE_265(49,140,"4-7"),
    SCORE_266(50,143,"4-7"),
    SCORE_267(51,146,"4-7"),

    SCORE_350(18,43,"8-11"),
    SCORE_351(19,47,"8-11"),
    SCORE_352(20,50,"8-11"),
    SCORE_353(21,52,"8-11"),
    SCORE_354(22,55,"8-11"),
    SCORE_355(23,58,"8-11"),
    SCORE_356(24,62,"8-11"),
    SCORE_357(25,65,"8-11"),
    SCORE_358(26,68,"8-11"),
    SCORE_359(27,71,"8-11"),
    SCORE_360(28,74,"8-11"),
    SCORE_361(29,76,"8-11"),
    SCORE_362(30,79,"8-11"),
    SCORE_363(31,82,"8-11"),
    SCORE_364(32,86,"8-11"),
    SCORE_365(33,89,"8-11"),
    SCORE_366(34,92,"8-11"),
    SCORE_367(35,95,"8-11"),
    SCORE_368(36,98,"8-11"),
    SCORE_369(37,101,"8-11"),
    SCORE_370(38,104,"8-11"),
    SCORE_371(39,107,"8-11"),
    SCORE_372(40,110,"8-11"),
    SCORE_373(41,113,"8-11"),
    SCORE_374(42,116,"8-11"),
    SCORE_375(43,119,"8-11"),
    SCORE_376(44,122,"8-11"),
    SCORE_377(45,125,"8-11"),
    SCORE_378(46,128,"8-11"),
    SCORE_379(47,131,"8-11"),
    SCORE_380(48,134,"8-11"),
    SCORE_381(49,138,"8-11"),
    SCORE_382(50,141,"8-11"),
    SCORE_383(51,143,"8-11");

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

    Year15ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year15ScoreEnum o : Year15ScoreEnum.values()) {
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
