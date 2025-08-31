package model;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class LogsFuncions {

    private static final String REPORT_FILE = "report.txt";
    private static List<String> logEntries = new ArrayList<>();


    public static void loadLogfILE(String filePath) {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                logEntries.add(line);
            }
            System.out.println("File loaded!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void seachByIp(Scanner scanner) {
        String ip = scanner.nextLine();

        List<String> ips = logEntries.stream()
                .filter(entry -> entry.startsWith(ip + " "))
                .collect(Collectors.toList());

        System.out.printf("Found %d requests", ips.size());
        ips.forEach(System.out::println);
    }

    public static void requestsMethodsCounting() {

        Map<String, Long> methodsCount = logEntries.stream()
                .map(entry -> entry.split(" ")[3])
                .collect(Collectors.groupingBy(
                        method -> method,
                        Collectors.counting()
                ));
        methodsCount.forEach((method, count) ->
                System.out.println(method + ":" + count));
    }


//    public static void resoures(){
//       List<String> resourses = new ArrayList<>();
//       resourses.add("ASDASD 345");
//       resourses.add("ASDASD 345");
//       resourses.add("ASDASD 345");
//       resourses.add("ASDASD 876");
//       resourses.add("QWEQWE 876");
//       resourses.add("QWEQWE 876");
//       resourses.add("QWEQWE 876");
//
//        Map<String, Long> streamresourses = resourses.stream()
//                .map(entry -> entry.split(" ")[1])
//                .collect(Collectors.groupingBy(
//                        method -> method,
//                        Collectors.counting()
//                ));
//        System.out.println(streamresourses.entrySet());
//
//
//    }
        public static void resoursesCounting(){
        Map<String, Long> streamResourses = logEntries.stream()
                .map(entry -> entry.split(" ")[3])
                .collect(Collectors.groupingBy(
                        method -> method,
                        Collectors.counting()
                ));
            System.out.println(streamResourses.entrySet());
        }

        // top 10 resourses
        public static void topResources() {
            logEntries.stream()
                    .map(entry -> entry.split(" ")[4])
                    .collect(Collectors.groupingBy(
                            resource -> resource,
                            Collectors.counting()
                    ))
                    .entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .limit(10)
                    .forEach(entry ->
                            System.out.println(entry.getValue() + ": " + entry.getKey()));
        }
}
