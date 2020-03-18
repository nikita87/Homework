package com.teachmeskills.rakhubovskiy.metoda.lesson9;
@Version(versionOfClass = "1.1", codeNameVersion = "Nougat")
public class MyService {

    private String field1;
    private String field2;

    public MyService(String field1, String field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public MyService() {
        field1 = null;
        field2 = null;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyService)) return false;

        MyService myService = (MyService) o;

        if (!getField1().equals(myService.getField1())) return false;
        return getField2().equals(myService.getField2());
    }

    @Override
    public int hashCode() {
        int result = getField1().hashCode();
        result = 31 * result + getField2().hashCode();
        return result;
    }

    private void thisClassInfo(){
        System.out.println("field1 = " + getField1() + "\n" +
                           "field2 = " + getField2());
    }
}
