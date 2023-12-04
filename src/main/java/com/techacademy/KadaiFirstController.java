package com.techacademy;

import java.time.LocalDate; // 追加
import java.time.DayOfWeek; // 追加
import java.time.format.DateTimeFormatter; // 追加

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; //追加
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd"); //　yyyymmddd形式で入力
        LocalDate ld = LocalDate.parse(val1, formatter); // 日付を取得
        DayOfWeek week = ld.getDayOfWeek();// 曜日を取得
        System.out.println(""+ week); //
        return ""+ week;
        }

    // ----- ここから四則演算 -----

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "計算結果：" + res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "計算結果：" + res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "計算結果：" + res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "計算結果：" + res;
    }


}
