package compositionlist.computer;

import java.util.ArrayList;
import java.util.List;

public class PersonalComputer {

    private List<Hardware> hardwares = new ArrayList<>();
    private List<Software> softwares = new ArrayList<>();
    private Cpu cou;

    public PersonalComputer(Cpu cou) {
        this.cou = cou;
    }

    public List<Hardware> getHardwares() {
        return hardwares;
    }

    public List<Software> getSoftware() {
        return softwares;
    }

    public Cpu getCou() {
        return cou;
    }

    public void addHardware(Hardware hardware) {
        hardwares.add(hardware);
    }

    public void addSoftware(Software software) {
        softwares.add(software);
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "hardwares=" + hardwares +
                ", softwares=" + softwares +
                ", cou=" + cou +
                '}';
    }
}
