package com.start;

import com.backgroundImage.BackgroundImage;
import com.ganmepanel.GamePanel;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;

/*
* 程序启动类
* */
public class MainFrme extends JFrame {

    //游戏面板
    private GamePanel gamePanel;

    /*
    * 构造函数主窗口
    * 设置标题、窗口关闭方式、窗口可见性、窗口大小
    * */
    public MainFrme() {

        //设置标题
        setTitle("恐龙跳跃-云泽Ruan");

        //设置窗口关闭方式
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gamePanel = new GamePanel();

        //将该面板添加到该层容器中
        Container container = getContentPane();
        container.add(gamePanel);

        addKeyListener(gamePanel);

        //设置窗口大小
        setBounds(300,200,734,320);
        //setSize(734,320);

        //设置窗口可见性
        setVisible(true);

    }

    public static void main(String[] args) {

        MainFrme mainFrme = new MainFrme();

    }

    //复活游戏
    public void restart(){

        Container container = getContentPane();

        //删除所有死的组件
        container.removeAll();

        gamePanel = new GamePanel();

        container.add(gamePanel);

        addKeyListener(gamePanel);

        //重新验证容器组件
        container.validate();

    }
}
