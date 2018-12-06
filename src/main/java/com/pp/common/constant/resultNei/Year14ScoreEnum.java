package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 14岁 得分和IQ枚举
 */
public enum Year14ScoreEnum {

    SCORE_118(18,46,"0-3"),
    SCORE_119(19,50,"0-3"),
    SCORE_120(20,53,"0-3"),
    SCORE_121(21,56,"0-3"),
    SCORE_122(22,59,"0-3"),
    SCORE_123(23,63,"0-3"),
    SCORE_124(24,65,"0-3"),
    SCORE_125(25,69,"0-3"),
    SCORE_126(26,73,"0-3"),
    SCORE_127(27,76,"0-3"),
    SCORE_128(28,79,"0-3"),
    SCORE_129(29,82,"0-3"),
    SCORE_130(30,85,"0-3"),
    SCORE_131(31,88,"0-3"),
    SCORE_132(32,91,"0-3"),
    SCORE_133(33,94,"0-3"),
    SCORE_134(34,97,"0-3"),
    SCORE_135(35,101,"0-3"),
    SCORE_136(36,104,"0-3"),
    SCORE_137(37,107,"0-3"),
    SCORE_138(38,110,"0-3"),
    SCORE_139(39,114,"0-3"),
    SCORE_140(40,117,"0-3"),
    SCORE_141(41,120,"0-3"),
    SCORE_142(42,124,"0-3"),
    SCORE_143(43,127,"0-3"),
    SCORE_144(44,130,"0-3"),
    SCORE_145(45,133,"0-3"),
    SCORE_146(46,137,"0-3"),
    SCORE_147(47,139,"0-3"),
    SCORE_148(48,143,"0-3"),
    SCORE_149(49,146,"0-3"),
    SCORE_150(50,149,"0-3"),
    SCORE_151(51,153,"0-3"),

    SCORE_234(18,44,"4-7"),
    SCORE_235(19,48,"4-7"),
    SCORE_236(20,51,"4-7"),
    SCORE_237(21,54,"4-7"),
    SCORE_238(22,57,"4-7"),
    SCORE_239(23,61,"4-7"),
    SCORE_240(24,64,"4-7"),
    SCORE_241(25,67,"4-7"),
    SCORE_242(26,71,"4-7"),
    SCORE_243(27,74,"4-7"),
    SCORE_244(28,77,"4-7"),
    SCORE_245(29,80,"4-7"),
    SCORE_246(30,83,"4-7"),
    SCORE_247(31,86,"4-7"),
    SCORE_248(32,89,"4-7"),
    SCORE_249(33,93,"4-7"),
    SCORE_250(34,96,"4-7"),
    SCORE_251(35,100,"4-7"),
    SCORE_252(36,103,"4-7"),
    SCORE_253(37,106,"4-7"),
    SCORE_254(38,109,"4-7"),
    SCORE_255(39,113,"4-7"),
    SCORE_256(40,116,"4-7"),
    SCORE_257(41,119,"4-7"),
    SCORE_258(42,123,"4-7"),
    SCORE_259(43,126,"4-7"),
    SCORE_260(44,129,"4-7"),
    SCORE_261(45,132,"4-7"),
    SCORE_262(46,136,"4-7"),
    SCORE_263(47,139,"4-7"),
    SCORE_264(48,142,"4-7"),
    SCORE_265(49,145,"4-7"),
    SCORE_266(50,148,"4-7"),
    SCORE_267(51,152,"4-7"),

    SCORE_350(18,44,"8-11"),
    SCORE_351(19,47,"8-11"),
    SCORE_352(20,50,"8-11"),
    SCORE_353(21,53,"8-11"),
    SCORE_354(22,56,"8-11"),
    SCORE_355(23,60,"8-11"),
    SCORE_356(24,63,"8-11"),
    SCORE_357(25,66,"8-11"),
    SCORE_358(26,70,"8-11"),
    SCORE_359(27,73,"8-11"),
    SCORE_360(28,76,"8-11"),
    SCORE_361(29,79,"8-11"),
    SCORE_362(30,82,"8-11"),
    SCORE_363(31,85,"8-11"),
    SCORE_364(32,88,"8-11"),
    SCORE_365(33,92,"8-11"),
    SCORE_366(34,95,"8-11"),
    SCORE_367(35,99,"8-11"),
    SCORE_368(36,102,"8-11"),
    SCORE_369(37,105,"8-11"),
    SCORE_370(38,108,"8-11"),
    SCORE_371(39,112,"8-11"),
    SCORE_372(40,115,"8-11"),
    SCORE_373(41,118,"8-11"),
    SCORE_374(42,122,"8-11"),
    SCORE_375(43,125,"8-11"),
    SCORE_376(44,128,"8-11"),
    SCORE_377(45,131,"8-11"),
    SCORE_378(46,134,"8-11"),
    SCORE_379(47,137,"8-11"),
    SCORE_380(48,140,"8-11"),
    SCORE_381(49,144,"8-11"),
    SCORE_382(50,147,"8-11"),
    SCORE_383(51,150,"8-11");

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

    Year14ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year14ScoreEnum o : Year14ScoreEnum.values()) {
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
