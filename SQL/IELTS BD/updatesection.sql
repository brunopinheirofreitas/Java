UPDATE bookmanagement.section sec
	SET ic_section='True'
	WHERE sec.nu_section in (
select se.nu_section from bookmanagement.section se
inner join bookmanagement.disciplina di on di.nu_disciplina = se.nu_disciplina
inner join bookmanagement.testes te on te.nu_teste = di.nu_teste
inner join bookmanagement.livro li on te.nu_livro = li.nu_livro
where li.no_livro = '9' 
		and te.no_teste = 'Test A' 
		--and di.no_disciplina = 'Listening'
		--and se.no_section = 'Section 2'
	)
	
	
	
	
	
	
	
	
	
