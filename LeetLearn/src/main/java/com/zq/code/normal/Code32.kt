package com.zq.code.normal

import java.util.Stack

/**
 * @author zhouqi
 * @desc
 * @data 2021/3/6
 */
class Code32 {


    fun longestValidParentheses(s: String): Int {

        var max = 0
        val t = IntArray(s.length)
        for (i in 1 until s.length) {
            if (s[i] == ')') {
                //并列的括号
                if (s[i - 1] == '(') {
                    t[i] = (if (i >= 2) t[i - 2] else 0) + 2
                } else
                //嵌套括号 i-t[i-1]-1 前一个的定位
                //i - t[i - 1] - 2 ((()))再更前一点的括号数
                    if (i - t[i - 1] > 0 && s[i - t[i - 1] - 1] == '(') {
                        t[i] = t[i - 1] + (if (i - t[i - 1] >= 2) t[i - t[i - 1] - 2] else 0) + 2
                    }
                max = Math.max(max, t[i])
            }
        }

        return max
    }

    companion object {


        @JvmStatic
        fun main(args: Array<String>) {


            println(Code32().longestValidParentheses("(()())"))
            println(Code32().longestValidParentheses(""))
        }
    }
}
