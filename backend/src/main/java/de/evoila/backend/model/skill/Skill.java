package de.evoila.backend.model.skill;


import de.evoila.eprofiler.dto.enums.Level;
import de.evoila.eprofiler.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "skill")
public class Skill extends BaseEntity {

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
}
