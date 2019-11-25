select li.no_livro, te.no_teste, di.no_disciplina, se.no_section, se.ic_section from bookmanagement.section se
inner join bookmanagement.disciplina di on di.nu_disciplina = se.nu_disciplina
inner join bookmanagement.testes te on te.nu_teste = di.nu_teste
inner join bookmanagement.livro li on te.nu_livro = li.nu_livro
where se.ic_section = 'False' and 
li.no_livro = '9' 
--and
--		and te.no_teste = 'Test 1' 
--		and di.no_disciplina = 'Reading'
--di.no_disciplina = 'Listening'
		--and se.no_section = 'Section 3'
