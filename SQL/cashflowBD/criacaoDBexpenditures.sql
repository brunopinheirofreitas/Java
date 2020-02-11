CREATE TABLE "Expenditure_Group" (
  "nu_expentirue_group" serial PRIMARY KEY,
  "no_expenditure_name" text
);

CREATE TABLE "Expenditure_Name" (
  "nu_expenditure_name" serial PRIMARY KEY,
  "nu_expentirue_group" int,
  "no_expenditure_name" text
);

CREATE TABLE "Person" (
  "nu_person" serial PRIMARY KEY,
  "no_person" text
);

CREATE TABLE "Cash_Flow" (
  "nu_cash_flow" serial PRIMARY KEY,
  "nu_expenditure_name" int,
  "nu_person" int,
  "dt_cash_flow" date,
  "vr_cash_flow" numeric
);

ALTER TABLE "Expenditure_Name" ADD FOREIGN KEY ("nu_expentirue_group") REFERENCES "Expenditure_Group" ("nu_expentirue_group");

ALTER TABLE "Cash_Flow" ADD FOREIGN KEY ("nu_expenditure_name") REFERENCES "Expenditure_Name" ("nu_expenditure_name");

ALTER TABLE "Cash_Flow" ADD FOREIGN KEY ("nu_person") REFERENCES "Person" ("nu_person");
