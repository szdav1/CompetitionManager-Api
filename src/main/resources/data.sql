-- COMPETITION
insert into competition (name, location, date)
values ('Elso verseny', 'Nyirszikszi', '2025-01-01');

insert into competition (name, location, date)
values ('Masodik verseny', 'Pince', '2025-12-01');

insert into competition (name, location, date)
values ('Harmadik verseny', 'Nyiregyhaza', '2022-02-01');


-- COMPETITOR
insert into competitor (name, club, birth_date)
values ('Szabo David', 'Nyirszikszi CLUB', '2005-01-01');

insert into competitor (name, club, birth_date)
values ('Szurke Levente', 'Pince CLUB', '2005-12-01');

insert into competitor (name, club, birth_date)
values ('Szanto David', 'Minek Vagy Itt CLUB', '2005-02-01');


-- LEADERBOARD
insert into leaderboard (competition_id, competitor_id, placement)
values (1, 3, 1);

insert into leaderboard (competition_id, competitor_id, placement)
values (2, 2, 2);

insert into leaderboard (competition_id, competitor_id, placement)
values (3, 1, 3);

-- Query to select the name of the fencer, the competition name and the placement of the fencer on the competition
/*
select competitor.name, competition.name, leaderboard.placement from leaderboard
inner join competitor on competitor.id=leaderboard.competitorId
inner join competition on competition.id=leaderboard.competitionId;
*/