package com.pp.common.constant.util;

import com.pp.common.constant.result132.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by asus on 2018/1/15.=
 */
public class GetStandardUtil {

    public static String getStandardScore(Date birth,Integer thickScore){
        String standardScore = "-1";
        Date now = new Date();
        Integer month = (getDiffDay(birth,now))/30;
        if(6<=month && month <=12){
            standardScore = Standard_A.getStandardScoreByThickScore(thickScore);
        }else if(12<=month && month <=18){
            standardScore = Standard_B.getStandardScoreByThickScore(thickScore);
        }else if(18<=month && month <=24){
            standardScore = Standard_C.getStandardScoreByThickScore(thickScore);
        }else if(25<=month && month <=30){
            standardScore = Standard_D.getStandardScoreByThickScore(thickScore);
        }else if(31<=month && month <=36){
            standardScore = Standard_E.getStandardScoreByThickScore(thickScore);
        }else if(37<=month && month <=48){
            standardScore = Standard_F.getStandardScoreByThickScore(thickScore);
        }else if(49<=month && month <=60){
            standardScore = Standard_G.getStandardScoreByThickScore(thickScore);
        }else if(61<=month && month <=72){
            standardScore = Standard_H.getStandardScoreByThickScore(thickScore);
        }else if(73<=month && month <=96){
            standardScore = Standard_I.getStandardScoreByThickScore(thickScore);
        }else if(97<=month && month <=120){
            standardScore = Standard_J.getStandardScoreByThickScore(thickScore);
        }else if(121<=month && month <=144){
            standardScore = Standard_K.getStandardScoreByThickScore(thickScore);
        }else if(145<=month && month <=168){
            standardScore = Standard_L.getStandardScoreByThickScore(thickScore);
        }
        return standardScore;
    }

    public static Integer getDiffDay(Date d1, Date d2){
        Long days = 0l;
        try {
            days = (d2.getTime()-d1.getTime())/(1000*3600*24);
        }catch (Exception e){

        }
        return days.intValue();
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        Date birth = df.parse("2008-01-16");
        String score = getStandardScore(birth,89);
        System.out.println("score是："+score);

        String temp = "-";
        String arr[] = temp.split("-");
        if (arr==null || arr.length==0){
            System.out.println("---------------------");
        }
    }
}
