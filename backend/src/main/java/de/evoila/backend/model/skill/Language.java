package de.evoila.backend.model.skill;

import de.evoila.eprofiler.dto.enums.LanguageLevel;
import de.evoila.eprofiler.dto.enums.LanguageName;
import de.evoila.eprofiler.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "language")
public class Language extends BaseEntity {

    private LanguageName languageName;
    private LanguageLevel languageLevel;

    public LanguageName getLanguageName() {
        return languageName;
    }

    public void setLanguageName(LanguageName languageName) {
        this.languageName = languageName;
    }

    public LanguageLevel getLanguageLevel() {
        return languageLevel;
    }

    public void setLanguageLevel(LanguageLevel languageLevel) {
        this.languageLevel = languageLevel;
    }
}
