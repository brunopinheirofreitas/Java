do $$
begin
for i in 1..13 loop
INSERT INTO ieltsbooks.teste(nu_teste, nu_livro, no_teste)
	VALUES ((select COALESCE(max(nu_teste), 0)from ieltsbooks.teste)+1, i, 'Teste 1');
INSERT INTO ieltsbooks.teste(nu_teste, nu_livro, no_teste)
	VALUES ((select COALESCE(max(nu_teste), 0)from ieltsbooks.teste)+1, i, 'Teste 2');
INSERT INTO ieltsbooks.teste(nu_teste, nu_livro, no_teste)
	VALUES ((select COALESCE(max(nu_teste), 0)from ieltsbooks.teste)+1, i, 'Teste 3');
INSERT INTO ieltsbooks.teste(nu_teste, nu_livro, no_teste)
	VALUES ((select COALESCE(max(nu_teste), 0)from ieltsbooks.teste)+1, i, 'Teste 4');
INSERT INTO ieltsbooks.teste(nu_teste, nu_livro, no_teste)
	VALUES ((select COALESCE(max(nu_teste), 0)from ieltsbooks.teste)+1, i, 'Teste A');
INSERT INTO ieltsbooks.teste(nu_teste, nu_livro, no_teste)
	VALUES ((select COALESCE(max(nu_teste), 0)from ieltsbooks.teste)+1, i, 'Teste B');
end loop;
end;
$$;