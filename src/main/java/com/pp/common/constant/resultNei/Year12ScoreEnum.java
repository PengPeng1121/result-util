package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 12岁 得分和IQ枚举
 */
public enum Year12ScoreEnum {


    SCORE_14(14,45,"0-3"),
    SCORE_15(15,48,"0-3"),
    SCORE_16(16,50,"0-3"),
    SCORE_117(17,55,"0-3"),
    SCORE_118(18,58,"0-3"),
    SCORE_119(19,61,"0-3"),
    SCORE_120(20,64,"0-3"),
    SCORE_121(21,68,"0-3"),
    SCORE_122(22,71,"0-3"),
    SCORE_123(23,74,"0-3"),
    SCORE_124(24,78,"0-3"),
    SCORE_125(25,81,"0-3"),
    SCORE_126(26,85,"0-3"),
    SCORE_127(27,88,"0-3"),
    SCORE_128(28,91,"0-3"),
    SCORE_129(29,95,"0-3"),
    SCORE_130(30,98,"0-3"),
    SCORE_131(31,101,"0-3"),
    SCORE_132(32,104,"0-3"),
    SCORE_133(33,108,"0-3"),
    SCORE_134(34,111,"0-3"),
    SCORE_135(35,114,"0-3"),
    SCORE_136(36,118,"0-3"),
    SCORE_137(37,121,"0-3"),
    SCORE_138(38,124,"0-3"),
    SCORE_139(39,128,"0-3"),
    SCORE_140(40,131,"0-3"),
    SCORE_141(41,134,"0-3"),
    SCORE_142(42,138,"0-3"),
    SCORE_143(43,140,"0-3"),
    SCORE_144(44,144,"0-3"),
    SCORE_145(45,147,"0-3"),
    SCORE_146(46,150,"0-3"),
    SCORE_147(47,154,"0-3"),
    SCORE_148(48,155,"0-3"),

    SCORE_30(14,42,"4-7"),
    SCORE_31(15,45,"4-7"),
    SCORE_32(16,48,"4-7"),
    SCORE_233(17,52,"4-7"),
    SCORE_234(18,55,"4-7"),
    SCORE_235(19,58,"4-7"),
    SCORE_236(20,62,"4-7"),
    SCORE_237(21,65,"4-7"),
    SCORE_238(22,68,"4-7"),
    SCORE_239(23,72,"4-7"),
    SCORE_240(24,75,"4-7"),
    SCORE_241(25,78,"4-7"),
    SCORE_242(26,82,"4-7"),
    SCORE_243(27,85,"4-7"),
    SCORE_244(28,88,"4-7"),
    SCORE_245(29,92,"4-7"),
    SCORE_246(30,95,"4-7"),
    SCORE_247(31,98,"4-7"),
    SCORE_248(32,102,"4-7"),
    SCORE_249(33,105,"4-7"),
    SCORE_250(34,108,"4-7"),
    SCORE_251(35,112,"4-7"),
    SCORE_252(36,115,"4-7"),
    SCORE_253(37,118,"4-7"),
    SCORE_254(38,122,"4-7"),
    SCORE_255(39,125,"4-7"),
    SCORE_256(40,129,"4-7"),
    SCORE_257(41,132,"4-7"),
    SCORE_258(42,135,"4-7"),
    SCORE_259(43,138,"4-7"),
    SCORE_260(44,142,"4-7"),
    SCORE_261(45,145,"4-7"),
    SCORE_262(46,148,"4-7"),
    SCORE_263(47,152,"4-7"),
    SCORE_264(48,152,"4-7"),
    SCORE_265(49,158,"4-7"),
    SCORE_266(50,162,"4-7"),

    SCORE_48(16,47,"8-11"),
    SCORE_349(17,51,"8-11"),
    SCORE_350(18,54,"8-11"),
    SCORE_351(19,57,"8-11"),
    SCORE_352(20,61,"8-11"),
    SCORE_353(21,64,"8-11"),
    SCORE_354(22,67,"8-11"),
    SCORE_355(23,70,"8-11"),
    SCORE_356(24,73,"8-11"),
    SCORE_357(25,77,"8-11"),
    SCORE_358(26,80,"8-11"),
    SCORE_359(27,83,"8-11"),
    SCORE_360(28,86,"8-11"),
    SCORE_361(29,90,"8-11"),
    SCORE_362(30,93,"8-11"),
    SCORE_363(31,96,"8-11"),
    SCORE_364(32,100,"8-11"),
    SCORE_365(33,103,"8-11"),
    SCORE_366(34,106,"8-11"),
    SCORE_367(35,110,"8-11"),
    SCORE_368(36,113,"8-11"),
    SCORE_369(37,116,"8-11"),
    SCORE_370(38,119,"8-11"),
    SCORE_371(39,122,"8-11"),
    SCORE_372(40,126,"8-11"),
    SCORE_373(41,129,"8-11"),
    SCORE_374(42,132,"8-11"),
    SCORE_375(43,135,"8-11"),
    SCORE_376(44,139,"8-11"),
    SCORE_377(45,142,"8-11"),
    SCORE_378(46,145,"8-11"),
    SCORE_379(47,149,"8-11"),
    SCORE_380(48,150,"8-11"),
    SCORE_381(49,155,"8-11"),
    SCORE_382(50,158,"8-11");

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

    Year12ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year12ScoreEnum o : Year12ScoreEnum.values()) {
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
