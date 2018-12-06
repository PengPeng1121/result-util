package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 17-18岁 得分和IQ枚举
 */
public enum Year17_18ScoreEnum {

    SCORE_118(18,42,"0-11"),
    SCORE_119(19,45,"0-11"),
    SCORE_120(20,48,"0-11"),
    SCORE_121(21,50,"0-11"),
    SCORE_122(22,53,"0-11"),
    SCORE_123(23,56,"0-11"),
    SCORE_124(24,58,"0-11"),
    SCORE_125(25,61,"0-11"),
    SCORE_126(26,64,"0-11"),
    SCORE_127(27,66,"0-11"),
    SCORE_128(28,69,"0-11"),
    SCORE_129(29,72,"0-11"),
    SCORE_130(30,74,"0-11"),
    SCORE_131(31,77,"0-11"),
    SCORE_132(32,80,"0-11"),
    SCORE_133(33,82,"0-11"),
    SCORE_134(34,85,"0-11"),
    SCORE_135(35,87,"0-11"),
    SCORE_136(36,90,"0-11"),
    SCORE_137(37,93,"0-11"),
    SCORE_138(38,95,"0-11"),
    SCORE_139(39,98,"0-11"),
    SCORE_140(40,101,"0-11"),
    SCORE_141(41,103,"0-11"),
    SCORE_142(42,106,"0-11"),
    SCORE_143(43,109,"0-11"),
    SCORE_144(44,111,"0-11"),
    SCORE_145(45,114,"0-11"),
    SCORE_146(46,117,"0-11"),
    SCORE_147(47,120,"0-11"),
    SCORE_148(48,122,"0-11"),
    SCORE_149(49,125,"0-11"),
    SCORE_150(50,127,"0-11"),
    SCORE_151(51,130,"0-11");

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

    Year17_18ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year17_18ScoreEnum o : Year17_18ScoreEnum.values()) {
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
