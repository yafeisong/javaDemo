package com.geor.img;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;

import javax.imageio.ImageIO;
 
/**
 * 图片旋转工具类
 */
public class RotateImage {
 
    /**
     * 对图片进行旋转
     *
     * @param src   被旋转图片
     * @param angel 旋转角度
     * @return 旋转后的图片
     */
    public static BufferedImage Rotate(Image src, int angel) {
        int src_width = src.getWidth(null);
        int src_height = src.getHeight(null);
        // 计算旋转后图片的尺寸
        Rectangle rect_des = CalcRotatedSize(new Rectangle(new Dimension(
                src_width, src_height)), angel);
        
        
        System.out.println(String.format("o:w=%s,h=%s", src_width,src_height));
        System.out.println(String.format("r:w=%s,h=%s", rect_des.width,rect_des.height));
        
        
        BufferedImage res = null;
        res = new BufferedImage(rect_des.width, rect_des.height,BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = res.createGraphics();
        // 进行转换
        g2.translate((rect_des.width - src_width) / 2,
                (rect_des.height - src_height) / 2);
        g2.rotate(Math.toRadians(angel), src_width / 2, src_height / 2);
 
        g2.drawImage(src, null, null);
        return res;
    }
 
    /**
     * 计算旋转后的图片
     *
     * @param src   被旋转的图片
     * @param angel 旋转角度
     * @return 旋转后的图片
     */
    public static Rectangle CalcRotatedSize(Rectangle src, int angel) {
        // 如果旋转的角度大于90度做相应的转换
        if (angel >= 90) {
            if (angel / 90 % 2 == 1) {
                int temp = src.height;
                src.height = src.width;
                src.width = temp;
            }
            angel = angel % 90;
        }
 
        double r = Math.sqrt(src.height * src.height + src.width * src.width) / 2;
        double len = 2 * Math.sin(Math.toRadians(angel) / 2) * r;
        double angel_alpha = (Math.PI - Math.toRadians(angel)) / 2;
        double angel_dalta_width = Math.atan((double) src.height / src.width);
        double angel_dalta_height = Math.atan((double) src.width / src.height);
 
        int len_dalta_width = (int) (len * Math.cos(Math.PI - angel_alpha
                - angel_dalta_width));
        int len_dalta_height = (int) (len * Math.cos(Math.PI - angel_alpha
                - angel_dalta_height));
        int des_width = src.width + len_dalta_width * 2;
        int des_height = src.height + len_dalta_height * 2;
        return new Rectangle(new Dimension(des_width, des_height));
    }
    
    public static void main(String[] args) throws Exception {
    	File file0 = new File("C:\\bipc\\Georsoft\\images\\ScanBatches\\batch00058\\5EE27844-233C-45FE-AD63-5AF09AD021A9.JPG"); // 270 
//    	File file0 = new File("C:\\Users\\Administrator\\Desktop\\tu\\Snipaste_2019-09-25_11-23-15.png"); // 270 
//    	File file1 = new File("C:\\Users\\Administrator\\Desktop\\tu\\E52BC70E-A5C4-49D0-8EDB-6700B7FE1367.JPG"); // 180
//    	File file2 = new File("C:\\Users\\Administrator\\Desktop\\tu\\78299F5A-07A6-4080-8494-44C91594F3E1.JPG"); // 90
        BufferedImage src0 = ImageIO.read(new FileInputStream(file0));
//        BufferedImage src1 = ImageIO.read(new FileInputStream(file1));
//        BufferedImage src2 = ImageIO.read(new FileInputStream(file2));
//        //顺时针旋转270度
        BufferedImage des0 = RotateImage.Rotate(src0, 90);
        ImageIO.write(des0, "jpg", new File("c:/90.jpg"));
//        //顺时针旋转180度
//        BufferedImage des1 = RotateImage.Rotate(src1, 180);
//        ImageIO.write(des1, "jpg", new File("c:/180.jpg"));
//        //顺时针旋转90度
//        BufferedImage des2 = RotateImage.Rotate(src2, 90);
//        ImageIO.write(des2, "jpg", new File("c:/90.jpg"));
	}
}
