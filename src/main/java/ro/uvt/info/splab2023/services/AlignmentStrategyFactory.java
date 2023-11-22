package ro.uvt.info.splab2023.services;

public class AlignmentStrategyFactory {
    private LeftAlignmentStrategy alignLeftPrototype;
    private RightAlignmentStrategy alignRightPrototype;

    public AlignmentStrategy create(String alignment) {
        if ("left".equalsIgnoreCase(alignment)) {
            return alignLeftPrototype;
        } else if ("right".equalsIgnoreCase(alignment)) {
            return alignRightPrototype;
        } else {
            throw new IllegalArgumentException("Unsupported alignment: " + alignment);
        }
    }
}
