package com.github.sdms.util;

import java.math.BigDecimal;

/**
 * BigDecimal的加减乘除
 */
public class BigDecimalUtil {

    /**
     * BigDecimal操作枚举定义
     */
    public enum BigDecimalOprations {
        add, subtract, multiply, divide
    }

    /**
     * Bigdecimal加减乘除运算
     *
     * @param numOne             [String Integer Long Double Bigdecimal]
     * @param numTwo             [String Integer Long Double Bigdecimal]
     * @param bigDecimalOpration 运算符号
     * @return /
     * @throws Exception
     */
    public static BigDecimal operationASMD(Object numOne, Object numTwo, BigDecimalOprations bigDecimalOpration) throws Exception {
        BigDecimal num1 = new BigDecimal(String.valueOf(numOne));
        BigDecimal num2 = new BigDecimal(String.valueOf(numTwo));
        switch (bigDecimalOpration) {
            case add:
                return num1.add(num2);
            case subtract:
                return num1.subtract(num2);
            case multiply:
                return num1.multiply(num2);
            case divide:
                return num1.divide(num2);
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        BigDecimal bigDecimal = BigDecimalUtil.operationASMD(10.5, 10.2, BigDecimalOprations.multiply);
        System.out.println(bigDecimal);
    }

}
