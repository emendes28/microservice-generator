package ${package}.${artifactId}.v1.domain.enums;

public enum ${artifactId.substring(0,1).toUpperCase()}${artifactId.substring(1)}StrategyEnumV1 {

    STRATEGY_A {
        @Override
        void execute() {
            System.out.print("Executing strategy A");
        }
    },

    STRATEGY_B {
        @Override
        void execute() {
            System.out.print("Executing strategy B");
        }
    };

    abstract void execute();
}
