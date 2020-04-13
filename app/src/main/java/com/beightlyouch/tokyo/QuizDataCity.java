package com.beightlyouch.tokyo;

public class QuizDataCity {
    private static final String poolcity[] []= new String[][]{
            //画像のファイル名：ほんとは数字でいいのかな
            {"adachi", "akiruno", "akishima", "arakawa", "bunkyo", "chiyoda", "chofu", "chuo", "edogawa", "fuchu", //10
              "fussa", "hachioji", "hamura", "higashikurume", "higashimurayama", "higashiyamato", "hino", "hinode",//8
              "hinohara", "inagi", "itabashi", "katsushika", "kita", "kiyose", "kodaira", "koganei", "kokubunji",//9
              "komae", "koto", "kunitachi", "machida", "meguro", "minato", "mitaka", "mizuho", "musashimurayama",//9
              "musashino", "nakano", "nerima", "nishitokyo", "okutama", "ome", "ota", "setagaya", "shibuya",//9
              "shinagawa", "shinjuku", "suginami", "sumida", "tachikawa", "taito", "tama", "toshima"//8
            },

            {"足立区", "あきる野市", "昭島市", "荒川区", "文京区", "千代田区", "調布市", "中央区", "江戸川区", "府中市",
             "福生市", "八王子市", "羽村市", "東久留米市", "東村山市", "東大和市", "日野市", "日の出町",
             "檜原村", "稲城市", "板橋区", "葛飾区", "北区", "清瀬市", "小平市", "小金井市", "国分寺市",
             "狛江市", "江東区", "国立市", "町田市", "目黒区", "港区", "三鷹市", "瑞穂町", "武蔵村山市",
             "武蔵野市", "中野区", "練馬区", "西東京市", "奥多摩町", "青梅市", "大田区", "世田谷区", "渋谷区",
             "品川区", "新宿区", "杉並区", "墨田区", "立川市", "台東区", "多摩市", "豊島区"
        }};
    public static String[][] getPoolcity(){
        return QuizDataCity.poolcity;
    }

    public static int getCityNum(){
        return poolcity.length;
    }
}
