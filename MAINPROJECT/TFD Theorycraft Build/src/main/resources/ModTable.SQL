CREATE TABLE IF NOT EXISTS mods
(
    mods_id INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (mods_id),
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    cost INT NOT NULL,
    mod_effect_1 INT NOT NULL,
    FOREIGN KEY (mod_effect_1) REFERENCES effects (effect_id),
    mod_value_1 DOUBLE NOT NULL,
    mod_effect_2 INT,
    FOREIGN KEY (mod_effect_2) REFERENCES effects (effect_id),
    mod_value_2 DOUBLE
);