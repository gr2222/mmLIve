# 基于WebSocket、Nginx的个人直播间

----

## 主要技术

-----

- 基于Springboot的Stomp实现直播间发言功能。     
- 基于开源项目 [nginx-http-flv-module](https://github.com/winshining/nginx-http-flv-module) 的流服务器。
- 基于 未知地址 的 JQ 弹幕插件(不好意思，找不到地址了)。
- 基于 哔哩哔哩 开源播放器 [flv.js](https://github.com/Bilibili/flv.js)

## 如何启动

------

- 首先你需要clone项目到本地，然后倒入idea，然后运行。但是只能够聊天和发弹幕。
- 实现直播的话需要在服务器上安装Nginx和ginx-http-flv-module模块[安装参考文档](https://blog.csdn.net/rain_meter/article/details/88127209) 
- 将拉流地址填入src/main/resources/static/html/index.html里108行 url 里面。

>流服务器配置 可以去[ginx-http-flv-module文档](https://github.com/arut/nginx-rtmp-module/wiki) 查看

## 项目图片

------

- 主页

  ![主页](https://github.com/gr2222/image/blob/master/mmLive/5e899d7b504f4bcb04e4ce48.jpg)

- 弹幕发言

  ![弹幕发言](https://github.com/gr2222/image/blob/master/mmLive/5e899db7504f4bcb04e50107.jpg)

- 互动区

  ![互动区](https://github.com/gr2222/image/blob/master/mmLive/5e899de7504f4bcb04e52719.jpg)

- 完整图

  ![完整](https://github.com/gr2222/image/blob/master/mmLive/5e899eeb504f4bcb04e626e1.jpg)

