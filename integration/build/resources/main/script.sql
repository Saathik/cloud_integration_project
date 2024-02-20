CREATE TABLE IF NOT EXISTS Player
(
    id         INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50),
    last_name  VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Team
(
    id      INT PRIMARY KEY AUTO_INCREMENT,
    name    VARCHAR(100),
    country VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Team_Player
(
    team_id   INT,
    player_id INT,
    PRIMARY KEY (team_id, player_id),
    FOREIGN KEY (team_id) REFERENCES Team (id),
    FOREIGN KEY (player_id) REFERENCES Player (id)
);
