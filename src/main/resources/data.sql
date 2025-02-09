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

insert into competitor (name, club, birth_date)
values ('Kis Miklos', 'Chips CLUB', '2015-01-01');

insert into competitor (name, club, birth_date)
values ('Tamas Gabor', 'Apatok itt van irany a Jafi', '2899-12-01');

insert into competitor (name, club, birth_date)
values ('Olah Armando', 'Kell a vas more', '2002-02-01');

insert into competitor (name, club, birth_date)
values ('Lakatos Boeing 627', 'Guszev', '1005-01-01');

insert into competitor (name, club, birth_date)
values ('Rezmives Manuella', 'Tuti nem cigany', '2012-12-01');

insert into competitor (name, club, birth_date)
values ('Doglott Hintalo', 'Hinta CLUB', '2005-02-01');

insert into competitor (name, club, birth_date)
values ('Szabo Miklos', 'Nyirszikszi CLUB', '2005-01-01');

insert into competitor (name, club, birth_date)
values ('Szurke Ronaldo', 'Pince CLUB', '2005-12-01');

insert into competitor (name, club, birth_date)
values ('Szanto Gergo', 'Minek Vagy Itt CLUB', '2005-02-01');

insert into competitor (name, club, birth_date)
values ('Kis Adnras', 'Chips CLUB', '2015-01-01');

insert into competitor (name, club, birth_date)
values ('Tamas Tamas', 'Apatok itt van irany a Jafi', '2899-12-01');

insert into competitor (name, club, birth_date)
values ('Olah Cigany', 'Kell a vas more', '2002-02-01');

insert into competitor (name, club, birth_date)
values ('Lakatos BMW 525', 'Guszev', '1005-01-01');

insert into competitor (name, club, birth_date)
values ('Rezmives Manuella apja', 'Tuti nem cigany', '2012-12-01');

insert into competitor (name, club, birth_date)
values ('Negecizz Velemella', 'Hinta CLUB', '2005-02-01');

insert into competitor (name, club, birth_date)
values ('Szabo David', 'Nyirszikszi CLUB', '2005-01-01');

insert into competitor (name, club, birth_date)
values ('Szurke Levente', 'Pince CLUB', '2005-12-01');

insert into competitor (name, club, birth_date)
values ('Szanto David', 'Minek Vagy Itt CLUB', '2005-02-01');

insert into competitor (name, club, birth_date)
values ('Kis Miklos', 'Chips CLUB', '2015-01-01');

insert into competitor (name, club, birth_date)
values ('Tamas Gabor', 'Apatok itt van irany a Jafi', '2899-12-01');

insert into competitor (name, club, birth_date)
values ('Olah Armando', 'Kell a vas more', '2002-02-01');

insert into competitor (name, club, birth_date)
values ('Lakatos Boeing 627', 'Guszev', '1005-01-01');

insert into competitor (name, club, birth_date)
values ('Rezmives Manuella', 'Tuti nem cigany', '2012-12-01');

insert into competitor (name, club, birth_date)
values ('Doglott Hintalo', 'Hinta CLUB', '2005-02-01');

insert into competitor (name, club, birth_date)
values ('Szabo Miklos', 'Nyirszikszi CLUB', '2005-01-01');

insert into competitor (name, club, birth_date)
values ('Szurke Ronaldo', 'Pince CLUB', '2005-12-01');

insert into competitor (name, club, birth_date)
values ('Szanto Gergo', 'Minek Vagy Itt CLUB', '2005-02-01');

insert into competitor (name, club, birth_date)
values ('Kis Adnras', 'Chips CLUB', '2015-01-01');

insert into competitor (name, club, birth_date)
values ('Tamas Tamas', 'Apatok itt van irany a Jafi', '2899-12-01');

insert into competitor (name, club, birth_date)
values ('Olah Cigany', 'Kell a vas more', '2002-02-01');

insert into competitor (name, club, birth_date)
values ('Lakatos BMW 525', 'Guszev', '1005-01-01');

insert into competitor (name, club, birth_date)
values ('Rezmives Manuella apja', 'Tuti nem cigany', '2012-12-01');

insert into competitor (name, club, birth_date)
values ('Negecizz Velemella', 'Hinta CLUB', '2005-02-01');


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