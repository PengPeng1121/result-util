package com.pp.common.constant.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2018/5/5.
 */
public class DDSTUtil {



    public static String getResult(List<Integer> a1List,List<Integer> a2List,List<Integer> a3List,List<Integer> a4List){
        if(a1List==null ||a1List.size()!=23){
            return "无法确定";
        }
        if(a2List==null ||a2List.size()!=30){
            return "无法确定";
        }
        if(a3List==null ||a3List.size()!=20){
            return "无法确定";
        }
        if(a4List==null ||a4List.size()!=31){
            return "无法确定";
        }


        Integer a1Lose = 0; //迟长
        Integer a1Success = 0; //成功
        Integer a1Failed = 0; //失败
        Integer a1UnCoop = 0; //不合作
        Integer a1UnAnswer = 0; //不用答
        for(Integer i:a1List){
            switch (i){
                case 0:
                    a1Success++;
                    continue;
                case 1:
                    a1Failed++;
                    continue;
                case 2:
                    a1Lose++;
                    continue;
                case 3:
                    a1UnCoop++;
                    continue;
                case 4:
                    a1UnAnswer++;
                    continue;
            }
        }
        Integer a2Lose = 0;
        Integer a2Success = 0;
        Integer a2Failed = 0;
        Integer a2UnCoop = 0;
        Integer a2UnAnswer = 0;
        for(Integer i:a2List){
            switch (i){
                case 0:
                    a2Success++;
                    continue;
                case 1:
                    a2Failed++;
                    continue;
                case 2:
                    a2Lose++;
                    continue;
                case 3:
                    a2UnCoop++;
                    continue;
                case 4:
                    a2UnAnswer++;
                    continue;
            }
        }
        Integer a3Lose = 0;
        Integer a3Success = 0;
        Integer a3Failed = 0;
        Integer a3UnCoop = 0;
        Integer a3UnAnswer = 0;
        for(Integer i:a3List){
            switch (i){
                case 0:
                    a3Success++;
                    continue;
                case 1:
                    a3Failed++;
                    continue;
                case 2:
                    a3Lose++;
                    continue;
                case 3:
                    a3UnCoop++;
                    continue;
                case 4:
                    a3UnAnswer++;
                    continue;
            }
        }
        Integer a4Lose = 0;
        Integer a4Success = 0;
        Integer a4Failed = 0;
        Integer a4UnCoop = 0;
        Integer a4UnAnswer = 0;
        for(Integer i:a4List){
            switch (i){
                case 0:
                    a4Success++;
                    continue;
                case 1:
                    a4Failed++;
                    continue;
                case 2:
                    a4Lose++;
                    continue;
                case 3:
                    a4UnCoop++;
                    continue;
                case 4:
                    a4UnAnswer++;
                    continue;
            }
        }
        //两个或者更多能区有两项或更多项目迟长
        if((a1Lose>=2&&a2Lose>=2)||(a1Lose>=2&&a3Lose>=2)||(a1Lose>=2&&a4Lose>=2)
                ||(a2Lose>=2&&a3Lose>=2)||(a2Lose>=2&&a4Lose>=2)||(a3Lose>=2&&a4Lose>=2)){
            return "异常";
        }
        //一个能区有两项或更多项目迟长、加上一个或更多能区具有一项迟长和同区通过年龄线的项目都失败
        if((a1Lose>=2&& a2Lose==1 &&a2Success==0)||(a1Lose>=2&& a3Lose==1 &&a3Success==0)||(a1Lose>=2 && a4Lose==1 &&a4Success==0)
                ||(a2Lose>=2&& a3Lose==1&&a3Success==0)||(a2Lose>=2 && a4Lose==1 &&a4Success==0)||(a3Lose>=2 && a4Lose==1 &&a4Success==0)){
            return "异常";
        }
        //一个能区有两项或更多项目迟长、加上一个或更多能区具有一项迟长和同区通过年龄线的项目都失败
        if((a2Lose>=2&& a1Lose==1 &&a1Success==0)||(a3Lose>=2&& a1Lose==1 &&a1Success==0)||(a4Lose>=2 && a1Lose==1 &&a1Success==0)
                ||(a3Lose>=2&& a2Lose==1&&a2Success==0)||(a4Lose>=2 && a2Lose==1 &&a2Success==0)||(a4Lose>=2 && a3Lose==1 &&a3Success==0)){
            return "异常";
        }
        if(a1Lose>=2 || a2Lose>=2 || a3Lose>=2 || a4Lose>=2){
            return "可疑";
        }
        if((a1Lose==1 &&a1Success==0)||(a2Lose==1&&a2Success==0)||(a4Lose==1 &&a4Success==0)||( a3Lose==1 &&a3Success==0)){
            return "异常";
        }
        if((a1UnCoop+a2UnCoop+a3UnCoop+a4UnCoop)>=3){
            return "无法确定";
        }
        return "正常";
    }


