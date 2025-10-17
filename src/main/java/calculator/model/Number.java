package calculator.model;

import java.util.List;

public class Number {
    public int [] separateNum(String value) {
        // null이 아니지만 ""이거나 " "등과같은 경우 0 리턴
        if (value == null) {
            invalidValue();
        }
        if (value != null && value.isBlank()) {
            return new int[]{0};
        }
        CustomParticles customParticles = new CustomParticles();
        List<String> particles = customParticles.separateParticles(value);
        String[] values = value.split("\n");
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < particles.size(); i++) {
            builder.append(particles.get(i));
        }
        builder.append("]");
        if (values.length == 1) {
            return getInts(values, 0, builder.toString());
        }
        return getInts(values, 1, builder.toString());
    }

    private int[] getInts(String[] values, int x, String splitParticles) {
        String[] splitValues = values[x].split(splitParticles);
        int[] numbers = new int[splitValues.length];
        for (int i = 0; i < splitValues.length; i++) {
            numbers[i] = Integer.parseInt(splitValues[i]);
        }
        return numbers;
    }

    private void invalidValue() {
        throw new IllegalArgumentException("올바른 식을 입력해 주세요");
    }
}
