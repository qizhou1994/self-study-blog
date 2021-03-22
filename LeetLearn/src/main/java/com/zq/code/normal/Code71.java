package com.zq.code.normal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/22
 */
public class Code71 {
    public String simplifyPath(String path) {
        List<String> list = new ArrayList<>();
        String temp = "";
        //去掉 / 得到数组
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '/' && temp.length() != 0) {
                if (i > 0) {
                    if (path.charAt(i - 1) != '/') {
                        list.add(temp);
                    }
                    temp = "";
                }
            } else if (path.charAt(i) != '/') {
                temp = temp + path.charAt(i);
            }
        }
        if (temp.length() != 0) {
            list.add(temp);
        }

        //通过符号 数组得到 目录数组
        List<String> s = new ArrayList<>();
        for (String t : list) {
            if (".".equals(t)) {
                continue;
            } else if ("..".equals(t)) {
                if (s.size() != 0) {
                    s.remove(s.size() - 1);
                }
            } else {
                s.add(t);
            }
        }
        String tt = "";
        if(s.size()==0){
            tt = "/";
        }
//        输出
        for (String x : s) {
            tt = tt + "/" + x;
        }
        return tt;
    }
    /*  public String simplifyPath1(String path) {

          List<String> list = new ArrayList<>();
          String s = String.valueOf(path.charAt(0));
          for (int i = 0; i < path.length(); i++) {
              if ("/..".equals(s)) {
                  if (path.charAt(i) == '/') {
                      if (list.size() != 0) {
                          list.remove(list.size() - 1);
                      }
                      s = String.valueOf(path.charAt(i));
                  } else {
                      s = s + path.charAt(i);
                  }
              } else if ("/.".equals(s)) {
                  if(path.charAt(i) == '/'){
                      s = String.valueOf(path.charAt(i));
                  }else {
                      s = s + path.charAt(i);
                  }

              } else if (s.length() != 0 && s.charAt(s.length() - 1) == '/' && path.charAt(i) == '/') {
                  continue;
              } else if (s.length() != 0 && s.charAt(s.length() - 1) != '/' && path.charAt(i) == '/') {
                  list.add(s);
                  s = String.valueOf(path.charAt(i));
              } else {
                  s = s + path.charAt(i);
              }
          }
          if ("/..".equals(s)) {
              if(list.size()!=0)
              list.remove(list.size() - 1);
          }else if("/.".equals(s)){

          }else if("/".equals(s)){

          }else {
              list.add(s);
          }
          if (list.size() != 0) {
              s = "";
          } else {
              s = "/";
          }


          for (String x : list) {
              s = s + x;
          }
          return s;
      }*/


    public static void main(String[] args) {

        System.out.println(new Code71().simplifyPath("/home//////////////"));
        System.out.println(new Code71().simplifyPath("//////////////.hhhh.//////////..gggg"));
        System.out.println(new Code71().simplifyPath("/a/..//////////////////../b/../c//.//"));
        System.out.println(new Code71().simplifyPath("/a/./b/../.../c/"));
        System.out.println(new Code71().simplifyPath("/home//foo/"));
        System.out.println(new Code71().simplifyPath("/a//b////c/d//././/.."));
    }
}
