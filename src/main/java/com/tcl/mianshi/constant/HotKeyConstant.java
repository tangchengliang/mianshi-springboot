package com.tcl.mianshi.constant;

public interface HotKeyConstant {

    /**
     * 题库 Hot Key 前缀
     */
    String QUESTION_BANK_KEY_PREFIX = "bank_detail_";

    static String getQuestionBankHotKey(Long id) {
        return String.format("%s:%s", QUESTION_BANK_KEY_PREFIX, id);
    }

}
