-- Create table competition
CREATE TABLE competition
(
    id       int          NOT NULL AUTO_INCREMENT,
    name     varchar(255) NOT NULL,
    location varchar(255) NOT NULL,
    date     date         NOT NULL,
    PRIMARY KEY (id)
);

-- Create table competitor
CREATE TABLE competitor
(
    id         int          NOT NULL AUTO_INCREMENT,
    name       varchar(255) NOT NULL,
    club       varchar(255) NOT NULL,
    birth_date date         NOT NULL,
    PRIMARY KEY (id)
);

-- Create table leaderboard
CREATE TABLE leaderboard
(
    competition_id int NOT NULL,
    competitor_id  int NOT NULL,
    placement     int NOT NULL,
    PRIMARY KEY (competition_id),
    foreign key (competitor_id) references competitor (id) on delete cascade on update cascade
);