    public static void main(String[] args) {
        List<Integer> score1List = new ArrayList<Integer>();
        score1List.add(4);
        score1List.add(0);
        score1List.add(3);
        score1List.add(4);
        score1List.add(2);
        score1List.add(0);
        score1List.add(4);
        score1List.add(3);
        score1List.add(3);
        score1List.add(4);

        score1List.add(2);
        score1List.add(1);
        score1List.add(4);
        score1List.add(0);
        score1List.add(0);
        score1List.add(4);
        score1List.add(0);
        score1List.add(1);
        score1List.add(4);
        score1List.add(2);

        score1List.add(4);
        score1List.add(4);
        score1List.add(3);

        List<Integer> score2List = new ArrayList<Integer>();
        score2List.add(4);
        score2List.add(3);
        score2List.add(2);
        score2List.add(0);
        score2List.add(4);
        score2List.add(0);
        score2List.add(3);

        score2List.add(1);
        score2List.add(4);
        score2List.add(2);
        score2List.add(0);
        score2List.add(4);
        score2List.add(4);
        score2List.add(3);
        score2List.add(2);
        score2List.add(1);
        score2List.add(4);

        score2List.add(0);
        score2List.add(3);
        score2List.add(4);
        score2List.add(4);
        score2List.add(2);
        score2List.add(0);
        score2List.add(4);
        score2List.add(4);
        score2List.add(3);
        score2List.add(4);

        score2List.add(4);
        score2List.add(0);
        score2List.add(3);
        List<Integer> score3List = new ArrayList<Integer>();
        score3List.add(4);
        score3List.add(3);
        score3List.add(1);
        score3List.add(4);
        score3List.add(0);
        score3List.add(3);
        score3List.add(4);

        score3List.add(2);
        score3List.add(0);
        score3List.add(4);
        score3List.add(3);
        score3List.add(4);
        score3List.add(4);
        score3List.add(0);
        score3List.add(4);
        score3List.add(2);
        score3List.add(4);

        score3List.add(3);
        score3List.add(4);
        score3List.add(0);
        List<Integer> score4List = new ArrayList<Integer>();
        score4List.add(4);
        score4List.add(2);
        score4List.add(3);
        score4List.add(2);
        score4List.add(4);
        score4List.add(3);
        score4List.add(2);

        score4List.add(0);
        score4List.add(4);
        score4List.add(2);
        score4List.add(3);
        score4List.add(1);
        score4List.add(4);
        score4List.add(0);
        score4List.add(0);
        score4List.add(4);
        score4List.add(4);

        score4List.add(3);
        score4List.add(2);
        score4List.add(4);
        score4List.add(4);
        score4List.add(0);
        score4List.add(3);
        score4List.add(3);
        score4List.add(4);
        score4List.add(2);
        score4List.add(0);

        score4List.add(4);
        score4List.add(4);
        score4List.add(0);
        score4List.add(3);
        String score = getResult(score1List,score2List,score3List,score4List);
        System.out.println("score是："+score);
    }
}
