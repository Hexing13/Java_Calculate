package com.xiyoulinux.calculate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Calculate {

    public Calculate() {
        mathFunction = new HashSet<String>();

        mathFunction.add("sin");
        mathFunction.add("cos");
        mathFunction.add("tan");
        mathFunction.add("arcsin");
        mathFunction.add("arccos");
        mathFunction.add("arctan");
        mathFunction.add("sinh");
        mathFunction.add("cosh");
        mathFunction.add("tanh");
        mathFunction.add("log");
        mathFunction.add("log10");
        mathFunction.add("ln");
        mathFunction.add("pow");
        mathFunction.add("exp");
        mathFunction.add("fact");
        mathFunction.add("mod");
        mathFunction.add("sqrt");
        mathFunction.add("cuberoot");
        mathFunction.add("yroot");
        mathFunction.add("avg");
        mathFunction.add("sum");
    }

    //	�û�����������ѧ���ʽ
    public void input() {
        System.out.print(">>");
        Scanner input = new Scanner(System.in);
        originalExpression = input.nextLine();
        while (!checkError()) {
            input();
        }
        input.close();
    }

    //	����������ѧ���ʽ�Ƿ��д�
    public boolean checkError() {
        return false;
    }

    //	��ԭʼ�����е���ͣ�ƽ�����ȴ������ѧʽ�ӡ��������벻�淶�ĸĳɹ淶�ģ����硰.7����Ϊ��0.7����
    public List<String> toNormalExpression() {
        return null;
    }

    //	�����µ�һ��List�����沨�����ʽ
    public List<String> toSuffixExpression(List<String> normalExpression) {
        getPriority("D:/priority.txt");
        return null;
    }

    //	���ݸ������沨�����ʽ����������ս��
    public String calculate(List<String> suffixExpression) {
        return null;
    }

    //	���ļ��л�ȡ����������ȼ�
    private void getPriority(String filePath) {
        priority = new HashMap<String, Integer>();
        try {
            BufferedReader priorityFile = new BufferedReader(new FileReader(filePath));
            String EveryLineStr;

            //��ȡÿһ��
            while ((EveryLineStr = priorityFile.readLine()) != null) {
                String [] operatorAndPriority = EveryLineStr.split(" ");//ȡ�ÿո�ǰ���ֵ
                priority.put(operatorAndPriority[0], Integer.valueOf(operatorAndPriority[1]));
				/*System.out.println(operatorAndPriority[0] + Integer.valueOf(operatorAndPriority[1]));*/
            }
            priorityFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String originalExpression;//ԭʼ�û�����ı��ʽ
    private Map<String,Integer> priority;//��������ȼ�������ԽС���ȼ�Խ�ߣ���������ȼ����
    private Set<String> mathFunction;//�洢��ѧ����
}
