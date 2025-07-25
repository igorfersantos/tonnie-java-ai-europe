package br.com.igorfersantos.model;

public enum GameStatusEnum {
    NOT_STARTED("Not Started"), INCOMPLETE("Incomplete"), COMPLETE("Complete");

    private String label;

    GameStatusEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
