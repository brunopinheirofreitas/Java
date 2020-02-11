INSERT INTO ieltsbooks.livro(nu_livro, no_livro)
VALUES (1, 1);

do $$
begin
for i in 2..13 loop
	INSERT INTO ieltsbooks.livro(nu_livro, no_livro)
	VALUES ((select max(nu_livro) from ieltsbooks.livro)+1, i);
end loop;
end;
$$;