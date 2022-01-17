package de.evoila.eprofiler.dto.skill;

import de.evoila.eprofiler.dto.common.enums.LanguageLevel;
import de.evoila.eprofiler.dto.common.enums.LanguageName;

public class LanguageDto {

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

    @Override
    public String toString() {
        return "LanguageDto{" +
                "language=" + languageName +
                ", languageLevel=" + languageLevel +
                '}';
    }
}
