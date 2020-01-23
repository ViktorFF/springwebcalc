package by.springwebcalc.model;

public class Operation {
    private String var1;
    private String var2;
    private String operationType;

    public Operation() {
    }

    public Operation(String var1, String var2, String operationType) {
        this.var1 = var1;
        this.var2 = var2;
        this.operationType = operationType;
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "var1='" + var1 + '\'' +
                ", var2='" + var2 + '\'' +
                ", operationType='" + operationType + '\'' +
                '}';
    }
}
