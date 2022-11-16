package com.nk.verticalhorizontallist.model;

import java.util.ArrayList;
import java.util.List;

public class DataManager {

    public static List<TimeLineItem> timeLineItemList = new ArrayList<>();

    public static void createTimeLineList(){
            List<PictureItem> pictures1 = new ArrayList<>();
                pictures1.add(new PictureItem("", ""));
                pictures1.add(new PictureItem("https://image.bikebros.co.jp/bike_img/1/16074/1_l.jpg", "R3"));
                pictures1.add(new PictureItem("https://img.webike-cdn.net/moto_img/cg/8/7859/L_1c0cfbcd87ea4c28774764af19.jpg", "R6"));
                pictures1.add(new PictureItem("https://young-machine.com/main/wp-content/uploads/2022/10/ym2210-025-01-yamaha-yzf-r1-img.jpg?v=1666086443", "R1"));
                pictures1.add(new PictureItem("https://ultimatemotorcycling.com/wp-content/uploads/2019/10/2020-yamaha-vmax-buyers-guide-1.jpg", "V-Max"));
        TimeLineItem yamaha = new TimeLineItem("Yamaha", "https://motosymbol.com/wp-content/uploads/2021/02/Yamaha-Logo.png", pictures1);
        timeLineItemList.add(yamaha);


            List<PictureItem> pictures2 = new ArrayList<>();
                pictures2.add(new PictureItem("", ""));
                pictures2.add(new PictureItem("https://gtaexotics.ca/wp-content/uploads/2020/04/ninja-300-1-860x535.jpg", "Ninja 300"));
                pictures2.add(new PictureItem("https://www.rushlane.com/wp-content/uploads/2019/03/2019-kawasaki-ninja-h2r-india-delivery-first-1200x1246.jpg", "Ninja H2R"));
        TimeLineItem kawasaki = new TimeLineItem("Kawasaki", "https://storage.kawasaki.eu/public/kawasaki.eu/en-EU/news/th_black_river_mark.jpg", pictures2);
        timeLineItemList.add(kawasaki);


            List<PictureItem> pictures3 = new ArrayList<>();
                pictures3.add(new PictureItem("", ""));
                pictures3.add(new PictureItem("https://mcn-images.bauersecure.com/wp-images/3688/1440x960/01suzuki-gsx-r600.jpg?mode=max&quality=90&scale=down", "GSXR 600"));
                pictures3.add(new PictureItem("https://www.roadracingworld.com/wp-content/uploads/2022/06/GSX1300RRM3_WHT_diagonal_single_seat_cowl_1654126827.jpg", "Hayabusa"));
        TimeLineItem suzuki = new TimeLineItem("Suzuki", "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Suzuki_logo_2.svg/640px-Suzuki_logo_2.svg.png", pictures3);
        timeLineItemList.add(suzuki);


            List<PictureItem> pictures4 = new ArrayList<>();
                pictures4.add(new PictureItem("", ""));
                pictures4.add(new PictureItem("https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_LIVO_rc390-22-orange-livo_%23SALL_%23AEPI_%23V1.png", "RC 390"));
                pictures4.add(new PictureItem("https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_DET_390-duke-in20-rotw21-power-torque_%23SALL_%23AEPI_%23V1.jpg", "Duke 390"));
                pictures4.add(new PictureItem("https://image.bikebros.co.jp/bike_img/1/15535/1_l.jpg", "690 smc"));
        TimeLineItem ktm = new TimeLineItem("KTM", "https://motosymbol.com/wp-content/uploads/2021/02/KTM-Emblem.png", pictures4);
        timeLineItemList.add(ktm);


            List<PictureItem> pictures5 = new ArrayList<>();
                pictures5.add(new PictureItem("", ""));
                pictures5.add(new PictureItem("https://image.bikebros.co.jp/bike_img/1/13453/1_l.jpg", "CBR1000RR"));
                pictures5.add(new PictureItem("https://ultimatemotorcycling.com/wp-content/uploads/2020/11/2021-Honda-CB1000R-First-Look-naked-sport-motorcycle-18.jpg", "CB1000"));
        TimeLineItem honda = new TimeLineItem("Honda", "https://motosymbol.com/wp-content/uploads/2021/02/Honda-Logo.png", pictures5);
        timeLineItemList.add(honda);


            List<PictureItem> pictures6 = new ArrayList<>();
                pictures6.add(new PictureItem("", ""));
                pictures6.add(new PictureItem("https://tshop.r10s.jp/fujimi-cc/cabinet/omocha/barbie/r1200gsa.jpg?fitin=720%3A720", "R1200"));
                pictures6.add(new PictureItem("https://stat.overdrive.in/wp-content/uploads/2014/10/BMW-Intermot-2.jpg", "RR1200"));
                pictures6.add(new PictureItem("https://www.roadracingworld.com/wp-content/uploads/2020/04/Reduced_BMW_R18_B_003-003_1585934163-e1600423271181.jpg", "R18"));
        TimeLineItem bmw = new TimeLineItem("BMW", "https://cdn.pixabay.com/photo/2016/08/15/18/18/bmw-1596080__480.png", pictures6);
        timeLineItemList.add(bmw);


            List<PictureItem> pictures7 = new ArrayList<>();
                pictures7.add(new PictureItem("", ""));
                pictures7.add(new PictureItem("https://i.ytimg.com/vi/tyPeD0BMKrE/maxresdefault.jpg", "V4"));
        TimeLineItem ducati = new TimeLineItem("Ducati", "https://cdn-0.motorcycle-logos.com/wp-content/uploads/2016/10/Ducati-Logo.png", pictures7);
        timeLineItemList.add(ducati);
    }






