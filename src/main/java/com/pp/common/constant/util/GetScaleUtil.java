package com.pp.common.constant.util;

import com.pp.common.constant.result132.*;
import com.pp.common.constant.resultCognize.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by asus on 2018/1/15.
 */
public class GetScaleUtil {

    public static String getScale(Date birth,Integer score){
        String scale = "-1";
        Date now = new Date();
        Integer days = (getDiffDay(birth,now));
        if(16<=days && days <=25){
            scale = Scale_1.getScaleScore(score);
        }else if(26<=days && days <=35){
            scale = Scale_2.getScaleScore(score);
        }else if(36<=days && days <=45){
            scale = Scale_3.getScaleScore(score);
        }else if(46<=days && days <=55){
            scale = Scale_4.getScaleScore(score);
        }else  if(56<=days && days <=65){
            scale = Scale_5.getScaleScore(score);
        }else if(66<=days && days <=75){
            scale = Scale_6.getScaleScore(score);
        }else if(76<=days && days <=85){
            scale = Scale_7.getScaleScore(score);
        }else if(86<=days && days <=95){
            scale = Scale_8.getScaleScore(score);
        }else if(96<=days && days <=105){
            scale = Scale_9.getScaleScore(score);
        }else if(106<=days && days <=115){
            scale = Scale_10.getScaleScore(score);
        }else if(116<=days && days <=125){
            scale = Scale_11.getScaleScore(score);
        }else if(126<=days && days <=135){
            scale = Scale_12.getScaleScore(score);
        }else if(136<=days && days <=145){
            scale = Scale_13.getScaleScore(score);
        }else if(146<=days && days <=155){
            scale = Scale_14.getScaleScore(score);
        }else if(156<=days && days <=165){
            scale = Scale_15.getScaleScore(score);
        }else if(166<=days && days <=195){
            scale = Scale_16.getScaleScore(score);
        }else if(196<=days && days <=225){
            scale = Scale_17.getScaleScore(score);
        }else if(226<=days && days <=255){
            scale = Scale_18.getScaleScore(score);
        }else if(256<=days && days <=285){
            scale = Scale_19.getScaleScore(score);
        }else if(286<=days && days <=315){
            scale = Scale_20.getScaleScore(score);
        }else if(316<=days && days <=345){
            scale = Scale_21.getScaleScore(score);
        }else if(346<=days && days <=375){
            scale = Scale_22.getScaleScore(score);
        }else if(376<=days && days <=405){
            scale = Scale_23.getScaleScore(score);
        }else if(406<=days && days <=435){
            scale = Scale_24.getScaleScore(score);
        }else if(436<=days && days <=465){
            scale = Scale_25.getScaleScore(score);
        }else if(466<=days && days <=495){
            scale = Scale_26.getScaleScore(score);
        }else if(496<=days && days <=525){
            scale = Scale_27.getScaleScore(score);
        }else if(526<=days && days <=555){
            scale = Scale_28.getScaleScore(score);
        }else if(556<=days && days <=585){
            scale = Scale_29.getScaleScore(score);
        }else if(586<=days && days <=615){
            scale = Scale_30.getScaleScore(score);
        }else if(616<=days && days <=645){
            scale = Scale_31.getScaleScore(score);
        }else if(646<=days && days <=675){
            scale = Scale_32.getScaleScore(score);
        }else if(676<=days && days <=705){
            scale = Scale_33.getScaleScore(score);
        }else if(706<=days && days <=735){
            scale = Scale_34.getScaleScore(score);
        }else if(736<=days && days <=765){
            scale = Scale_35.getScaleScore(score);
        }else if(766<=days && days <=795){
            scale = Scale_36.getScaleScore(score);
        }else if(796<=days && days <=825){
            scale = Scale_37.getScaleScore(score);
        }else if(826<=days && days <=855){
            scale = Scale_38.getScaleScore(score);
        }else if(856<=days && days <=885){
            scale = Scale_39.getScaleScore(score);
        }else if(886<=days && days <=915){
            scale = Scale_40.getScaleScore(score);
        }else if(916<=days && days <=945){
            scale = Scale_41.getScaleScore(score);
        }else if(946<=days && days <=975){
            scale = Scale_42.getScaleScore(score);
        }else if(976<=days && days <=1005){
            scale = Scale_43.getScaleScore(score);
        }else if(1006<=days && days <=1035){
            scale = Scale_44.getScaleScore(score);
        }else if(1036<=days && days <=1065){
            scale = Scale_45.getScaleScore(score);
        }else if(1066<=days && days <=1095){
            scale = Scale_46.getScaleScore(score);
        }else if(1096<=days && days <=1185){
            scale = Scale_47.getScaleScore(score);
        }else if(1186<=days && days <=1275){
            scale = Scale_48.getScaleScore(score);
        }
        return scale;
    }

    public static Integer getDiffDay(Date d1, Date d2){
        Long days = 0l;
        try {
            days = (d2.getTime()-d1.getTime())/(1000*3600*24);
        }catch (Exception e){

        }
        return days.intValue();
    }

//    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
//        Date birth = df.parse("2008-01-16");
//        String score = getStandardScore(birth,89);
//        System.out.println("score是："+score);
//
//        String temp = "-";
//        String arr[] = temp.split("-");
//        if (arr==null || arr.length==0){
//            System.out.println("---------------------");
//        }
//    }
}
