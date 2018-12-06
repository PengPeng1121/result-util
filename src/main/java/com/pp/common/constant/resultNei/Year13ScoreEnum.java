package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 13岁 得分和IQ枚举
 */
public enum Year13ScoreEnum {

    SCORE_16(16,46,"0-3"),
    SCORE_117(17,49,"0-3"),
    SCORE_118(18,52,"0-3"),
    SCORE_119(19,55,"0-3"),
    SCORE_120(20,59,"0-3"),
    SCORE_121(21,62,"0-3"),
    SCORE_122(22,65,"0-3"),
    SCORE_123(23,68,"0-3"),
    SCORE_124(24,71,"0-3"),
    SCORE_125(25,75,"0-3"),
    SCORE_126(26,78,"0-3"),
    SCORE_127(27,81,"0-3"),
    SCORE_128(28,84,"0-3"),
    SCORE_129(29,87,"0-3"),
    SCORE_130(30,90,"0-3"),
    SCORE_131(31,93,"0-3"),
    SCORE_132(32,97,"0-3"),
    SCORE_133(33,100,"0-3"),
    SCORE_134(34,103,"0-3"),
    SCORE_135(35,107,"0-3"),
    SCORE_136(36,110,"0-3"),
    SCORE_137(37,113,"0-3"),
    SCORE_138(38,116,"0-3"),
    SCORE_139(39,119,"0-3"),
    SCORE_140(40,122,"0-3"),
    SCORE_141(41,125,"0-3"),
    SCORE_142(42,128,"0-3"),
    SCORE_143(43,131,"0-3"),
    SCORE_144(44,135,"0-3"),
    SCORE_145(45,138,"0-3"),
    SCORE_146(46,141,"0-3"),
    SCORE_147(47,145,"0-3"),
    SCORE_148(48,147,"0-3"),
    SCORE_149(49,151,"0-3"),
    SCORE_150(50,154,"0-3"),

    SCORE_32(16,45,"4-7"),
    SCORE_233(17,48,"4-7"),
    SCORE_234(18,51,"4-7"),
    SCORE_235(19,54,"4-7"),
    SCORE_236(20,57,"4-7"),
    SCORE_237(21,60,"4-7"),
    SCORE_238(22,63,"4-7"),
    SCORE_239(23,66,"4-7"),
    SCORE_240(24,69,"4-7"),
    SCORE_241(25,73,"4-7"),
    SCORE_242(26,76,"4-7"),
    SCORE_243(27,79,"4-7"),
    SCORE_244(28,82,"4-7"),
    SCORE_245(29,85,"4-7"),
    SCORE_246(30,88,"4-7"),
    SCORE_247(31,91,"4-7"),
    SCORE_248(32,94,"4-7"),
    SCORE_249(33,97,"4-7"),
    SCORE_250(34,100,"4-7"),
    SCORE_251(35,104,"4-7"),
    SCORE_252(36,107,"4-7"),
    SCORE_253(37,110,"4-7"),
    SCORE_254(38,113,"4-7"),
    SCORE_255(39,116,"4-7"),
    SCORE_256(40,119,"4-7"),
    SCORE_257(41,122,"4-7"),
    SCORE_258(42,125,"4-7"),
    SCORE_259(43,128,"4-7"),
    SCORE_260(44,132,"4-7"),
    SCORE_261(45,135,"4-7"),
    SCORE_262(46,138,"4-7"),
    SCORE_263(47,141,"4-7"),
    SCORE_264(48,144,"4-7"),
    SCORE_265(49,147,"4-7"),
    SCORE_266(50,150,"4-7"),
    SCORE_267(51,151,"4-7"),

    SCORE_48(16,44,"8-11"),
    SCORE_349(17,47,"8-11"),
    SCORE_350(18,49,"8-11"),
    SCORE_351(19,52,"8-11"),
    SCORE_352(20,55,"8-11"),
    SCORE_353(21,58,"8-11"),
    SCORE_354(22,61,"8-11"),
    SCORE_355(23,65,"8-11"),
    SCORE_356(24,68,"8-11"),
    SCORE_357(25,71,"8-11"),
    SCORE_358(26,75,"8-11"),
    SCORE_359(27,78,"8-11"),
    SCORE_360(28,81,"8-11"),
    SCORE_361(29,84,"8-11"),
    SCORE_362(30,87,"8-11"),
    SCORE_363(31,90,"8-11"),
    SCORE_364(32,93,"8-11"),
    SCORE_365(33,96,"8-11"),
    SCORE_366(34,99,"8-11"),
    SCORE_367(35,103,"8-11"),
    SCORE_368(36,106,"8-11"),
    SCORE_369(37,109,"8-11"),
    SCORE_370(38,112,"8-11"),
    SCORE_371(39,115,"8-11"),
    SCORE_372(40,118,"8-11"),
    SCORE_373(41,121,"8-11"),
    SCORE_374(42,124,"8-11"),
    SCORE_375(43,127,"8-11"),
    SCORE_376(44,131,"8-11"),
    SCORE_377(45,134,"8-11"),
    SCORE_378(46,137,"8-11"),
    SCORE_379(47,140,"8-11"),
    SCORE_380(48,143,"8-11"),
    SCORE_381(49,146,"8-11"),
    SCORE_382(50,149,"8-11"),
    SCORE_383(51,153,"8-11");

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

    Year13ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year13ScoreEnum o : Year13ScoreEnum.values()) {
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
