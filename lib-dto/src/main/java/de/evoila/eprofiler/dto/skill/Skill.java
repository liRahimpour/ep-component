package de.evoila.eprofiler.dto.skill;

import de.evoila.eprofiler.dto.common.enums.Level;

public class Skill {

    private String skillName;
    private Level level;

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillName='" + skillName + '\'' +
                ", level=" + level +
                '}';
    }
}
