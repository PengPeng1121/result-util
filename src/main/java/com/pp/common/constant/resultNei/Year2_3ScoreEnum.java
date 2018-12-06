package com.pp.common.constant.resultNei;

/**
 * Created by asus on 2018/12/6  比内
 * 2-3岁 得分和IQ枚举
 */
public enum Year2_3ScoreEnum {
    SCORE_1(1,75,"0-3"),
    SCORE_2(2,85,"0-3"),
    SCORE_3(3,90,"0-3"),
    SCORE_4(4,96,"0-3"),
    SCORE_5(5,102,"0-3"),
    SCORE_6(6,108,"0-3"),
    SCORE_7(7,113,"0-3"),
    SCORE_8(8,116,"0-3"),
    SCORE_9(9,126,"0-3"),
    SCORE_10(10,132,"0-3"),
    SCORE_11(11,137,"0-3"),
    SCORE_12(12,144,"0-3"),
    SCORE_13(13,150,"0-3"),
    SCORE_14(14,155,"0-3"),
    SCORE_15(15,151,"0-3"),
    SCORE_16(16,167,"0-3"),
    SCORE_17(1,72,"4-7"),
    SCORE_18(2,81,"4-7"),
    SCORE_19(3,86,"4-7"),
    SCORE_20(4,92,"4-7"),
    SCORE_21(5,97,"4-7"),
    SCORE_22(6,103,"4-7"),
    SCORE_23(7,108,"4-7"),
    SCORE_24(8,114,"4-7"),
    SCORE_25(9,120,"4-7"),
    SCORE_26(10,126,"4-7"),
    SCORE_27(11,131,"4-7"),
    SCORE_28(12,137,"4-7"),
    SCORE_29(13,143,"4-7"),
    SCORE_30(14,148,"4-7"),
    SCORE_31(15,154,"4-7"),
    SCORE_32(16,159,"4-7"),
    SCORE_33(1,69,"8-11"),
    SCORE_34(2,77,"8-11"),
    SCORE_35(3,82,"8-11"),
    SCORE_36(4,86,"8-11"),
    SCORE_37(5,92,"8-11"),
    SCORE_38(6,98,"8-11"),
    SCORE_39(7,103,"8-11"),
    SCORE_40(8,112,"8-11"),
    SCORE_41(9,114,"8-11"),
    SCORE_42(10,120,"8-11"),
    SCORE_43(11,125,"8-11"),
    SCORE_44(12,130,"8-11"),
    SCORE_45(13,136,"8-11"),
    SCORE_46(14,141,"8-11"),
    SCORE_47(15,147,"8-11"),
    SCORE_48(16,152,"8-11");

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

    Year2_3ScoreEnum(Integer score, Integer IQ, String monthRange) {
        this.score = score;
        this.IQ = IQ;
        this.monthRange = monthRange;
    }

    //根据索引获取名称
    public static Integer getIQByScoreAndMonth(Integer score,Integer month) {
        Integer IQ = 0;
        for (Year2_3ScoreEnum o : Year2_3ScoreEnum.values()) {
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
