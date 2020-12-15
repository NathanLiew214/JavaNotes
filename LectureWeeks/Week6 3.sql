show databases;
use wliew;
show tables;

-- 1. List all albums in the database.
select * from Album;
-- 2.  List all albums in the database from newest to oldest.
select * from Album order by year desc;
-- 3. List all bands in the database that begin with “The”.
select name from Band where name like "The%";
select b.name from Band as b where name like "The%";
-- 4. List all songs in the database in alphabetic order.
select title from Song order by title ;
select s.title from Song as s order by title ;
-- 5. Write a query that gives just the albumId of the album “Nevermind”
select albumId from Album where title = "Nevermind";
-- 6. Write a query to determine how many musicians are in the database.
select count(*) from Musician;
-- 7. Write a (nested) query to list the oldest album(s) in the database
select min(year) from Album;
select title from Album where year=(select min(year) from Album);
-- 8. Write a query to find the total running time (in seconds) of all tracks on the album Rain
-- Dogs by Tom Waits
select * from Song where title = "Rain Dogs";
select * from Song;
select * from Album;
select * from AlbumSong;

select albs.trackLength from AlbumSong as albs
	join Song as s on s.songId=albs.songId
    join Album as a on a.albumId= albs.albumId;
  
select albs.trackLength,albs.albumId,a.albumId, s.title as SongTitle, a.title as AlbumTitle from AlbumSong as albs
	join Song as s on s.songId=albs.songId
    join Album as a on a.albumId= albs.albumId
    where a.title = "Rain Dogs";
 
 
select Sum(albs.trackLength) from AlbumSong as albs
	join Song as s on s.songId=albs.songId
    join Album as a on a.albumId= albs.albumId
    where a.title = "Rain Dogs";

-- 9. Write a query list all albums in the database along with the album’s band, but only
-- 	  include the album title, year and band name.
select * from Album;  
select * from Band;  

select a.title as AlbumTitle,a.year as AlbumYear, b.name as BandName from Album as a
	join Band as b on b.bandId =a.bandId ;  

-- 10. Write a query that lists all albums and all tracks on the albums for the band Nirvana
select * from Album;
select * from Band;
select * from Song;
select * from AlbumSong;

select a.title as albumName,s.title as SongName from Album as a
	join AlbumSong as albs on a.albumId=albs.albumId
    join Song as s on albs.songId= s.songId
    join Band as b on a.bandId=b.bandId 
    where b.name = "Nirvana";
-- 11. Write a query that list all bands along with all their albums in the database even if they
-- 		do not have any.
select b.name as BandName, a.title as AlbumName from Band as b
   left join Album as a on b.bandId=a.bandId ;
-- 12. Write a query list all bands along with a count of how many albums they have in the
--  	database (as you saw in the previous query, some should have zero).   
select b.name as BandName ,count(a.title) from  Band as b
	left join Album as a on b.bandId= a.bandId group by b.name;  
        
-- 13. Write a query that lists all albums in the database along with the number of tracks on
-- 		them.
   select *from  AlbumSong;
	 
select a.title as AlbumName, albs.tracklength as TrackLength  from  Album as a
	 join AlbumSong as albs on albs.albumId= a.albumId group by a.title ;  
     
 select a.title as AlbumName, count(albs.tracklength)  from  Album as a
	 join AlbumSong as albs on albs.albumId= a.albumId group by a.title ;      
-- 14. Write the same query, but limit it to albums which have 12 or more tracks on them. 
 select a.title as AlbumName, count(albs.tracklength)  from  Album as a
	 join AlbumSong as albs on albs.albumId= a.albumId group by a.title
     having count(albs.tracklength) <13;      
 
 -- 15. Write a query to find all musicians that are not in any bands.
 select  * from Musician as m
	left join BandMember as bm on m.musicianId= bm.musicianId
    left join Band as b on  b.bandId = bm.bandId
    group by m.musicianId
    having count(b.bandId)=0;
 
select  * from BandMember;
select  * from Band;
  
 -- 16. Write a query to find all musicians that are in more than one band
 
	select  * from Musician as m
	left join BandMember as bm on m.musicianId= bm.musicianId
    left join Band as b on  b.bandId = bm.bandId
    group by m.musicianId
    having count(b.bandId)>1;


Group Member Ans: Dinesh

-- 1)
SELECT * From Album;
-- 2)
SELECT * From Album ORDER by year desc;
-- 3)
SELECT b.name From Band b WHERE b.name like "The%";
-- 4)
Select a.title from Song a ORDER by a.title;
-- 5)
Select albumId from Album Where title= "Nevermind";
-- 6)
Select count(*) from Musician;
-- 7)
select a.title from Album a where a.year = (Select min(year) from Album);
-- 8)
Select Sum(a.trackLength) from Song s JOIN AlbumSong a ON a.songId = s.songId JOIN Album 
c ON c.AlbumId = a.AlbumId WHERE c.title = "Rain Dogs";
-- 9 )
Select t.title, t.year, t.bandId from Album t;
-- 10)
Select al.title, s.title from Band b JOIN Album al ON b.bandId = al.bandId JOIN 
AlbumSong a ON  al.albumId = a.albumId join Song s on s.songId = a.songId WHERE b.name = "Nirvana"; 
-- 11)
Select al.title, b.name from Band b left join Album al on b.bandId = al.bandId;
-- 12)
Select  b.name, count(al.title) from Band b left join Album al on b.bandId= al.bandId group by b.name;
-- 13)
Select al.title, count(a.trackNumber) from Album al join AlbumSong a on al.albumId = a.albumId group by al.title;
-- 14)
Select al.title, count(a.trackNumber)  from Album al join AlbumSong a on al.albumId = a.albumId 
group by al.title having count(a.trackNumber) >= 12; 
-- 15)
SELECT * FROM Musician m LEFT JOIN BandMember bm ON m.musicianId = bm.musicianId LEFT JOIN Band b on b.bandId= bm.bandId group by m.musicianId having count(b.bandId) = 0;
-- 16)
SELECT * FROM Musician m LEFT JOIN BandMember bm ON m.musicianId = bm.musicianId LEFT JOIN Band b on b.bandId= bm.bandId group by m.musicianId having count(b.bandId) > 1; 



