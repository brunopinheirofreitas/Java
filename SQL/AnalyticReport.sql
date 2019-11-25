SELECT 
--nu_cash_flow, nu_expenditure_name, nu_person, dt_cash_flow, 
en.no_expenditure_name,
sum(cf.vr_cash_flow)
	FROM public."Cash_Flow" cf
	inner join public."Expenditure_Name" en on cf.nu_expenditure_name = en.nu_expenditure_name
	where cf.nu_expenditure_name in (1,2,3,4,5,6,7,8,9,10,11,12,13,14)
	group by cf.nu_expenditure_name, en.nu_expenditure_name