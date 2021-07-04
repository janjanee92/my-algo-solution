package com.janjanee.programmers.naver;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public String[] solution(String s) {
        char[] chars = s.toCharArray();
        List<String> list = new ArrayList<>();

        int start = 0;
        int end = chars.length;
        boolean odd = false;

        for (int i = 0; i < chars.length; i++) {
            String s1 = s.substring(start, i + 1);
            String s2 = s.substring(chars.length - 1 - i, end);
            if (s1.equals(s2)) {
                list.add(s1);
                start = i + 1;
                end = chars.length - i - 1;
                if (start > end) odd = true;
            }
            if (start >= end) break;
        }

        String[] answer = new String[odd ? list.size() * 2 - 1 : list.size() * 2];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
            answer[answer.length - i - 1] = list.get(i);
        }

        return answer;
    }
}
