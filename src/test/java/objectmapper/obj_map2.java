package objectmapper;

import org.junit.Test;

public class obj_map2 {

    @Test
    public void pojo(){}

    String key;
    public  obj_map2(String key){
        this.key=key;

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


}
