package com.pp.common.constant.result132;

/**
 * Created by asus on 2018/1/15.
 */
public enum Standard_A {

//            粗分与标准分换算(2)
//标准分	4-	5-	6-	8-	10-	12-14
//            5	      <5	<9	<30	<38	<63	<70
//            6	    5-16	9-22	30-42	38-52	63-74	70-80
//            7	   17-28	23-37	43-54	53-66	75-86	81-91
//            8	   29-40	38-51	55-67	67-80	87-97	92-102
//            9	   41-51	52-65	68-80	81-95	98-109	103-113
//            10   52-74	66-95	81-106	96-124	110-122	114-126
//            11   75-88	96-109	107-119	 >124	>122	>126
//            12   89-100	110-123	 120-131	-	-	-
//            13   >100	>123	>131	-	-	-
//一共132道题，总数取200
    SCORE_9("9","0-4"),

    SCORE_10("10","5-10"),

    SCORE_11("11","11-14"),

    SCORE_12("12","15-18"),

    SCORE_13("13","19-200");

    private String name;

    private String index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    Standard_A(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getStandardScoreByThickScore(Integer index) {
        String name = "-1";
        for (Standard_A o : Standard_A.values()) {
            String arr[] = o.getIndex().split("-");
            Integer begin = Integer.parseInt(arr[0]);
            Integer end = Integer.parseInt(arr[1]);
            if (begin <= index && index <= end) {
                name = o.getName();
                break;
            }
        }
        return name;
    }
}
