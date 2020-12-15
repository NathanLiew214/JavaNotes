-- Starting with SQL

-- this is using autoincrement
/*
multiple line comment
*/

show databases;
use wliew;
show tables;
--inside table
--SELECT   (RETRIEVE OR SHOW)
select * from publisher;--publisher contains 2 field
select * from platform;
select name from game; --only show name table
select name, publisherId from game; --( show name and publisherId table)
select name, publisherId from game where publisherId = 5; --(list with publisherId = 5 only)
select name, publisherId from game where publisherId > 7
select name as GameName, publisherId as pubId from game where publisherId  > 7;-- change name the table, can't use the alias
select name, publisherId from game where name = "GameXYZ1" ;
select name as GameName, publisherId as pubId from game where name like "GTA%";--%whilecard (GTA,GTA1,GTA2,GTA3,GTAIV)
select name as GameName, publisherId as pubId from game where name like "%m%";-- contains m
select name as GameName, publisherId as pubId from game where name like "%y";-- ends with y

--INSERT
insert into publisher values (22,"Bethesda");
select * from game;
insert into game values (223,"Skyrim",22);--3 field
insert into game(name,publisherId) values ("Destiny2",2); -- 2 +1 with auto increment field
-- insert the publisherId where the name is "",9
insert into game(name,publisherId) values ("DDLC", (select publisherId from publisher where name = "Atari")); 
-- insert more than one
insert into game(name,publisherId) values ("GameXYZ1",2),("GameZZZ2",1); 

--DELETE
delete from game -- delete the whole game table (SAFEMODE)
delete from game where gameId = 233;


--UPDATE
update game set publisherId=5; -- setting the whole row of gameId to 5 (SAFEMODE)
update game set publisherId=5 where publisherId=2;


------------------------------------------------------------------------------------------

--2 Joining SQL keys

--Starting 
select game.name from game join publisher on game.publisherId=publisher.publisherId;
select p.name from game as p join publisher;-- using alias
select p.name from game p join publisher;-- you can remove alias too but not recommended

--PROBLEM 1 BOTH HAS NAME
select name from game join publisher on game.publisherId=publisher.publisherId--XXX cannot be executed as both has name

--PROBLEM 2 NEEDS TO JOIN USIN ON
--select name only needs ON
select game.name from game join publisher--** Problems ( it is matching all 364)XXX--counts
select count(*)from game; 26
select count(*)from pubisher;14--26x14 (364)

--JOINING TABLES
select * from game join publisher on game.publisherId=publisher.publisherId;--show all the join table
select game.name,publisher.name from game join publisher on game.publisherId = publisher.publisherId 
select g.name,p.name from game as g join publisher as p on g.publisherId = p.publisherId; -- using alias
select g.name as GAMENAME ,p.name as PUBLISHERNAME from game as g join publisher as p on g.publisherId = p.publisherId;--changing table name

--more than one joins
--long form ( joining all together first and then select what you want)
select game.name,platform.name from game
		join availability on game.gameId = availability.gameId
		join platform  on availabiltiy.platformId = platform.platformId;

--short form (join has no null)
select g.name as GameName ,t.name as PlatformName from game as g 
		join availability as a on g.gameId = a.gameId
		join platform as t on a.platformId = t.platformId;
	
-- same 	
select g.name as GameName ,t.name as PlatformName from availability as a
		join game as g on g.gameId = a.gameId
		join platform as t on a.platformId = t.platformId;
		
				
		
--left join all values on left table (some values with null)
select g.name as GameName ,t.name as PlatformName from game as g 
		left join availability as a on g.gameId = a.gameId
		left join platform as t on a.platformId = t.platformId;
		
		
--right join all values on right table ( all right table contains at least one left table here)
select g.name as GameName ,t.name as PlatformName from game as g 
		right join availability as a on g.gameId = a.gameId
		right join platform as t on a.platformId = t.platformId;
		
	
-- Insert into platform to show a right join
insert into platform (name) values ("www");



--union	 show all null values (full join)
select g.name as GameName ,t.name as PlatformName from game as g 
		left join availability as a on g.gameId = a.gameId
		left join platform as t on a.platformId = t.platformId
union
select g.name as GameName ,t.name as PlatformName from game as g 
		right join availability as a on g.gameId = a.gameId
		right join platform as t on a.platformId = t.platformId;
	
		
-- (inner join) removes all the null values	closely same as join just the orderis different
select g.name as GameName ,t.name as PlatformName from game as g 
		inner join availability as a on g.gameId = a.gameId
		inner join platform as t on a.platformId = t.platformId;
		

-------------------------------------------------------------------------------------------------

		
-- 3 Sorting
select publishYear from availability; --(contains duplicates)		
select distinct publishYear from availability; --(contains duplicates)		
select distinct publishYear from availability order by publishYear; -- (ordering by publish Year)
select distinct gameId, publishYear from availability order by publishYear desc; -- (descending ordering by publish Year)
select distinct gameId,publishYear from availability where publishYear=2005 order by publishYear desc; -- (descending ordering by publish Year)
select distinct gameId,publishYear from availability where publishYear in (2005,2007,1985) order by publishYear desc; 
select gameId,publishYear from availability where publishYear in (2005,2007,1985) ;


------------------------------------------------------------------------------------------------


--4 Group by (prints out according to the sorting method you want to follow)
-- For each publisher how many game they published
-- counts prints final number, group by prints each and every one of it
-- if it counts name, it can show each value
--if it counts number, it removes duplicates
select count(publisherId) from game;
select count(*) from game;
-- same

-- only returns count
select count(gameId) from game 
	join publisher on game.publisherId = publisher.publisherId;

-- using group by - publisher name and gameId (how many games for each publisher)
select publisher.name, count(gameId) from game 
	join publisher on game.publisherId = publisher.publisherId group by publisher.publisherId ;
-- limiting using having, if you use where, you need to sort it first using order by
select publisher.name, count(gameId) from game 
	join publisher on game.publisherId = publisher.publisherId
	group by publisher.publisherId
	having publisher.publisherId >4  ;
or
select publisher.publisherId, publisher.name, count(gameId) from game -- show how it is sorted
	join publisher on game.publisherId = publisher.publisherId 
	where game.name like "%n%" -- add where
	group by publisher.publisherId 
	having publisher.publisherId >4 
	order by publisher.publisherId ; --  add order for where












