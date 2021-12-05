package com.example.testenv;
import org.springframework.stereotype.Component;

@Component
public class Technology {
    private int techId;

    private String trchName;

    public int getTechId() {
        return techId;
    }

    public void setTechId(int techId) {
        this.techId = techId;
    }

    public String getTrchName() {
        return trchName;
    }

    public void setTrchName(String trchName) {
        this.trchName = trchName;
    }

    public void tech()
    {
        System.out.println("Completed");
    }

}
