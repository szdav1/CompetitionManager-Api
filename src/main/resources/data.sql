-- COMPETITION
insert into competition (name, location, date)
values ('Elso verseny', 'Nyirszikszi', '2025-01-01');

insert into competition (name, location, date)
values ('Masodik verseny', 'Pince', '2025-12-01');

insert into competition (name, location, date)
values ('Harmadik verseny', 'Nyiregyhaza', '2022-02-01');


-- COMPETITOR
insert into competitor (name, club, birth_date)
values ('Szabo David', 'Nyirszikszi CLUB', '2005-01-01'); -- 1

insert into competitor (name, club, birth_date)
values ('Szurke Levente', 'Pince CLUB', '2005-12-01'); -- 2

insert into competitor (name, club, birth_date)
values ('Szanto David', 'Minek Vagy Itt CLUB', '2005-02-01'); -- 3

insert into competitor (name, club, birth_date)
values ('Lakatos Turret', 'Nyirszikszi CLUB', '2012-01-19'); -- 4

insert into competitor (name, club, birth_date)
values ('Rezmives Lopottbicikli', 'Elloptak a Biciklim KLUBB', '1987-12-23'); -- 5

insert into competitor (name, club, birth_date)
values ('Necigizz Velemella', 'TouchMarbi', '2012-06-11'); -- 6

insert into competitor (name, club, birth_date)
values ('Beteri Gabor', 'TouchMarbi', '2006-03-23'); -- 7

insert into competitor (name, club, birth_date)
values ('Kerekes Dominik', 'Kristaly', '2004-02-01'); -- 8

insert into competitor (name, club, birth_date)
values ('Hansaghy Bence', 'Kristaly', '2025-01-06'); -- 9

insert into competitor (name, club, birth_date)
values ('Kis Ferenc', 'MAV', '1978-09-11'); -- 10

insert into competitor (name, club, birth_date)
values ('Nagy Tamas', 'Nyirszikszi CLUB', '2000-05-15'); -- 11

insert into competitor (name, club, birth_date)
values ('Kolompar Megatron', 'Minek Vagy Itt CLUB', '1999-01-01'); -- 12

insert into competitor (name, club, birth_date)
values ('Laszo Devera Almos', 'Pince CLUB', '2006-02-24'); -- 13

insert into competitor (name, club, birth_date)
values ('Vap Solo', 'TouchMarbi', '2014-02-11'); -- 14


-- LEADERBOARD
/*insert into leaderboard (competition_id, competitor_id, placement)
values (1, 3, 1);

insert into leaderboard (competition_id, competitor_id, placement)
values (2, 2, 2);

insert into leaderboard (competition_id, competitor_id, placement)
values (3, 1, 3);

insert into leaderboard (competition_id, competitor_id, placement)
values (3, 4, 23);

insert into leaderboard (competition_id, competitor_id, placement)
values (2, 5, 19);

insert into leaderboard (competition_id, competitor_id, placement)
values (1, 6, 105);*/

-- Query to select the name of the fencer, the competition name and the placement of the fencer on the competition
/*
select competitor.name, competition.name, competition.location, competition.date, leaderboard.placement from leaderboard
inner join competitor on competitor.id=leaderboard.competitor_id
inner join competition on competition.id=leaderboard.competition_id;
*/

/*

NAME  	        NAME  	         LOCATION  	    DATE  	    PLACEMENT
Szanto David	Elso verseny	 Nyirszikszi	2025-01-01	    1
Szurke Levente	Masodik verseny	 Pince	        2025-12-01	    2
Szabo David	    Harmadik verseny Nyiregyhaza	2022-02-01	    3
Szabo David	    Elso verseny	 Nyirszikszi	2025-01-01	    3
*/