import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arr {

    private static final String pathToFirstArr = "src\\main\\resources\\array1.txt";
    private static final String pathToSecondArr = "src\\main\\resources\\array2.txt";

    private static List<String> getFirstArr() {
        try {
            return Files.lines(Paths.get(pathToFirstArr))
                    .map(line -> line.split(" +")).flatMap(Arrays::stream)
                    .map(String::valueOf)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<String> getSecondArr() {
        try {
            return Files.lines(Paths.get(pathToSecondArr))
                    .map(line -> line.split(" +")).flatMap(Arrays::stream)
                    .map(String::valueOf)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<String> sortedArr() {
        return Stream.concat(Objects.requireNonNull(getFirstArr()).stream(),
                Objects.requireNonNull(getSecondArr()).stream())
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }

}
