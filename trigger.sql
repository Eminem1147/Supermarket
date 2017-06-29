use supermarket;

/*
drop trigger stockdelete;
drop trigger stockinsert;
*/

delimiter /
create trigger stockdelete
after insert on sell
for each row
begin
update stock set number = number - new.number where productid = new.productid;
end /
delimiter ;

delimiter /
create trigger stockinsert
after insert on purchase
for each row
begin
update stock set number = number + new.number where productid = new.productid;
end /
delimiter ;
