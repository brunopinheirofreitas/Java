CREATE TABLE "Company" (
  "nu_company" int PRIMARY KEY,
  "de_name" varchar,
  "nu_origin" int,
  "nu_noc" int
);

CREATE TABLE "Origin" (
  "nu_origin" int PRIMARY KEY,
  "de_city" varchar,
  "de_province" varchar
);

CREATE TABLE "NOC" (
  "nu_noc" int PRIMARY KEY,
  "co_noc" int
);

ALTER TABLE "Company" ADD FOREIGN KEY ("nu_origin") REFERENCES "Origin" ("nu_origin");

ALTER TABLE "Company" ADD FOREIGN KEY ("nu_noc") REFERENCES "NOC" ("nu_noc");