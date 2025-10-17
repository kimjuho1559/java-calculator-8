package calculator.model;

import java.util.ArrayList;
import java.util.List;

public class CustomParticles {
    public List<String> separateParticles(String value) {
        String [] values = value.split("");
        List<String> list = new ArrayList<>();
        list.add(",");
        list.add(":");
        if (values[0].equals("/") && values[1].equals("/")) {
            for (int i = 2; i < values.length; i++) {
                if (i == values.length - 1) {
                    invalidCustomParticles();
                }
                if (values[i].equals("\n")) {
                    break;
                }
                list.add(values[i]);
            }
            return list;
        } else if (values[0].equals("/") || values[1].equals("/")) {
            invalidCustomParticles();
        } else {
            for (int i = 0; i < values.length; i++) {
                if (values[i].equals("\n")) {
                    invalidCustomParticles();
                }
            }
        }
        return list;
    }
    private void invalidCustomParticles() {
        throw new IllegalArgumentException("올바른 커스텀 생성자를 사용해주세요");
    }
}
