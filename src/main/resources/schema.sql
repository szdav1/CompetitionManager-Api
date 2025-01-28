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
    competitor_id  int NOT NULL,
    competition_id int NOT NULL,
    placement      int NOT NULL,
    PRIMARY KEY (competitor_id),
    foreign key (competition_id) references competition (id) on delete cascade on update cascade
);