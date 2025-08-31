package org.example;
import model.LogsFuncions;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //Користувач може:
        //Знайти всі записи за певною IP-адресою
        //Порахувати кількість запитів за типом (GET, POST, etc.)
        //Знайти найпопулярніші ресурси
        //Вивести статистику за кодом відповіді (200, 404, 500, etc.)
        //Згенерувати звіт у окремий файл
        //Дані логу повинні бути у форматі: IP дата метод ресурс протокол код_відповіді розмір

        LogsFuncions.loadLogfILE("src/main/test.rtf");
        System.out.println();
        LogsFuncions.topResources();
        System.out.println();
        LogsFuncions.requestsMethodsCounting();
        System.out.println();
        LogsFuncions.resoursesCounting();


        }
    }