    public static List<ParentItem> parentItemList = new ArrayList<>();

    public static void createPatentList() {

        parentItemList.add(new ParentItem("Parent 1", crateChildItem(5, "1")));
        parentItemList.add(new ParentItem("Parent 2", crateChildItem(3, "2")));
        parentItemList.add(new ParentItem("Parent 3", crateChildItem(10, "3")));
        parentItemList.add(new ParentItem("Parent 4", crateChildItem(8, "4")));
        parentItemList.add(new ParentItem("Parent 5", crateChildItem(7, "5")));
        parentItemList.add(new ParentItem("Parent 6", crateChildItem(4, "6")));
        parentItemList.add(new ParentItem("Parent 7", crateChildItem(5, "7")));
        parentItemList.add(new ParentItem("Parent 8", crateChildItem(7, "8")));
        parentItemList.add(new ParentItem("Parent 9", crateChildItem(2, "9")));
        parentItemList.add(new ParentItem("Parent 10", crateChildItem(6, "10")));

    }

    private static List<ChildItem> crateChildItem(int counter, String numRow) {

        List<ChildItem> childItemList = new ArrayList<>();

        for (int i = 0; i < counter; i++){
            childItemList.add(new ChildItem("Row Child item " + numRow + " Item: " + (i + 1) + "/" + counter, getListImages(i)));
        }

        return childItemList;
    }

    private static String getListImages(int numPicture) {
        List<String> imageList = new ArrayList<>();
            imageList.add("https://image.bikebros.co.jp/bike_img/1/16074/1_l.jpg");
            imageList.add("https://young-machine.com/main/wp-content/uploads/2022/10/ym2210-025-01-yamaha-yzf-r1-img.jpg?v=1666086443");
            imageList.add("https://www.rushlane.com/wp-content/uploads/2019/03/2019-kawasaki-ninja-h2r-india-delivery-first-1200x1246.jpg");
            imageList.add("https://mcn-images.bauersecure.com/wp-images/3688/1440x960/01suzuki-gsx-r600.jpg?mode=max&quality=90&scale=down");
            imageList.add("https://azwecdnepstoragewebsiteuploads.azureedge.net/PHO_BIKE_PERS_LIVO_rc390-22-orange-livo_%23SALL_%23AEPI_%23V1.png");
            imageList.add("https://image.bikebros.co.jp/bike_img/1/13453/1_l.jpg");
            imageList.add("https://ultimatemotorcycling.com/wp-content/uploads/2020/11/2021-Honda-CB1000R-First-Look-naked-sport-motorcycle-18.jpg");
            imageList.add("https://stat.overdrive.in/wp-content/uploads/2014/10/BMW-Intermot-2.jpg");
            imageList.add("https://tshop.r10s.jp/fujimi-cc/cabinet/omocha/barbie/r1200gsa.jpg?fitin=720%3A720");
            imageList.add("https://i.ytimg.com/vi/tyPeD0BMKrE/maxresdefault.jpg");
            imageList.add("https://ultimatemotorcycling.com/wp-content/uploads/2019/10/2020-yamaha-vmax-buyers-guide-1.jpg");

        return imageList.get(numPicture);
    }
}
